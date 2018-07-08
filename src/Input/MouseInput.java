/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.mario.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.tutorial.mario.Game;
import com.tutorial.mario.gfx.gui.Button;

/**
 *
 * @author Rafael Melara
 */


public class MouseInput implements MouseListener, MouseMotionListener {
	
	public int x, y;

	public void mouseDragged(MouseEvent e) {
		
	}

	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	public void mouseClicked(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		for(int i=0;i<Game.launcher.buttons.length;i++) {
			Button button = Game.launcher.buttons[i];
			
			if(x>=button.getX()&&y>=button.getY()&&x<=button.getX()+button.getWidth()&&y<=button.getY()+button.getHeight()) button.triggerEvent();
		}
	}

	public void mouseReleased(MouseEvent e) {
		
	}

}

