import java.util.ArrayList;

public class Driver {

	int VillainIndex = 0;
	int HeroIndex = 0;
	String HeroID = "SuperDude";
	String VillainID = "EvilMachine";

	public Driver() {

		ArrayList<Person> dailyPlanetStreet = new ArrayList<Person>();
		ArrayList<Person> safepeople = new ArrayList<Person>();
		ArrayList<Person> unsafepeople = new ArrayList<Person>();
		String[] firstname = { "Bob", "Billy", "Nick", "Jim", "Sam", "Kevin", "Hank", "Frank", "Rob", "Will" };
		String[] lastname = { "Carter", "DiAntonio", "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis",
				"Wilson", "Hill" };
		String[] job = { "Doctor", "Construction Worker", "Janitor", "Game Developer", "Artist", "Author", "Lawyer",
				"News Writer", "Police", "Scientist" };

		Hero hero = new Hero(HeroID, "Inventor", "Turbo Lazer", 10, 10, 100, 25, true, "Let's save the city!",
				"superdude");
		Villain villain = new Villain(VillainID, "Mechanic", "Earth Spikes", 10, 10, 100, 25, false, "HAAAAAHAAAAAAAAA",
				"evildude");

		int random = (int) (Math.random() * 2) + 1;
		int random2 = (int) (Math.random() * 49) + 1;
		int hp1;
		int hp2;
		int randomAttack = (int) (Math.random() * 1) + 1;

		for (int i = 0; i < 48; i++) {
			Person person = new Person(
					firstname[(int) (Math.random() * 9) + 1] + " " + lastname[(int) (Math.random() * 9) + 1],
					job[(int) (Math.random() * 9) + 1]);
			dailyPlanetStreet.add(person);

			if (i == random) {
				dailyPlanetStreet.add(hero);
			}
			if (i == random2) {
				dailyPlanetStreet.add(villain);
			}
		}

		Person safe = null;
		Person unsafe = null;
		while (dailyPlanetStreet.size() > 2) {
			getHeroVillainIndex(dailyPlanetStreet);

			if (VillainIndex == 0) {
				if (HeroIndex != VillainIndex + 1) {
					unsafe = dailyPlanetStreet.get(VillainIndex + 1);
					unsafepeople.add(unsafe);
					dailyPlanetStreet.remove(VillainIndex + 1);
					getHeroVillainIndex(dailyPlanetStreet);
					int index = RandomLocation(dailyPlanetStreet);
					if (index != -1) {
						safe = dailyPlanetStreet.get(index);
						safepeople.add(safe);
						dailyPlanetStreet.remove(index);
					}
					Dialogue(dailyPlanetStreet, hero, villain, unsafe, safe);
					continue;
				} else {
					unsafe = dailyPlanetStreet.get(VillainIndex + 2);
					unsafepeople.add(unsafe);
					dailyPlanetStreet.remove(VillainIndex + 2);
					getHeroVillainIndex(dailyPlanetStreet);
					int index = RandomLocation(dailyPlanetStreet);
					if (index != -1) {
						safe = dailyPlanetStreet.get(index);
						safepeople.add(safe);
						dailyPlanetStreet.remove(index);
					}
					Dialogue(dailyPlanetStreet, hero, villain, unsafe, safe);
					continue;
				}
			}

			if (VillainIndex == dailyPlanetStreet.size() - 1) {
				if (HeroIndex != VillainIndex - 1) {
					unsafe = dailyPlanetStreet.get(VillainIndex - 1);
					unsafepeople.add(unsafe);
					dailyPlanetStreet.remove(VillainIndex - 1);
					getHeroVillainIndex(dailyPlanetStreet);
					int index = RandomLocation(dailyPlanetStreet);
					if (index != -1) {
						safe = dailyPlanetStreet.get(index);
						safepeople.add(safe);
						dailyPlanetStreet.remove(index);
					}
					Dialogue(dailyPlanetStreet, hero, villain, unsafe, safe);
					continue;
				} else {
					unsafe = dailyPlanetStreet.get(VillainIndex - 2);
					unsafepeople.add(unsafe);
					dailyPlanetStreet.remove(VillainIndex - 2);
					getHeroVillainIndex(dailyPlanetStreet);
					int index = RandomLocation(dailyPlanetStreet);
					if (index != -1) {
						safe = dailyPlanetStreet.get(index);
						safepeople.add(safe);
						dailyPlanetStreet.remove(index);
					}
					Dialogue(dailyPlanetStreet, hero, villain, unsafe, safe);
					continue;
				}
			}

			if (HeroIndex != VillainIndex - 1) {
				unsafe = dailyPlanetStreet.get(VillainIndex - 1);
				unsafepeople.add(unsafe);
				dailyPlanetStreet.remove(VillainIndex - 1);
				getHeroVillainIndex(dailyPlanetStreet);
				int index = RandomLocation(dailyPlanetStreet);
				if (index != -1) {
					safe = dailyPlanetStreet.get(index);
					safepeople.add(safe);
					dailyPlanetStreet.remove(index);
				}
				Dialogue(dailyPlanetStreet, hero, villain, unsafe, safe);
				continue;
			} else {
				if (HeroIndex != VillainIndex + 1) {
					unsafe = dailyPlanetStreet.get(VillainIndex + 1);
					unsafepeople.add(unsafe);
					dailyPlanetStreet.remove(VillainIndex + 1);
					getHeroVillainIndex(dailyPlanetStreet);

					int index = RandomLocation(dailyPlanetStreet);
					if (index != -1) {
						safe = dailyPlanetStreet.get(index);
						safepeople.add(safe);
						dailyPlanetStreet.remove(index);
					}
					Dialogue(dailyPlanetStreet, hero, villain, unsafe, safe);
					continue;
				}
			}

		}
		System.out.println("DailyPlanetStreet: " + dailyPlanetStreet);
		System.out.println("Safe: " + safepeople);
		System.out.println("Unsafe: " + unsafepeople);

		System.out.println("_________________________________________________________________________\nCOMBAT PHASE");
		
		while(hero.getHitPoint() > 0 && villain.getHitPoint() > 0) {
			if(randomAttack == 1) {
				System.out.println("Villain Attacks Hero!");
				
				hp1 = hero.hpReduction((int)(Math.random()*hero.getMaxDamage())+1);
				if(hp1 < 0) {
					hp1 = 0;
				}
				System.out.println("Hero is on " + hp1 + " HP!");
				randomAttack = 2;
			System.out.println("_________________________________________________________________________");
			}
			else {
				System.out.println("Hero Attacks Villain!");
				
				hp2 = villain.hpReduction((int)(Math.random()*villain.getMaxDamage())+1);
				if(hp2 < 0) {
					hp2 = 0;
				}
				
				System.out.println("Villain is on " + hp2 + " HP!");
				randomAttack = 1;
				System.out.println("_________________________________________________________________________");
			}
		}
		
		if(hero.getHitPoint() == 0) {
			System.out.println("VILLAIN WINS!!!");
		}
		else {
			System.out.println("HERO WINS!!!");
		}
	}

	
	
	public int RandomLocation(ArrayList<Person> street) {
		int randomSafe = -1;
		getHeroVillainIndex(street);
		if (street.size() <= 2) {
			return -1;
		}
		//if (street.size() == 3) {
//			
//			for (int i = 0; i < street.size(); i++) {
//				if ((i != HeroIndex) && (i != VillainIndex))
//					return i;
//
//			}
		//}

		while (true) {
			randomSafe = (int) (Math.random() * street.size()) + 0;
			if (randomSafe != HeroIndex && randomSafe != VillainIndex) {
				break;
			}
		}
		return randomSafe;

	}

	public void Dialogue(ArrayList<Person> street, Hero h, Villain v, Person unsafe, Person safe) {
		System.out.println("Villain: " + v.getEvilLaugh());
		System.out.println(unsafe + " was moved to the unsafe list!");
		System.out.println("Hero: " + h.getCatchPhrase());
		if (safe != null) {
			System.out.println(safe + " was moved to the safe list!");
		}
		
		int index = RandomLocation(street);
		if(index != -1) {
			Person temp = street.get(index);
			street.set(index, h);
			street.set(HeroIndex, temp);
			
			System.out.println("Hero has moved to location: " + index);
		}
		getHeroVillainIndex(street);
		System.out.println("_________________________________________________________________________");
	}

	public void getHeroVillainIndex(ArrayList<Person> dailyPlanetStreet) {
		for (int j = dailyPlanetStreet.size() - 1; j > -1; j--) {
			if (dailyPlanetStreet.get(j).getName().equals(VillainID)) {
				VillainIndex = j;
			}
			if (dailyPlanetStreet.get(j).getName().equals(HeroID)) {
				HeroIndex = j;
			}
		}
	}

	public static void main(String[] args) {
		Driver app = new Driver();
	}

}
