package io;

/**
 * Die Klasse {@code DateiEingabe} dient dem Einlesen der Eingabedatei.
 * Hier wird auf syntaktische Fehler geprüft, welche gemäß Konzept behandelt werden.
 * 
 * @author Lukas Dahlberg
 * @version 1.0
 */
public class DateiEingabe implements IEingabe {
	
	private String kommentar;
	private String dateiname;
	private String dateipfad;
	
	public DateiEingabe(String datei) {
		// TODO implement
	}
	
	private void setKommentar(String kommentar) {
		if(kommentar == null || kommentar.trim().length() == 0) {
			return; // TODO throw Exception
		}
		this.kommentar = kommentar;
	}
	
	public String getKommentar() {
		return kommentar;
	}
	
	private void setDateiname(String dateiname) {
		if(dateiname == null || dateiname.trim().length() == 0) {
			return; // TODO throw Exception
		}
		this.dateiname = dateiname;
	}
	
	public String getDateiname() {
		return dateiname;
	}
	
	private void setDateipfad(String dateipfad) {
		if(dateipfad == null || dateipfad.trim().length() == 0) {
			return; // TODO throw Exception
		}
		this.dateipfad = dateipfad;
	}
	
	public String getDateipfad() {
		return dateipfad;
	}
	
}
