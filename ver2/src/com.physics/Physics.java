package com.physics;

import com.game.*;
import com.game.Object;

public class Physics {
	Collision col = new Collision(Object.width, Object.height);
	
	public void tick() {
		for (int i = 0; i < Game.engine.spawn.enemyList.size(); i++) {
			col.touching(Game.engine.spawn.p.xPos, 
					Game.engine.spawn.p.yPos, 
					(Game.engine.spawn.p.xPos+col.boxWidth), 
					(Game.engine.spawn.p.yPos + col.boxHeight), 
					Game.engine.spawn.enemyList.get(i).xPos, 
					Game.engine.spawn.enemyList.get(i).yPos, 
					(Game.engine.spawn.enemyList.get(i).xPos+col.boxWidth), 
					(Game.engine.spawn.enemyList.get(i).yPos + col.boxHeight));
		}
	}
}
