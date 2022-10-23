
public class app {
	public static void main(String[] args) {

		int[][] grid = {

		{ 1, 2, 3, 4 }, 
		{ 4, 23, 56, 9 }, 
		{ 34, 5, 1, 7 } 
		
		};

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + "\t");
			}
			System.out.println();
		}	
	}
}
