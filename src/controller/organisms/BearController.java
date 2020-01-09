package controller.organisms;

import model.Organism;
import model.mammal.Bear;


public class BearController extends Bear implements SpecificCollision {

    @Override
    public void collisionWithWolf(Organism organism) {
        if (organism.getType().equalsIgnoreCase("Wolf")) {
            organism.getHealth().setText(String.valueOf(Double.parseDouble(organism.getHealth().getText()) - 20));
            System.out.println("Collision between bear and wolf ");
        }
    }

    @Override
    public void collisionWithDoe(Organism organism) {
        setType("Bear");
        if (organism.getType().equalsIgnoreCase("Doe")){
            organism.getHealth().setText(String.valueOf(Double.parseDouble(organism.getHealth().getText()) - 30));
            System.out.println("Collision between bear and doe ");
        }
    }

    @Override
    public Organism collisionWithTheSameOrganism(Organism bear) {
        return getOrganism(bear);
    }

    @Override
    public void collisionWithBear(Organism organism) {

    }
}
