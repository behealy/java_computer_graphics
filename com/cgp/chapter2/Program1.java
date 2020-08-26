package com.cgp.chapter2;

import javax.swing.*;
import static com.jogamp.opengl.GL4.*;
import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;

public class Program1 extends JFrame implements GLEventListener {

    private GLCanvas mCanvas;

    public Program1() {
        setTitle("Chapter 2 - program 1");
        setSize(600, 400);
        setLocation(200, 200);
        mCanvas = new GLCanvas();
        mCanvas.addGLEventListener(this);

        this.add(mCanvas);
        this.setVisible(true);

    }

    public void display(GLAutoDrawable drawable) {
        GL4 gl = (GL4) GLContext.getCurrentGL();
        gl.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        gl.glClear(GL_COLOR_BUFFER_BIT);
    }

    public void init(GLAutoDrawable drawable) {
        // no
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        // no

    }

    public void dispose(GLAutoDrawable drawable) {
        // no

    }

    public static void main(String[] args) {
        new Program1();
    }
}

// public class Program1 {
// public static void main(String[] args) {
// System.out.println("WHAT THE FUCK");
// }
// }