package com.project.basicDi;

public class EnergieSolara implements Energie{
    int energyLevel;

    public EnergieSolara(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    @Override
    public int getEnergyLevel() {
        return energyLevel;
    }
}
