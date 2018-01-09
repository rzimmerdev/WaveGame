package com.game;


import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.physics.Physics;

public class Spawner {
	public Player p;
	public int wave = 0;
	public List <Enemy> enemyList;
	
	Physics phys;
	
	public Spawner () {
	}
	
	public void initialize() {
		p = new Player();
		enemyList = new ArrayList<Enemy>();
		enemyList.add(new Enemy(2));
		enemyList.add(new Enemy(3));
		enemyList.add(new Enemy(4));
		p.setColor(Color.GREEN);
		for (int i = 0; i < (enemyList.size()); i++) {
			enemyList.get(i).setColor(Color.RED);
			
			if (i == 0) {
				enemyList.get(i).setxPos(1*300);
				enemyList.get(i).setyPos(1*300);
				
			} else {
				enemyList.get(i).setxPos(i*300);
				enemyList.get(i).setyPos(i*300);
			}
		}
	}

	public int getWave() {
		return wave;
	}

	public void setWave(int wave) {
		this.wave = wave;
	}
	
	public void tick() {
		p.xPos += p.xVel;
		p.yPos += p.yVel;
		p.outOfBounds();
		for (Enemy e: enemyList){
		    e.takeAction();
		}
		if (p.health<=0) {
			Game.engine.stop();
		}
		
	}
	
	public void render() {
		p.render(Game.engine.g);
		for (Enemy e: enemyList){
		    e.render(Game.engine.g);
		}
		
	}
}
