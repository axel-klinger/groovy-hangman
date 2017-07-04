
class Hangman {

  static main(args) {

    def gesuchtesWort = "eingabe"
    def ersatzWort = gesuchtesWort.replaceAll("\\w","_")
    def buchstaben = [] as Set

    def fehlVersuche = 0

    while (fehlVersuche < 7 && ersatzWort != gesuchtesWort) {

      println ersatzWort + " " + fehlVersuche
    	def eingabe = System.console().readLine("Buchstabe? ")

      if (gesuchtesWort.contains(eingabe)) {
        def index = gesuchtesWort.indexOf(eingabe)
        while (index >= 0) {
          ersatzWort = ersatzWort.substring(0,index) + eingabe + ersatzWort.substring(index+1);
          index = gesuchtesWort.indexOf(eingabe, index + 1);
        }
      } else {
        fehlVersuche++
      }
    }
    if (ersatzWort == gesuchtesWort) {
      println "Gewonnen: " + ersatzWort
    } else {
        println "Verloren! Das Wort war " + gesuchtesWort
    }
  }
}

// Erweiterungen
// * gesuchtesWort per Zufall (random) aus Wörterbuch
// * bei ? alle Möglichkeiten aus Wörterbuch ausgeben
// * den Computer raten lassen mit statistischer Auswertung
//   möglicher Treffer auf maximal vorkommende Buchstaben
