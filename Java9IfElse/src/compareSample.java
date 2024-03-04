import java.util.Scanner;
public class compareSample {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int age, weight;
        String nameSurname;
        System.out.print("Ad - Soyad           : ");
        nameSurname = read.nextLine();
        System.out.print("Yaşınızı giriniz     : ");
        age = read.nextInt();
        System.out.print("Kilonuzu giriniz(Kg) : ");
        weight = read.nextInt();

        if(age >= 18) {
            if (weight >= 48){
                System.out.println("Sn : "+ nameSurname + " Kan verebilirsiniz!");
            }
            else {
                System.out.println("Sn : "+ nameSurname + " Kan vermek için yeterli kiloya sahip değilsiniz!");
            }
        }
        else{
            System.out.println("Sn : "+ nameSurname + " Kan vermek için yaşınız uygun değil!");
        }

    }
}
