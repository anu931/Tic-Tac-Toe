package art;

public class binarysearch {

	public static void main(String[] args) {
		int arr[]= {1,3,5,7,8,10,12};
		int target = 1;
		System.out.println(BS(arr,target));
		
	}
	public static int BS(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		while(start<=end) {
			int mid = start + (end - start)/2;
	
		if(arr[mid]==target) return mid;
		else if(arr[mid]>target) end = mid-1;
		else start = mid + 1;
	 }
	
    return -1;
	}
}

