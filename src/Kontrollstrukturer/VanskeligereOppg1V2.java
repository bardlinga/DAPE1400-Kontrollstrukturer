package Kontrollstrukturer;

import java.text.DecimalFormat;
import java.util.Objects;

public class VanskeligereOppg1V2 {

    public static void main(String[] args){


        // I linja under, ta bort // for å kommentere ut blokk
        ///*-------------------------------------------------------------------

        //velg antall desimaler ved å redigere format her
        DecimalFormat avrunding = new DecimalFormat("0.00");
        DecimalFormat avrundingWorking = new DecimalFormat("0.000");

        //-------------------------------------------------------------------*/

        long i = 0;

        //for å sammenligne forrige iterasjon og nåværende,
        // piPrev er gitt en vilkårlig verdi !=0 før den blir
        // gitt faktisk verdi av løkken
        double piCurrent = 0;
        double piPrev = 1;

        //avrunda strengevariabler for sammenligning og print
        String roundedPiCurrent = avrunding.format(piPrev);
        String roundedPiPrev = avrunding.format(piCurrent);

        String workingPiCurrent;
        String workingPiPrev;
        String workingPiLedd;

        while (!Objects.equals(roundedPiCurrent, roundedPiPrev)) {

            double piLedd;
            piLedd = Math.pow(-1, i) * 4 / (2*i + 1);

            piPrev = piCurrent;
            piCurrent = piCurrent + piLedd;

            workingPiPrev = avrundingWorking.format(piPrev);
            workingPiCurrent = avrundingWorking.format(piCurrent);

            piPrev = Double.parseDouble(workingPiPrev);
            piCurrent = Double.parseDouble(workingPiCurrent);

            roundedPiPrev = avrunding.format(piPrev);
            roundedPiCurrent = avrunding.format(piCurrent);

            System.out.println("i = "+i+", π ≈ "+roundedPiCurrent);
            i++;
        }
        System.out.println(
                "π estimert og avrundet til valgt antall desimaler = "
                        +roundedPiCurrent+". Det tok "+(i-1)+" iterasjoner av loopen å estimere."
        );
    }
}