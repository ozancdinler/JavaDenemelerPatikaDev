import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        double kmbasina = 2.20,acilis = 10, minTutar = 20,gidilenKm;

        System.out.print("Kaç KM yol gidilecek : ");
        gidilenKm = inp.nextInt();

        double ucret = (((gidilenKm * kmbasina) + acilis) < minTutar) ? minTutar : ((gidilenKm * kmbasina) + acilis);

        System.out.println("Ücret : " + ucret);

    }
}
