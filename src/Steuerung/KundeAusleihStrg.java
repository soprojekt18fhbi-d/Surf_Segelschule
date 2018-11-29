/**
 * @author Ben S
 */

package Steuerung;

import java.util.ArrayList;

import Domaenklassen.Kunde;

public class KundeAusleihStrg {

	private static KundeAusleihStrg instance;
	private static KundeSuchenStrg kundenSuche;
	private static KundeAuswStrg kundenAuswahl;
	private ArrayList <Kunde> kundenListe;
	private Kunde suchKunde;
	
	
	//Strg erstellen
	
	static KundeAusleihStrg getKundeAusleihStrg() {
		if (instance == null) {
			instance = new KundeAusleihStrg();
		}
		return instance;	
		}
	
	// Strg schlieﬂen
	
	static void closeKundeAusleihStrg() {
		if (instance != null) {
			instance = null;
		}
	}
	
	//Hauptmethode
	
	public Kunde getSuchKunde() {
		kundenListe=getKundeSuchenStrg();
		suchKunde=selectKunde(kundenListe);
		return suchKunde;
	}
		 
	
	//Start der Datenbankabfrage mit einer ArrayList als Ergebnis
	
	private ArrayList getKundeSuchenStrg() {
		kundenSuche = new KundeSuchenStrg();
		kundenListe = KundeSuchenStrg.sucheKunde();
		return kundenListe;
	}
	
	//Wahl eines Kunden aus der KundenListe
	
	private Kunde selectKunde(ArrayList kundenListe) {
		kundenAuswahl = new KundeAuswStrg();
		suchKunde = KundeAuswStrg.auswKunde(kundenListe);
		return suchKunde;
	}
	
	 
	
}
