package week_2.linearsearch;

public class LinearSearch {

	static int linear(char[] obj, char input) {

		for (int i = 0; i < obj.length; i++) {
			if (obj[i] == input) {
				System.out.println(obj[i] + " is found.");
				return obj[i];
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		char[] list = { 'a', 'b', 'f', 't' };
		linear(list, 'a');
	}

}
