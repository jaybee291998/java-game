package com.jayvee.game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Trail extends GameObject{

	private Rectangle[] rectangles;	
	public Trail(int x, int y, ID id, int numberOfRectangles) {
		super(x, y, id);
		rectangles = new Rectangle[numberOfRectangles];
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics g) {

	}
	

	@Override
	public Rectangle getBounds() {
		return null;
	}

}
