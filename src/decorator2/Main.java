package decorator2;

public class Main  {
    public static void main(String[]args)  {

        Samochod s1 = new Mercedes();
        Samochod s2 = new Fiat();

        System.out.println("\nBez wyposazenia");
        System.out.println(s1.about() + " " + s1.cena());
        System.out.println(s2.about() + " " + s2.cena());

        s1 = new Klimatyzacja(s1);
        s2 = new Klimatyzacja(s2);
        System.out.println("\nZ Klima");
        System.out.println(s1.about() + " " + s1.cena());
        System.out.println(s2.about() + " " + s2.cena());

        s1 = new OponyZimowe(s1);
        s2 = new OponyZimowe(s2);
        System.out.println("\nZ oponami");
        System.out.println(s1.about() + " " + s1.cena());
        System.out.println(s2.about() + " " + s2.cena());

        System.out.println("\nPelne wyposazenie");
        Samochod s3 = new OponyZimowe(new Klimatyzacja(new Mercedes()));
        System.out.println(s3.about() + " " + s3.cena());
    }

}
