/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juegos;

import entity.Entity;

/**
 *
 * @author diego
 */
public class Camara {
    public int x, y;

	public void tick(Entity jugador) {
		setX(-jugador.getX() + NombreJuego.ANCHO*2);
		setY(-jugador.getY() + NombreJuego.ALTO*2);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
