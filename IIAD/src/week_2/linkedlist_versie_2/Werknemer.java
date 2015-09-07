package week_2.linkedlist_versie_2;

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
