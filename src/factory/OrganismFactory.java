package factory;

import model.Organism;
import model.mammal.Bear;
import model.mammal.Doe;
import model.mammal.Wolf;
import model.mushroom.Poisonous;
import model.plant.Grass;

public class OrganismFactory {

    public static Organism getOrganism(String type, int spawnX, int spawnY){

        if("Wolf".equalsIgnoreCase(type)) return new Wolf(type, spawnX, spawnY);
        else if ("Doe".equalsIgnoreCase(type)) return new Doe(type, spawnX, spawnY);
        else if ("Bear".equalsIgnoreCase(type)) return new Bear(type, spawnX, spawnY);
        else if ("Poisonous".equalsIgnoreCase(type)) return new Poisonous(type, spawnX, spawnY);
        else if ("Grass".equalsIgnoreCase(type)) return new Grass(type, spawnX, spawnY);

        return null;
    }
}
