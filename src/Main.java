import java.util.*;

public class Main {

    public static void main(String[] args) {

        Artikel Hammer = new Artikel("001", "Hammer", 12.99);
        Artikel Banane = new Artikel("002", "Banane", 0.30);
        Artikel Vodka = new Artikel("003", "Vodka", 15.99);
        Artikel Wein = new Artikel("004", "Wein", 10);
        Artikel Whisky = new Artikel("005", "Whisky", 19.99);
        Artikel Laptop = new Artikel("006", "Laptop", 500);
        Artikel Computer = new Artikel("007", "Computer", 1000);
        Artikel Parfum = new Artikel("008", "Parfum", 50);
        Artikel Kaugummi = new Artikel("009", "Kaugummi", 2.99);
        Artikel Brot = new Artikel("010", "Brot", 2.49);

        List<Artikel> Artikelliste = new ArrayList<>();

        Artikelliste.add(Hammer);
        Artikelliste.add(Banane);
        Artikelliste.add(Vodka);
        Artikelliste.add(Wein);
        Artikelliste.add(Whisky);
        Artikelliste.add(Laptop);
        Artikelliste.add(Computer);
        Artikelliste.add(Parfum);
        Artikelliste.add(Kaugummi);
        Artikelliste.add(Brot);


        for (int i = 0; i < 10; i++) {
            System.out.println(Artikelliste.get(i).getArtikelName() + " " + Artikelliste.get(i).getArtikelNummer() + " " + Artikelliste.get(i).getArtikelPreis());
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willst du etwas bestellen?");

        for (int j = 0; j < 6; j= j+0) {
        String antwort = scanner.nextLine();
           if(antwort.equalsIgnoreCase("Ja")){
                       System.out.println("Was wollen sie kaufen?");
                       String kaufen = scanner.nextLine();
                       if (kaufen.equalsIgnoreCase("Hammer"))
                           System.out.println("didiifs");



                   }

           else if (antwort.equalsIgnoreCase("Nein")) {
                       System.out.println("Ok tschuess");
                       break;
                   }






           else {
                       System.out.println("Bitte mit Ja oder Nein antworten");
                   }
        }


    }

}