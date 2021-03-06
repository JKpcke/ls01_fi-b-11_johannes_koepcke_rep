import java.util.Scanner;
public class Fahrkartenautomat {
    public static void main(String[] args) throws Exception {
        Scanner tastatur = new Scanner(System.in);

        float zuZahlenderBetrag;
        //float eingezahlterGesamtbetrag = 0.0f;
        //float eingeworfene Münze;
        //float rückgabebetrag;

        /**
         * System.out.println("Ticketpreis (Euro): ");
         * zuZahlenderBetrag = tastatur.nextFloat();
         * System.out.print("Ticketzahl: ");
         * ticketzahl = tastatur.nextInt();
         * zuZahlenderBetrag *= ticketzahl;
         */

         zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur, "Ticketpreis (Euro): ", "Ticketzahl: ");

         zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur,"Ticketpreis (Euro): ", "Ticketzahl: ");
         float eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
         fahrkartenAusgeben();
         rueckgeldAusgeben(eingezahlterGesamtbetrag,zuZahlenderBetrag);
   
          // Geldeinwurf
          // -----------
         
         /** while(eingezahlterGesamtbetrag < zuZahlenderBetrag)
          {	float change = zuZahlenderBetrag - eingezahlterGesamtbetrag;
              String output = String.format("%.2f", change);
              System.out.println("Noch zu zahlen: " +output+ " Euro");
              System.out.print("Eingabe (mind. 5Ct, höchstens 2 Euro): ");
              eingeworfeneMünze = tastatur.nextFloat();
              eingezahlterGesamtbetrag += eingeworfeneMünze;
          }
          **/
          
          // Fahrscheinausgabe
          // -----------------
         /** System.out.println("\nFahrschein wird ausgegeben");
          for (int i = 0; i < 8; i++)
          {
             System.out.print("=");
             try {
               Thread.sleep(250);
           } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
          }
          System.out.println("\n\n");
       **/
          // Rückgeldberechnung und -Ausgabe
          // -------------------------------
         /** rückgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
          if(rückgabebetrag > 0.0)
          {	float backChange = rückgabebetrag;
              String outputBack = String.format("%.2f", backChange);
              System.out.println("Der Rückgabebetrag in Höhe von " + outputBack + " EURO");
              System.out.println("wird in folgenden Münzen ausgezahlt:");
   
              while(rückgabebetrag >= 2.0) // 2 EURO-Münzen
              {
                 System.out.println("2 EURO");
                 rückgabebetrag -= 2.0;
              }
              while(rückgabebetrag >= 1.0) // 1 EURO-Münzen
              {
                 System.out.println("1 EURO");
                 rückgabebetrag -= 1.0;
              }
              while(rückgabebetrag >= 0.5) // 50 CENT-Münzen
              {
                 System.out.println("50 CENT");
                 rückgabebetrag -= 0.5;
              }
              while(rückgabebetrag >= 0.2) // 20 CENT-Münzen
              {
                 System.out.println("20 CENT");
                  rückgabebetrag -= 0.2;
              }
              while(rückgabebetrag >= 0.1) // 10 CENT-Münzen
              {
                 System.out.println("10 CENT");
                 rückgabebetrag -= 0.1;
              }
              while(rückgabebetrag >= 0.05)// 5 CENT-Münzen
              {
                 System.out.println("5 CENT");
                  rückgabebetrag -= 0.05;
              }
          }
   
          System.out.println("\nVergessen sie nicht, den Fahrschein\n"+
                                     "vor Fahrtantritt entwerten zu lassen!\n"+
                                     "Wir wünschen ihnen eine gute Fahrt.");
          **/
          }
       
      public static float fahrkartenbestellungErfassen(Scanner sc,String ticketpreis, String ticketanzahl) {
          System.out.print(ticketpreis);
          float ticketPreis = sc.nextFloat();
          if(ticketPreis <= 0) {
              ticketPreis = 1;
              System.out.println("Der Ticketpreis darf nicht negativ sein.");
              System.out.println("Er wird daher auf 1 gesetzt.");
          }
          System.out.print(ticketanzahl);
          int ticketAnzahl = sc.nextInt();
          float gesamtpreis = 0;
          if(ticketAnzahl > 10 || ticketAnzahl <= 0) {
              System.out.println("Die Ticketzahl muss größer als 0 und kleiner 11 sein.");
              System.out.println("Die Ticketzahl wird auf 1 gesetzt.");
              ticketAnzahl = 1;
              gesamtpreis = ticketPreis * ticketAnzahl; 
             // System.out.println("gesamtpreis in if clause: " + gesamtpreis);
          } 
         // System.out.println("gesamtpreis in else clause: " + gesamtpreis);
          return gesamtpreis;
      }
      public static float fahrkartenBezahlen(Scanner tastatur,float zuZahlen) {
          float eingezahlterGesamtbetrag = 0.0f;
          while(eingezahlterGesamtbetrag < zuZahlen)
          {	float change = zuZahlen - eingezahlterGesamtbetrag;
                String output = String.format("%.2f", change);
              System.out.println("Noch zu zahlen: " +output+ " Euro");
              System.out.print("Eingabe (mind. 5Ct, höchstens 2 Euro): ");
              float eingeworfeneMünze = tastatur.nextFloat();
              eingezahlterGesamtbetrag += eingeworfeneMünze;
          }
          return eingezahlterGesamtbetrag;
      }
      public static void fahrkartenAusgeben() {
          System.out.println("\nFahrschein wird ausgegeben");
          warte(250);
         /** for (int i = 0; i < 8; i++)
          {
             System.out.print("=");
             try {
               Thread.sleep(250);
           } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
          }
          **/System.out.println("\n\n");
      }
      public static void rueckgeldAusgeben(float eingezahlterGesamtbetrag,float zuZahlen) {
         float rückgabebetrag = eingezahlterGesamtbetrag - zuZahlen;
         // System.out.println  ("Eingezahlt "+eingezahlterGesamtbetrag);
         // System.out.println  ("zuZahlen "+zuZahlen);
         // float rückgabebetrag = zuZahlen - eingezahlterGesamtbetrag;
        // System.out.println("Rückgabebetrag "+rückgabebetrag);
          if(rückgabebetrag > 0.0)
          {	float backChange = rückgabebetrag;
                  String outputBack = String.format("%.2f", backChange);
              System.out.println("Der Rückgabebetrag in Höhe von " + outputBack + " EURO");
              System.out.println("wird in folgenden Münzen ausgezahlt:");
   
              while(rückgabebetrag >= 2.0) // 2 EURO-Münzen
              {
                 System.out.println("2 EURO");
                 rückgabebetrag -= 2.0;
              }
              while(rückgabebetrag >= 1.0) // 1 EURO-Münzen
              {
                 System.out.println("1 EURO");
                 rückgabebetrag -= 1.0;
              }
              while(rückgabebetrag >= 0.5) // 50 CENT-Münzen
              {
                 System.out.println("50 CENT");
                 rückgabebetrag -= 0.5;
              }
              while(rückgabebetrag >= 0.2) // 20 CENT-Münzen
              {
                 System.out.println("20 CENT");
                  rückgabebetrag -= 0.2;
              }
              while(rückgabebetrag >= 0.1) // 10 CENT-Münzen
              {
                 System.out.println("10 CENT");
                 rückgabebetrag -= 0.1;
              }
              while(rückgabebetrag >= 0.05)// 5 CENT-Münzen
              {
                 System.out.println("5 CENT");
                  rückgabebetrag -= 0.05;
              }
          }
   
          System.out.println("\nVergessen sie nicht, den Fahrschein\n"+
                                     "vor Fahrtantritt entwerten zu lassen!\n"+
                                     "Wir wünschen ihnen eine gute Fahrt.");
      }
      public static void warte (int millisekunde) {
          for (int i = 0; i < 8; i++)
          {
             System.out.print("=");
             try {
               Thread.sleep(millisekunde);
           } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
          }
          System.out.println("\n\n");
    }
}
