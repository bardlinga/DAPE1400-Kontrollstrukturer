package Kontrollstrukturer;

public class Kontrollstrukturer2Oppg1og2og3 {
    public static void main(String[] args){
        int sum = 0;
        int partall;
        for(int i=0; i<10; i++){
            sum += i;
            System.out.println("i = " + i);
        }
        System.out.println("Sum = " + sum);
        System.out.print("Partall = ");
        for(int i=0; i<10; i++){
            partall = 2 * i;
            System.out.print(partall + " ");
        }
    }
}
