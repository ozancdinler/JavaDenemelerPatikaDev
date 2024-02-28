import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args){

        double tutar, kdvOrani, kdvTutari, kdvliTutar;
        String kdvGosterim;
        Scanner scn = new Scanner(System.in);

        System.out.print("Lütfen Tutarı Giriniz : ");
        tutar = scn.nextDouble();

        kdvOrani = (tutar > 0 && tutar < 1000) ? 0.18 : 0.08;
        kdvGosterim = (kdvOrani == 0.18) ? "%18" : "%8";
        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("Ürün tutarı KDV Hariç : " + tutar);
        System.out.println("KDV oranı             : " + kdvGosterim);
        System.out.println("KDV tutarı            : " + kdvTutari);
        System.out.println("Toplam fiyat          : " + kdvliTutar);

    }
}
