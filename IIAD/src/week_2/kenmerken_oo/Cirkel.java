package week_2.kenmerken_oo;

import java.awt.Color;
import java.awt.Graphics;

public class Cirkel extends Figuur {
	private int straal;
	private int x_middelpunt;
	private int y_middelpunt;

	public Cirkel(int straal, int x, int y, Color kleur) {
		super(kleur);

		this.straal = straal;
		this.x_middelpunt = x;
		this.y_middelpunt = y;
	}

	public String getVorm() {
		return ("Cirkel");
	}

	public void teken(Graphics g) {
		g.setColor(getKleur());
	}

}