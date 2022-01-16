package quicksort;

import java.util.Arrays;

public class QuickSort {
	
	private int partition(int[] arr,int lb,int ub) {
		int pivot=arr[lb];
		int start=lb;
		int end=ub;
		int tmp;
		while(start<end) {
		while(arr[start]<=pivot) {
			start++;
		}
		while(arr[end]>pivot) {
			end--;
		}
		if(start<end) {
			tmp=arr[start];
			arr[start]=arr[end];
			arr[end]=tmp;
		}
		
		
		}
		
			tmp=arr[lb];
			arr[lb]=arr[end];
			arr[end]=tmp;
		
		return end;
		
	}
	
	public int[] quickSort(int[] arr,int lb,int ub) {
		if(lb<ub) {
			int loc=partition(arr, lb, ub);
			quickSort(arr, lb, loc-1);
			quickSort(arr, loc+1, ub);
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		int[] arr= {2,8,4,9,3,6,7,5};
		System.out.println("unsorted array :"+Arrays.toString(arr));
		
		QuickSort q=new QuickSort();
		int[] sorted_arr=q.quickSort(arr, 0, arr.length-1);
		System.out.println("sorted array :"+Arrays.toString(sorted_arr)); 
		 
	}

}
