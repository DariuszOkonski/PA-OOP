package Mines;

public class HadronCollider extends Mine{
    public HadronCollider(int energyUnitProductionPerDay) {

        super(energyUnitProductionPerDay);
    }

    public double getEnergyUnitProductionPerDayHadron() {
        double energyProduced = (double) getEnergyUnitProductionPerDay() / 7;
        return energyProduced;
    }
}
