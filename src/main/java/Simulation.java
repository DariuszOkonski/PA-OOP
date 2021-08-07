import EnergyConsumers.EnergyConsumers;
import EnergyPlants.CoalPlant;
import EnergyPlants.EnergyPlant;
import EnergyPlants.NuclearPlant;
import Mines.*;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private List<EnergyConsumers> energyConsumers = new ArrayList<EnergyConsumers>();
    private List<Mine> mines = new ArrayList<Mine>();
    private List<EnergyPlant> energyPlants = new ArrayList<EnergyPlant>();

    public Simulation(List<EnergyConsumers> energyConsumers, List<Mine> mines, List<EnergyPlant> energyPlants) {
        this.energyConsumers = energyConsumers;
        this.mines = mines;
        this.energyPlants = energyPlants;
    }

    public void run() {
        System.out.println("Simulation run");
        System.out.println("---------------");


        int coalProduced = getCoalProducedPerDay();
        int uraniumProduced = getUraniumProducedPerDay();
        int heliumProduced = getHeliumProducedPerDay();
        double antimatterProduced = getAntimatterProducedPerDay();

        String coalUsed = getCoalUsagePerDay(coalProduced);
        String uraniumUsed = getUraniumUsagePerDay(uraniumProduced);
        int energyProduced = getEnergyProduced();

        System.out.println("CoalProduced: " + coalProduced);
        System.out.println("UraniumProduced: " + uraniumProduced);
        System.out.println("HeliumProduced: " + heliumProduced);
        System.out.println("AntimatterProduced: " + antimatterProduced);
        System.out.println("---");
        System.out.println("Energy usage");
        System.out.println(coalUsed);
        System.out.println(uraniumUsed);
        System.out.println("---");
        System.out.println("EnergyProduced: " + energyProduced);
        System.out.println("====================");

//        for (int i = 0; i < 30; i++) {
//
//        }
    }

    private int getCoalProducedPerDay() {
        int coalProduced = 0;
        for (Mine mine: mines) {
            if(mine instanceof CoalMine)
                coalProduced += mine.getEnergyUnitProductionPerDay();
        }

        return coalProduced;
    }

    private int getUraniumProducedPerDay() {
        int uraniumProduced = 0;
        for (Mine mine: mines) {
            if(mine instanceof UraniumMine)
                uraniumProduced += mine.getEnergyUnitProductionPerDay();
        }

        return uraniumProduced;
    }

    private int getHeliumProducedPerDay() {
        int heliumProduced = 0;
        for (Mine mine: mines) {
            if(mine instanceof MoonMine)
                heliumProduced += mine.getEnergyUnitProductionPerDay();
        }

        return heliumProduced;
    }

    private double getAntimatterProducedPerDay() {
        double antimatterProduced = 0;
        for (Mine mine: mines) {
            if(mine instanceof HadronCollider)
                antimatterProduced += ((HadronCollider) mine).getEnergyUnitProductionPerDayHadron();
        }
        return antimatterProduced;
    }

    private String getCoalUsagePerDay(int coalSupplied) {
        int coalUsage = 0;
        for (EnergyPlant energyPlant: energyPlants) {
            if(energyPlant instanceof CoalPlant)
                coalUsage += energyPlant.energyUnitConsumption();
        }

        int coalVolume = coalSupplied - coalUsage;

        return "Coal supplied: " + coalSupplied + ", coal usage: " + coalUsage + ", coal volume: " + coalVolume;
    }

    private String getUraniumUsagePerDay(int uraniumSupplied) {
        int uraniumUsage = 0;
        for (EnergyPlant energyPlant: energyPlants) {
            if(energyPlant instanceof NuclearPlant)
                uraniumUsage += energyPlant.energyUnitConsumption();
        }

        int uraniumVolume = uraniumSupplied - uraniumUsage;

        return "Uranium supplied: " + uraniumSupplied + ", uranium usage: " + uraniumUsage + ", uranium volume: " + uraniumVolume;
    }

    private int getEnergyProduced() {
        int energyProduced = 0;
        for (EnergyPlant energyPlant: energyPlants) {
            energyProduced += energyPlant.getEnergyUnitProductionPerDay();
        }


        return energyProduced;
    }
}
