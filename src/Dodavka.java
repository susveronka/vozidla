public class Dodavka {

    private int pocetSedadel = 2;
    private int pocetOsob;
    private int uzitecnaHmotnost = 500;
    private int hmotnostNakladu;

    public void zmenitPocetOsob(int pocetOsob) {
        if (pocetOsob >= 0 || pocetOsob <= pocetSedadel) {
            this.pocetOsob = pocetOsob;
        } else {
            System.out.println("Počet osob musí být kladný");
        }

    }


}
