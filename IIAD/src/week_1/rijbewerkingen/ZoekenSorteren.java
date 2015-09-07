package week_1.rijbewerkingen;

public class ZoekenSorteren {
	
	public static void main(String[] args) {
		char[] rij = { 'M', 'H', 'O', 'G', 'P', 'F', 'Z', 'D', 'A', 'K' };
		char[] rij2 = { 'M', 'H', 'O', 'G', 'P', 'F', 'Z', 'D', 'A', 'K' };
		RijBewerkingen rb = new RijBewerkingen(rij);
		rb.print();

		rb.bubble(); // voordat je binair gaat zoeken
		rb.print(); // moet de tabel gesorteerd zijn.

		char target = 'P';
		int index = rb.binair_zoeken(target);
		System.out.println(rij[index] + " gevonden" + "\n");
		
		rb.print();
		rb.mergeSort(rij2, 0, rij2.length -1); //sorteren m.b.v. merge
		rb.print();

	}
}