package org.yourorghere;

import com.sun.opengl.util.Animator;
import com.sun.opengl.util.FPSAnimator;
import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureCoords;
import com.sun.opengl.util.texture.TextureIO;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_DOWN;
import static java.awt.event.KeyEvent.VK_F;
import static java.awt.event.KeyEvent.VK_L;
import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_PAGE_DOWN;
import static java.awt.event.KeyEvent.VK_PAGE_UP;
import static java.awt.event.KeyEvent.VK_RIGHT;
import static java.awt.event.KeyEvent.VK_SHIFT;
import static java.awt.event.KeyEvent.VK_SPACE;
import static java.awt.event.KeyEvent.VK_UP;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLException;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;



/**
 * BlueWhale3D.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
@SuppressWarnings("serial")
public class BlueWhale3D extends GLCanvas implements GLEventListener, KeyListener {
    // Define constants for the top-level constainer
    private static String TITLE = "3D Blue Whale";
    private static final int CANVAS_WIDTH = 800; // width of the drawable
    private static final int CANVAS_HEIGHT = 450; // height of the drawable
    private static final int FPS = 60; // animator's target frame per second
    
    // setup OpenGL Graphics Renderer
    private GLU glu; // for the GL Utility
    private static float angleX = 0.0f; // rotational angle for x-axis in degree
    private static float angleY = 0.0f; // rotational angle for y-axis in degree
    private static float angleZ = 0.0f; // rotational angle for z-axis in degree
    private static float rotateSpeedX = 0.0f; // rotational speed for x-axis
    private static float rotateSpeedY = 0.0f; // rotational speed for y-axis
    private static float rotateSpeedZ = 0.0f; // rotational speed for z-axis
    private static float rotateSpeedXIncrement = 1f; // adjusting x rotational speed
    private static float rotateSpeedYIncrement = 1f; // adjusting y rotational speed
    private static float zoomZ = -1.0f; // translation for z-axis
    private static float transSpeedZ = 0.0f; // translation speed for z-axis
    private static float transSpeedZIncrement = 0.01f;
    
    // set variable for visible object
    private static boolean isVisible;
    
    public static void main(String[] args) {
        // Run the GUI codes in the event-dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                // Create the OpenGL rendering canvas
                GLCanvas canvas = new BlueWhale3D();
                canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

                // Create a animator that drives canvas' display() at the specified FPS.
                final FPSAnimator animator = new FPSAnimator(canvas, FPS, true);

                // Create the top-level container
                final JFrame frame = new JFrame(); // Swing's JFrame or AWT's Frame
                frame.getContentPane().add(canvas);
                frame.addWindowListener(new WindowAdapter() {

                    @Override
                    public void windowClosing(WindowEvent e) {
                        // Use a dedicate thread to run the stop() to ensure that the
                        // animator stops before program exits.
                        new Thread() {

                            @Override
                            public void run() {
                                if (animator.isAnimating()) {
                                    animator.stop();
                                }
                                System.exit(0);
                            }
                        }.start();
                    }
                });
                frame.setTitle(TITLE);
                frame.pack();
                frame.setVisible(true);
                animator.start(); // start the animation loop
            }
        });
    }
    
    /** Constructor to setup the GUI for this Component */
    public BlueWhale3D() {
        this.addGLEventListener(this);
        // For handling KeyEvents
        this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocus();
    }
    
    /**
     * Called back immediately after the OpenGL context is initialized. Can be used
     * to perform one-time initialization. Run only once.
     */
    @Override
    public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();      // get the OpenGL graphics context
        glu = new GLU();                         // get GL Utilities
        gl.glClearColor(0.0f, 0.9f, 0.9f, 0.0f); // set background (clear) color
        gl.glClearDepth(1.0f);      // set clear depth value to farthest
        gl.glEnable(GL.GL_DEPTH_TEST); // enables depth testing
        gl.glDepthFunc(GL.GL_LEQUAL);  // the type of depth test to do
        gl.glHint(GL.GL_PERSPECTIVE_CORRECTION_HINT, GL.GL_NICEST); // best perspective correction
        gl.glShadeModel(GL.GL_SMOOTH); // blends colors nicely, and smoothes out lighting

        isVisible = false;
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();     // get the OpenGL graphics context

        if (height == 0) {
            height = 1;   // prevent divide by zero
        }
        float aspect = (float) width / height;

        // Set the view port (display area) to cover the entire window
        gl.glViewport(0, 0, width, height);

        // Setup perspective projection, with aspect ratio matches viewport
        gl.glMatrixMode(GL.GL_PROJECTION);  // choose projection matrix
        gl.glLoadIdentity();             // reset projection matrix
        glu.gluPerspective(45.0, aspect, 0.1, 100.0); // fovy, aspect, zNear, zFar

        // Enable the model-view transform
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity(); // reset
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL(); // get the OpenGL graphics context
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT); // clear color and depth buffers

        gl.glLoadIdentity(); // reset the model-view matrix
        gl.glTranslatef(0.0f, 0.0f, zoomZ); // translate into the screen
        gl.glRotatef(angleX, 1.0f, 0.0f, 0.0f); // rotate about the x-axis
        gl.glRotatef(angleY, 0.0f, 1.0f, 0.0f); // rotate about the y-axis
        gl.glRotatef(angleZ, 0.0f, 0.0f, 1.0f); // rotate about the z-axis
        
        BlueWhale blueWhale = new BlueWhale(drawable);
        blueWhale.drawBlueWhale();
        Fountain fountain = new Fountain(drawable);
        
        if (isVisible) {
            fountain.drawFountain();
        }
        
        // Update the rotational angel after each refresh by the corresponding
        // translation speed
        zoomZ += transSpeedZ;
        
        // rotational speed
        angleX += rotateSpeedX;
        angleY += rotateSpeedY;
        angleZ += rotateSpeedZ;
    }
    
    // ------ Implement methods declared in GLEventListener ------
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case VK_SPACE: // toggle fountain
                isVisible = !isVisible;
                break;
            case VK_UP:   // rotate to up
                rotateSpeedX = -rotateSpeedXIncrement;
                break;
            case VK_DOWN: // rotate to down
                rotateSpeedX = +rotateSpeedXIncrement;
                break;
            case VK_LEFT:  // rotate to left
                rotateSpeedY = -rotateSpeedYIncrement;
                break;
            case VK_RIGHT: // rotate to right
                rotateSpeedY = +rotateSpeedYIncrement;
                break;
            case VK_PAGE_UP: // zoom out
                transSpeedZ = -transSpeedZIncrement;
                break;
            case VK_PAGE_DOWN: // zoom in
                transSpeedZ = +transSpeedZIncrement;
                break;
            case VK_SHIFT :
                rotateSpeedY = 0;
                rotateSpeedX = 0;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case VK_UP:   // decrease rotational speed in x
                rotateSpeedY = 0;
                rotateSpeedX = 0;
                break;
            case VK_DOWN: // increase rotational speed in x
                rotateSpeedY = 0;
                rotateSpeedX = 0;
                break;
            case VK_LEFT:  // decrease rotational speed in y
                rotateSpeedY = 0;
                rotateSpeedX = 0;
                break;
            case VK_RIGHT: // increase rotational speed in y
                rotateSpeedY = 0;
                rotateSpeedX = 0;
                break;
            case VK_PAGE_UP:
                transSpeedZ = 0;
                break;
            case VK_PAGE_DOWN:
                transSpeedZ = 0;
                break;
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {}
}

