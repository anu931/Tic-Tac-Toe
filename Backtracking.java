package art;

public class Backtracking {

	public static void main(String[] args) {
		boolean arr[]=new boolean[4];
		find(arr, 2, " ");
	}
	  public static void find(boolean arr[], int n, String ans) {
		  if(n==0) {
			  System.out.println(ans);
			  return;
		  }
		  for(int i =0; i<arr.length; i++) {
			  if(arr[i]==false) {
				  arr[i]=true;
				  find(arr, n-1, ans+"b"+n+"c"+i+" ");
				  arr[i]=false;
			  }
		  }
	  }

	}


