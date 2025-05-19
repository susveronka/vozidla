import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        Dodavka dodavka = new Dodavka();

        OsobniVozidla vozidlo = new OsobniVozidla(5);
        vozidlo.zmenPocetOsob(2);
        System.out.println(dodavka.getPocetOsob());
        System.out.println(dodavka.getPocetOsob());

        vozidlo = dodavka;

        List<Dodavka> evidenceV = new ArrayList<>();
     evidenceV.add(new Dodavka());
        Dodavka dodavka1 = (Dodavka) evidenceV.get(1);




    }
}
