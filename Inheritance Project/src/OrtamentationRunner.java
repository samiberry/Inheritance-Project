
public class OrtamentationRunner {

	public static void main(String[] args) {
		Ortamentation ortamentationl = new Ortamentation();
		Clothes clothes = new Clothes ();
		Jeans jean = new Jeans();
		Shirts shirts = new Shirts();
		Jewerly jewerly = new Jewerly();
		Earrings earrings = new Earrings();
		Necklace necklace = new Necklace();
		
		Ortamentation.wear();
		
		Clothes.showsfirgure();
		Clothes.warms();
		
		Jewerly.attractsburgalurs();
		Jewerly.pairwithoutfit();
		
		Jeans.carrythings();
		Jeans.matches();
		Jeans.puton();
		
		Shirts.putontorso();
		
		Earrings.putonears();
		Earrings.matchwithnecklace();
		
		Necklace.putaroundneck();
		Necklace.matchwithshirt();
	}

}
