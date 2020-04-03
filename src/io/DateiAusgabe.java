package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DateiAusgabe implements IAusgabe {

	private final String DATEIPFAD = "./Output/";
	private final String INOUTLINE = "********************************************************************************";
	private final String BEGINENDLINE = "*****";
	
	public DateiAusgabe() {
		
	}
	
	@Override
	public void schreibeFehler(String fehlermeldung, String dateiname, int zeile) {
		if(fehlermeldung == null || fehlermeldung.trim().length() == 0) {
			throw new IllegalArgumentException("Keine Fehlermeldung vorhanden!");
		} else if(dateiname == null || dateiname.trim().length() == 0) {
			throw new IllegalArgumentException("Dateiname für Fehlerdatei nicht vorhanden");
		}
		
		try(PrintWriter printer = new PrintWriter(new File(DATEIPFAD + dateiname + ".err"))){
			String leerzeichenDatei = "";
			
			for(int i = 0; i < (dateiname.length() + 11) / 2; ++i) {
				leerzeichenDatei += " ";
			}
			
			printer.println(INOUTLINE 
					+ "\n*************************************FEHLER*************************************"
					+ INOUTLINE);
			printer.println(BEGINENDLINE 
					+ "                              Zeile: " 
					+ String.format("%03d", zeile) 
					+ "                              " 
					+ BEGINENDLINE);
			printer.println(BEGINENDLINE
					+ leerzeichenDatei + "Dateiname: " + dateiname + leerzeichenDatei
					+ BEGINENDLINE);
			printer.println(fehlermeldung);
			printer.println(INOUTLINE + "\n" + INOUTLINE + "\n" + INOUTLINE);
			
			printer.flush();
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Fehler beim schreiben der Fehlerdatei");
		}
		
	}
	
	@Override
	public void schreibeAusgabe(String dateiname) {
		if(dateiname == null || dateiname.trim().length() == 0) {
			throw new IllegalArgumentException("Dateiname für Ausgabedatei nicht vorhanden");
		}
		//TODO implement Ausgabe
		try(PrintWriter printer = new PrintWriter(new File(DATEIPFAD + dateiname + ".out"))){
			printer.flush();
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Fehler beim schreiben der Ausgabedatei");
		}
	}
	
}
