package week_2.dynamicbinding;

public class DynamicBinding {

	public static void main(String[] args) {
		Persoon[] mijnTabel = new Persoon[4];

		mijnTabel[0] = new Werknemer("Jan");
		mijnTabel[1] = new Werkgever("Karel");
		mijnTabel[2] = new Werknemer("Piet");
		mijnTabel[3] = new Werkgever("Henk");

		for (int te = 0; te < mijnTabel.length; te++) {
			Persoon p = mijnTabel[te];
			System.out.println(p.toString() + " --- " + p.getRol());
		}

	}
}
