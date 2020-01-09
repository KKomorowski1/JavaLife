package controller.organisms;

import model.Organism;

import model.mammal.Wolf;

public class WolfController extends Wolf implements SpecificCollision {


    @Override
    public void collisionWithWolf(Organism wolf) {}

    @Override
    public void collisionWithDoe(Organism doe) {
        setType("Wolf");
        if (doe.getType().equalsIgnoreCase("Doe")){
            doe.getHealth().setText(String.valueOf(Double.parseDouble(doe.getHealth().getText()) - 30));
        }
    }

    @Override
    public Organism collisionWithTheSameOrganism(Organism wolf) {
        return getOrganism(wolf);
    }

    @Override
    public void collisionWithBear(Organism bear) {}
}
