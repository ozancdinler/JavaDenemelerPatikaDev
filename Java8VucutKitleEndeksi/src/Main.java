import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // VKİ FORMÜL : Kilo (kg) / Boy(m) * Boy(m)
        Scanner scn = new Scanner(System.in);
        double boy, kilo, vki;
        System.out.print("Boyunuzu giriniz (metre) : ");
        boy = scn.nextDouble();
        System.out.print("Kilonuzu giriniz (kg)    : ");
        kilo = scn.nextDouble();

        vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle indeksiniz : " + vki);
    }
}
