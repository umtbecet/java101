import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluştur

        int mat, fizik, kimya, turkce, tarih,muzik;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan bilgileri al
        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam= (mat+fizik+kimya+turkce+tarih+muzik);

        double sonuc = toplam/6;

        System.out.println("Ortalamanız " + sonuc);
        System.out.println(sonuc >=50 ? " Geçti":"Kaldı" );


    }
}























