package art;

public class java1 {

	public static void main(String[] args) {
		int arr[] = {3,4,2,1};
		int target = 5;
		System.out.println(find(arr,target));
	}
		public static boolean find(int arr[], int target) {
			for(int i=0; i< arr.length; i++) {
				if(arr[i]==target) return true;
		}
        return false;
		}

	}


