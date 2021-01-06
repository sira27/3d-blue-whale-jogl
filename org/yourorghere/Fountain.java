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
public class Fountain {
    private GLAutoDrawable drawable;
    
    public Fountain(GLAutoDrawable drawable) {
        this.drawable = drawable;
    }
    
    public void drawFountain() {
        GL gl = drawable.getGL();
        gl.glTranslatef(0.26f, 0.045f, 0.0f);
        fountain();
        gl.glTranslatef(-0.26f, -0.045f, 0.0f); // Reset Translate
    }
    
    private void fountain() {
        GL gl = drawable.getGL();
        gl.glBegin(GL.GL_QUADS);
        
        /**
         * Sisi Depan
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.01f, 0.0f, 0.005f);
        gl.glVertex3f(0.01f, 0.1f, 0.005f);
        gl.glVertex3f(0.01f, 0.1f, -0.005f);
        gl.glVertex3f(0.01f, 0.0f, -0.005f);
        
        gl.glVertex3f(0.01f, 0.1f, 0.005f);
        gl.glVertex3f(0.02f, 0.13f, 0.005f);
        gl.glVertex3f(0.02f, 0.13f, -0.005f);
        gl.glVertex3f(0.01f, 0.1f, -0.005f);
        
        gl.glVertex3f(0.02f, 0.13f, 0.005f);
        gl.glVertex3f(0.03f, 0.15f, 0.005f);
        gl.glVertex3f(0.03f, 0.15f, -0.005f);
        gl.glVertex3f(0.02f, 0.13f, -0.005f);
        
        gl.glVertex3f(0.03f, 0.15f, 0.005f);
        gl.glVertex3f(0.05f, 0.17f, 0.005f);
        gl.glVertex3f(0.05f, 0.17f, -0.005f);
        gl.glVertex3f(0.03f, 0.15f, -0.005f);
        
        gl.glVertex3f(0.05f, 0.17f, 0.005f);
        gl.glVertex3f(0.08f, 0.18f, 0.005f);
        gl.glVertex3f(0.08f, 0.18f, -0.005f);
        gl.glVertex3f(0.05f, 0.17f, -0.005f);
        
        gl.glVertex3f(0.08f, 0.18f, 0.005f);
        gl.glVertex3f(0.11f, 0.17f, 0.005f);
        gl.glVertex3f(0.11f, 0.17f, -0.005f);
        gl.glVertex3f(0.08f, 0.18f, -0.005f);
        
        /**
         * Sisi Belakang
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(-0.01f, 0.0f, 0.005f);
        gl.glVertex3f(-0.01f, 0.1f, 0.005f);
        gl.glVertex3f(-0.01f, 0.1f, -0.005f);
        gl.glVertex3f(-0.01f, 0.0f, -0.005f);
        
        gl.glVertex3f(-0.01f, 0.1f, 0.005f);
        gl.glVertex3f(-0.02f, 0.13f, 0.005f);
        gl.glVertex3f(-0.02f, 0.13f, -0.005f);
        gl.glVertex3f(-0.01f, 0.1f, -0.005f);
        
        gl.glVertex3f(-0.02f, 0.13f, 0.005f);
        gl.glVertex3f(-0.03f, 0.15f, 0.005f);
        gl.glVertex3f(-0.03f, 0.15f, -0.005f);
        gl.glVertex3f(-0.02f, 0.13f, -0.005f);
        
        gl.glVertex3f(-0.03f, 0.15f, 0.005f);
        gl.glVertex3f(-0.05f, 0.17f, 0.005f);
        gl.glVertex3f(-0.05f, 0.17f, -0.005f);
        gl.glVertex3f(-0.03f, 0.15f, -0.005f);
        
        gl.glVertex3f(-0.05f, 0.17f, 0.005f);
        gl.glVertex3f(-0.08f, 0.18f, 0.005f);
        gl.glVertex3f(-0.08f, 0.18f, -0.005f);
        gl.glVertex3f(-0.05f, 0.17f, -0.005f);
        
        gl.glVertex3f(-0.08f, 0.18f, 0.005f);
        gl.glVertex3f(-0.11f, 0.17f, 0.005f);
        gl.glVertex3f(-0.11f, 0.17f, -0.005f);
        gl.glVertex3f(-0.08f, 0.18f, -0.005f);
        
        /**
         * Sisi Kanan
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.005f, 0.0f, 0.01f);
        gl.glVertex3f(0.005f, 0.1f, 0.01f);
        gl.glVertex3f(-0.005f, 0.1f, 0.01f);
        gl.glVertex3f(-0.005f, 0.0f, 0.01f);
        
        gl.glVertex3f(0.005f, 0.1f, 0.01f);
        gl.glVertex3f(0.005f, 0.13f, 0.02f);
        gl.glVertex3f(-0.005f, 0.13f, 0.02f);
        gl.glVertex3f(-0.005f, 0.1f, 0.01f);
        
        gl.glVertex3f(0.005f, 0.13f, 0.02f);
        gl.glVertex3f(0.005f, 0.15f, 0.03f);
        gl.glVertex3f(-0.005f, 0.15f, 0.03f);
        gl.glVertex3f(-0.005f, 0.13f, 0.02f);
        
        gl.glVertex3f(0.005f, 0.15f, 0.03f);
        gl.glVertex3f(0.005f, 0.17f, 0.05f);
        gl.glVertex3f(-0.005f, 0.17f, 0.05f);
        gl.glVertex3f(-0.005f, 0.15f, 0.03f);
        
        gl.glVertex3f(0.005f, 0.17f, 0.05f);
        gl.glVertex3f(0.005f, 0.18f, 0.08f);
        gl.glVertex3f(-0.005f, 0.18f, 0.08f);
        gl.glVertex3f(-0.005f, 0.17f, 0.05f);
        
        gl.glVertex3f(0.005f, 0.18f, 0.08f);
        gl.glVertex3f(0.005f, 0.17f, 0.11f);
        gl.glVertex3f(-0.005f, 0.17f, 0.11f);
        gl.glVertex3f(-0.005f, 0.18f, 0.08f);
        
        /**
         * Sisi Kiri
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.005f, 0.0f, -0.01f);
        gl.glVertex3f(0.005f, 0.1f, -0.01f);
        gl.glVertex3f(-0.005f, 0.1f, -0.01f);
        gl.glVertex3f(-0.005f, 0.0f, -0.01f);
        
        gl.glVertex3f(0.005f, 0.1f, -0.01f);
        gl.glVertex3f(0.005f, 0.13f, -0.02f);
        gl.glVertex3f(-0.005f, 0.13f, -0.02f);
        gl.glVertex3f(-0.005f, 0.1f, -0.01f);
        
        gl.glVertex3f(0.005f, 0.13f, -0.02f);
        gl.glVertex3f(0.005f, 0.15f, -0.03f);
        gl.glVertex3f(-0.005f, 0.15f, -0.03f);
        gl.glVertex3f(-0.005f, 0.13f, -0.02f);
        
        gl.glVertex3f(0.005f, 0.15f, -0.03f);
        gl.glVertex3f(0.005f, 0.17f, -0.05f);
        gl.glVertex3f(-0.005f, 0.17f, -0.05f);
        gl.glVertex3f(-0.005f, 0.15f, -0.03f);
        
        gl.glVertex3f(0.005f, 0.17f, -0.05f);
        gl.glVertex3f(0.005f, 0.18f, -0.08f);
        gl.glVertex3f(-0.005f, 0.18f, -0.08f);
        gl.glVertex3f(-0.005f, 0.17f, -0.05f);
        
        gl.glVertex3f(0.005f, 0.18f, -0.08f);
        gl.glVertex3f(0.005f, 0.17f, -0.11f);
        gl.glVertex3f(-0.005f, 0.17f, -0.11f);
        gl.glVertex3f(-0.005f, 0.18f, -0.08f);
        
        gl.glEnd();
        
        gl.glRotatef(45, 0.0f, 1.0f, 0.0f);
        
        gl.glBegin(GL.GL_QUADS);
        
        /**
         * Sisi Depan
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.01f, 0.0f, 0.005f);
        gl.glVertex3f(0.01f, 0.1f, 0.005f);
        gl.glVertex3f(0.01f, 0.1f, -0.005f);
        gl.glVertex3f(0.01f, 0.0f, -0.005f);
        
        gl.glVertex3f(0.01f, 0.1f, 0.005f);
        gl.glVertex3f(0.02f, 0.13f, 0.005f);
        gl.glVertex3f(0.02f, 0.13f, -0.005f);
        gl.glVertex3f(0.01f, 0.1f, -0.005f);
        
        gl.glVertex3f(0.02f, 0.13f, 0.005f);
        gl.glVertex3f(0.03f, 0.15f, 0.005f);
        gl.glVertex3f(0.03f, 0.15f, -0.005f);
        gl.glVertex3f(0.02f, 0.13f, -0.005f);
        
        gl.glVertex3f(0.03f, 0.15f, 0.005f);
        gl.glVertex3f(0.05f, 0.17f, 0.005f);
        gl.glVertex3f(0.05f, 0.17f, -0.005f);
        gl.glVertex3f(0.03f, 0.15f, -0.005f);
        
        gl.glVertex3f(0.05f, 0.17f, 0.005f);
        gl.glVertex3f(0.08f, 0.18f, 0.005f);
        gl.glVertex3f(0.08f, 0.18f, -0.005f);
        gl.glVertex3f(0.05f, 0.17f, -0.005f);
        
        gl.glVertex3f(0.08f, 0.18f, 0.005f);
        gl.glVertex3f(0.11f, 0.17f, 0.005f);
        gl.glVertex3f(0.11f, 0.17f, -0.005f);
        gl.glVertex3f(0.08f, 0.18f, -0.005f);
        
        /**
         * Sisi Belakang
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(-0.01f, 0.0f, 0.005f);
        gl.glVertex3f(-0.01f, 0.1f, 0.005f);
        gl.glVertex3f(-0.01f, 0.1f, -0.005f);
        gl.glVertex3f(-0.01f, 0.0f, -0.005f);
        
        gl.glVertex3f(-0.01f, 0.1f, 0.005f);
        gl.glVertex3f(-0.02f, 0.13f, 0.005f);
        gl.glVertex3f(-0.02f, 0.13f, -0.005f);
        gl.glVertex3f(-0.01f, 0.1f, -0.005f);
        
        gl.glVertex3f(-0.02f, 0.13f, 0.005f);
        gl.glVertex3f(-0.03f, 0.15f, 0.005f);
        gl.glVertex3f(-0.03f, 0.15f, -0.005f);
        gl.glVertex3f(-0.02f, 0.13f, -0.005f);
        
        gl.glVertex3f(-0.03f, 0.15f, 0.005f);
        gl.glVertex3f(-0.05f, 0.17f, 0.005f);
        gl.glVertex3f(-0.05f, 0.17f, -0.005f);
        gl.glVertex3f(-0.03f, 0.15f, -0.005f);
        
        gl.glVertex3f(-0.05f, 0.17f, 0.005f);
        gl.glVertex3f(-0.08f, 0.18f, 0.005f);
        gl.glVertex3f(-0.08f, 0.18f, -0.005f);
        gl.glVertex3f(-0.05f, 0.17f, -0.005f);
        
        gl.glVertex3f(-0.08f, 0.18f, 0.005f);
        gl.glVertex3f(-0.11f, 0.17f, 0.005f);
        gl.glVertex3f(-0.11f, 0.17f, -0.005f);
        gl.glVertex3f(-0.08f, 0.18f, -0.005f);
        
        /**
         * Sisi Kanan
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.005f, 0.0f, 0.01f);
        gl.glVertex3f(0.005f, 0.1f, 0.01f);
        gl.glVertex3f(-0.005f, 0.1f, 0.01f);
        gl.glVertex3f(-0.005f, 0.0f, 0.01f);
        
        gl.glVertex3f(0.005f, 0.1f, 0.01f);
        gl.glVertex3f(0.005f, 0.13f, 0.02f);
        gl.glVertex3f(-0.005f, 0.13f, 0.02f);
        gl.glVertex3f(-0.005f, 0.1f, 0.01f);
        
        gl.glVertex3f(0.005f, 0.13f, 0.02f);
        gl.glVertex3f(0.005f, 0.15f, 0.03f);
        gl.glVertex3f(-0.005f, 0.15f, 0.03f);
        gl.glVertex3f(-0.005f, 0.13f, 0.02f);
        
        gl.glVertex3f(0.005f, 0.15f, 0.03f);
        gl.glVertex3f(0.005f, 0.17f, 0.05f);
        gl.glVertex3f(-0.005f, 0.17f, 0.05f);
        gl.glVertex3f(-0.005f, 0.15f, 0.03f);
        
        gl.glVertex3f(0.005f, 0.17f, 0.05f);
        gl.glVertex3f(0.005f, 0.18f, 0.08f);
        gl.glVertex3f(-0.005f, 0.18f, 0.08f);
        gl.glVertex3f(-0.005f, 0.17f, 0.05f);
        
        gl.glVertex3f(0.005f, 0.18f, 0.08f);
        gl.glVertex3f(0.005f, 0.17f, 0.11f);
        gl.glVertex3f(-0.005f, 0.17f, 0.11f);
        gl.glVertex3f(-0.005f, 0.18f, 0.08f);
        
        /**
         * Sisi Kiri
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.005f, 0.0f, -0.01f);
        gl.glVertex3f(0.005f, 0.1f, -0.01f);
        gl.glVertex3f(-0.005f, 0.1f, -0.01f);
        gl.glVertex3f(-0.005f, 0.0f, -0.01f);
        
        gl.glVertex3f(0.005f, 0.1f, -0.01f);
        gl.glVertex3f(0.005f, 0.13f, -0.02f);
        gl.glVertex3f(-0.005f, 0.13f, -0.02f);
        gl.glVertex3f(-0.005f, 0.1f, -0.01f);
        
        gl.glVertex3f(0.005f, 0.13f, -0.02f);
        gl.glVertex3f(0.005f, 0.15f, -0.03f);
        gl.glVertex3f(-0.005f, 0.15f, -0.03f);
        gl.glVertex3f(-0.005f, 0.13f, -0.02f);
        
        gl.glVertex3f(0.005f, 0.15f, -0.03f);
        gl.glVertex3f(0.005f, 0.17f, -0.05f);
        gl.glVertex3f(-0.005f, 0.17f, -0.05f);
        gl.glVertex3f(-0.005f, 0.15f, -0.03f);
        
        gl.glVertex3f(0.005f, 0.17f, -0.05f);
        gl.glVertex3f(0.005f, 0.18f, -0.08f);
        gl.glVertex3f(-0.005f, 0.18f, -0.08f);
        gl.glVertex3f(-0.005f, 0.17f, -0.05f);
        
        gl.glVertex3f(0.005f, 0.18f, -0.08f);
        gl.glVertex3f(0.005f, 0.17f, -0.11f);
        gl.glVertex3f(-0.005f, 0.17f, -0.11f);
        gl.glVertex3f(-0.005f, 0.18f, -0.08f);
        
        gl.glEnd();
    }
}
