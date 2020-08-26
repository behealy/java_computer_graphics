package com.cgp.chapter2;

import javax.swing.*;
import static com.jogamp.opengl.GL4.*;
import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;

public class Program1 extends JFrame implements GLEventListener {

    private GLCanvas mCanvas;

    private int renderingProgram;

    private int vao[] = new int[1];

    private int createShaderProgram() {
        GL4 gl = (GL4) GLContext.getCurentGL();

        String vshaderSource
    }

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
        gl.glUseProgram(renderingProgram);
        gl.glDrawArrays(GL_POINTS, 0, 1);
    }

    public void init(GLAutoDrawable drawable) {
        // no
        GL4 gl = (GL4) GLContext.getCurrentGL();
        gl.glGenVertexArrays(vao.length, vao, 0);
        gl.glBindVertexArray(vao[0]);
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