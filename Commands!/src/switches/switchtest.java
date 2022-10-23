	package switches;

	import java.util.Scanner;

	public class switchtest {

	public static void main(String[] args) throws InterruptedException {
	

	Scanner input = new Scanner (System.in);
	String text ="";
		
		
	System.out.println("Enter a Command / Question: ");
	text = input.nextLine();
		
	if(text.startsWith("/Kill"))
	
	{
		String whattokill = text.substring(6);
		
		System.out.println("Killed " + whattokill);

	}
	else
	{
		switch (text) { 
			
			case "/time set 0": 
					System.out.println("Time Set to Day");
					break;
	
			case "/time set 13000":
					System.out.println("Time Set to Night");
					break;
			
			case "/summon Circle":
				System.out.println("There Are No Circles In Minecraft!");
				break;
				
			case "/summon Herobrine":
					System.out.println("---Your computer crashed---");
					break;
				
			case "/summon Entity303":
					System.out.println("---Your computer crashed---");
					break;
		
			case "Is Neha Nishikant a Pooper?":
					System.out.println("Why Ask? Of Course");
					break;			
				
			case "Is Yash Nishikant Awesome?":
					System.out.println("YEAH! Why Even Ask?");
					break;			
				
			case "/Find the Ruler of the Nishikant Family":
					System.out.println("The Ruler Is Nishiant Par- NOPE! IT IS YASH NISHIKANT!     :D");
					break;			
				
			case "Daddy, Mamma, Diddi, And Yash Are The Best Right?":
				System.out.println("YEAH! Why Even Ask?");
				break;			
			
			case "/Robot":
				 System.out.print("0");
				 Thread.sleep(600);
				 System.out.print("     0");
				 Thread.sleep(600); 
				 System.out.println(" \n _____");
				 Thread.sleep(600);
				 System.out.print("        -");
				 System.out.print("-");
				 System.out.print("-");
				 System.out.print("-");
				 System.out.print("-");
				 System.out.print("->");
				 System.out.print(" HELLO!");
				 break;			 
			
			case "/Shoot A Grappling Hook":
				System.out.print("/=====");
				Thread.sleep(50);  
				int count =0;
				  String mychar = "-";
				       
				  while (count < 20){ Thread.sleep(100); 
				            
		          System.out.print (mychar);
				            count++;    
				  }
				  System.out.print("-}");
				  break;			 
				
			case "/Name the Numbers of Pi":
					System.out.println("3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117... PHEW! Wait... I'll Never Be Done!!! 06798214808651... NO!!");
					break;			
			
			case "/Destroy MC People":
				int[][] array = {
						
						{0 ,1 ,2},
						{3 ,4 ,5, 6},
						{7, 8 ,9, 10, 11}
						
						};
						String[][] textarray = new String[3][5];
						
						textarray[2][3] = "COUNTDOWN UNTIL BOMB EXPLOSION";
						
						
						System.out.println(textarray[2][3]);
						 Thread.sleep(1000);
						System.out.println(array[2][3]);
						 Thread.sleep(1000);
						System.out.println(array[2][2]);
						 Thread.sleep(1000);
						System.out.println(array[2][1]);
						 Thread.sleep(1000);
						System.out.println(array[2][0]);
						 Thread.sleep(1000);
						System.out.println(array[1][3]);
						 Thread.sleep(1000);
						System.out.println(array[1][2]);
						 Thread.sleep(1000);
						System.out.println(array[1][1]);
						 Thread.sleep(1000);
						System.out.println(array[1][0]);
						 Thread.sleep(1000);
						System.out.println(array[0][2]);
						 Thread.sleep(1000);
						System.out.println(array[0][1]);
						 Thread.sleep(1000);
						System.out.println(array[0][0]);
						System.out.println("((((=*=))))");
						System.out.println("     =");					
						System.out.println("     =");					
						System.out.println("     =");					
						System.out.println("_____=____");						
						System.out.println("TheActiveCreator, TheIronGamer666, Nunu0405, EpicBobZilla, HerobrineNS, Markeplier, SSundee, DanTDM, Deadlox, Vikkstar123, Eckosoldier, Logdotzip, Antvenom, BajanCanadian, Lachlan, Orepros, Magmamusen, Jacksepticeye, SwimmingBird941 SkydoesMinecraft, UnspeakableGaming, Xisumavoid, ExplodingTNT, PinkSheep, PurpleShep, YourMCAdmin, GrantTomphson(KingOfRandom), RejectedShotgun, GameCrown96, OMGcraft, CaptainSparklez, MrCrainer, JeromeASF, MinecraftUniverse, BlueMonkey, HuskyMukipz TechRax, And Nigahiga | All died from A Neuclear Explosion!     ");
						
						break;			
			
			default:
					System.out.println("I Am Not Able To Do That / Awnser That For You");
					break;
			}
		}	
	input.close();
	}		
}