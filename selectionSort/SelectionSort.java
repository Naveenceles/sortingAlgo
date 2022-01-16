package selectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 21, 5, 87, 32, 4, 1, 75, 121, 100, 99, 8 };
		System.out.print("unsorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			int minValue=arr[i];
			int minValueIndex=i;
			int tmp;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<minValue) {
					minValue=arr[j];
					minValueIndex=j;
				}
				
					
			}
			
			if(minValue<arr[i]) {
				tmp=arr[i];
				arr[i]=minValue;
				arr[minValueIndex]=tmp;
		
			}
		}

		System.out.print("sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
