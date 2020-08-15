
public class SmallestNumber {

	public static void main(String[] args) {
		
		String s1 = "Rachel";
        String s2 = "Rachel";
        String s3 = new String("Rachel");
        String s4 = new String("Rachel").intern();
        
        System.out.println(s1.equals(s3));
		
		System.out.println("Sort by Smallest Number / Largest Number...");
		int[] test = {5, 2, 3, 1, 8};
		for(int index=0; index < test.length; index++) {
			for(int innerIndex=index+1; innerIndex < test.length; innerIndex++) {
				if(test[index] < test[innerIndex]) {
					int temp = test[index];
					test[index] = test[innerIndex];
					test[innerIndex] = temp;
				}
			}
		}
		print(test);
		
		System.out.println("Find the smallest / largest number...");
		int[] a = {5, 2, 3, 1, 8};
		int smallest = a[0];
		for(int index =1; index < a.length; index++) {
			if(smallest < a[index]) {
				smallest = a[index];
			}
		}
		System.out.println(smallest);
		
		System.out.println("Array Rotation...");
		
		int[] b = {5, 2, 3, 1, 8};
		for(int index =0; index < b.length; index++) {
			int temp = a[index];
			a[index] = a[b.length - index - 1];
			a[b.length - 1] = temp;
		}
		
		print(b);
		
	}
	
	private static void print(int[] test) {
		for(int index=0; index < test.length; index++) {
			System.out.print(test[index]);
		}
	}
	
}
