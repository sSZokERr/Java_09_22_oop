package oop_package;

import java.time.LocalDateTime;
import java.util.Date;

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

    public int getSzuletesiEv(){
        return Integer.parseInt(this.szulDatum.substring(0,4));
    }

    public int getHonap(){
        return Integer.parseInt(this.szulDatum.substring(5,7));
    }
    public int getNap(){
        return Integer.parseInt(this.szulDatum.substring(8,9));
    }

    public int getEletkor(){
        return  (2022 - Integer.parseInt(this.szulDatum.substring(0,4)));
    }
}
