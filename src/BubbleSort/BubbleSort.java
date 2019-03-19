package BubbleSort;

public class BubbleSort {

	public static void main(String args[]) {
		
		int[] arr = {6,4,5,2,3,1};
		for(int num:arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp; 
				}
			}
		}
		
		System.out.println("排序后的数组为：");
		for(int num:arr) {
			System.out.print(num + " ");
		}
		
	}
}
