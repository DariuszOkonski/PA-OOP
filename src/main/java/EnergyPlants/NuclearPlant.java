package EnergyPlants;

public class NuclearPlant extends EnergyPlant{
    private final int  URANIUM_UNIT_USAGE_PER_DAY = 1;

    public NuclearPlant(int energyUnit) {
        super(energyUnit);
    }

    @Override
    public int energyUnitConsumption() {
        return URANIUM_UNIT_USAGE_PER_DAY;
    }
}

