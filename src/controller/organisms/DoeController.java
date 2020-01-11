package controller.organisms;

import factory.OrganismFactory;
import model.Organism;
import model.mammal.Doe;

import java.util.Random;

public class DoeController extends Doe implements SpecificCollision {

    @Override
    public void collisionWithWolf(Organism wolf) {}

    @Override
    public void collisionWithBear(Organism bear) {}

    @Override
    public void collisionWithDoe(Organism doe) {
    }

    @Override
    public Organism collisionWithTheSameOrganism(Organism organism) {
        if (organism.getType().equalsIgnoreCase("Doe")){
            return getOrganism(organism);
        }else{
            return OrganismFactory.getOrganism("Grass", new Random().nextInt(1000), new Random().nextInt(1000));
        }
    }

    @Override
    public void collisionWithGrass(Organism organism) {
        if (organism.getType().equalsIgnoreCase("Grass")){
            organism.getHealth().setText(String.valueOf(Double.parseDouble(organism.getHealth().getText()) - 2));
        }
    }


}
