package com.jayvee.game;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{

	public Player(int x, int y, ID id) {
		super(x, y, id);
	}

	public void tick() {
		x += velX;
		y += velY;
		// allow the player to move if its not out of bounds
		if(x <= 0 || x >= Game.WIDTH - 40)  x -= velX;
		if(y <= 0 || y >= Game.HEIGHT - 65) y -= velY;
	}
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}

}
