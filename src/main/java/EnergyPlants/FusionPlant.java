package EnergyPlants;

public class FusionPlant extends EnergyPlant{
    private final int HELIUM_UNIT_USAGE_PER_DAY = 1;

    public FusionPlant(int energyUnit) {
        super(energyUnit);
    }

    @Override
    public int energyUnitConsumption() {
        return 0;
    }
}

