package controller.organisms;

import model.Organism;
import model.mammal.Bear;


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
    public Organism collisionWithTheSameOrganism(Organism bear) {
        return getOrganism(bear, "Bear");
    }

    @Override
    public void collisionWithBear(Organism organism) {

    }
}
