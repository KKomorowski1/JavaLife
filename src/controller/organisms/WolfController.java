package controller.organisms;

import model.Organism;
import model.mammal.Bear;

public class WolfController extends Bear implements SpecificCollision {

    @Override
    public void collisionWithWolf(Organism wolf) {}

    @Override
    public void collisionWithDoe(Organism doe) {
        if (doe.getType().equalsIgnoreCase("Doe")){
            doe.getHealth().setText(String.valueOf(Double.parseDouble(doe.getHealth().getText()) - Math.round(getPower())));
        }
    }

    @Override
    public Organism collisionWithTheSameOrganism(Organism wolf) {
        return getOrganism(wolf);
    }

    @Override
    public void collisionWithBear(Organism bear) {
        getHealth().setText(String.valueOf(Double.parseDouble(getHealth().getText()) - Math.round(bear.getPower())));
    }
}
