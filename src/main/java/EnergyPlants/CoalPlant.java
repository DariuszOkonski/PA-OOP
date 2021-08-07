package EnergyPlants;

public class CoalPlant extends EnergyPlant {
    private final int COAL_UNIT_USAGE_PER_DAY = 100;

    public CoalPlant(int energyUnit) {
        super(energyUnit);
    }

    @Override
    public int energyUnitConsumption() {
        return COAL_UNIT_USAGE_PER_DAY;
    }
}
