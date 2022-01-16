package bubbleSort;

public class BubbleSort {
public int[] bubbleSort(int[] arr)
{
	int tmp;

	for (int i = 0; i < arr.length - 1; i++) {
		for (int j = 0; j < arr.length - 1 - i; j++) {
			if (arr[j] > arr[j + 1]) {
				tmp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = tmp;
			}

		}

	}

	return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 21, 5, 87, 32, 4, 1, 75, 121, 100, 99, 8 };
		System.out.print("unsorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		BubbleSort b=new BubbleSort();
		int[] sorted_arr=b.bubbleSort(arr);

		System.out.print("sorted arr: ");
		for (int i = 0; i < sorted_arr.length; i++) {
			System.out.print(sorted_arr[i] + " ");
		}
	}

}
