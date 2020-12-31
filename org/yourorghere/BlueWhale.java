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
public class BlueWhale {
    private GLAutoDrawable drawable;
    
    public BlueWhale(GLAutoDrawable drawable) {
        this.drawable = drawable;
    }
    
    /**
     * Method to call part object
     */
    public void drawBlueWhale() {
        Body body = new Body(drawable);
        Fin fin = new Fin(drawable);
        Tail tail = new Tail(drawable);
        
        body.drawBody();
        fin.drawFin();
        tail.drawTail();
    }
}
