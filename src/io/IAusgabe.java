package io;

public interface IAusgabe {

	/**
	 * Gibt eine Fehlermeldung aus, mit Bezug auf den Ort des Auftritts.
	 * 
	 * @param fehlermeldung Die auszugebende Fehlermeldung
	 * @param eingabedatei Der Dateiname der Eingabedatei
	 * @param zeile Die Zeilen-Nr. der fehlerverursachenden Zeile
	 */
	void schreibeFehler(String fehlermeldung, String eingabedatei, int zeile);
	
	/**
	 * Gibt die Lösung des Problems aus.
	 * 
	 * @param dateiname Der Dateiname der Eingabedatei
	 */
	void schreibeAusgabe(String dateiname);
	
}
