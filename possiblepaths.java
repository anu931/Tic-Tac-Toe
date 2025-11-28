package art;

public class possiblepaths {

	public static void main(String[] args) {
		way(0,0,2,2," ");
		//current column cc
		// current row cr
		// destination row dr
		// destination column dc

	}
	private static void way(int cr, int cc, int dr, int dc, String string) {
		if (cr == dr && cc == dc) {
			System.out.println(string);
			return;
		}
		 if (cc > dc || cr > dr)  { 
		return;
		}
	    	way(cr, cc + 1, dr, dc, string + "H");
	        way(cr + 1, cc, dr, dc, string + "V");
		
	}

}
