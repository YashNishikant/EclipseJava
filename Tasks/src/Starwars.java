import java.util.Stack;

public class Starwars {

	public Starwars() {
		
		Stack<Character> males = new Stack<Character>();
		Stack<Character> females = new Stack<Character>();
		Stack<Character> droidss = new Stack<Character>();
		Stack<Character> validbirthyears = new Stack<Character>();
		
	}
	
	public static void main(String[] args) {
		
	}

}

class Character {

	private String name;
	private String gender;
	private String homeworld;
	private String species;
	private int birthyear;
	
	public Character(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	
}