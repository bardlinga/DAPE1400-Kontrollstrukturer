package Kontrollstrukturer;

public class Kontrollstrukturer2Oppg8 {
    public static void main(String[] args){
        int i = 0;
        int partall = 0;
        int sum = 0;
        int snitt = 0;

        while(i < 50){
            partall = 2 * i;
            sum += partall;
            snitt = sum / (i + 1);
            i++;
        }
        System.out.println(
                "Summen av alle partall fom 0 til og med " + partall + " er " + sum + ", og snittet er " + snitt);
    }
}
