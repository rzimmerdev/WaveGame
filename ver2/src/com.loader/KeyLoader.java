package com.loader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import com.game.Game;
import com.game.Window;

public class KeyLoader extends JPanel implements ActionListener, KeyListener {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public KeyLoader () {
	
		this.addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		System.out.println("KeyLoader initialized...");
		Window.canvas.addKeyListener(this);
	
	}

	public void actionPerformed(ActionEvent e) {

	}
		@Override
		public void keyPressed(KeyEvent e) {
			int c = e.getKeyCode();
			
			if (c == KeyEvent.VK_A) {
				
				Game.engine.spawn.p.xVel = -(Game.engine.spawn.p.ms);
			}
			
			if (c == KeyEvent.VK_W) {
				
				Game.engine.spawn.p.yVel = -(Game.engine.spawn.p.ms);
			}
			
			if (c == KeyEvent.VK_D) {
				
				Game.engine.spawn.p.xVel = (Game.engine.spawn.p.ms);
			}
			
			if (c == KeyEvent.VK_S) {
				
				Game.engine.spawn.p.yVel = (Game.engine.spawn.p.ms);
				
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			
			int c = e.getKeyCode();

			if (c == KeyEvent.VK_A) {
				
				Game.engine.spawn.p.xVel = 0;
			}
			
			if (c == KeyEvent.VK_W) {
				
				Game.engine.spawn.p.yVel = 0;
			}
			
			if (c == KeyEvent.VK_D) {
				
				Game.engine.spawn.p.xVel = 0;
			}
			
			if (c == KeyEvent.VK_S) {
				
				Game.engine.spawn.p.yVel = 0;
				
			}
			
			if (c == KeyEvent.VK_S) {
				
				
			}
			
		}
		@Override
		public void keyTyped(KeyEvent e) {
			int c = e.getKeyCode();
			
			if (c == KeyEvent.VK_A) {
				
				Game.engine.spawn.p.xVel = -2;
			}
			
			if (c == KeyEvent.VK_W) {
				
				Game.engine.spawn.p.yVel = -2;
			}
			
			if (c == KeyEvent.VK_D) {
				
				Game.engine.spawn.p.xVel = 2;
			}
			
			if (c == KeyEvent.VK_S) {
				
				Game.engine.spawn.p.yVel = 2;
				
			}
		}
}
