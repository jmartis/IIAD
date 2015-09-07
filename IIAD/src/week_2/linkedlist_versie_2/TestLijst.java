package week_2.linkedlist_versie_2;

public class TestLijst {
	
	public static void main(String[] args) {
		
		Lijst lijst = new Lijst();
		
		
		lijst.addFirst(new Werknemer("Jan"));
		lijst.addFirst(new Werknemer("Bert"));
		lijst.addFirst(new Werknemer("Janet"));
		lijst.addFirst(new Werknemer("Sally"));
		lijst.addLast(new Werknemer("Brandy"));
		
		Iterator iterator = lijst.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("\n" + "grootte = " + lijst.getSize());
	}

}
