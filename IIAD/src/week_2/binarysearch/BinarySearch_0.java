package week_2.binarysearch;

public class BinarySearch_0 {

	private static int binarySearch0(int[] a, int fromIndex, int toIndex, int key) {
		int low = fromIndex;
		int high = toIndex - 1;

		while (low <= high) {
			int mid = (low + high) >>> 1; //SRL
			int midVal = a[mid];

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -(low + 1); // key not found.
	}
	
	
	public static void main(String[] args) {
		
		int[] data = {53,6,8,910,98,62,56,48};
		
		int result = binarySearch0(data, 0, data.length, 6);
		System.out.println(result);
		
	}
}
