package EnergyPlants;

public class AnnihilationPlant extends EnergyPlant{
    private final int ANTIMATTER_UNIT_USAGE_PER_DAY = 1;

    public AnnihilationPlant(int energyUnit) {
        super(energyUnit);
    }

    @Override
    public int energyUnitConsumption() {
        return 0;
    }
}
