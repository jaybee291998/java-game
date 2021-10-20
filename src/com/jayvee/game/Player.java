package com.jayvee.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends GameObject{
	
	private Handler handler;
	
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
	}

	public void tick() {
		x += velX;
		y += velY;
		// dont allow player to move out of bounds
		x = Game.clamp(x, 0, Game.WIDTH-38);
		y = Game.clamp(y, 0, Game.HEIGHT-61);
		
		// method that contains the collision code
		collision();
	}
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}
	
	public void collision() {
		for(GameObject object : handler.getObjects()) {
			if(object.getId() == ID.BasicEnemy) {
				// check if the player collided with the enemy
				if(getBounds().intersects(object.getBounds())) {
					// collision code
					HUD.HEALTH-=2;
				}
			}
		}
	}

}
