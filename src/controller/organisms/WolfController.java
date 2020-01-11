package controller.organisms;

import controller.collision.CollisionImpl;
import factory.OrganismFactory;
import model.Organism;

import model.mammal.Wolf;

import java.util.Random;

public class WolfController extends Wolf implements SpecificCollision {

    @Override
    public void collisionWithWolf(Organism wolf) {}

    @Override
    public void collisionWithDoe(Organism doe) {
        if (doe.getType().equalsIgnoreCase("Doe")){
            doe.getHealth().setText(String.valueOf(Double.parseDouble(doe.getHealth().getText()) - 30));

        }
    }

    @Override
    public Organism collisionWithTheSameOrganism(Organism organism) {
        if (organism.getType().equalsIgnoreCase("Wolf")){
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

    @Override
    public void collisionWithBear(Organism bear) {}
}
