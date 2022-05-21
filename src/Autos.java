
public class Autos {
	
	//Attribute bzw. Eigenschaften
	private String farbe;
	private String marke;
	private int ps;
	
	//Methoden
	public void drive()
	{
		System.out.println("Das Auto faehrt ...");
	}//end drive()
	
	public void print()
	{
		System.out.println(farbe + " " + marke + " " + Integer.toString(ps));

	}
	
	
	//Getters & Setters
	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}


	
	

}//end Class
