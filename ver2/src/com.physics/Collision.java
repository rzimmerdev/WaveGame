package com.physics;

import com.game.Game;

public class Collision {
	public int boxHeight;
	public int boxWidth;
	
	public Collision (int a, int b) {
		boxHeight = b;
		boxWidth = a;
	}
	
	public int getBoxHeight() {
		return boxHeight;
	}

	public void setBoxHeight(int boxHeight) {
		this.boxHeight = boxHeight;
	}

	public int getBoxWidth() {
		return boxWidth;
	}

	public void setBoxWidth(int boxWidth) {
		this.boxWidth = boxWidth;
	}

	public boolean colliding;
	
	public void touching (int px, int py, int pw, int ph, int ex, int ey, int ew, int eh) {
		if (px >= ex) {
			if (py >= ey) {
				if (px <= ew) {
					if (py <= eh) {
						Game.engine.spawn.p.damage();
					}
				}
			}
		}
		if (pw >= ex) {
			if (py >= ey) {
				if (pw <= ew) {
					if (py <= eh) {
						Game.engine.spawn.p.damage();
					}
				}
			}
		}
		if (pw >= ex) {
			if (ph >=ey) {
				if (pw <= ew) {
					if (ph <= eh) {
						Game.engine.spawn.p.damage();
					}
					
				}
			}
		}
		if (px >= ex) {
			if (ph >=ey) {
				if (px <= ew) {
					if (ph <= eh) {
						Game.engine.spawn.p.damage();
					}
					
				}
			}
		}
	}
}
