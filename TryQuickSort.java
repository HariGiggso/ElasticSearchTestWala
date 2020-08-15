
public class TryQuickSort {

	public static void main(String[] args) {
		int[] data = { 3, 10, 7, 2, 8, 1, 9 };
		sort(data, 0, data.length - 1);
	}

	private static void sort(int[] data, int min, int max) {
		int pivot = data[max];

		int order = min - 1;
		for (int index = min; index < max; index++) {
			if (data[index] < pivot) {
				order = order + 1;
				int temp = data[index];
			//	data[index] = data[]
			}
		}
	}

}
