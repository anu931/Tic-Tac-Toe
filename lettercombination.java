package art;

public class lettercombination {

	public static void main(String[] args) {
		String key[]= {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		print("", 0, "23", key);
	}
public static void print(String ans, int i, String d, String []key) {
	if(i==d.length()) {
		System.out.println(ans);
		return;
	}
	int index = d.charAt(i)-'0';
	String s = key[index];
	for(int j=0; j<s.length(); j++) {
		print(ans+s.charAt(j), i+1, d , key);
	}
}
}
