package week_2.dynamicbinding;

public class Werkgever implements Persoon {
	private String naam;

	public Werkgever(String naam) {
		this.naam = naam;
	}

	public String toString() {
		return (naam);
	}

	public String getRol() {
		return ("werkgever");
	}
}
