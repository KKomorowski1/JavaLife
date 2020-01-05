package controller.organisms;

import model.Organism;
import model.mammal.Doe;

public class DoeController extends Doe implements SpecificCollision {

    @Override
    public void collisionWithWolf(Organism wolf) {
        if (wolf.getType().equalsIgnoreCase("Wolf")) {
            getHealth().setText(String.valueOf(Double.parseDouble(getHealth().getText()) - Math.round(wolf.getPower())));
        }
    }

    @Override
    public void collisionWithDoe(Organism doe) {
    }

    @Override
    public Organism collisionWithTheSameOrganism(Organism doe) {
        return getOrganism(doe);
    }

    @Override
    public void collisionWithBear(Organism bear) {
        if (bear.getType().equalsIgnoreCase("Bear")){
            getHealth().setText(String.valueOf(Double.parseDouble(getHealth().getText()) - Math.round(bear.getPower())));
        }
    }
}
