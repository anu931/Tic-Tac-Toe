package art;

public class recursion1 {

	public static void main(String[] args) {
    System.out.println(fact(6));
	}
   public static int fact(int n) {
	   if(n==1)return 1;
	   int smaller = fact (n-1);
	   return n*smaller;
   }
}
