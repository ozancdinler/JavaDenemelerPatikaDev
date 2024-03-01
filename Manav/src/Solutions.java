import java.util.*;
import java.io.*;
public class Solutions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double armutFiyati = 2.14, elmaFiyati = 3.67,
                domatesFiyati = 1.11, muzFiyati = 0.95 , patlicanFiyati = 5.0;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, fiyat;
        System.out.print("Armut kaç kg?    : ");
        armutKg = scn.nextDouble();
        System.out.print("Elma kaç kg?     : ");
        elmaKg = scn.nextDouble();
        System.out.print("Domates kaç kg?  : ");
        domatesKg = scn.nextDouble();
        System.out.print("Muz kaç kg?      : ");
        muzKg = scn.nextDouble();
        System.out.print("Patlıcan kaç kg? : ");
        patlicanKg = scn.nextDouble();

        fiyat = (armutFiyati * armutKg) + (elmaFiyati * elmaKg) + (domatesFiyati * domatesKg)
                + (muzFiyati * muzKg) + (patlicanFiyati* patlicanKg);

        System.out.println("Toplam Tutar : " + fiyat);
    }
}
