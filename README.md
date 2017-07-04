Galgenraten
============

```
-----
|   |
|   o
|  /|\
|   |
|  /
|
-----

Gesucht: haus -> _ _ _ _ -> "a" -> _ a _ _

```

Ziel/Aufgabe
* Gesucht ist ein Wort
* für jeden Buchstaben des gesuchten Wortes wird ein Unterstrich angezeigt
* in einem Spielzug rate ich einen Buchstaben oder das gesuchte Wort
* wenn der Buchstabe im Wort enthalten ist, werden bei allen Stellen die Platzhalter durch den Buchstaben ersetzt
* wenn der Buchstabe nicht enthalten ist, gibt es einen Strafpunkt
* wenn ich das richtige Wort rate, habe ich gewonnen
* wenn kein Unterstrich mehr existiert, habe ich gewonnen
* wenn ich 9 Strafpunkte habe (die Linien im Männchen oben zusammengefasst), habe ich verloren
* wenn ich das falsche Wort rate habe ich verloren

```
Axels-MBP-2:hangman axelklinger$ groovy Hangman.groovy
---- 0
Buchstabe? w
---- 1
Buchstabe? a
-a-- 1
Buchstabe? u
-au- 1
Buchstabe? s
-aus 1
Buchstabe? g
-aus 2
Buchstabe? h
Gewonnen: haus
```

=> jeder dieser Punkte wird ein (vollständiges!) Feature/Commit mit
* Beschreibung/Aufgabe (+ Video)
* Moellierung (+ Video)
* Umsetzung/Lösung + Commits + Videos
* ... + Theorie!
* ... + Methodik?! - s.a. Curriculum

-> der Computer verwendet für die Auswahl des Wortes per random (Zufall) eine Liste von Wörtern

*Anmerkung:*
Eine saubere Problembeschreibung ist das A und O. Wenn ihr das könnt, werdet ihr zu guten Problemlösern - und die werden immer gebraucht!-)
