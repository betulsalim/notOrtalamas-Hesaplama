import java.util.Scanner;
public class Main {
    public static void main(String[] args ){

        int fizikNot,matNot,kimyaNot,turkceNot,tarihNot,muzikNot;
            Scanner input = new Scanner(System.in);
        float ortalama;
        float sum ;
        System.out.println("Fizik notunuzu giriniz: ");
        fizikNot= input.nextInt();


        System.out.println("Matematik notunuzu giriniz: ");
        matNot= input.nextInt();


        System.out.println("Kimya notunuzu giriniz: ");
        kimyaNot= input.nextInt();


        System.out.println("Türkçe notunuzu giriniz: ");
        turkceNot= input.nextInt();


        System.out.println("Tarih notunuzu giriniz: ");
        tarihNot= input.nextInt();


        System.out.println("Müzik notunuzu giriniz: ");
        muzikNot= input.nextInt();

        sum = fizikNot+matNot+muzikNot+tarihNot+turkceNot+kimyaNot;
        ortalama= sum/6;
        System.out.println("Ortalama: "+ortalama);

    }
}
