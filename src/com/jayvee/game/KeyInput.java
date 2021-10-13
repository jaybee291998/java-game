package com.jayvee.game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(GameObject tempObject : handler.getObjects()) {
			if(tempObject.getId() == ID.Player) {
				// key events for player
				if(key == KeyEvent.VK_W) tempObject.setVelY(-5);
				else if(key == KeyEvent.VK_S) tempObject.setVelY(5);
				else if(key == KeyEvent.VK_A) tempObject.setVelX(-5);
				else if(key == KeyEvent.VK_D) tempObject.setVelX(5);
			}
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getExtendedKeyCode();
		
		for(GameObject tempObject : handler.getObjects()) {
			if(tempObject.getId() == ID.Player) {
				// key events for player
				if(key == KeyEvent.VK_W) tempObject.setVelY(0);
				else if(key == KeyEvent.VK_S) tempObject.setVelY(0);
				else if(key == KeyEvent.VK_A) tempObject.setVelX(0);
				else if(key == KeyEvent.VK_D) tempObject.setVelX(0);
			}
		}
	}
}
