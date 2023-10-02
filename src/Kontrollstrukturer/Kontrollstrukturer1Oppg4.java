package Kontrollstrukturer;

import java.util.Scanner;

public class Kontrollstrukturer1Oppg4 {
    public static void main(String[] args){

        System.out.println("Skriv inn alderen din");

        Scanner sc = new Scanner(System.in);
        int alder = sc.nextInt();
        int alderMax = 70;

        if(alder < 18){
            System.out.println("Du er for ung til å ta førerkort for bil");
        }
        if(alder >= alderMax){
            System.out.println("Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
        }
        else{
            System.out.println("Du kan ta førerkort for bil og du trenger ikke årlige legesjekker");
        }
    }
}
