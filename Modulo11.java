import java.util.Scanner;

/**
 * Denne metoden sjekker et kontonummer for å kontrollere om det overholder Modulo 11-regelen.
 * 
 * @author YVCrombrugge
 */
public class Modulo11 {
    public static void main(String[] args) {
	    try {
            // Definere kontonummeret som skal testes
		    Scanner reader = new Scanner(System.in);
            System.out.println("Skriv inn ditt kontonummer:");
            String strNum = reader.next();
            reader.close();
		
		    //Rengjøring av inngangen
		    strNum = strNum.replaceAll("[^0-9]", ""); //Fjerne eventuelle andre tegn enn tall fra input
            
		    // Definere variables
            int Len = strNum.length();
            int ControlDigit = 0; 
            int Multiplier = 2;
            int Sum = 0;

		    // Denne loopen går gjennom hvert nummer i kontonummeret og multipliserer det med tilsvarende konstant som angitt i reglene for Modulo 11.
            for(int i = Len-2; i >= 0; i--) {
			    int s = Character.getNumericValue(strNum.charAt(i));
			    //For debugging kommenter inn neste to linjer
                //System.out.println("Sum: "+ Sum);
                //System.out.println("Tallverdi: "+ s + ", Multiplier:" + Multiplier);
			    if (Multiplier > 7) {
                	Multiplier = 2;
                } else {
			    //Hopp videre
			    }
                Sum += (s*Multiplier);
                Multiplier += 1;
            }

		    //Denne testen bestemmer hva kontrollnummeret skal være.
            if (Sum%11 == 0) {
            	ControlDigit = 0;
            } else if (Sum%11 == 10) {
            	System.out.println("Kontrollnummeret er ikke gyldig!");
            } else {
            	ControlDigit = 11-Sum%11;
            }
		
		    //Denne testen sjekker at siste siffer i kontonummeret er lik kontrollnummeret
            if (ControlDigit == Character.getNumericValue(strNum.charAt(Len-1))) {
            	System.out.println("Dette kontonummeret er gyldig!");
            } else {
            	System.out.println("Dette kontonummeret er ikke gyldig!");
            }
        }
        catch(Exception e){
	        //Fange uventede feil.
		    System.out.println("Det har skjedd en uventet feil. Prøv på nytt.");
	    }
    }
}
