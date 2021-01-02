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
public class RightFin {
    private GLAutoDrawable drawable;
    
    public RightFin(GLAutoDrawable drawable) {
        this.drawable = drawable;
    }
    
    public void drawFin() {
        GL gl = drawable.getGL();
        patternFin();
        refillFin();
    }
    
    public void patternFin() {
        GL gl = drawable.getGL();
        gl.glBegin(GL.GL_QUADS);
        
        /**
         * Kerangka Sirip Kanan
         */
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(0.0f, 0.0f, 0.05f);
        gl.glVertex3f(0.0f, 0.0f, 0.07f);
        gl.glVertex3f(-0.04f, 0.0f, 0.07f);
        gl.glVertex3f(-0.04f, 0.0f, 0.05f);
        
        gl.glVertex3f(-0.04f, 0.0f, 0.05f);
        gl.glVertex3f(-0.04f, 0.0f, 0.07f);
        gl.glVertex3f(-0.07f, -0.01f, 0.08f);
        gl.glVertex3f(-0.07f, -0.01f, 0.06f);
        
        gl.glVertex3f(-0.07f, -0.01f, 0.06f);
        gl.glVertex3f(-0.07f, -0.01f, 0.08f);
        gl.glVertex3f(-0.1f, -0.04f, 0.11f);
        gl.glVertex3f(-0.1f, -0.04f, 0.095f);
        
        gl.glVertex3f(-0.1f, -0.04f, 0.095f);
        gl.glVertex3f(-0.1f, -0.04f, 0.11f);
        gl.glVertex3f(-0.12f, -0.06f, 0.13f);
        gl.glVertex3f(-0.12f, -0.06f, 0.12f);
        
        gl.glVertex3f(-0.12f, -0.06f, 0.12f);
        gl.glVertex3f(-0.12f, -0.06f, 0.13f);
        gl.glVertex3f(-0.15f, -0.08f, 0.14f);
        gl.glVertex3f(-0.15f, -0.08f, 0.14f);
        
        gl.glVertex3f(-0.15f, -0.08f, 0.14f);
        gl.glVertex3f(-0.15f, -0.08f, 0.14f);
        gl.glVertex3f(-0.11f, -0.08f, 0.14f);
        gl.glVertex3f(-0.11f, -0.08f, 0.15f);
        
        gl.glVertex3f(-0.11f, -0.08f, 0.14f);
        gl.glVertex3f(-0.11f, -0.08f, 0.15f);
        gl.glVertex3f(-0.08f, -0.07f, 0.14f);
        gl.glVertex3f(-0.08f, -0.07f, 0.125f);
        
        gl.glVertex3f(-0.08f, -0.07f, 0.125f);
        gl.glVertex3f(-0.08f, -0.07f, 0.14f);
        gl.glVertex3f(-0.05f, -0.05f, 0.12f);
        gl.glVertex3f(-0.05f, -0.05f, 0.10f);
        
        gl.glVertex3f(-0.05f, -0.05f, 0.10f);
        gl.glVertex3f(-0.05f, -0.05f, 0.12f);
        gl.glVertex3f(-0.02f, -0.02f, 0.09f);
        gl.glVertex3f(-0.02f, -0.02f, 0.07f);
        
        gl.glVertex3f(-0.02f, -0.02f, 0.07f);
        gl.glVertex3f(-0.02f, -0.02f, 0.09f);
        gl.glVertex3f(0.0f, 0.0f, 0.07f);
        gl.glVertex3f(0.0f, 0.0f, 0.05f);
        
        gl.glEnd();
    }
    
    public void refillFin() {
        GL gl = drawable.getGL();
        gl.glBegin(GL.GL_QUADS);
        
        /**
         * Atas
         */
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(0.0f, 0.0f, 0.07f);
        gl.glVertex3f(0.0f, 0.0f, 0.07f);
        gl.glVertex3f(-0.02f, -0.02f, 0.09f);
        gl.glVertex3f(-0.04f, 0.0f, 0.07f);
        
        gl.glVertex3f(-0.02f, -0.02f, 0.09f);
        gl.glVertex3f(-0.04f, 0.0f, 0.07f);
        gl.glVertex3f(-0.07f, -0.01f, 0.08f);
        gl.glVertex3f(-0.05f, -0.05f, 0.12f);
        
        gl.glVertex3f(-0.07f, -0.01f, 0.08f);
        gl.glVertex3f(-0.05f, -0.05f, 0.12f);
        gl.glVertex3f(-0.08f, -0.07f, 0.14f);
        gl.glVertex3f(-0.1f, -0.04f, 0.11f);
        
        gl.glVertex3f(-0.08f, -0.07f, 0.14f);
        gl.glVertex3f(-0.1f, -0.04f, 0.11f);
        gl.glVertex3f(-0.12f, -0.06f, 0.13f);
        gl.glVertex3f(-0.11f, -0.08f, 0.15f);
        
        gl.glVertex3f(-0.12f, -0.06f, 0.13f);
        gl.glVertex3f(-0.11f, -0.08f, 0.15f);
        gl.glVertex3f(-0.15f, -0.08f, 0.14f);
        gl.glVertex3f(-0.15f, -0.08f, 0.14f);
        
        /**
         * Bawah
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Abu-Abu
        gl.glVertex3f(0.0f, 0.0f, 0.05f);
        gl.glVertex3f(0.0f, 0.0f, 0.05f);
        gl.glVertex3f(-0.02f, -0.02f, 0.07f);
        gl.glVertex3f(-0.04f, 0.0f, 0.05f);
        
        gl.glVertex3f(-0.02f, -0.02f, 0.07f);
        gl.glVertex3f(-0.04f, 0.0f, 0.05f);
        gl.glVertex3f(-0.07f, -0.01f, 0.06f);
        gl.glVertex3f(-0.05f, -0.05f, 0.10f);
        
        gl.glVertex3f(-0.07f, -0.01f, 0.06f);
        gl.glVertex3f(-0.05f, -0.05f, 0.10f);
        gl.glVertex3f(-0.08f, -0.07f, 0.125f);
        gl.glVertex3f(-0.1f, -0.04f, 0.095f);
        
        gl.glVertex3f(-0.08f, -0.07f, 0.125f);
        gl.glVertex3f(-0.1f, -0.04f, 0.095f);
        gl.glVertex3f(-0.12f, -0.06f, 0.12f);
        gl.glVertex3f(-0.11f, -0.08f, 0.14f);
        
        gl.glVertex3f(-0.12f, -0.06f, 0.12f);
        gl.glVertex3f(-0.11f, -0.08f, 0.14f);
        gl.glVertex3f(-0.15f, -0.08f, 0.14f);
        gl.glVertex3f(-0.15f, -0.08f, 0.14f);
        
        gl.glEnd();
    }
}
