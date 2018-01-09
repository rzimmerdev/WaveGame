package com.game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window extends JFrame{
	
	
	/*
	 * --------------------------------------Window variables---------------------------------
	 */
	public static String name; //Variable for the method input (JFrame new / setTitle)
	public static Canvas canvas; //New canvas render variable for implementation in the Handler class
	public int width; //JFrame properties variable for method calling?
	public int height;
	
	JTextField t;
		
	private static final long serialVersionUID = -1159482399447975661L;

	/*
	 * 	---------------------------------------Window Method--------------------------------------------
	 */
	
	public Window(String a, int b,int c) {
		name = a;
		setWidth(c);
		setHeight(b);
		System.out.println("New window set...");
		init();
	}
	
	public void init() {
				//Initializes "new" Window()
				setTitle(name);		//Sets window properties
				setVisible(true);
				setSize(width, height);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				System.out.println("New window created...");
				newCanvas();
				this.add(canvas);
				this.pack();
				
	}
	
	public void newCanvas() {
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		System.out.println("New canvas created...");
	}
	
	public Canvas getCanvas() {
		return canvas;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void addTextField() {
		t = new JTextField("Oie");
		Game.window.add(t);
	}

}
