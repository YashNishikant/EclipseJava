public class nestedLoop {
	public static void main(String [] args){

//TASK 1
	for(int i=0;i<=4;i++) {
		for(int j=0;j<i;j++) {

		System.out.print("*");

			}
	System.out.println();
		}

System.out.println("\n");

//TASK 2
	for(int a=0;a<=4;a++) {
		for(int b=a;b<4;b++) {

		System.out.print("*");

			}
	System.out.println();
		}

System.out.println("\n");

//TASK 3
	for(int a=0;a<=3;a++) {
		for(int b=a;b<5;b++) {

		System.out.print("*");

			}
	System.out.println();
		}

System.out.println("\n");

//TASK 4
	for(int x=1;x<10;x++){

		System.out.print("\t" + x + "\t");
		
		for(int y=2;y<10;y++) {

		System.out.print((x * y) + "\t");
		}
	System.out.println("");
	}

	}

}


