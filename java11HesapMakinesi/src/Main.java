import java.util.*;
public class Main {
    public static void main(String[] args) {
        double n1,n2;
        Scanner s = new Scanner(System.in);

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen bir işlem seçiniz : ");
        int select = s.nextInt();

        System.out.print("1.Sayı : ");
        n1 = s.nextDouble();
        System.out.print("2.Sayı : ");
        n2 = s.nextDouble();

        switch (select){
            case 1:
                System.out.println("Sonuc : " + (n1+n2));
                break;
            case 2:
                System.out.println("Sonuc : " + (n1-n2));
                break;
            case 3:
                System.out.println("Sonuc : " + (n1*n2));
                break;
            case 4:
                System.out.println("Sonuc : " + (n1/n2));
                break;
            default:
                System.out.println("Geçersiz seçim!");
        }
    }
}
