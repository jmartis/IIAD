package week_2.kenmerken_oo;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Figuur {

	private Color achtergrondKleur;

	public Figuur(Color kleur) {
		this.achtergrondKleur = kleur;
	}

	public Color getKleur() {
		return (this.achtergrondKleur);
	}

	public abstract String getVorm();

	public abstract void teken(Graphics g);

}