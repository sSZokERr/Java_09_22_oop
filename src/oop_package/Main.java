package oop_package;

public class Main {
    public static void main(String[] args) {
        ember emb = new ember("Lajos","1988-12-12", "Budapest");
        ember emb2 = new ember("Gabriel","1989-12-5", "Debrecen");
        ember emb3 = new ember("Lajos","1990-12-8", "Pecs");

        System.out.println(emb + " " + emb.getSzuletesiEv());
        System.out.println(emb2 + " " + emb2.getHonap() + " " + emb2.getNap());
        System.out.println(emb3 + " " + emb3.getEletkor());

    }
}