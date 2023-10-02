package Kontrollstrukturer;

import java.util.Scanner;

public class Kontrollstrukturer1Oppg3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn alderen din");
        int alder = sc.nextInt();
        if(alder >= 18){
            System.out.println("Du er gammel nok til å ta lappen");
        }
        else{
            System.out.println("Du er ikke gammel nok til å ta lappen");
        }
    }
}
