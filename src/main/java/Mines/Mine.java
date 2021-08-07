package Mines;

public abstract class Mine {
    private int energyUnitProductionPerDay;

    public Mine(int energyUnitProductionPerDay) {
        this.energyUnitProductionPerDay = energyUnitProductionPerDay;
    }

    public int getEnergyUnitProductionPerDay() {
        return energyUnitProductionPerDay;
    }

    protected void setEnergyUnitProductionPerDay(int energyUnitProductionPerDay) {
        this.energyUnitProductionPerDay = energyUnitProductionPerDay;
    }
}

