import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

class StarWarsCharacter {

	private String name;
	private String gender;
	private String homeworld;
	private String species;
	private String birthyear;
	
	public StarWarsCharacter(String n, String g, String h, String s, String b){
		name = n;
		gender = g;
		homeworld = h;
		species = s;
		birthyear = b;
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
		if(homeworld.equals("NA")) {
			homeworld = "Unknown";
		}
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

	public String getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(String birthyear) {
		this.birthyear = birthyear;
	}
	
	public String toString(boolean B) { 
		if(B)
			return String.format("%-40s %-40s %-40s", getName(), getHomeworld(), getBirthyear());
		else 
			return String.format("%-40s %-40s", getName(), getHomeworld());
	}
	
}

public class Starwars {

	public Starwars() {
		
		Stack<StarWarsCharacter> males = new Stack<StarWarsCharacter>();
		Stack<StarWarsCharacter> females = new Stack<StarWarsCharacter>();
		Stack<StarWarsCharacter> droids = new Stack<StarWarsCharacter>();
		Stack<StarWarsCharacter> validbirthyears = new Stack<StarWarsCharacter>();
	
		File f = new File("C:\\github\\JavaApps\\Tasks\\src\\StarWarsCharacters.csv");

		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String temp;
			while ((temp = reader.readLine()) != null) {
				String[] pieces = temp.split(",");
				
				StarWarsCharacter c = new StarWarsCharacter(pieces[0], pieces[6], pieces[7], pieces[8], pieces[5]);
				
				if(c.getGender().equals("male")) {
					males.push(c);
				}
				if(c.getGender().equals("female")) {
					females.push(c);
				}
				if(c.getSpecies().equals("Droid")) {
					droids.push(c);
				}
				if(c.getBirthyear().contains("BBY")) {
					validbirthyears.push(c);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		
		format("Male Characters", males, false);
		format("Female Characters", females, false);
		format("Droids", droids, false);
		format("Ages", validbirthyears, true);
		
	}
	
	void format(String title, Stack<StarWarsCharacter> a, boolean birthyears) {
		System.out.println(title);
		if(birthyears)
			System.out.println(String.format("%-40s %-40s %-40s", "Name", "Homeworld", "Birth Year (BBY)"));
		else
			System.out.println(String.format("%-40s %-40s", "Name", "Homeworld"));
			
		for(int i = a.size()-1; i > 0; i--) {
			System.out.println(a.pop().toString(birthyears));
		}
		System.out.println("============================================================================================================");
	}
	
	public static void main(String[] args) {
		new Starwars();
	}

}
