package com.project.basicDi;

public class Bec {

    Energie energie;

    public Bec(Energie energie) {
        this.energie = energie;
    }

    public void aprinde(){
        if(energie.getEnergyLevel() == 999){
            System.out.println("PREA MULTA ENERGIEEEE");
            return;
        }
        if(energie.getEnergyLevel() >= 15){
            System.out.println("BEC APRINS");
        } else {
            System.out.println("NU AM ENERGIE");
        }
    }

    @Override
    public String toString() {
        return "Bec{" +
                "energie=" + energie.toString() +
                '}';
    }
}
