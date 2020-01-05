package controller.organisms;

import factory.OrganismFactory;
import model.Organism;
import model.mammal.Bear;

import java.util.Random;

public class BearController extends Bear implements SpecificCollision {

    @Override
    public void collisionWithWolf(Organism wolf) {
        if (wolf.getType().equalsIgnoreCase("Wolf")) {
            wolf.getHealth().setText(String.valueOf(Double.parseDouble(wolf.getHealth().getText()) - Math.round(getPower())));
        }
    }

    @Override
    public void collisionWithDoe(Organism doe) {
        if (doe.getType().equalsIgnoreCase("Doe")){
            doe.getHealth().setText(String.valueOf(Double.parseDouble(doe.getHealth().getText()) - Math.round(getPower()*2)));
        }
    }

    @Override
    public Organism collisionWithBear(Organism bear) {
        Random random = new Random();
        if (random.nextInt(100) >= 75) {
            if (bear.getType().equalsIgnoreCase("Bear")) {
                return OrganismFactory.getOrganism(bear.getType(), random.nextInt(500), random.nextInt(500));
            } else {
                return null;
            }
        }else {
            return null;
        }
    }
}
