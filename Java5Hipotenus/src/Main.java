import java.util.Scanner;

/*
    HİPOTENÜS FORMULÜ a^2 + b^2 = c^2

    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

    𝑢 = (a+b+c) / 2

    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,u,alan;

        System.out.print("a kenarını giriniz : ");
        a = input.nextInt();
        System.out.print("b kenarını giriniz : ");
        b = input.nextInt();
        System.out.print("c kenarını giriniz : ");
        c = input.nextInt();

        u = (a+b+c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin çevresi : " + (2*u));
        System.out.println("Üçgenin Alanı : " + alan);

    }
}
