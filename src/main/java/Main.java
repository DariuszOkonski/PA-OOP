import EnergyConsumers.NewYork;
import EnergyConsumers.Poland;
import EnergyConsumers.World;
import EnergyPlants.*;
import Mines.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        var coalPlant = new CoalPlant(7);
//        var solarPlant = new SolarPlant(2);
//        var nuclearPlant = new NuclearPlant(10000);
//        var fusionPlant = new FusionPlant(20000);
//        var annihilationPlant = new AnnihilationPlant(25000);
//
//        var coalMine = new CoalMine(40);
//        var uraniumMine = new UraniumMine(100);
//        var moonMine = new MoonMine(10);
//        var HadronColliderMine = new HadronCollider(1);
//
//        var worldConsumer = new World(6000000);
//        var polandConsumer = new Poland(40000);
//        var newYorkConsumer = new NewYork(10000);

        List<Mine> mines = new ArrayList<>();
        mines.add(new CoalMine(40));
        mines.add(new CoalMine(40));
        mines.add(new CoalMine(40));
        mines.add(new CoalMine(40));
        mines.add(new UraniumMine(100));
        mines.add(new MoonMine(10));
        mines.add(new MoonMine(10));
        mines.add(new HadronCollider(1));

        List<EnergyPlant> energyPlants = new ArrayList<>();
        energyPlants.add(new CoalPlant(7));
        energyPlants.add(new CoalPlant(7));
        energyPlants.add(new SolarPlant(2));
        energyPlants.add(new SolarPlant(2));
        energyPlants.add(new NuclearPlant(10000));
        energyPlants.add(new NuclearPlant(10000));
        energyPlants.add(new FusionPlant(20000));
        energyPlants.add(new FusionPlant(20000));
        energyPlants.add(new AnnihilationPlant(25000));
        energyPlants.add(new AnnihilationPlant(25000));


        var simulation = new Simulation(null, mines, energyPlants);
        simulation.run();

    }
}
