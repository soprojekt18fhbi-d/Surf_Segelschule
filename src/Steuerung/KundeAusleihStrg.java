/**
 * @author Ben S
 */

package Steuerung;

import java.util.ArrayList;

import Domaenklassen.Kunde;

public class KundeAusleihStrg {

	private static KundeAusleihStrg instance;
	private static KundeSuchenStrg kundensuche;
	private ArrayList <Kunde> kundenListe;
	private Kunde suchKunde;
	
	
	//Strg erstellen
	
	static KundeAusleihStrg getKundeAusleihStrg() {
		if (instance == null) {
			instance = new KundeAusleihStrg();
		}
		return instance;	
		}
	
	//Hauptmethode
	
	public Kunde getSuchKunde() {
		kundenListe=getKundeSuchenStrg();
		suchKunde=selectKunde(kundenListe);
		return suchKunde;
	}
		 
	
	//Start der Datenbankabfrage mit einer ArrayList als Ergebnis
	
	public ArrayList getKundeSuchenStrg() {
		KundeSuchenStrg kundenSuche = new KundeSuchenStrg();
		kundenListe = KundeSuchenStrg.sucheKunde();
		return kundenListe;
	}
	
	//Wahl eines Kunden aus der KundenListe
	
	public Kunde selectKunde(ArrayList kundenListe) {
		KundeAuswStrg kundenSuche = new KundeAuswStrg();
		KundeAuswStrg.sucheKunde();
		return suchKunde;
	}
	
	 
	
}
