package Kontrollstrukturer;

import java.util.Scanner;

public class Kontrollstrukturer1Oppg5a {
    public static void main (String[] args){
        System.out.println("Hvilken måned er det?");

        Scanner sc = new Scanner(System.in);
        String maned = sc.nextLine();
        String arstid = null;
        boolean gyldigArstid = false;

        if (maned.equalsIgnoreCase("juni") ||
                maned.equalsIgnoreCase("juli") ||
                maned.equalsIgnoreCase("august")){
            gyldigArstid = true;
            arstid = "sommer";
        }
        if (maned.equalsIgnoreCase("september") ||
                maned.equalsIgnoreCase("oktober") ||
                maned.equalsIgnoreCase("november")){
            gyldigArstid = true;
            arstid = "høst";
        }
        if (maned.equalsIgnoreCase("desember") ||
                maned.equalsIgnoreCase("januar") ||
                maned.equalsIgnoreCase("februar")){
            gyldigArstid = true;
            arstid = "vinter";
        }
        if (maned.equalsIgnoreCase("mars") ||
                maned.equalsIgnoreCase("april") ||
                maned.equalsIgnoreCase("mai")){
            gyldigArstid = true;
            arstid = "vår";
        }

        if(gyldigArstid){
            System.out.println("Det er "+arstid);
        }
        else{
            System.out.println("Ugyldig årstid, syntax error cannot compute bleep bloop");
        }
    }
}
