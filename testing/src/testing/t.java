
package testing;

import java.util.ArrayList;

public class t {

	public t() {

        char[][] map = new char[5][6];
        char[] line11 = {'0','0','0','0','0','N'};
        char[] line12 = {'0','0','0','0','0','0'};
        char[] line13 = {'X','0','0','0','0','0'};
        char[] line14 = {'0','0','0','0','0','0'};
        char[] line15 = {'0','0','0','N','0','0'};
        map[0] = line11;
        map[1] = line12;
        map[2] = line13;
        map[3] = line14;
        map[4] = line15;

		System.out.println(checkCourse(map));
	}

	boolean checkCourse(char[][] map) {
		
		ship s = new ship(0,0);
		ArrayList<guard> guardlist = new ArrayList<guard>();
		
		for(int r = 0; r < map.length; r++) {
			for(int c = 0; c < map[0].length; c++) {
				if(map[r][c] == 'X') {
					s = new ship(r,c);
				}
				if(map[r][c] == 'N') {
					if(r == 0)
						guardlist.add(new guard(r,c,false));
					else
						guardlist.add(new guard(r,c,true));
				}
			}	
		}
		
		for(int i = 0; i < map[0].length; i++) {

			s.moveforward();
			
			for(int j = 0; j < guardlist.size(); j++) {
				

				printmap(map, guardlist, s);
				
				if(guardlist.get(j).up()) {
					guardlist.get(j).moveUp();
				}
				else {
					guardlist.get(j).moveDown();
				}
				
				if(guardlist.get(j).getR() == 0) {
					guardlist.get(j).changeDir();
				}
				
				if(guardlist.get(j).getR() == map.length-1) {
					guardlist.get(j).changeDir();
				}
				
				if(s.getR() == map[0].length) {
					return true;
				}
				
				if(s.caught(guardlist.get(j))) {
					printmap(map, guardlist, s);
					return false;
				}
			}
			
		}
		return true;
	}

	void printmap(char[][] map, ArrayList<guard> guardlist, ship s) {
		
		for(int r = 0; r < map.length; r++) {
			for(int c = 0; c < map[0].length; c++) {

				for(int j = 0; j < guardlist.size(); j++) {
					if(r == guardlist.get(j).getR() && c == guardlist.get(j).getC()) {
						System.out.print("N");
					}
					else if(r == s.getR() && c == s.getC()) {
						System.out.print("X");
					}
					else {
						System.out.print("0");
					}
						
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new t();
	}

}

class ship {
	private int r;
	private int c;

	public ship(int r, int c) {
		this.r = r;
		this.c = c;
	}

	public int getR() {
		return r;
	}

	public int getC() {
		return c;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public void moveforward() {
		c++;
	}
	
	public boolean caught(guard g) {
		
		if((r == g.getR() || r == g.getR()-1 || r == g.getR()+1) && (c == g.getC() || c == g.getC()-1 || c == g.getC()+1)) {
			return true;
		}
		return false;
	}
	
}

class guard {
	private int r;
	private int c;
	private boolean up;

	public guard(int r, int c, boolean dir) {
		this.r = r;
		this.c = c;
		up = dir;
	}

	public int getR() {
		return r;
	}

	public int getC() {
		return c;
	}

	public void moveUp() {
		r--;
	}
	public void moveDown() {
		r++;
	}
	public void changeDir() {
		up = !up;
	}
	public boolean up() {
		return up;
	}
}