package EnergyConsumers;

public abstract class EnergyConsumers {
    private int energyUnitConsumptionPerDay;

    public EnergyConsumers(int energyUnitConsumptionPerDay) {
        this.energyUnitConsumptionPerDay = energyUnitConsumptionPerDay;
    }

    protected int getEnergyUnitConsumptionPerDay() {
        return energyUnitConsumptionPerDay;
    }

    protected void setEnergyUnitConsumptionPerDay(int energyUnitConsumptionPerDay) {
        this.energyUnitConsumptionPerDay = energyUnitConsumptionPerDay;
    }
}

