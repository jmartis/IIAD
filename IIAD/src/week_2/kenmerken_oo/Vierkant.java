package week_2.kenmerken_oo;

import java.awt.Color;
import java.awt.Graphics;

public class Vierkant extends Figuur {
	private int linksBoven_x;
	private int linksBoven_y;
	private int zijde;

	public Vierkant(int x, int y, int zijde, Color kleur) {
		super(kleur);

		this.linksBoven_x = x;
		this.linksBoven_y = y;
		this.zijde = zijde;
	}

	public String getVorm() {
		return ("Vierkant");
	}

	public void teken(Graphics g) {
		g.setColor(getKleur());
	}

}