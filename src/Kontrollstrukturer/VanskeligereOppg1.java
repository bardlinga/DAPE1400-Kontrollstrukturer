package Kontrollstrukturer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VanskeligereOppg1 {

    /*
    Beregn Pi med 10 desimalers nøyaktighet. Pi med 12 desimaler er 3.14159265358. Bruk en løkke til å beregne pi ved hjelp av denne rekken:

    Pi=4-4/3+4/5-4/7+4/9-4/11+....

    Lag en innlesning av antall ledd i rekken (omganger i løkken) slik at det er mulig å variere hvor mange som trengs for å oppnå en presisjon på 10 siffer.

    Tips: Bruk long isteden for int for å ha mulighet for stort nok tall i løkken.
    */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int antallDesimalerInn;

        System.out.println("Skriv inn antall desimaler du ønsker å estimere π til:");
        try {
            antallDesimalerInn = sc.nextInt();
        }
        catch(Exception e){
            antallDesimalerInn = 0;
        }

        DecimalFormat avrundingsMal = new DecimalFormat();
        avrundingsMal.setMinimumFractionDigits(antallDesimalerInn);

        String avrundingsMalString = avrundingsMal.format(0);

        DecimalFormat avrunding = new DecimalFormat(avrundingsMalString);

        long i = 0;

        double piCurrent = 0;
        double piPrev;
        if(antallDesimalerInn > 0) {
            piPrev = 1;
        }
        else{
            piPrev = 0;
            System.out.println("Vennligst skriv inn et heltall over 0.");
        }

        String roundedPiCurrent = avrunding.format(piPrev);
        String roundedPiPrev = avrunding.format(piCurrent);

        while (!roundedPiCurrent.equals(roundedPiPrev)) {
            double piLedd;
            piLedd = Math.pow(-1, i) * 4 / (2*i + 1);
            piPrev = piCurrent;
            piCurrent += piLedd;

            roundedPiPrev = avrunding.format(piPrev);
            roundedPiCurrent = avrunding.format(piCurrent);

            System.out.println("i = "+i+", π ≈ "+roundedPiCurrent);
            i++;
        }
        System.out.println(
                "π estimert og avrundet til "+antallDesimalerInn+" desimaler = "
                +roundedPiCurrent+". Det tok "+(i-1)+" iterasjoner av loopen å estimere."
        );
    }
}
