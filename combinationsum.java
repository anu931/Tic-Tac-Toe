package art;

import java.util.ArrayList;
import java.util.List;

public class combinationsum {

	public static void main(String[] args) {
         int coins[]= {2,3,5};
         int t=8;
         exchange(coins, t, 0, new ArrayList<>());

	}
	public static void exchange(int []coins, int t, int i, List <Integer>list) {
		if(t==0) {
			System.out.println(list);
			return;
		}
		for( i=i; i<coins.length; i++) {
			if(t>=coins[i]) {
				list.add(coins[i]);
				exchange(coins, t-coins[i], i, list);
				list.remove(list.size()-1);
			}
		}
	}

}
