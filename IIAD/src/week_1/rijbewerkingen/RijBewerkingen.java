package week_1.rijbewerkingen;

public class RijBewerkingen {
	private char[] rij;

	// constructor
	public RijBewerkingen(char[] rij) {
		this.rij = rij;
	}

	// als target voor komt in de tabel dan wordt de index van target teruggegeven; als target niet voor komt dan wordt -1 teruggegeven.
	public int lineair_zoeken(char target) {
		for (int i = 0; i < rij.length; i++) {
			if (rij[i] == target) {
				return rij[i];
			}
		}
		return -1;
	}

	// als target voor komt in de gesorteerde tabel dan wordt de index van target teruggegeven; als target niet voor komt dan -1.
	public int binair_zoeken(char target) {

		int top = rij.length - 1;
		int bottom = 0;
		int mid;

		while (bottom <= top) {
			mid = (bottom + top) / 2;

			if (rij[mid] == target) {
				return (mid);
			} else if (target > rij[mid]) {
				bottom = mid + 1;
			} else {
				top = mid - 1;
			}
		}
		return (-1);
	}

	// de tabel wordt in oplopende volgorde gesorteerd
	// mbv de 'bubble-sort'-methode
	public void bubble() {
		int i, j = 0;
		char temp = 0;

		for (i = 0; i < rij.length; i++) {
			for (j = 0; j < rij.length - 1 - i; j++) {
				if (rij[j] > rij[j + 1]) {
					temp = rij[j];
					rij[j] = rij[j + 1];
					rij[j + 1] = temp;
				}
			}
		}
	}

	public void print() {
		for (int te = 0; te < rij.length; te++)
			System.out.print(rij[te] + "  ");
		System.out.println("\n\n\n");
	}

	public void mergeSort(char[] rij, int low, int high) {
		int size = rij.length;
		if(low < high){
			int middle = (low + high)/2;
			mergeSort(rij, low, middle);
			mergeSort(rij, middle + 1, high);
			merge(rij, low, middle, high);
		}
	}

	private void merge(char[] rij, int low, int middle, int high) {
		int size = rij.length;
		char [] temp = new char[size];
		
		for(int i = low; i <=high; i++){
			temp[i] = rij[i];
		}
		
		int i = low;
		int j = middle + 1;
		int k = low;
		
		while( i <= middle && j <= high){
			if(temp[i] <= temp[j]){
				rij[k] = temp[j];
				i++;
			}else{
				rij[k] = temp[j];
				j++;
			}
			k++;
		}
		
		while(i <= middle){
			rij[k]  = temp[i];
			k++;
			i++;
		}
	}

}