package Domaenklassen;

public class Kunde {

	private int lastKundennummer = 10000;
	
	private int kundennummer;
	private String name;
	private String vorname;
	private Adresse heimadresse;
	private Adresse urlaubsadresse;
	private boolean surfschein;
	private boolean segelschein;
	private boolean motorbootschein;
	private int geburtsdatum;
	private boolean bestandskunde;
	
	
	public Kunde(String name, String vorname, Adresse heimadresse, Adresse urlaubsadresse, Boolean surfschein, Boolean segelschein, Boolean motorbootschein, int geburtsdatum) {
		this.kundennummer = ++lastKundennummer;
		
		this.name = name;
		this.vorname = vorname;
		this.heimadresse = heimadresse;
		this.urlaubsadresse = urlaubsadresse;
		this.surfschein = surfschein;
		this.segelschein = segelschein;
		this.motorbootschein = motorbootschein;
		this.geburtsdatum = geburtsdatum;
		this.bestandskunde = false;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public int getKundennummer() {
		return kundennummer;
	}
	
	public boolean isSurfschein() {
		return surfschein;
	}
	public void setSurfschein(boolean surfschein) {
		this.surfschein = surfschein;
	}
	public boolean isSegelschein() {
		return segelschein;
	}
	public void setSegelschein(boolean segelschein) {
		this.segelschein = segelschein;
	}
	public boolean isMotorbootschein() {
		return motorbootschein;
	}
	public void setMotorbootschein(boolean motorbootschein) {
		this.motorbootschein = motorbootschein;
	}
	public int getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(int geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	public void drucken(){
		System.out.println("\n" + this.kundennummer + ": " + this.name + ", " + this.vorname) ;
		this.heimadresse.drucken();
	}
	
	@Override
	public String toString(){
		return this.kundennummer + ";" + this.name + ";" + this.vorname + ";" + this.segelschein + ";" + this.surfschein + ";" + this.motorbootschein + ";"+  this.heimadresse.toString(); 
	}

}
