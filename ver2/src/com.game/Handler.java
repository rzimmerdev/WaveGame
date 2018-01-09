package com.game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.loader.KeyLoader;
import com.physics.Physics;

public class Handler {
	
	public boolean running = false;
	
	long timer = 0;
	int ticks = 0;
	
	public int height = Game.window.height;
	public int width = Game.window.width;
	
	Window buffDisplay = Game.window;
	
	BufferStrategy bf;
	Graphics g;
	public KeyLoader kl;
	
	public Spawner spawn;
	Physics phys;
	
	/*
	 * 	-----------------------------------------Main run method----------------------------------------
	 * 
	 */
	
	public Handler() {
		shouldStop();
		Object.defineObject();
		System.out.println("Initialized...");
		spawn = new Spawner();
		spawn.initialize();
		kl = new KeyLoader();
		phys = new Physics();
	}
	
	public void run() {
		runVerif();
		int fps = 60;
		double tickTime = 1000000000/fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		
		while (running) {
			shouldStop();
			now = System.nanoTime();
			delta += (now - lastTime) / tickTime;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1) {
				
				render();
				tick();
				ticks++;
				delta--;
			}
			
			fpsLog();
		}
		stop();
		
	}
	
	
	/*
	 * 	 ----------------------------------------Heart beat methods----------------------------------
	 */
	
	public void stop() {
		if(!running) {
			return;
		}
		else {
			Game.window.dispose();
			running = false;
		}
	}
	
	public void tick() {
		spawn.tick();
		phys.tick();
		
		
	}
	
	public void render() {
		bf = Game.window.getCanvas().getBufferStrategy();
		if (bf == null) {
			Game.window.getCanvas().createBufferStrategy(3);
			return;
		}
		drawClear();
		draw();
		drawDispose();
	}
	
	
	/*
	 * 	------------------------------------Crash safety net methods----------------------------------------
	 */
	
	public void runVerif() {
		if(running == true) {
			stop();
			run();
		}
		else {
			running = true;
			System.out.println("Run process started...");
		}
	}
	
	public void shouldStop() {
		if (!Game.window.isShowing()) {
			stop();
		}
	}
	
	/*
	 * 	--------------------------------------FPS exit Method-------------------------------------------------
	 */
	
	public void fpsLog() {
		if (timer >= 1000000000) {
			System.out.println("fps = " + ticks);
			ticks = 0;
			timer = 0;
			System.out.println(spawn.p.health);
		}
	}
	
	/*
	 * 	--------------------------------------Render methods-------------------------------------------------
	 */
	public void draw() {
		spawn.render();
	}
	
	public void drawClear() {
		g = bf.getDrawGraphics();
		g.clearRect(0, 0, width,height);
		
	}
	
	public void drawDispose() {
		bf.show();
		g.dispose();
		
	}
}
