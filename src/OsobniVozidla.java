public class OsobniVozidla {
    private final int pocetSedadel; // final - nebude se měnit
    private int pocetOsob;

    public OsobniVozidla(int pocetSedadel) {
        this.pocetSedadel = pocetSedadel;
        this.pocetOsob = 0;
    }

    public int zmenPocetOsob(int oKolik) {
        int puvodniPocetOsob = pocetOsob;
        pocetOsob = Math.max(0, Math.min(pocetOsob + oKolik, pocetSedadel));
        return pocetOsob - puvodniPocetOsob;
    }
    public int getPocetSedadel() {
        return pocetSedadel;
    }
    public int getPocetOsob() {
        return pocetOsob;
    }

}
