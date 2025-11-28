package art;

public class strings {

	public static void main(String[] args) {
		String s = "aaabbcccc";
		for(int i = 0; i <s.length();) {
        	 int j = i+1;
        	 while(j<s.length() && s.charAt(i)==s.charAt(j))j++ ;
 			System.out.println(s.charAt(i)+"  "+(j-i));
 			i=j;

         }
	}
}
