package com.game;

public class Enemy extends Object{
	
	int ms;
	
	public void Object() {
	}
	
	public Enemy (int e) {
		ms = e;
		health = 100;
	}

	public void takeAction() {
		xVel = 0;
		yVel = 0;
		
		if (xPos<Game.engine.spawn.p.xPos) {
			xVel+=ms;
		}
		
		if (yPos<Game.engine.spawn.p.yPos) {
			yVel+=ms;
		}
		
		if (yPos>Game.engine.spawn.p.yPos) {
			yVel+=-ms;
		}
		
		if (xPos>Game.engine.spawn.p.xPos) {
			xVel+=-ms;
		}
		
		xPos += xVel;
		yPos += yVel;
	}
}
