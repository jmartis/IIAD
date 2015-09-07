package week_1.linkedlist_versie_1;

import week_1.linkedlist_versie_1.Lijst.LijstIterator;

public class TestLijst {

	public static void main(String[] args) {

		Lijst lijst = new Lijst();

		lijst.addFirst(new Werknemer("Jan"));
		lijst.addFirst(new Werknemer("Bert"));
		lijst.addFirst(new Werknemer("Brandy"));
		lijst.addFirst(new Werknemer("Sally"));

		System.out.println(lijst.getFirst() + " !");

		LijstIterator iterator = lijst.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
