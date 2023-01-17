package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class codewars {

	public codewars() {

	      String[] results = new String[]
	    	      {
	    	        "6:0 FC Bayern Muenchen - Werder Bremen",
	    	        "1:0 Eintracht Frankfurt - Schalke 04",
	    	        "0:2 FC Augsburg - VfL Wolfsburg",
	    	        "1:1 Hamburger SV - FC Ingolstadt",
	    	        "2:0 1. FC Koeln - SV Darmstadt",
	    	        "2:1 Borussia Dortmund - FSV Mainz 05",
	    	        "2:1 Borussia Moenchengladbach - Bayer Leverkusen",
	    	        "-:- Hertha BSC Berlin - SC Freiburg",
	    	        "-:- TSG 1899 Hoffenheim - RasenBall Leipzig"
	    	      };

		System.out.println(table(results));

	}

	public static void main(String[] args) {
		new codewars();
	}

	public static String table(String[] results) {

		String answer = "";

		ArrayList<group> glist = new ArrayList<group>();

		for (int i = 0; i < results.length; i++) {
			String nameline = results[i].substring(4, results[i].length());
			String scoreline = results[i].substring(0, 3);
			String[] pieces = nameline.split(" - ");
			String[] scorepieces = scoreline.split(":");

			glist.add(new group(pieces[0], scorepieces[0], 0, scoreline));
			glist.add(new group(pieces[1], scorepieces[1], 1, scoreline));

		}

		Collections.sort(glist);
		
		int p = 1;
		for (int i = 0; i < glist.size(); i++) {
			String s = "";
			if (i > 0 && glist.get(i).moveup(glist.get(i - 1))) {
				p = i + 1;
			}
			if (p < 10) {
				s = " " + p + ".";
			} else {
				s = p + ".";
			}

			answer += (String.format("%s %-30s %-2s %-2s %-2s %-2s %-4s %s", s, glist.get(i).getName(),
					glist.get(i).getPlayedgames(), glist.get(i).getWins(), glist.get(i).getTies(),
					glist.get(i).getLosses(), glist.get(i).getGoaldiff(), glist.get(i).getPts()));

			if(i < glist.size()-1) {
				answer += "\n";
			}
			
		}

		return answer;
	}

}

class group implements Comparable<group> {

	private String name;
	private int pts;
	private int playedgames;
	private int wins;
	private int losses;
	private int ties;
	private String goaldiff;
	private int goaldiff_Int;
	private int goaltotal;
	private int arrpos;
	private String scoreline;
	private boolean moveup;

	public group(String n, String pt, int a, String sl) {
		moveup = false;
		name = n;

		arrpos = a;
		scoreline = sl;

		String[] pieces = scoreline.split(":");

		if (!pt.equals("-")) {
			pts = Integer.parseInt(pt);

			if (arrpos == 0) {
				setGoaldiff(pieces[0] + ":" + pieces[1]);
			} else {
				setGoaldiff(pieces[1] + ":" + pieces[0]);
			}
		} else {
			setGoaldiff("0:0");
		}
		if (!pieces[0].equals("-")) {
			if (arrpos == 0) {
				if (Integer.parseInt(pieces[0]) > Integer.parseInt(pieces[1]))
					wins++;
				else if (Integer.parseInt(pieces[0]) < Integer.parseInt(pieces[1]))
					losses++;
				else
					ties++;
			}
			if (arrpos == 1) {
				if (Integer.parseInt(pieces[0]) < Integer.parseInt(pieces[1]))
					wins++;
				else if (Integer.parseInt(pieces[0]) > Integer.parseInt(pieces[1]))
					losses++;
				else
					ties++;
			}
			playedgames++;

			setGoalTotal(Integer.parseInt(pieces[0]), Integer.parseInt(pieces[1]), getGoaldiff());

		}

		if (wins > 0) {
			setPts(3);
		} else if (losses > 0) {
			setPts(0);
		} else if (ties > 0) {
			setPts(1);
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayedgames() {
		return playedgames;
	}

	public void setPlayedgames(int playedgames) {
		this.playedgames = playedgames;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getTies() {
		return ties;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}

	public String getGoaldiff() {
		return goaldiff;
	}

	public void setGoalTotal(int a, int b, String goalldiff) {
		goaltotal = a + b;
		String[] pieces = goalldiff.split(":");
		if (pieces[0] != "-")
			goaldiff_Int = Integer.parseInt(pieces[0]) - Integer.parseInt(pieces[1]);
	}

	public int getGoalTotal() {
		return goaltotal;
	}

	public int getGoaldiff_Int() {
		return goaldiff_Int;
	}

	public void setGoaldiff(String goaldiff) {
		this.goaldiff = goaldiff;
	}

	public int getPts() {
		return pts;
	}

	public void setPts(int pts) {
		this.pts = pts;
	}

	public void setMove(boolean m) {
		moveup = m;
	}

	public boolean moveup(group o) {
		Integer a = o.getPts();
		Integer b = getPts();
		int ans = a.compareTo(b);

		if (ans == 0) {
			a = o.getGoaldiff_Int();
			b = getGoaldiff_Int();
			ans = a.compareTo(b);
			if (ans == 0) {
				a = o.getGoalTotal();
				b = getGoalTotal();
				ans = a.compareTo(b);
				if (ans == 0) {
					ans = getName().compareTo(o.getName());
					return false;
				}
			}
		}

		return true;
	}

	@Override
	public int compareTo(group o) {
		
		Integer a = o.getPts();
		Integer b = getPts();
		int ans = a.compareTo(b);
		
		if (ans == 0) {
			a = o.getGoaldiff_Int();
			b = getGoaldiff_Int();
			ans = a.compareTo(b);
			if (ans == 0) {
				a = o.getGoalTotal();
				b = getGoalTotal();
				ans = a.compareTo(b);
				if (ans == 0) {
					String a2 = o.getName();
					String b2 = getName();
					ans = b2.toLowerCase().compareTo(a2.toLowerCase());
				}
			}
		}

		return ans;
	}

}