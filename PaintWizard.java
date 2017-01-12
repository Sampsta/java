package Paint;
import java.util.*;
public class PaintWizard {

	public PaintWizard() {
	
	}
ArrayList<Paint> Paints = new ArrayList<Paint>();
ArrayList<Double> Price = new ArrayList<Double>();
ArrayList<Integer> TotalCans = new ArrayList<Integer>();


double cheapest = 900000000;
int roomSize = 50;
String name;
int numCans;


public void addPaints(){
	Paint p1 = new Paint("CheapoMax", 20, 10, 19.99);
	Paint p2 = new Paint("AverageJoes", 15, 11, 17.99);
	Paint p3 = new Paint("DuluxourousPaints", 10, 20, 25.00);
	Paints.add(p1);
	Paints.add(p2);
	Paints.add(p3);
	
	
}
public void calPrice(){
	for (int i = 0; i < Paints.size(); i++){
		int room = Paints.get(i).getRoom();
		int counter = 1;
		while (room < roomSize){
				room = room+Paints.get(i).getRoom();
				counter++;
				
			}
		double price = Paints.get(i).getPrice()*counter;
		Price.add(price);
	}
	for (int i = 0; i < Price.size(); i++){
		if (Price.get(i) < cheapest){
			cheapest = Price.get(i);
			name = Paints.get(i).getName();
		}
	} 
	System.out.println(cheapest+" " + name);
	
}


public void waste(){
	TotalCans.add(((5*20*10)-50)/10);
	TotalCans.add(((5*15*11)-50)/11);
	TotalCans.add(((3*10*20)-50)/20);
	System.out.print("CheapoMax "+TotalCans.get(0)+" AverageJoes "+TotalCans.get(1)+" DuluxourousPaints "+TotalCans.get(2));
} 
}
