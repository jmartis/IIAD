package week_1.linkedlist_versie_1;

public class Werknemer implements Persoon {

	public String naam;

	public Werknemer(String naam) {
		this.naam = naam;
	}

	public String toString() {
		return naam;
	}

	public String getRol() {
		return "Werknemer";
	}
}
