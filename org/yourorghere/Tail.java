/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;

/**
 *
 * @author Sirajuddin
 */
public class Tail {
    private GLAutoDrawable drawable;
    
    public Tail(GLAutoDrawable drawable) {
        this.drawable = drawable;
    }
    
    public void drawTail() {
        patternTail();
        refillTail();
    }
    
    public void patternTail() {
        GL gl = drawable.getGL();
        gl.glBegin(GL.GL_QUADS);
        
        // Kerangka Ekor
        /**
         * Kiri
         */
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.44f, -0.02f, 0.0f);
        gl.glVertex3f(-0.44f, -0.04f, 0.0f);
        gl.glVertex3f(-0.47f, -0.05f, -0.1f);
        gl.glVertex3f(-0.47f, -0.04f, -0.1f);
        
        gl.glVertex3f(-0.47f, -0.04f, -0.1f);
        gl.glVertex3f(-0.47f, -0.05f, -0.1f);
        gl.glVertex3f(-0.49f, -0.06f, -0.12f);
        gl.glVertex3f(-0.49f, -0.055f, -0.12f);
        
        gl.glVertex3f(-0.49f, -0.055f, -0.12f);
        gl.glVertex3f(-0.49f, -0.06f, -0.12f);
        gl.glVertex3f(-0.51f, -0.07f, -0.12f);
        gl.glVertex3f(-0.51f, -0.07f, -0.12f);
        
        gl.glVertex3f(-0.51f, -0.07f, -0.12f);
        gl.glVertex3f(-0.51f, -0.07f, -0.12f);
        gl.glVertex3f(-0.5f, -0.065f, -0.1f);
        gl.glVertex3f(-0.5f, -0.06f, -0.1f);
        
        gl.glVertex3f(-0.5f, -0.06f, -0.1f);
        gl.glVertex3f(-0.5f, -0.065f, -0.1f);
        gl.glVertex3f(-0.5f, -0.065f, -0.01f);
        gl.glVertex3f(-0.5f, -0.06f, -0.01f);
        
        gl.glVertex3f(-0.5f, -0.06f, -0.01f);
        gl.glVertex3f(-0.5f, -0.065f, -0.01f);
        gl.glVertex3f(-0.49f, -0.055f, 0.0f);
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        
        /**
         * Kanan
         */
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.44f, -0.02f, 0.0f);
        gl.glVertex3f(-0.44f, -0.04f, 0.0f);
        gl.glVertex3f(-0.47f, -0.05f, 0.1f);
        gl.glVertex3f(-0.47f, -0.04f, 0.1f);
        
        gl.glVertex3f(-0.47f, -0.04f, 0.1f);
        gl.glVertex3f(-0.47f, -0.05f, 0.1f);
        gl.glVertex3f(-0.49f, -0.06f, 0.12f);
        gl.glVertex3f(-0.49f, -0.055f, 0.12f);
        
        gl.glVertex3f(-0.49f, -0.055f, 0.12f);
        gl.glVertex3f(-0.49f, -0.06f, 0.12f);
        gl.glVertex3f(-0.51f, -0.07f, 0.12f);
        gl.glVertex3f(-0.51f, -0.07f, 0.12f);
        
        gl.glVertex3f(-0.51f, -0.07f, 0.12f);
        gl.glVertex3f(-0.51f, -0.07f, 0.12f);
        gl.glVertex3f(-0.5f, -0.065f, 0.1f);
        gl.glVertex3f(-0.5f, -0.06f, 0.1f);
        
        gl.glVertex3f(-0.5f, -0.06f, 0.1f);
        gl.glVertex3f(-0.5f, -0.065f, 0.1f);
        gl.glVertex3f(-0.5f, -0.065f, 0.01f);
        gl.glVertex3f(-0.5f, -0.06f, 0.01f);
        
        gl.glVertex3f(-0.5f, -0.06f, 0.01f);
        gl.glVertex3f(-0.5f, -0.065f, 0.01f);
        gl.glVertex3f(-0.49f, -0.055f, 0.0f);
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        
        gl.glEnd();
    }
    
    public void refillTail() {
        GL gl = drawable.getGL();
        gl.glBegin(GL.GL_QUADS);
        
        // Fill Ekor Kiri
        /**
         * Atas
         */
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.44f, -0.02f, 0.0f);
        gl.glVertex3f(-0.47f, -0.04f, -0.1f);
        gl.glVertex3f(-0.5f, -0.06f, -0.01f);
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        
        gl.glVertex3f(-0.47f, -0.04f, -0.1f);
        gl.glVertex3f(-0.5f, -0.06f, -0.01f);
        gl.glVertex3f(-0.5f, -0.06f, -0.1f);
        gl.glVertex3f(-0.49f, -0.055f, -0.12f);
        
        gl.glVertex3f(-0.49f, -0.055f, -0.12f);
        gl.glVertex3f(-0.5f, -0.06f, -0.1f);
        gl.glVertex3f(-0.51f, -0.07f, -0.12f);
        gl.glVertex3f(-0.51f, -0.07f, -0.12f);
        
        /**
         * Bawah
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Abu-Abu
        gl.glVertex3f(-0.44f, -0.04f, 0.0f);
        gl.glVertex3f(-0.47f, -0.05f, -0.1f);
        gl.glVertex3f(-0.5f, -0.065f, -0.01f);
        gl.glVertex3f(-0.49f, -0.055f, 0.0f);
        
        gl.glVertex3f(-0.47f, -0.05f, -0.1f);
        gl.glVertex3f(-0.5f, -0.065f, -0.01f);
        gl.glVertex3f(-0.5f, -0.065f, -0.1f);
        gl.glVertex3f(-0.49f, -0.06f, -0.12f);
        
        gl.glVertex3f(-0.49f, -0.06f, -0.12f);
        gl.glVertex3f(-0.5f, -0.065f, -0.1f);
        gl.glVertex3f(-0.51f, -0.07f, -0.12f);
        gl.glVertex3f(-0.51f, -0.07f, -0.12f);
        
        // Fill Ekor Kanan
        /**
         * Atas
         */
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.44f, -0.02f, 0.0f);
        gl.glVertex3f(-0.47f, -0.04f, 0.1f);
        gl.glVertex3f(-0.5f, -0.06f, 0.01f);
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        
        gl.glVertex3f(-0.47f, -0.04f, 0.1f);
        gl.glVertex3f(-0.5f, -0.06f, 0.01f);
        gl.glVertex3f(-0.5f, -0.06f, 0.1f);
        gl.glVertex3f(-0.49f, -0.055f, 0.12f);
        
        gl.glVertex3f(-0.49f, -0.055f, 0.12f);
        gl.glVertex3f(-0.5f, -0.06f, 0.1f);
        gl.glVertex3f(-0.51f, -0.07f, 0.12f);
        gl.glVertex3f(-0.51f, -0.07f, 0.12f);
        
        /**
         * Bawah
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(-0.44f, -0.04f, 0.0f);
        gl.glVertex3f(-0.47f, -0.05f, 0.1f);
        gl.glVertex3f(-0.5f, -0.065f, 0.01f);
        gl.glVertex3f(-0.49f, -0.055f, 0.0f);
        
        gl.glVertex3f(-0.47f, -0.05f, 0.1f);
        gl.glVertex3f(-0.5f, -0.065f, 0.01f);
        gl.glVertex3f(-0.5f, -0.065f, 0.1f);
        gl.glVertex3f(-0.49f, -0.06f, 0.12f);
        
        gl.glVertex3f(-0.49f, -0.06f, 0.12f);
        gl.glVertex3f(-0.5f, -0.065f, 0.1f);
        gl.glVertex3f(-0.51f, -0.07f, 0.12f);
        gl.glVertex3f(-0.51f, -0.07f, 0.12f);
        
        gl.glEnd();
    }
}
