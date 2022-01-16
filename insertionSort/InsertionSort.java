package insertionSort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 21, 5, 87, 32, 4, 1, 75, 121, 100, 99, 8 };
		System.out.print("unsorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i=1;i<arr.length;i++) {
			int tmp;
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && key<arr[j]) {
				tmp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tmp;
				j--;
			}
		}

		System.out.print("sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
