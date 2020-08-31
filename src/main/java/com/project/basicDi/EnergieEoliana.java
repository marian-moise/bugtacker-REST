package com.project.basicDi;

public class EnergieEoliana implements Energie{

    int energyLevel;

    public EnergieEoliana(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    @Override
    public int getEnergyLevel() {
        return energyLevel;
    }
}
