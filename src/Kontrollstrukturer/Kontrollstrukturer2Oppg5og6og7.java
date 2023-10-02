package Kontrollstrukturer;

public class Kontrollstrukturer2Oppg5og6og7 {
    public static void main(String[] args){
        int i = 0;
        int sum = 0;
        int partall;

        while(i < 10){
            System.out.println("i = " + i);
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);

        System.out.print("Partall = ");
        i = 0;
        while(i < 10){
            partall = 2 * i;
            i++;
            System.out.print(partall + " ");
        }
    }
}
