package art;

public class cointoss {

	public static void main(String[] args) {
		Toss(3, "");	
		}
		public static void Toss(int n, String ans) {
			if(n==0) {
				System.out.println(ans);
				return;
			}
			Toss(n-1, ans+"H");
			Toss(n-1, ans+"T");
		}
	}


