:: Skript zum leeren des Ausgabeordners
@echo off

:: Setzen der Standardwerte
set outdir  = "./Output"
set filetyp = ".out"

:: Ueberpruefen ob Ordner vorhanden ist
IF NOT EXIST %outdir% (
  echo "-------------Test-Fehler-------------"
  echo "Pfad fuer die Ausgabedateien wurde nicht gefunden!"
  echo "Bitte ueberpruefen Sie ob der Pfad"
  echo "%outdir%"
  echo "existiert und fuehren das Skript erneut aus."
  echo "Zum beenden beliebige Taste druecken."
  pause > nul
) 
for %%i in (%outdir%/*%filetyp%) do (
  echo "Loesche Datei " %%i
  del %%i
  echo.
)
echo.
echo "Ausgabeordner wurde geleert von allen Files mit der Dateiendung %filetyp%"
echo "Zum beenden beliebige Taste druecken."
pause > nul