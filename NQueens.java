package art;

public class NQueens {

	public static void main(String[] args) {
		int n=4;
		
		int board[][]= new int [n][n];
		
		place(0,0,board);
		

	}
	public static void place(int q,int row,int [][]board) {
		//basecase
		if(q==board.length) {
			
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					if(board[i][j]==1) {
						System.out.print("Q ");
					}
					else System.out.print("_ ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			
			return;
		}
for(int col=0;col<board.length;col++) {
			
			if(isSafe(row,col,board)==true) {
				
				board[row][col]=1;
				place(q+1,row+1,board);
				board[row][col]=0;
				
			}
		}
	}
	
	public static boolean isSafe(int row, int col, int board[][]) {
		
		
		int r=row;
		int c=col;
		//vertical
		while(r>=0) {
			if(board[r][c]==1)return false;
			r--;
		}
		//left dia
		r=row;
		while(r>=0 && c<board.length) {
			if(board[r][c]==1) return false;
			r--;
			c++;
		}
		r=row;
		c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]==1) return false;
			r--;
			c--;
		}
	  return true;
	}


}
