package EnergyPlants;

public class SolarPlant extends EnergyPlant {
    public SolarPlant(int energyUnit) {
        super(energyUnit);
    }

    @Override
    public int energyUnitConsumption() {
        return 0;
    }
}

