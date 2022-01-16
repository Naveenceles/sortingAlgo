package mergesort;

import java.util.Arrays;

public class MergeSortingDesc {
	int[] merged_arr;
	
	public void MergeSort(int[] arr) {
		merged_arr=new int[arr.length];
		mergeSort(arr, 0, arr.length-1);
	}
	
	private void mergeSort(int[] arr,int lb,int ub) {
		if(lb<ub) {
			int mid=(lb+ub)/2;
			mergeSort(arr, lb, mid);
			mergeSort(arr, mid+1, ub);
			merge(arr,lb,mid,ub);
		}
		
	}
	
	
	private void merge(int[] arr,int lb,int mid,int ub ) {
		int i=lb;
		int j=mid+1;
		int k=lb;
		
		while(i<=mid && j<=ub) {
			if(arr[i]>=arr[j]) {
				merged_arr[k]=arr[i];
				i++;
				k++;
			}
			else {
				merged_arr[k]=arr[j];
				j++;
				k++;
			}
		}
		
		if(i>mid)
		{
			while(j<=ub) {
				merged_arr[k]=arr[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid) {
				merged_arr[k]=arr[i];
				i++;
				k++;
			}
		}
		
		for(k=lb;k<=ub;k++)
			arr[k]=merged_arr[k];
	}

	public static void main(String[] args) {
		int[] arr= {22,18,47,39,3,68,76,55,21};
		System.out.println("unsorted array :"+Arrays.toString(arr));

		MergeSortingDesc m=new MergeSortingDesc();
		m.MergeSort(arr);
		
		System.out.println("sorted array :"+Arrays.toString(arr));
	}

}
