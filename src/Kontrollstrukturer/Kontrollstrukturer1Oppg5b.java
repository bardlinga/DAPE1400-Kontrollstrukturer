package Kontrollstrukturer;

import java.util.Scanner;

public class Kontrollstrukturer1Oppg5b {
    public static void main(String[] args){
        System.out.println("Hvilken måned er det?");

        Scanner sc = new Scanner(System.in);

        String maned;
        maned = sc.nextLine();
        maned = maned.toLowerCase();

        String arstid = null;
        boolean gyldigArstid = true;

        switch (maned) {
            case ("juni"), ("juli"), ("august") -> arstid = "sommer";
            case ("september"), ("oktober"), ("november") -> arstid = "høst";
            case ("desember"), ("januar"), ("februar") -> arstid = "vinter";
            case ("mars"), ("april"), ("mai") -> arstid = "vår";
            default -> gyldigArstid = false;
        }
        if (gyldigArstid){
            System.out.println("Det er "+arstid);
        }
    }
}
