package io;

public interface IAusgabe {

	void schreibeFehler(String fehlermeldung, String eingabedatei, int zeile);
	
	void schreibeAusgabe(String dateiname);
	
}
