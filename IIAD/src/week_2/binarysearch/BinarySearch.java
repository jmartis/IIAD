package week_2.binarysearch;

public class BinarySearch {
	
	public static int BinarySearch(int [] data, int size, int element){
		
		int start = 0;
		int end = size -1; // arrays are zero indexed, if you println data[size], you will get and ArrayIndexOutOfBoundsException
		System.out.println("the size of array is " + size);
		System.out.println("the size of end is "   + end);
		int mid;
		int steps = 0;
		
		while (start <= end){
			
			System.out.println("the size of mid without division is " + (start + end));
			 mid = (start + end) >>> 1;
			System.out.println("when mid is divided, then the size is " + mid);
			System.out.println("We check if the data located at position " + mid + " is equal to  " + element + "[is " + data[mid] + " equal to " + element + " ?]");
			
			if(data[mid] == element){
				System.out.println("Yes, it is, so we return the matching position where the matched value is located " + mid);
				System.out.println("it took " + steps + " steps");
				return mid;
				

			}else if( element < data[mid]){ //It don't match, so we checked if the compared value is higher than the target " + element
				System.out.println("It don't match, so we checked if the compared value is higher than the target " + element);
				System.out.println("if that's the case, then we decrement the end position of our array ");
				 System.out.println("the value of variable end was " + end); 
				end = mid - 1;
				 
				 System.out.println("the new value of variable end is now decremented by 1 (-1) as you can see:  " + end);
			}else{
				
				System.out.println("the value of variable start is now incremented by 1 (+1) as you can see: " + start);
				start = mid + 1;
			}
			steps += 1 ;
		}  
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int [] data = {1,2,3,4,5,6,7,8};
		int element = 8;
		int size = data.length;
		
		int position = BinarySearch(data, size, element);
		
		if (position  == -1) {
			System.out.println("not found");
		}else{
			//System.out.println(position);
		}
	}

}
