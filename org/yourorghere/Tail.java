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
        GL gl = drawable.getGL();
        gl.glTranslatef(-0.44f, -0.015f, 0.0f);
        gl.glRotatef(2.5f, 0.0f, 0.0f, 1.0f);
        patternTail();
        refillTail();
        gl.glTranslatef(0.44f, 0.015f, 0.0f); // Reset Translate
    }
    
    private void patternTail() {
        GL gl = drawable.getGL();
        gl.glBegin(GL.GL_QUADS);
        
        // Kerangka Ekor
        /**
         * Kiri
         */
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, -0.02f, 0.0f);
        gl.glVertex3f(-0.03f, -0.03f, -0.1f);
        gl.glVertex3f(-0.03f, -0.02f, -0.1f);
        
        gl.glVertex3f(-0.03f, -0.02f, -0.1f);
        gl.glVertex3f(-0.03f, -0.03f, -0.1f);
        gl.glVertex3f(-0.05f, -0.04f, -0.12f);
        gl.glVertex3f(-0.05f, -0.035f, -0.12f);
        
        gl.glVertex3f(-0.05f, -0.035f, -0.12f);
        gl.glVertex3f(-0.05f, -0.04f, -0.12f);
        gl.glVertex3f(-0.07f, -0.05f, -0.12f);
        gl.glVertex3f(-0.07f, -0.05f, -0.12f);
        
        gl.glVertex3f(-0.07f, -0.05f, -0.12f);
        gl.glVertex3f(-0.07f, -0.05f, -0.12f);
        gl.glVertex3f(-0.06f, -0.045f, -0.1f);
        gl.glVertex3f(-0.06f, -0.04f, -0.1f);
        
        gl.glVertex3f(-0.06f, -0.04f, -0.1f);
        gl.glVertex3f(-0.06f, -0.045f, -0.1f);
        gl.glVertex3f(-0.06f, -0.045f, -0.01f);
        gl.glVertex3f(-0.06f, -0.04f, -0.01f);
        
        gl.glVertex3f(-0.06f, -0.04f, -0.01f);
        gl.glVertex3f(-0.06f, -0.045f, -0.01f);
        gl.glVertex3f(-0.05f, -0.035f, 0.0f);
        gl.glVertex3f(-0.05f, -0.03f, 0.0f);
        
        /**
         * Kanan
         */
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, -0.02f, 0.0f);
        gl.glVertex3f(-0.03f, -0.03f, 0.1f);
        gl.glVertex3f(-0.03f, -0.02f, 0.1f);
        
        gl.glVertex3f(-0.03f, -0.02f, 0.1f);
        gl.glVertex3f(-0.03f, -0.03f, 0.1f);
        gl.glVertex3f(-0.05f, -0.04f, 0.12f);
        gl.glVertex3f(-0.05f, -0.035f, 0.12f);
        
        gl.glVertex3f(-0.05f, -0.035f, 0.12f);
        gl.glVertex3f(-0.05f, -0.04f, 0.12f);
        gl.glVertex3f(-0.07f, -0.05f, 0.12f);
        gl.glVertex3f(-0.07f, -0.05f, 0.12f);
        
        gl.glVertex3f(-0.07f, -0.05f, 0.12f);
        gl.glVertex3f(-0.07f, -0.05f, 0.12f);
        gl.glVertex3f(-0.06f, -0.045f, 0.1f);
        gl.glVertex3f(-0.06f, -0.04f, 0.1f);
        
        gl.glVertex3f(-0.06f, -0.04f, 0.1f);
        gl.glVertex3f(-0.06f, -0.045f, 0.1f);
        gl.glVertex3f(-0.06f, -0.045f, 0.01f);
        gl.glVertex3f(-0.06f, -0.04f, 0.01f);
        
        gl.glVertex3f(-0.06f, -0.04f, 0.01f);
        gl.glVertex3f(-0.06f, -0.045f, 0.01f);
        gl.glVertex3f(-0.05f, -0.035f, 0.0f);
        gl.glVertex3f(-0.05f, -0.03f, 0.0f);
        
        gl.glEnd();
    }
    
    private void refillTail() {
        GL gl = drawable.getGL();
        gl.glBegin(GL.GL_QUADS);
        
        // Fill Ekor Kiri
        /**
         * Atas
         */
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.03f, -0.02f, -0.1f);
        gl.glVertex3f(-0.06f, -0.04f, -0.01f);
        gl.glVertex3f(-0.05f, -0.03f, 0.0f);
        
        gl.glVertex3f(-0.03f, -0.02f, -0.1f);
        gl.glVertex3f(-0.06f, -0.04f, -0.01f);
        gl.glVertex3f(-0.06f, -0.04f, -0.1f);
        gl.glVertex3f(-0.05f, -0.035f, -0.12f);
        
        gl.glVertex3f(-0.05f, -0.035f, -0.12f);
        gl.glVertex3f(-0.06f, -0.04f, -0.1f);
        gl.glVertex3f(-0.07f, -0.05f, -0.12f);
        gl.glVertex3f(-0.07f, -0.05f, -0.12f);
        
        /**
         * Bawah
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Abu-Abu
        gl.glVertex3f(0.0f, -0.02f, 0.0f);
        gl.glVertex3f(-0.03f, -0.03f, -0.1f);
        gl.glVertex3f(-0.06f, -0.045f, -0.01f);
        gl.glVertex3f(-0.05f, -0.035f, 0.0f);
        
        gl.glVertex3f(-0.03f, -0.03f, -0.1f);
        gl.glVertex3f(-0.06f, -0.045f, -0.01f);
        gl.glVertex3f(-0.06f, -0.045f, -0.1f);
        gl.glVertex3f(-0.05f, -0.04f, -0.12f);
        
        gl.glVertex3f(-0.05f, -0.04f, -0.12f);
        gl.glVertex3f(-0.06f, -0.045f, -0.1f);
        gl.glVertex3f(-0.07f, -0.05f, -0.12f);
        gl.glVertex3f(-0.07f, -0.05f, -0.12f);
        
        // Fill Ekor Kanan
        /**
         * Atas
         */
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.03f, -0.02f, 0.1f);
        gl.glVertex3f(-0.06f, -0.04f, 0.01f);
        gl.glVertex3f(-0.05f, -0.03f, 0.0f);
        
        gl.glVertex3f(-0.03f, -0.02f, 0.1f);
        gl.glVertex3f(-0.06f, -0.04f, 0.01f);
        gl.glVertex3f(-0.06f, -0.04f, 0.1f);
        gl.glVertex3f(-0.05f, -0.035f, 0.12f);
        
        gl.glVertex3f(-0.05f, -0.035f, 0.12f);
        gl.glVertex3f(-0.06f, -0.04f, 0.1f);
        gl.glVertex3f(-0.07f, -0.05f, 0.12f);
        gl.glVertex3f(-0.07f, -0.05f, 0.12f);
        
        /**
         * Bawah
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.0f, -0.02f, 0.0f);
        gl.glVertex3f(-0.03f, -0.03f, 0.1f);
        gl.glVertex3f(-0.06f, -0.045f, 0.01f);
        gl.glVertex3f(-0.05f, -0.035f, 0.0f);
        
        gl.glVertex3f(-0.03f, -0.03f, 0.1f);
        gl.glVertex3f(-0.06f, -0.045f, 0.01f);
        gl.glVertex3f(-0.06f, -0.045f, 0.1f);
        gl.glVertex3f(-0.05f, -0.04f, 0.12f);
        
        gl.glVertex3f(-0.05f, -0.04f, 0.12f);
        gl.glVertex3f(-0.06f, -0.045f, 0.1f);
        gl.glVertex3f(-0.07f, -0.05f, 0.12f);
        gl.glVertex3f(-0.07f, -0.05f, 0.12f);
        
        gl.glEnd();
    }
}
