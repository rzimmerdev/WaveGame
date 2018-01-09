package com.game;

import java.awt.Color;
import java.awt.Graphics;

public class Object {

	public int xPos = 0;
	public int yPos = 0;
	
	public double xVel;
	public double yVel;
	
	public static int width;
	public static int height;
	
	public double health;
	
	public Color color;
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void damage() {
		this.health += -0.1;
	}
	
	public static void defineObject() {
		width = 50;
		height = 50;
	}
	
	public int getWidth() {
		return width;
	}


	public static void setWidth(int width) {
		Object.width = width;
	}


	public int getHeight() {
		return height;
	}


	public static void setHeight(int height) {
		Object.height = height;
	}

	private float img;
	protected int objects = 0;

	public double getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public double getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public float getImg() {
		return img;
	}

	public void setImg(float img) {
		this.img = img;
	}

	public int getObjects() {
		return objects;
	}

	public void setObjects(int objects) {
		this.objects = objects;
	}
	
	public void outOfBounds () {
		
		
		if (this.yPos >= (Game.window.height - height)) {
			this.yPos = Game.window.height - height;
			
		}
		
		if (this.xPos >= (Game.window.width - width)) {
			this.xPos = Game.window.height - height;
			
		}
		
		if (this.yPos <= (0)) {
			this.yPos = 0;
			
		}
		
		if (this.xPos <= 0) {
			this.xPos = 0;
			
		}
	}
	
	public void render (Graphics g) {
		g.setColor(getColor());
		
		if (health>90) {
			g.fillRect(this.xPos, this.yPos, 
	                this.getWidth(), this.getHeight());
		}
		
		else if (health>70) {
			g.fillRect(this.xPos, this.yPos, 
	                this.getWidth(), (int) (Math.round(this.getHeight()/1.4)));
		}
		
		else if (health>50) {
			g.fillRect(this.xPos, this.yPos, 
	                this.getWidth(), this.getHeight()/2);
		}
		
		else if (health>25) {
			g.fillRect(this.xPos, this.yPos, 
	                this.getWidth(), (int) (Math.round(this.getHeight()/3)));
		}
		
		else {
			g.fillRect(this.xPos, this.yPos, 
	                this.getWidth(), (int) (Math.round(this.getHeight()/4)));
		}
        
	}
}
