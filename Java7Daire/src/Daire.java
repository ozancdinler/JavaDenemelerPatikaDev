/*
Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
 */

import java.util.Scanner;
public class Daire {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        double r, a, pi = 3.14, alan, cevre, diliminAlani;

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = inp.nextDouble();
        System.out.print("Dairenin merkez açısının ölçüsü giriniz : ");
        a = inp.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        diliminAlani = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin alanı        : " + alan);
        System.out.println("Dairenin çevresi      : " + cevre);
        System.out.println("Daire diliminin alanı : " + diliminAlani);

    }
}
//aq