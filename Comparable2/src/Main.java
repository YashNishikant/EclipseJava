import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		
		GamingEquipment p1 = new GamingEquipment("SteelSeries Apex Pro", "Logitech G502   ", 154);
		GamingEquipment p2 = new GamingEquipment("SteelSeries Apex Pro", "Razer Deathadder", 189);
		GamingEquipment p3 = new GamingEquipment("RK ROYAL KLUDGE", "Model O           ", 100);
		GamingEquipment p4 = new GamingEquipment("Logitech G213    ", "Logitech G203     ", 102);
		GamingEquipment p5 = new GamingEquipment("Corsair K55    ", "SteelSeries Rival 3", 249);
		GamingEquipment p6 = new GamingEquipment("SteelSeries Apex Pro", "Razer Deathadder", 263);

		ArrayList<GamingEquipment> gamingList = new ArrayList<GamingEquipment>();

		gamingList.add(p1);
		gamingList.add(p2);
		gamingList.add(p3);
		gamingList.add(p4);
		gamingList.add(p5);
		gamingList.add(p6);

		Collections.sort(gamingList);
		for (GamingEquipment g : gamingList) {
			System.out.println(g);
		}
	}
}
