package com.game;

import java.util.Scanner;

public class Player extends Object{
	
	public String name;
	
	static Scanner userinput = new Scanner(System.in);
	
	public int ms = 5;
	
	public Player() {
		this.health = 100;
		this.setxPos(20);
		this.setyPos(20);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
