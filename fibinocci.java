package art;

public class fibinocci {

	public static void main(String[] args) {
		System.out.println(fibinocci(5));
	}
public static int fibinocci(int n) {
	if(n==1||n==0) return n;
	int prev = fibinocci(n-1);
	int pkp = fibinocci(n-2);
	
	return prev + pkp;
	
}
}
