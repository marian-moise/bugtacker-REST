package com.project.basicDi;

public class BecRunner {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(15000);
        // un bec trebuie sa aiba 15 energie ca sa se aprinda
        // un bec poate sa primeasca mai mult de 15 energie
        // mai putin de 15 energie si becul nu se aprinde

        Energie eo = new EnergieEoliana(16);
        Energie es = new EnergieSolara(16);
        Energie ec = new EnergieCuantica();

        Bec bec2 = new Bec(eo);

        bec2.aprinde();

        System.out.println(bec2);

        Bec b2 = new Bec(es);

        Bec b3 = new Bec(ec);

        b3.aprinde();

        b2.aprinde();

        System.out.println(b2);
    }
}
