package com.game;

public class Game {
	
	
	/*
	 * -----------------------------------------Engine variables---------------------------------------
	 */
		public static Window window;
		public static Handler engine;
	
	/*
	 * 	----------------------------------------New game method (static void main)-----------------------------------------
	 */
	
	public void newWindow(String a,int b, int c) {
		window = new Window(a, b, c);
		
	}
	
	public void newEngine() {
		engine = new Handler();
		engine.run();
	
	}
		
	public Game(String a, int b, int c) {
		newWindow(a, b, c);
		newEngine();
		
	}

	public static void main(String[] args) {
		new Game("Shooter", 1000, 1000);
		
	}

}
