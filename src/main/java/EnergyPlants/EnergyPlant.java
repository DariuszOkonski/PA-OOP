package EnergyPlants;

public abstract class EnergyPlant {
    private int energyUnitProductionPerDay;

    public EnergyPlant(int energyUnitProductionPerDay) {
        this.energyUnitProductionPerDay = energyUnitProductionPerDay;
    }

    public abstract int energyUnitConsumption();

    public int getEnergyUnitProductionPerDay() {
        return energyUnitProductionPerDay;
    }

    protected void setEnergyUnit(int energyUnitProductionPerDay) {
        this.energyUnitProductionPerDay = energyUnitProductionPerDay;
    }
}