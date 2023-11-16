import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner scn = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = scn.nextInt();

        for (int i=1; i<sayi; i*=4 ){
            System.out.print("Sayının 4 kuvveti: ");
            System.out.println(i+", ");
        }
        System.out.println("____________");
        for(int j=1; j<sayi; j*=5){
            System.out.print("Sayının 5 kuvveti: ");
            System.out.println(j+", ");
        }
    }
}64