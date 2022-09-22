package oop_package;

public class ember {
    private String nev;
    private String szulDatum;
    private String szulHely;

    public ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    @Override
    public String toString() {
        return String.format("%30s %10s %20s", this.nev, this.szulDatum, this.szulHely);
    }
}
