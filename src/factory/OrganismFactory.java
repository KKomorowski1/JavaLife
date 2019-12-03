package factory;

import model.Organism;
import model.mammal.Doe;
import model.mammal.Wolf;

public class OrganismFactory {

    public static Organism getOrganism(String type, int spawnX, int spawnY){

        if("Wolf".equalsIgnoreCase(type)) return new Wolf(spawnX, spawnY);
        else if ("Doe".equalsIgnoreCase(type)) return new Doe(spawnX, spawnY);

        return null;
    }

}
