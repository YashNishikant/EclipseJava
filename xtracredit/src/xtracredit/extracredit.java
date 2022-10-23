package xtracredit;

import java.util.Scanner;

public class extracredit {

	public static void main(String[] args) {


		
		
		Scanner spookyReader = new Scanner(System.in);

		System.out.println("It's Halloween time!");

		System.out.println("\nPick your decorations! What do you want?");
		System.out.println("Pumpkin(1)\nWebs(2)\nGhost(3)\n\n\n");

		int decoration = spookyReader.nextInt();

		if (decoration == 1) {
			System.out.println(" \t          #######     ");
			System.out.println(" \t      ____|____ ####  ");
			System.out.println(" \t    (  |  |  |  |)      ");
			System.out.println(" \t  ( |  |  |  |  |  )    ");
			System.out.println(" \t (| |\"[O]\"|\"[O]\"| | )  ");
			System.out.println(" \t (| | _|__|__|__| | )  ");
			System.out.println(" \t  ( |  \\______/  | )   ");
			System.out.println(" \t    (__|__|__|__|)" + "\tHAPPY HALLOWEEN");

		}

		if (decoration == 2) {	
			System.out.println("   *****\t******\t******              ");
			System.out.println("        ******__ \t   ******                    ");
			System.out.println("**** __ ***  (**)  ** __   **********         ");
			System.out.println("     __\\__  (\t )__/__ *******     ***     ");
			System.out.println(" ****  \\__  (\t )__/   **     ******       ");
			System.out.println("  **     \\__ (  )__/     *******             ");
			System.out.println("    ******\t\t****     *******        " + "\tHAPPY HALLOWEEN");
			System.out.println(" \t   ***************** \t   ");
		}

		
		if (decoration == 3) {
			System.out.println("                                                   ____________                                                             ");
			System.out.println("                                                  /\t\t\\                                                           ");
			System.out.println("                                                 /\t\t \\                                                         ");
			System.out.println("                                                |    [_]     [_] |                                                         ");
			System.out.println("                                                 |\t\t   |                                                       ");
			System.out.println("                                    ||||       |     _________     |                                                        ");
			System.out.println("                                    ||||_       |   |_________|   |                                                         ");
			System.out.println("                                     | |       |__ \t\t |__                                                       ");
			System.out.println("                                     | |__________|__\t\t    |_____                                                    ");
			System.out.println("                                     |_________________ \t\t |_____*************    *********                    ");
			System.out.println("                                                       |_ \t\t |_********* *********    ***************      ");
			System.out.println("                                                         |_____ \t\t |_  ********* ******************             ");
			System.out.println("                                                               |_________________|  ****************** *********            "  + " \tHAPPY HALLOWEEN");
		}
	}
}
