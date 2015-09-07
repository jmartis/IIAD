package week_2.bubblesort;

public class BubbleSort {
	
	public static int[] sort(int[] data){
		
		int i,j,swap = 0;
		
		for(i = 0; i < data.length - 1; i++){
			for(j = 0; j < data.length - 1 - i; j++){
				if (data[j] > data[j + 1]){
					swap = data[j];
					data[j] = data[j + 1];
					data[j + 1] = swap;
				}
			}
		}
			return data;
	}
	
	public static void main(String[] args) {
		
		int [] data = {5,8,1,6,9,2};
		sort(data);
		
		for (int i : data) {
			System.out.println(i);
		}
	}
}
