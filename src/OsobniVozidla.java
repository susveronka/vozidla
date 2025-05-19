public class OsobniVozidla {
    private int pocetSedadel;
    private int pocetOsob;

    public OsobniVozidla() {
        pocetOsob = 0;
    }

    public void zmenitPocetOsob(int pocetOsob) {
        if (pocetOsob >= 0 || pocetOsob <= pocetSedadel) {
            this.pocetOsob = pocetOsob;
        } else {
            System.out.println("Počet osob musí být kladný.");
        }
    }
}
