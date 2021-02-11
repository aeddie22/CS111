//อาดีนัน อับดุลลี
//6209650719
package question2;

import java.util.Scanner; 

public class Player {
	private int lifePoint;
	private int[][] position;
	private int row,col;
	
	Scanner sc = new Scanner(System.in);
	public Player() {
		lifePoint = 3;
	}
	
	public int[][] playByPlayer() {
		System.out.println("------- Player turn -------");
		System.out.println("Input row");
		row = sc.nextInt();
		System.out.println("Input col");
		col = sc.nextInt();
		position = new int[row][col];
		System.out.println("openning Grid "+row+" , "+col);
		return position;
	
	}
	public int lifePoint() { 
		return lifePoint;
	}
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
}
