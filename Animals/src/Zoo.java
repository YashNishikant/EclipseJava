
public class Zoo {
	void Transportation(Animal animal) {
		animal.Transportation();
	
	}

	void Sound(Animal animal) {
		animal.Sound();
	}

	void Live(Animal animal) {
		animal.Live();
	}

	public static void main(String[] args) {

		Zoo zoo = new Zoo();
		
		
		// Lion
		System.out.println("Lion:");
		System.out.println();
		Lion Lion1 = new Lion();

		zoo.Transportation(Lion1);
		zoo.Sound(Lion1);	
		zoo.Live(Lion1);
		System.out.println("____________");

		// Eagle
		System.out.println("Eagle:");
		System.out.println();
		Eagle Eagle1 = new Eagle();

		zoo.Transportation(Eagle1);
		zoo.Sound(Eagle1);
		zoo.Live(Eagle1);
		System.out.println("____________");

		// Shark
		System.out.println("Shark:");
		System.out.println();
		Shark Shark1 = new Shark();

		zoo.Transportation(Shark1);
		zoo.Sound(Shark1);
		zoo.Live(Shark1);
		System.out.println("____________");

		// Cobra
		System.out.println("Cobra:");
		System.out.println();
		Cobra Cobra1 = new Cobra();

		zoo.Transportation(Cobra1);
		zoo.Sound(Cobra1);
		zoo.Live(Cobra1);
		System.out.println("____________");

	}
}
