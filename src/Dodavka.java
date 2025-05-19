public class Dodavka extends OsobniVozidla {


    private int uzitecnaHmotnost = 500;
    private int hmotnostNakladu;

    public Dodavka(int pocetSedadel, int uzitecnaHmotnost) {
        super(pocetSedadel);
        this.uzitecnaHmotnost = uzitecnaHmotnost;
    }
public Dodavka(int uzitecnaHmotnost){
        this(5, uzitecnaHmotnost);
}

    public void omezeni() {
        int celkovaHmotnost = 0;
      //  int hmotnostOsob = pocetSedadel * 120;
   //     celkovaHmotnost += hmotnostNakladu += hmotnostOsob;

        if (celkovaHmotnost > uzitecnaHmotnost) {
            System.out.println("Přetížení vozidla");
        }
        else {
            System.out.println("vše v pořádku");
        }
    }

}
