package Kontrollstrukturer;

import java.util.Scanner;

public class Kontrollstrukturer1Oppg1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn alderen din");
        int alder = sc.nextInt();
        if (alder >= 18 && alder <= 20){
            System.out.println("Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet");
        }
        else {
            System.out.println("Du er enten umyndig eller så kan du kjøpe hva du vil på polet");
        }
    }
}
