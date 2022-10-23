package classesandobjects;

class Minecraft {

	String name;

	void AttackDammage() {
		System.out.println("64 Attack Damage");
	}
}

public class ClassesAndObjects {

	public static void main(String[] args) {

		Minecraft Minecraft1 = new Minecraft();
		Minecraft1.name = "TechnoTitaniumBattleAxe";


		Minecraft Minecraft2 = new Minecraft();
		Minecraft2.name = "DeathRay: 120 Attack Damage";
	
		
		System.out.println("\t" + Minecraft1.name); 
		System.out.print("\t");
		Minecraft1.AttackDammage();
		
		System.out.println(Minecraft2.name);
		
	}

}
