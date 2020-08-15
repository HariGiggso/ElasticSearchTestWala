
public class ArrayRotation {
	
	public static void main(String[] args) {
		int[] input = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		print(input);

		int swap = 3;
		int total = input.length;
		for (int index = 0; index < input.length; index++) {
			if (index < swap) {
				int tempIndex = total - swap + index;
				int temp = input[index];
				input[index] = input[tempIndex];
				input[tempIndex] = temp;
			}
		}
		
		print(input);
		
		int index = 0;
		
		while(true) {
			
		}

	}

	private static void print(int[] input) {
		System.out.println("\n");
		for (int index = 0; index < input.length; index++) {
			System.out.print(input[index]);
		}
	}

}
