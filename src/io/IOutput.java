package io;

public interface IOutput {

	/**
	 * Gibt eine Fehlermeldung aus, mit Bezug auf den Ort des Auftritts.
	 * 
	 * @param errorMessage Die auszugebende Fehlermeldung
	 * @param row Die Zeilen-Nr. der fehlerverursachenden Zeile
	 */
	void writeError(String errorMessage, int row);
	
	/**
	 * Gibt die L�sung des Problems aus.
	 */
	void writeOutput();
	
}
