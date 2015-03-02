package autoPackage;

public class Auto {
	int raeder;
	int ps;
	String farbe;
	String marke;
	
	// Konstruktor mit default values
	public Auto(){
		this.raeder = 4;
		this.ps = 100;
		this.farbe = "Silber";
		this.marke = "Volkswagen";
	}
	
	public Auto(String marke){
		this.marke = marke;
	}
	
	// Konstruktor mit usesr defined values
	public Auto(int raeder, int ps, String farbe){
		this.raeder = raeder;
		this.ps = ps;
		this.farbe = farbe;
		this.marke = marke;
	}
	
	public void fahren(){
		System.out.println("Hallo, ich bin ein " + marke);
	}

}
