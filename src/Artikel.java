public class Artikel {

    String artikelNummer;
    String artikelName;
    double artikelPreis;

        public void setArtikelNummer(String artikelNummer) {
        this.artikelNummer = artikelNummer;
    }

    public void setArtikelPreis(double artikelPreis) {
        this.artikelPreis = artikelPreis;
    }

    public void setArtikelName(String artikelName) {
        this.artikelName = artikelName;
    }

    public String getArtikelName() {
        return artikelName;
    }

    public String getArtikelNummer() {
        return artikelNummer;
    }

    public double getArtikelPreis() {
        return artikelPreis;
    }

    public Artikel (String artikelNummer, String artikelName, double artikelPreis)
    {
        this.artikelNummer = artikelNummer;
        this.artikelName = artikelName;
        this.artikelPreis = artikelPreis;
    }
}
