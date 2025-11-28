package art;

public class palindrome {

	public static void main(String[] args) {
		String s = "nayan";
		int i = 0;
		int j = s.length()-1;
		int temp=0;
		while(i<j) {
			
			if(s.charAt(i)!=s.charAt(j)) {
				temp =1;
				System.out.println("not a palindrome");
				break;
			}
			i++;
			j++;
		}
		if(temp==0)
			System.out.println(" palindrome");

		}
	}


