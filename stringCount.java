package art;

public class stringCount {

	public static void main(String[] args) {
		String  s = "abbcddeeaecdf";
		int arr[]=new int[26];
		for(int i =0; i<s.length(); i++) {
			int idx = s.charAt(i)-'a';
			arr[idx]++;
		}
        for(int i =0; i<arr.length; i++) {
        	if(arr[i]>0)
        		System.out.println((char)(97+i)+" "+arr[i]);
        }
	}

}
