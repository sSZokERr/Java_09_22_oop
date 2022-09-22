package oop_package;

public class Main {
    public static void main(String[] args) {
        ember emb = new ember("Lajos","1988-12-12", "Budapest");
        ember emb2 = new ember("Gabriel","1989-12-5", "Debrecen");
        ember emb3 = new ember("Lajos","1990-12-8", "Pecs");

        System.out.println(emb);
        System.out.println(emb2);
        System.out.println(emb3);
    }
}