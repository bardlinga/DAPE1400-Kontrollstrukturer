package Kontrollstrukturer;

public class Kontrollstrukturer2Oppg4 {

    //Lag en forløkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 99)

    public static void main(String[] args){
        int partall;
        int sum = 0;
        int snitt;

        for(int i = 0; i < 50; i++) {
            partall = 2 * i;
            sum += partall;
            snitt = sum / (i + 1);
            System.out.println("Partall = " + partall + ", Sum = " + sum + ", snitt = " + snitt);
        }
    }
}
