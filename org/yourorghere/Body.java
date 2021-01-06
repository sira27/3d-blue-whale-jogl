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
public class Body {
    private GLAutoDrawable drawable;
    
    public Body(GLAutoDrawable drawable) {
        this.drawable = drawable;
    }
    
    public void drawBody() {
        eye();
        patternBody();
        refillBody();
    }
    
    private void eye() {
        GL gl = drawable.getGL();
        gl.glBegin(GL.GL_QUADS);
        
        /**
         * Mata Kanan
         */
        gl.glColor3f(0.0f, 0.0f, 0.0f); // Warna Hitam
        gl.glVertex3f(0.23f, 0.02f, 0.0625f);
        gl.glVertex3f(0.245f, 0.025f, 0.0625f);
        gl.glVertex3f(0.25f, 0.04f, 0.0625f);
        gl.glVertex3f(0.235f, 0.035f, 0.0625f);
        
        gl.glVertex3f(0.25f, 0.04f, 0.06f);
        gl.glVertex3f(0.245f, 0.025f, 0.0625f);
        gl.glVertex3f(0.255f, 0.025f, 0.0625f);
        gl.glVertex3f(0.25f, 0.04f, 0.0625f);
        
        gl.glVertex3f(0.25f, 0.04f, 0.0625f);
        gl.glVertex3f(0.255f, 0.025f, 0.0625f);
        gl.glVertex3f(0.27f, 0.02f ,0.0625f);
        gl.glVertex3f(0.265f, 0.035f, 0.0625f);
        
        /**
         * Mata Kiri
         */
        gl.glColor3f(0.0f, 0.0f, 0.0f); // Hitam
        gl.glVertex3f(0.23f, 0.02f, -0.0625f);
        gl.glVertex3f(0.245f, 0.025f, -0.0625f);
        gl.glVertex3f(0.25f, 0.04f, -0.0625f);
        gl.glVertex3f(0.235f, 0.035f, -0.0625f);
        
        gl.glVertex3f(0.25f, 0.04f, -0.0625f);
        gl.glVertex3f(0.245f, 0.025f, -0.0625f);
        gl.glVertex3f(0.255f, 0.025f, -0.0625f);
        gl.glVertex3f(0.25f, 0.04f, -0.0625f);
        
        gl.glVertex3f(0.25f, 0.04f, -0.0625f);
        gl.glVertex3f(0.255f, 0.025f, -0.0625f);
        gl.glVertex3f(0.27f, 0.02f, -0.0625f);
        gl.glVertex3f(0.265f, 0.035f, -0.0625f);
        
        gl.glEnd();
    }
    
    private void patternBody() {
        GL gl = drawable.getGL();
        gl.glBegin(GL.GL_QUADS);
        
        // Kerangka Paus
        /**
         * Perut
         */
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-Abu
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        gl.glVertex3f(-0.44f, -0.04f, 0.005f);
        gl.glVertex3f(-0.44f, -0.04f, -0.005f);
        
        gl.glVertex3f(-0.44f, -0.04f, -0.005f);
        gl.glVertex3f(-0.44f, -0.04f, 0.005f);
        gl.glVertex3f(-0.39f, -0.03f, 0.0075f);
        gl.glVertex3f(-0.39f, -0.03f, -0.0075f);
        
        gl.glVertex3f(-0.39f, -0.03f, -0.0075f);
        gl.glVertex3f(-0.39f, -0.03f, 0.0075f);
        gl.glVertex3f(-0.35f, -0.02f, 0.01f);
        gl.glVertex3f(-0.35f, -0.02f, -0.01f);
        
        gl.glVertex3f(-0.35f, -0.02f, -0.01f);
        gl.glVertex3f(-0.35f, -0.02f, 0.01f);
        gl.glVertex3f(-0.30f, -0.01f, 0.01f);
        gl.glVertex3f(-0.30f, -0.01f, -0.01f);
        
        gl.glVertex3f(-0.30f, -0.01f, -0.01f);
        gl.glVertex3f(-0.30f, -0.01f, 0.01f);
        gl.glVertex3f(-0.19f, -0.01f, 0.01f);
        gl.glVertex3f(-0.19f, -0.01f, -0.01f);
        
        gl.glVertex3f(-0.19f, -0.01f, -0.01f);
        gl.glVertex3f(-0.19f, -0.01f, 0.01f);
        gl.glVertex3f(-0.14f, -0.02f, 0.01f);
        gl.glVertex3f(-0.14f, -0.02f, -0.01f);
        
        gl.glVertex3f(-0.14f, -0.02f, -0.01f);
        gl.glVertex3f(-0.14f, -0.02f, 0.01f);
        gl.glVertex3f(-0.09f, -0.03f, 0.01f);
        gl.glVertex3f(-0.09f, -0.03f, -0.01f);
        
        gl.glVertex3f(-0.09f, -0.03f, -0.01f);
        gl.glVertex3f(-0.09f, -0.03f, 0.01f);
        gl.glVertex3f(0.0f, -0.05f, 0.01f);
        gl.glVertex3f(0.0f, -0.05f, -0.01f);
        
        gl.glVertex3f(0.0f, -0.05f, -0.01f);
        gl.glVertex3f(0.0f, -0.05f, 0.01f);
        gl.glVertex3f(0.25f, -0.05f, 0.01f);
        gl.glVertex3f(0.25f, -0.05f, -0.01f);
        
        gl.glVertex3f(0.25f, -0.05f, -0.01f);
        gl.glVertex3f(0.25f, -0.05f, 0.01f);
        gl.glVertex3f(0.3f, -0.04f, 0.01f);
        gl.glVertex3f(0.3f, -0.04f, -0.01f);
        
        gl.glVertex3f(0.3f, -0.04f, -0.01f);
        gl.glVertex3f(0.3f, -0.04f, 0.01f);
        gl.glVertex3f(0.35f, -0.03f, 0.01f);
        gl.glVertex3f(0.35f, -0.03f, -0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.35f, -0.03f, -0.01f);
        gl.glVertex3f(0.35f, -0.03f, 0.01f);
        gl.glVertex3f(0.4f, -0.01f, 0.01f);
        gl.glVertex3f(0.4f, -0.01f, -0.01f);
        
        gl.glVertex3f(0.4f, -0.01f, -0.01f);
        gl.glVertex3f(0.4f, -0.01f, 0.01f);
        gl.glVertex3f(0.43f, 0.02f, 0.01f);
        gl.glVertex3f(0.43f, 0.02f, -0.01f);
        
        /**
         * Punggung
         */
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru Tua
        gl.glVertex3f(0.43f, 0.02f, -0.01f);
        gl.glVertex3f(0.43f, 0.02f, 0.01f);
        gl.glVertex3f(0.43f, 0.04f, 0.01f);
        gl.glVertex3f(0.43f, 0.04f, -0.01f);
        
        gl.glVertex3f(0.43f, 0.04f, -0.01f);
        gl.glVertex3f(0.43f, 0.04f, 0.01f);
        gl.glVertex3f(0.38f, 0.06f, 0.01f);
        gl.glVertex3f(0.38f, 0.06f, -0.01f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru
        gl.glVertex3f(0.38f, 0.06f, -0.01f);
        gl.glVertex3f(0.38f, 0.06f, 0.01f);
        gl.glVertex3f(0.31f, 0.07f, 0.01f);
        gl.glVertex3f(0.31f, 0.07f, -0.01f);
        
        gl.glVertex3f(0.31f, 0.07f, -0.01f);
        gl.glVertex3f(0.31f, 0.07f, 0.01f);
        gl.glVertex3f(0.21f, 0.08f, 0.01f);
        gl.glVertex3f(0.21f, 0.08f, -0.01f);
        
        gl.glVertex3f(0.21f, 0.08f, -0.01f);
        gl.glVertex3f(0.21f, 0.08f, 0.01f);
        gl.glVertex3f(0.1f, 0.09f, 0.01f);
        gl.glVertex3f(0.1f, 0.09f, -0.01f);
        
        gl.glVertex3f(0.1f, 0.09f, -0.01f);
        gl.glVertex3f(0.1f, 0.09f, 0.01f);
        gl.glVertex3f(0.01f, 0.09f, 0.01f);
        gl.glVertex3f(0.01f, 0.09f, -0.01f);
        
        gl.glVertex3f(0.01f, 0.09f, -0.01f);
        gl.glVertex3f(0.01f, 0.09f, 0.01f);
        gl.glVertex3f(-0.1f, 0.085f, 0.01f);
        gl.glVertex3f(-0.1f, 0.085f, -0.01f);
        
        gl.glVertex3f(-0.1f, 0.085f, -0.01f);
        gl.glVertex3f(-0.1f, 0.085f, 0.01f);
        gl.glVertex3f(-0.19f, 0.08f, 0.01f);
        gl.glVertex3f(-0.19f, 0.08f, -0.01f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.23f, 0.07f, -0.01f);
        gl.glVertex3f(-0.23f, 0.07f, 0.01f);
        gl.glVertex3f(-0.3f, 0.06f, 0.01f);
        gl.glVertex3f(-0.3f, 0.06f, -0.01f);
        
        gl.glVertex3f(-0.3f, 0.06f, -0.01f);
        gl.glVertex3f(-0.3f, 0.06f, 0.01f);
        gl.glVertex3f(-0.34f, 0.05f, 0.01f);
        gl.glVertex3f(-0.34f, 0.05f, -0.01f);
        
        gl.glVertex3f(-0.34f, 0.05f, -0.01f);
        gl.glVertex3f(-0.34f, 0.05f, 0.01f);
        gl.glVertex3f(-0.39f, 0.02f, 0.0075f);
        gl.glVertex3f(-0.39f, 0.02f, -0.0075f);
        
        gl.glVertex3f(-0.39f, 0.02f, -0.0075f);
        gl.glVertex3f(-0.39f, 0.02f, 0.0075f);
        gl.glVertex3f(-0.44f, -0.01f, 0.005f);
        gl.glVertex3f(-0.44f, -0.01f, -0.005f);
        
        gl.glVertex3f(-0.44f, -0.01f, -0.005f);
        gl.glVertex3f(-0.44f, -0.01f, 0.005f);
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
            
        /**
         * Sisi Kanan
         */
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru Tua
        gl.glVertex3f(-0.41f, -0.01f, 0.02f);
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        gl.glVertex3f(-0.41f, -0.02f, 0.02f);
        
        gl.glVertex3f(-0.35f, 0.02f, 0.03f);
        gl.glVertex3f(-0.41f, -0.01f, 0.02f);
        gl.glVertex3f(-0.41f, -0.02f, 0.02f);
        gl.glVertex3f(-0.35f, 0.0f, 0.03f);
        
        gl.glVertex3f(-0.25f, 0.04f, 0.04f);
        gl.glVertex3f(-0.35f, 0.02f, 0.03f);
        gl.glVertex3f(-0.35f, 0.0f, 0.03f);
        gl.glVertex3f(-0.25f, 0.02f, 0.04f);
        
        gl.glVertex3f(-0.25f, 0.02f, 0.04f);
        gl.glVertex3f(-0.15f, 0.02f, 0.05f);
        gl.glVertex3f(-0.15f, 0.04f, 0.05f);
        gl.glVertex3f(-0.25f, 0.04f, 0.04f);
        
        gl.glVertex3f(-0.15f, 0.02f, 0.05f);
        gl.glVertex3f(-0.07f, 0.02f, 0.07f);
        gl.glVertex3f(-0.07f, 0.04f, 0.07f);
        gl.glVertex3f(-0.15f, 0.04f, 0.05f);
        
        gl.glVertex3f(-0.07f, 0.02f, 0.07f);
        gl.glVertex3f(0.0f, 0.02f, 0.08f);
        gl.glVertex3f(0.0f, 0.04f, 0.08f);
        gl.glVertex3f(-0.07f, 0.04f, 0.07f);
        
        gl.glVertex3f(0.0f, 0.02f, 0.08f);
        gl.glVertex3f(0.05f, 0.02f, 0.08f);
        gl.glVertex3f(0.05f, 0.04f, 0.08f);
        gl.glVertex3f(0.0f, 0.04f, 0.08f);
        
        gl.glVertex3f(0.05f, 0.02f, 0.08f);
        gl.glVertex3f(0.15f, 0.02f, 0.07f);
        gl.glVertex3f(0.15f, 0.04f, 0.07f);
        gl.glVertex3f(0.05f, 0.04f, 0.08f);
        
        gl.glVertex3f(0.15f, 0.02f, 0.07f);
        gl.glVertex3f(0.25f, 0.02f, 0.06f);
        gl.glVertex3f(0.25f, 0.04f, 0.06f);
        gl.glVertex3f(0.15f, 0.04f, 0.07f);
        
        gl.glVertex3f(0.25f, 0.02f, 0.06f);
        gl.glVertex3f(0.33f, 0.02f, 0.05f);
        gl.glVertex3f(0.33f, 0.04f, 0.05f);
        gl.glVertex3f(0.25f, 0.04f, 0.06f);
        
        gl.glVertex3f(0.33f, 0.02f, 0.05f);
        gl.glVertex3f(0.37f, 0.02f, 0.04f);
        gl.glVertex3f(0.37f, 0.04f, 0.04f);
        gl.glVertex3f(0.33f, 0.04f, 0.05f);
        
        gl.glVertex3f(0.37f, 0.02f, 0.04f);
        gl.glVertex3f(0.4f, 0.02f, 0.03f);
        gl.glVertex3f(0.4f, 0.04f, 0.03f);
        gl.glVertex3f(0.37f, 0.04f, 0.04f);
        
        gl.glVertex3f(0.4f, 0.02f, 0.03f);
        gl.glVertex3f(0.42f, 0.02f, 0.02f);
        gl.glVertex3f(0.42f, 0.04f, 0.02f);
        gl.glVertex3f(0.4f, 0.04f, 0.03f);
        
        gl.glVertex3f(0.42f, 0.02f, 0.02f);
        gl.glVertex3f(0.43f, 0.02f, 0.0f);
        gl.glVertex3f(0.43f, 0.04f, 0.0f);
        gl.glVertex3f(0.42f, 0.04f, 0.02f);
        
        /**
         * Sisi Kiri
         */
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.41f, -0.01f, -0.02f);
        gl.glVertex3f(-0.49f, -0.05f, -0.0f);
        gl.glVertex3f(-0.49f, -0.05f, -0.0f);
        gl.glVertex3f(-0.41f, -0.02f, -0.02f);
        
        gl.glVertex3f(-0.35f, 0.02f, -0.03f);
        gl.glVertex3f(-0.41f, -0.01f, -0.02f);
        gl.glVertex3f(-0.41f, -0.02f, -0.02f);
        gl.glVertex3f(-0.35f, 0.0f, -0.03f);
        
        gl.glVertex3f(-0.25f, 0.04f, -0.04f);
        gl.glVertex3f(-0.35f, 0.02f, -0.03f);
        gl.glVertex3f(-0.35f, 0.0f, -0.03f);
        gl.glVertex3f(-0.25f, 0.02f, -0.04f);
        
        gl.glVertex3f(-0.25f, 0.02f, -0.04f);
        gl.glVertex3f(-0.15f, 0.02f, -0.05f);
        gl.glVertex3f(-0.15f, 0.04f, -0.05f);
        gl.glVertex3f(-0.25f, 0.04f, -0.04f);
        
        gl.glVertex3f(-0.15f, 0.02f, -0.05f);
        gl.glVertex3f(-0.07f, 0.02f, -0.07f);
        gl.glVertex3f(-0.07f, 0.04f, -0.07f);
        gl.glVertex3f(-0.15f, 0.04f, -0.05f);
        
        gl.glVertex3f(-0.07f, 0.02f, -0.07f);
        gl.glVertex3f(0.0f, 0.02f, -0.08f);
        gl.glVertex3f(0.0f, 0.04f, -0.08f);
        gl.glVertex3f(-0.07f, 0.04f, -0.07f);
        
        gl.glVertex3f(0.0f, 0.02f, -0.08f);
        gl.glVertex3f(0.05f, 0.02f, -0.08f);
        gl.glVertex3f(0.05f, 0.04f, -0.08f);
        gl.glVertex3f(0.0f, 0.04f, -0.08f);
        
        gl.glVertex3f(0.05f, 0.02f, -0.08f);
        gl.glVertex3f(0.15f, 0.02f, -0.07f);
        gl.glVertex3f(0.15f, 0.04f, -0.07f);
        gl.glVertex3f(0.05f, 0.04f, -0.08f);
        
        gl.glVertex3f(0.15f, 0.02f, -0.07f);
        gl.glVertex3f(0.25f, 0.02f, -0.06f);
        gl.glVertex3f(0.25f, 0.04f, -0.06f);
        gl.glVertex3f(0.15f, 0.04f, -0.07f);
        
        gl.glVertex3f(0.25f, 0.02f, -0.06f);
        gl.glVertex3f(0.33f, 0.02f, -0.05f);
        gl.glVertex3f(0.33f, 0.04f, -0.05f);
        gl.glVertex3f(0.25f, 0.04f, -0.06f);
        
        gl.glVertex3f(0.33f, 0.02f, -0.05f);
        gl.glVertex3f(0.37f, 0.02f, -0.04f);
        gl.glVertex3f(0.37f, 0.04f, -0.04f);
        gl.glVertex3f(0.33f, 0.04f, -0.05f);
        
        gl.glVertex3f(0.37f, 0.02f, -0.04f);
        gl.glVertex3f(0.4f, 0.02f, -0.03f);
        gl.glVertex3f(0.4f, 0.04f, -0.03f);
        gl.glVertex3f(0.37f, 0.04f, -0.04f);
        
        gl.glVertex3f(0.4f, 0.02f, -0.03f);
        gl.glVertex3f(0.42f, 0.02f, -0.02f);
        gl.glVertex3f(0.42f, 0.04f, -0.02f);
        gl.glVertex3f(0.4f, 0.04f, -0.03f);
        
        gl.glVertex3f(0.42f, 0.02f, -0.02f);
        gl.glVertex3f(0.43f, 0.02f, -0.0f);
        gl.glVertex3f(0.43f, 0.04f, -0.0f);
        gl.glVertex3f(0.42f, 0.04f, -0.02f);
        
        /**
         * Sirip Atas
         */
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru Tua
        gl.glVertex3f(-0.19f, 0.08f, -0.01f);
        gl.glVertex3f(-0.19f, 0.08f, 0.01f);
        gl.glVertex3f(-0.23f, 0.095f, 0.005f);
        gl.glVertex3f(-0.23f, 0.095f, -0.005f);
        
        gl.glVertex3f(-0.23f, 0.095f, -0.005f);
        gl.glVertex3f(-0.23f, 0.095f, 0.005f);
        gl.glVertex3f(-0.25f, 0.095f, 0.0f);
        gl.glVertex3f(-0.25f, 0.095f, -0.0f);
        
        gl.glVertex3f(-0.25f, 0.095f, -0.0f);
        gl.glVertex3f(-0.25f, 0.095f, 0.0f);
        gl.glVertex3f(-0.23f, 0.07f, 0.01f);
        gl.glVertex3f(-0.23f, 0.07f, -0.01f);

        gl.glEnd();
    }
    
    private void refillBody() {
        GL gl = drawable.getGL();
        gl.glBegin(GL.GL_QUADS);
        
        // Fill Seluruh Badan
        /**
         * Punggung Kanan
         */
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        gl.glVertex3f(-0.44f, -0.01f, 0.005f);
        gl.glVertex3f(-0.41f, -0.01f, 0.02f);
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        
        gl.glVertex3f(-0.41f, -0.01f, 0.02f);
        gl.glVertex3f(-0.44f, -0.01f, 0.005f);
        gl.glVertex3f(-0.39f, 0.02f, 0.0075f);
        gl.glVertex3f(-0.41f, -0.01f, 0.02f);
        
        gl.glVertex3f(-0.39f, 0.02f, 0.0075f);
        gl.glVertex3f(-0.34f, 0.05f, 0.01f);
        gl.glVertex3f(-0.35f, 0.02f, 0.03f);
        gl.glVertex3f(-0.41f, -0.01f, 0.02f);
        
        gl.glVertex3f(-0.34f, 0.05f, 0.01f);
        gl.glVertex3f(-0.30f, 0.06f, 0.01f);
        gl.glVertex3f(-0.30f, 0.0425f, 0.0285f);
        gl.glVertex3f(-0.35f, 0.02f, 0.03f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.35f, 0.02f, 0.03f);
        gl.glVertex3f(-0.30f, 0.0425f, 0.0285f);
        gl.glVertex3f(-0.30f, 0.03f, 0.035f);
        gl.glVertex3f(-0.35f, 0.02f, 0.03f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.30f, 0.06f, 0.01f);
        gl.glVertex3f(-0.23f, 0.07f, 0.01f);
        gl.glVertex3f(-0.24f, 0.055f, 0.03f);
        gl.glVertex3f(-0.30f, 0.0425f, 0.0285f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.30f, 0.0425f, 0.0285f);
        gl.glVertex3f(-0.24f, 0.055f, 0.03f);
        gl.glVertex3f(-0.25f, 0.04f, 0.04f);
        gl.glVertex3f(-0.30f, 0.03f, 0.035f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.23f, 0.07f, 0.01f);
        gl.glVertex3f(-0.19f, 0.08f, 0.01f);
        gl.glVertex3f(-0.195f, 0.06f, 0.033f);
        gl.glVertex3f(-0.24f, 0.055f, 0.03f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.24f, 0.055f, 0.03f);
        gl.glVertex3f(-0.195f, 0.06f, 0.033f);
        gl.glVertex3f(-0.20f, 0.04f, 0.045f);
        gl.glVertex3f(-0.25f, 0.04f, 0.04f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.19f, 0.08f, 0.01f);
        gl.glVertex3f(-0.145f, 0.0825f, 0.01f);
        gl.glVertex3f(-0.1475f, 0.06125f, 0.04f);
        gl.glVertex3f(-0.195f, 0.06f, 0.033f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.195f, 0.06f, 0.033f);
        gl.glVertex3f(-0.1475f, 0.06125f, 0.04f);
        gl.glVertex3f(-0.15f, 0.04f, 0.05f);
        gl.glVertex3f(-0.20f, 0.04f, 0.045f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.145f, 0.0825f, 0.01f);
        gl.glVertex3f(-0.1f, 0.085f, 0.01f);
        gl.glVertex3f(-0.085f, 0.0625f, 0.05f);
        gl.glVertex3f(-0.1475f, 0.06125f, 0.04f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.1475f, 0.06125f, 0.04f);
        gl.glVertex3f(-0.085f, 0.0625f, 0.05f);
        gl.glVertex3f(-0.07f, 0.04f, 0.07f);
        gl.glVertex3f(-0.15f, 0.04f, 0.05f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.1f, 0.085f, 0.01f);
        gl.glVertex3f(-0.045f, 0.0875f, 0.01f);
        gl.glVertex3f(-0.0225f, 0.06375f, 0.055f);
        gl.glVertex3f(-0.085f, 0.0625f, 0.05f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.085f, 0.0625f, 0.05f);
        gl.glVertex3f(-0.0225f, 0.06375f, 0.055f);
        gl.glVertex3f(0.0f, 0.04f, 0.08f);
        gl.glVertex3f(-0.07f, 0.04f, 0.07f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.045f, 0.0875f, 0.01f);
        gl.glVertex3f(0.01f, 0.09f, 0.01f);
        gl.glVertex3f(0.03f, 0.065f, 0.055f);
        gl.glVertex3f(-0.0225f, 0.06375f, 0.055f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.0225f, 0.06375f, 0.055f);
        gl.glVertex3f(0.03f, 0.065f, 0.055f);
        gl.glVertex3f(0.05f, 0.04f, 0.08f);
        gl.glVertex3f(0.0f, 0.04f, 0.08f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(0.01f, 0.09f, 0.01f);
        gl.glVertex3f(0.1f, 0.09f, 0.01f);
        gl.glVertex3f(0.125f, 0.065f, 0.05f);
        gl.glVertex3f(0.03f, 0.065f, 0.055f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(0.03f, 0.065f, 0.055f);
        gl.glVertex3f(0.125f, 0.065f, 0.05f);
        gl.glVertex3f(0.15f, 0.04f, 0.07f);
        gl.glVertex3f(0.05f, 0.04f, 0.08f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(0.1f, 0.09f, 0.01f);
        gl.glVertex3f(0.21f, 0.08f, 0.01f);
        gl.glVertex3f(0.23f, 0.06f, 0.045f);
        gl.glVertex3f(0.125f, 0.065f, 0.05f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(0.125f, 0.065f, 0.05f);
        gl.glVertex3f(0.23f, 0.06f, 0.045f);
        gl.glVertex3f(0.25f, 0.04f, 0.06f);
        gl.glVertex3f(0.15f, 0.04f, 0.07f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(0.21f, 0.08f, 0.01f);
        gl.glVertex3f(0.31f, 0.07f, 0.01f);
        gl.glVertex3f(0.32f, 0.06f, 0.03f);
        gl.glVertex3f(0.23f, 0.06f, 0.045f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(0.23f, 0.06f, 0.045f);
        gl.glVertex3f(0.32f, 0.06f, 0.03f);
        gl.glVertex3f(0.33f, 0.04f, 0.05f);
        gl.glVertex3f(0.25f, 0.04f, 0.06f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(0.31f, 0.07f, 0.01f);
        gl.glVertex3f(0.38f, 0.06f, 0.01f);
        gl.glVertex3f(0.38f, 0.06f, 0.01f);
        gl.glVertex3f(0.32f, 0.06f, 0.03f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(0.32f, 0.06f, 0.03f);
        gl.glVertex3f(0.35f, 0.06f, 0.02f);
        gl.glVertex3f(0.37f, 0.04f, 0.04f);
        gl.glVertex3f(0.33f, 0.04f, 0.05f);
        
        gl.glVertex3f(0.35f, 0.06f, 0.02f);
        gl.glVertex3f(0.38f, 0.06f, 0.01f);
        gl.glVertex3f(0.4f, 0.04f, 0.03f);
        gl.glVertex3f(0.37f, 0.04f, 0.04f);
        
        gl.glVertex3f(0.38f, 0.06f, 0.01f);
        gl.glVertex3f(0.4f, 0.04f, 0.03f);
        gl.glVertex3f(0.42f, 0.04f, 0.02f);
        gl.glVertex3f(0.38f, 0.06f, 0.01f);
        
        gl.glVertex3f(0.38f, 0.06f, 0.01f);
        gl.glVertex3f(0.43f, 0.04f, 0.0f);
        gl.glVertex3f(0.42f, 0.04f, 0.02f);
        gl.glVertex3f(0.38f, 0.06f, 0.01f);
        
        /**
         * Punggung Kiri
         */
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        gl.glVertex3f(-0.44f, -0.01f, -0.005f);
        gl.glVertex3f(-0.41f, -0.01f, -0.02f);
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        
        gl.glVertex3f(-0.41f, -0.01f, -0.02f);
        gl.glVertex3f(-0.44f, -0.01f, -0.005f);
        gl.glVertex3f(-0.39f, 0.02f, -0.0075f);
        gl.glVertex3f(-0.41f, -0.01f, -0.02f);
        
        gl.glVertex3f(-0.39f, 0.02f, -0.0075f);
        gl.glVertex3f(-0.34f, 0.05f, -0.01f);
        gl.glVertex3f(-0.35f, 0.02f, -0.03f);
        gl.glVertex3f(-0.41f, -0.01f, -0.02f);
        
        gl.glVertex3f(-0.34f, 0.05f, -0.01f);
        gl.glVertex3f(-0.30f, 0.06f, -0.01f);
        gl.glVertex3f(-0.30f, 0.0425f, -0.0285f);
        gl.glVertex3f(-0.35f, 0.02f, -0.03f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.35f, 0.02f, -0.03f);
        gl.glVertex3f(-0.30f, 0.0425f, -0.0285f);
        gl.glVertex3f(-0.30f, 0.03f, -0.035f);
        gl.glVertex3f(-0.35f, 0.02f, -0.03f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.30f, 0.06f, -0.01f);
        gl.glVertex3f(-0.23f, 0.07f, -0.01f);
        gl.glVertex3f(-0.24f, 0.055f, -0.03f);
        gl.glVertex3f(-0.30f, 0.0425f, -0.0285f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.30f, 0.0425f, -0.0285f);
        gl.glVertex3f(-0.24f, 0.055f, -0.03f);
        gl.glVertex3f(-0.25f, 0.04f, -0.04f);
        gl.glVertex3f(-0.30f, 0.03f, -0.035f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.23f, 0.07f, -0.01f);
        gl.glVertex3f(-0.19f, 0.08f, -0.01f);
        gl.glVertex3f(-0.195f, 0.06f, -0.033f);
        gl.glVertex3f(-0.24f, 0.055f, -0.03f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.24f, 0.055f, -0.03f);
        gl.glVertex3f(-0.195f, 0.06f, -0.033f);
        gl.glVertex3f(-0.20f, 0.04f, -0.045f);
        gl.glVertex3f(-0.25f, 0.04f, -0.04f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.19f, 0.08f, -0.01f);
        gl.glVertex3f(-0.145f, 0.0825f, -0.01f);
        gl.glVertex3f(-0.1475f, 0.06125f, -0.04f);
        gl.glVertex3f(-0.195f, 0.06f, -0.033f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.195f, 0.06f, -0.033f);
        gl.glVertex3f(-0.1475f, 0.06125f, -0.04f);
        gl.glVertex3f(-0.15f, 0.04f, -0.05f);
        gl.glVertex3f(-0.20f, 0.04f, -0.045f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.145f, 0.0825f, -0.01f);
        gl.glVertex3f(-0.1f, 0.085f, -0.01f);
        gl.glVertex3f(-0.085f, 0.0625f, -0.05f);
        gl.glVertex3f(-0.1475f, 0.06125f, -0.04f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.1475f, 0.06125f, -0.04f);
        gl.glVertex3f(-0.085f, 0.0625f, -0.05f);
        gl.glVertex3f(-0.07f, 0.04f, -0.07f);
        gl.glVertex3f(-0.15f, 0.04f, -0.05f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.1f, 0.085f, -0.01f);
        gl.glVertex3f(-0.045f, 0.0875f, -0.01f);
        gl.glVertex3f(-0.0225f, 0.06375f, -0.055f);
        gl.glVertex3f(-0.085f, 0.0625f, -0.05f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.085f, 0.0625f, -0.05f);
        gl.glVertex3f(-0.0225f, 0.06375f, -0.055f);
        gl.glVertex3f(0.0f, 0.04f, -0.08f);
        gl.glVertex3f(-0.07f, 0.04f, -0.07f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.045f, 0.0875f, -0.01f);
        gl.glVertex3f(0.01f, 0.09f, -0.01f);
        gl.glVertex3f(0.03f, 0.065f, -0.055f);
        gl.glVertex3f(-0.0225f, 0.06375f, -0.055f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(-0.0225f, 0.06375f, -0.055f);
        gl.glVertex3f(0.03f, 0.065f, -0.055f);
        gl.glVertex3f(0.05f, 0.04f, -0.08f);
        gl.glVertex3f(0.0f, 0.04f, -0.08f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(0.01f, 0.09f, -0.01f);
        gl.glVertex3f(0.1f, 0.09f, -0.01f);
        gl.glVertex3f(0.125f, 0.065f, -0.05f);
        gl.glVertex3f(0.03f, 0.065f, -0.055f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(0.03f, 0.065f, -0.055f);
        gl.glVertex3f(0.125f, 0.065f, -0.05f);
        gl.glVertex3f(0.15f, 0.04f, -0.07f);
        gl.glVertex3f(0.05f, 0.04f, -0.08f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(0.1f, 0.09f, -0.01f);
        gl.glVertex3f(0.21f, 0.08f, -0.01f);
        gl.glVertex3f(0.23f, 0.06f, -0.045f);
        gl.glVertex3f(0.125f, 0.065f, -0.05f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(0.125f, 0.065f, -0.05f);
        gl.glVertex3f(0.23f, 0.06f, -0.045f);
        gl.glVertex3f(0.25f, 0.04f, -0.06f);
        gl.glVertex3f(0.15f, 0.04f, -0.07f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(0.21f, 0.08f, -0.01f);
        gl.glVertex3f(0.31f, 0.07f, -0.01f);
        gl.glVertex3f(0.32f, 0.06f, -0.03f);
        gl.glVertex3f(0.23f, 0.06f, -0.045f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(0.23f, 0.06f, -0.045f);
        gl.glVertex3f(0.32f, 0.06f, -0.03f);
        gl.glVertex3f(0.33f, 0.04f, -0.05f);
        gl.glVertex3f(0.25f, 0.04f, -0.06f);
        
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(0.31f, 0.07f, -0.01f);
        gl.glVertex3f(0.38f, 0.06f, -0.01f);
        gl.glVertex3f(0.38f, 0.06f, -0.01f);
        gl.glVertex3f(0.32f, 0.06f, -0.03f);
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // Warna Biru
        gl.glVertex3f(0.32f, 0.06f, -0.03f);
        gl.glVertex3f(0.35f, 0.06f, -0.02f);
        gl.glVertex3f(0.37f, 0.04f, -0.04f);
        gl.glVertex3f(0.33f, 0.04f, -0.05f);
        
        gl.glVertex3f(0.35f, 0.06f, -0.02f);
        gl.glVertex3f(0.38f, 0.06f, -0.01f);
        gl.glVertex3f(0.4f, 0.04f, -0.03f);
        gl.glVertex3f(0.37f, 0.04f, -0.04f);
        
        gl.glVertex3f(0.38f, 0.06f, -0.01f);
        gl.glVertex3f(0.4f, 0.04f, -0.03f);
        gl.glVertex3f(0.42f, 0.04f, -0.02f);
        gl.glVertex3f(0.38f, 0.06f, -0.01f);
        
        gl.glVertex3f(0.38f, 0.06f, -0.01f);
        gl.glVertex3f(0.43f, 0.04f, -0.0f);
        gl.glVertex3f(0.42f, 0.04f, -0.02f);
        gl.glVertex3f(0.38f, 0.06f, -0.01f);
        
        /**
         * Perut Kanan
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        gl.glVertex3f(-0.49f, -0.05f, 0.0f);
        gl.glVertex3f(-0.44f, -0.04f, 0.005f);
        gl.glVertex3f(-0.41f, -0.02f, 0.02f);
        
        gl.glVertex3f(-0.44f, -0.04f, 0.005f);
        gl.glVertex3f(-0.41f, -0.02f, 0.02f);
        gl.glVertex3f(-0.35f, 0.0f, 0.03f);
        gl.glVertex3f(-0.39f, -0.03f, 0.0075f);
        
        gl.glVertex3f(-0.35f, 0.0f, 0.03f);
        gl.glVertex3f(-0.39f, -0.03f, 0.0075f);
        gl.glVertex3f(-0.35f, -0.02f, 0.01f);
        gl.glVertex3f(-0.25f, 0.02f, 0.04f);
        
        gl.glVertex3f(-0.39f, -0.03f, 0.0075f);
        gl.glVertex3f(-0.39f, -0.03f, 0.0075f);
        gl.glVertex3f(-0.25f, 0.02f, 0.04f);
        gl.glVertex3f(-0.30f, -0.01f, 0.01f);
        
        gl.glVertex3f(-0.25f, 0.02f, 0.04f);
        gl.glVertex3f(-0.30f, -0.01f, 0.01f);
        gl.glVertex3f(-0.17f, 0.001f, 0.03f);
        gl.glVertex3f(-0.15f, 0.02f, 0.05f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(-0.30f, -0.01f, 0.01f);
        gl.glVertex3f(-0.30f, -0.01f, 0.01f);
        gl.glVertex3f(-0.17f, 0.001f, 0.03f);
        gl.glVertex3f(-0.19f, -0.01f, 0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(-0.15f, 0.02f, 0.05f);
        gl.glVertex3f(-0.17f, 0.001f, 0.03f);
        gl.glVertex3f(-0.08f, -0.006f, 0.045f);
        gl.glVertex3f(-0.07f, 0.02f, 0.07f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(-0.19f, -0.01f, 0.01f);
        gl.glVertex3f(-0.17f, 0.001f, 0.03f);
        gl.glVertex3f(-0.125f, -0.0015f, 0.04f);
        gl.glVertex3f(-0.14f, -0.02f, 0.01f);
        
        gl.glVertex3f(-0.14f, -0.02f, 0.01f);
        gl.glVertex3f(-0.125f, -0.0015f, 0.04f);
        gl.glVertex3f(-0.08f, -0.006f, 0.045f);
        gl.glVertex3f(-0.09f, -0.03f, 0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(-0.07f, 0.02f, 0.07f);
        gl.glVertex3f(-0.08f, -0.006f, 0.045f);
        gl.glVertex3f(0.0f, -0.025f, 0.055f);
        gl.glVertex3f(0.0f, 0.02f, 0.08f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(-0.09f, -0.03f, 0.01f);
        gl.glVertex3f(-0.08f, -0.006f, 0.045f);
        gl.glVertex3f(0.0f, -0.025f, 0.055f);
        gl.glVertex3f(0.0f, -0.05f, 0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.05f, 0.02f, 0.08f);
        gl.glVertex3f(0.05f, -0.025f, 0.055f);
        gl.glVertex3f(0.0f, -0.025f, 0.055f);
        gl.glVertex3f(0.0f, 0.02f, 0.08f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(0.0f, -0.05f, 0.01f);
        gl.glVertex3f(0.0f, -0.025f, 0.055f);
        gl.glVertex3f(0.05f, -0.025f, 0.055f);
        gl.glVertex3f(0.05f, -0.05f, 0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.05f, 0.02f, 0.08f);
        gl.glVertex3f(0.05f, -0.025f, 0.055f);
        gl.glVertex3f(0.15f, -0.025f, 0.05f);
        gl.glVertex3f(0.15f, 0.02f, 0.07f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(0.05f, -0.05f, 0.01f);
        gl.glVertex3f(0.05f, -0.025f, 0.055f);
        gl.glVertex3f(0.15f, -0.025f, 0.05f);
        gl.glVertex3f(0.15f, -0.05f, 0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.15f, 0.02f, 0.07f);
        gl.glVertex3f(0.15f, -0.025f, 0.05f);
        gl.glVertex3f(0.25f, -0.025f, 0.04f);
        gl.glVertex3f(0.25f, 0.02f, 0.06f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(0.15f, -0.05f, 0.01f);
        gl.glVertex3f(0.15f, -0.025f, 0.05f);
        gl.glVertex3f(0.25f, -0.025f, 0.04f);
        gl.glVertex3f(0.25f, -0.05f, 0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.25f, 0.02f, 0.06f);
        gl.glVertex3f(0.25f, -0.0025f, 0.05f);
        gl.glVertex3f(0.34f, -0.007f, 0.035f);
        gl.glVertex3f(0.33f, 0.02f, 0.05f);
        
        gl.glVertex3f(0.25f, -0.025f, 0.04f);
        gl.glVertex3f(0.25f, -0.0025f, 0.05f);
        gl.glVertex3f(0.34f, -0.007f, 0.035f);
        gl.glVertex3f(0.35f, -0.03f, 0.01f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(0.25f, -0.025f, 0.04f);
        gl.glVertex3f(0.25f, -0.05f, 0.01f);
        gl.glVertex3f(0.3f, -0.04f, 0.01f);
        gl.glVertex3f(0.35f, -0.03f, 0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.34f, -0.007f, 0.035f);
        gl.glVertex3f(0.35f, -0.03f, 0.01f);
        gl.glVertex3f(0.4f, -0.01f, 0.01f);
        gl.glVertex3f(0.4f, -0.01f, 0.01f);
        
        gl.glVertex3f(0.33f, 0.02f, 0.05f);
        gl.glVertex3f(0.34f, -0.007f, 0.035f);
        gl.glVertex3f(0.34f, -0.007f, 0.035f);
        gl.glVertex3f(0.37f, 0.02f, 0.04f);
        
        gl.glVertex3f(0.4f, -0.01f, 0.01f);
        gl.glVertex3f(0.40f, 0.02f, 0.03f);
        gl.glVertex3f(0.37f, 0.02f, 0.04f);
        gl.glVertex3f(0.34f, -0.007f, 0.035f);
        
        gl.glVertex3f(0.40f, 0.02f, 0.03f);
        gl.glVertex3f(0.4f, -0.01f, 0.01f);
        gl.glVertex3f(0.4f, -0.01f, 0.01f);
        gl.glVertex3f(0.42f, 0.02f, 0.02f);
        
        gl.glVertex3f(0.42f, 0.02f, 0.02f);
        gl.glVertex3f(0.4f, -0.01f, 0.01f);
        gl.glVertex3f(0.4f, -0.01f, 0.01f);
        gl.glVertex3f(0.43f, 0.02f, 0.01f);
        
        /**
         * Perut Kiri
         */
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(-0.49f, -0.05f, -0.0f);
        gl.glVertex3f(-0.49f, -0.05f, -0.0f);
        gl.glVertex3f(-0.44f, -0.04f, -0.005f);
        gl.glVertex3f(-0.41f, -0.02f, -0.02f);
        
        gl.glVertex3f(-0.44f, -0.04f, -0.005f);
        gl.glVertex3f(-0.41f, -0.02f, -0.02f);
        gl.glVertex3f(-0.35f, 0.0f, -0.03f);
        gl.glVertex3f(-0.39f, -0.03f, -0.0075f);
        
        gl.glVertex3f(-0.35f, 0.0f, -0.03f);
        gl.glVertex3f(-0.39f, -0.03f, -0.0075f);
        gl.glVertex3f(-0.35f, -0.02f, -0.01f);
        gl.glVertex3f(-0.25f, 0.02f, -0.04f);
        
        gl.glVertex3f(-0.39f, -0.03f, -0.0075f);
        gl.glVertex3f(-0.39f, -0.03f, -0.0075f);
        gl.glVertex3f(-0.25f, 0.02f, -0.04f);
        gl.glVertex3f(-0.30f, -0.01f, -0.01f);
        
        gl.glVertex3f(-0.25f, 0.02f, -0.04f);
        gl.glVertex3f(-0.30f, -0.01f, -0.01f);
        gl.glVertex3f(-0.17f, 0.001f, -0.03f);
        gl.glVertex3f(-0.15f, 0.02f, -0.05f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(-0.30f, -0.01f, -0.01f);
        gl.glVertex3f(-0.30f, -0.01f, -0.01f);
        gl.glVertex3f(-0.17f, 0.001f, -0.03f);
        gl.glVertex3f(-0.19f, -0.01f, -0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(-0.15f, 0.02f, -0.05f);
        gl.glVertex3f(-0.17f, 0.001f, -0.03f);
        gl.glVertex3f(-0.08f, -0.006f, -0.045f);
        gl.glVertex3f(-0.07f, 0.02f, -0.07f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(-0.19f, -0.01f, -0.01f);
        gl.glVertex3f(-0.17f, 0.001f, -0.03f);
        gl.glVertex3f(-0.125f, -0.0015f, -0.04f);
        gl.glVertex3f(-0.14f, -0.02f, -0.01f);
        
        gl.glVertex3f(-0.14f, -0.02f, -0.01f);
        gl.glVertex3f(-0.125f, -0.0015f, -0.04f);
        gl.glVertex3f(-0.08f, -0.006f, -0.045f);
        gl.glVertex3f(-0.09f, -0.03f, -0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(-0.07f, 0.02f, -0.07f);
        gl.glVertex3f(-0.08f, -0.006f, -0.045f);
        gl.glVertex3f(0.0f, -0.025f, -0.055f);
        gl.glVertex3f(0.0f, 0.02f, -0.08f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(-0.09f, -0.03f, -0.01f);
        gl.glVertex3f(-0.08f, -0.006f, -0.045f);
        gl.glVertex3f(0.0f, -0.025f, -0.055f);
        gl.glVertex3f(0.0f, -0.05f, -0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.05f, 0.02f, -0.08f);
        gl.glVertex3f(0.05f, -0.025f, -0.055f);
        gl.glVertex3f(0.0f, -0.025f, -0.055f);
        gl.glVertex3f(0.0f, 0.02f, -0.08f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(0.0f, -0.05f, -0.01f);
        gl.glVertex3f(0.0f, -0.025f, -0.055f);
        gl.glVertex3f(0.05f, -0.025f, -0.055f);
        gl.glVertex3f(0.05f, -0.05f, -0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.05f, 0.02f, -0.08f);
        gl.glVertex3f(0.05f, -0.025f, -0.055f);
        gl.glVertex3f(0.15f, -0.025f, -0.05f);
        gl.glVertex3f(0.15f, 0.02f, -0.07f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(0.05f, -0.05f, -0.01f);
        gl.glVertex3f(0.05f, -0.025f, -0.055f);
        gl.glVertex3f(0.15f, -0.025f, -0.05f);
        gl.glVertex3f(0.15f, -0.05f, -0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.15f, 0.02f, -0.07f);
        gl.glVertex3f(0.15f, -0.025f, -0.05f);
        gl.glVertex3f(0.25f, -0.025f, -0.04f);
        gl.glVertex3f(0.25f, 0.02f, -0.06f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(0.15f, -0.05f, -0.01f);
        gl.glVertex3f(0.15f, -0.025f, -0.05f);
        gl.glVertex3f(0.25f, -0.025f, -0.04f);
        gl.glVertex3f(0.25f, -0.05f, -0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.25f, 0.02f, -0.06f);
        gl.glVertex3f(0.25f, -0.0025f, -0.05f);
        gl.glVertex3f(0.34f, -0.007f, -0.035f);
        gl.glVertex3f(0.33f, 0.02f, -0.05f);
        
        gl.glVertex3f(0.25f, -0.025f, -0.04f);
        gl.glVertex3f(0.25f, -0.0025f, -0.05f);
        gl.glVertex3f(0.34f, -0.007f, -0.035f);
        gl.glVertex3f(0.35f, -0.03f, -0.01f);
        
        gl.glColor3f(0.75f, 0.75f, 0.75f); // Warna Abu-abu
        gl.glVertex3f(0.25f, -0.025f, -0.04f);
        gl.glVertex3f(0.25f, -0.05f, -0.01f);
        gl.glVertex3f(0.3f, -0.04f, -0.01f);
        gl.glVertex3f(0.35f, -0.03f, -0.01f);
        
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Warna Putih
        gl.glVertex3f(0.34f, -0.007f, -0.035f);
        gl.glVertex3f(0.35f, -0.03f, -0.01f);
        gl.glVertex3f(0.4f, -0.01f, -0.01f);
        gl.glVertex3f(0.4f, -0.01f, -0.01f);
        
        gl.glVertex3f(0.33f, 0.02f, -0.05f);
        gl.glVertex3f(0.34f, -0.007f, -0.035f);
        gl.glVertex3f(0.34f, -0.007f, -0.035f);
        gl.glVertex3f(0.37f, 0.02f, -0.04f);
        
        gl.glVertex3f(0.4f, -0.01f, -0.01f);
        gl.glVertex3f(0.40f, 0.02f, -0.03f);
        gl.glVertex3f(0.37f, 0.02f, -0.04f);
        gl.glVertex3f(0.34f, -0.007f, -0.035f);
        
        gl.glVertex3f(0.40f, 0.02f, -0.03f);
        gl.glVertex3f(0.4f, -0.01f, -0.01f);
        gl.glVertex3f(0.4f, -0.01f, -0.01f);
        gl.glVertex3f(0.42f, 0.02f, -0.02f);
        
        gl.glVertex3f(0.42f, 0.02f, -0.02f);
        gl.glVertex3f(0.4f, -0.01f, -0.01f);
        gl.glVertex3f(0.4f, -0.01f, -0.01f);
        gl.glVertex3f(0.43f, 0.02f, -0.01f);
        
        // Fill Sirip Atas
        gl.glColor3f(0.0f, 0.0f, 0.75f); // Warna Biru Tua
        gl.glVertex3f(-0.25f, 0.095f, 0.0f);
        gl.glVertex3f(-0.23f, 0.095f, 0.005f);
        gl.glVertex3f(-0.19f, 0.08f, 0.01f);
        gl.glVertex3f(-0.23f, 0.07f, 0.01f);
        
        gl.glVertex3f(-0.25f, 0.095f, 0.0f);
        gl.glVertex3f(-0.23f, 0.095f, -0.005f);
        gl.glVertex3f(-0.19f, 0.08f, -0.01f);
        gl.glVertex3f(-0.23f, 0.07f, -0.01f);
        
        gl.glEnd();
    }
}
