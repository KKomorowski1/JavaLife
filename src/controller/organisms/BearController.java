package controller.organisms;

import factory.OrganismFactory;
import model.Organism;
import model.mammal.Bear;

import java.util.Random;


public class BearController extends Bear implements SpecificCollision {

    @Override
    public void collisionWithWolf(Organism organism) {
            if (organism.getType().equalsIgnoreCase("Wolf") ) {
                organism.getHealth().setText(String.valueOf(Double.parseDouble(organism.getHealth().getText()) - 20));
            }
    }

    @Override
    public void collisionWithDoe(Organism organism) {
        if (organism.getType().equalsIgnoreCase("Doe")){
            organism.getHealth().setText(String.valueOf(Double.parseDouble(organism.getHealth().getText()) - 30));
        }
    }

    @Override
    public Organism collisionWithTheSameOrganism(Organism organism) {
        if (organism.getType().equalsIgnoreCase("Bear")){
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
    public void collisionWithBear(Organism organism) {

    }
}
