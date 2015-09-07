package week_2.swap;

public class Swap {

	static void swap(int data[], int a, int b) {
		int temporary = data[a];
		data[a] = data[b];
		data[b] = temporary;
	}

	public static void main(String[] args) {

		int[] data = { 3, 5, 6 };

		System.out.println("Current value of the item is: " + data[0]);
		swap(data, 0, 1);
		System.out.println("The new value of the item is: " + data[0]);
	}

}
