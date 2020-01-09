package controller.organisms;

import model.Organism;
import model.mammal.Doe;

public class DoeController extends Doe implements SpecificCollision {

    @Override
    public void collisionWithWolf(Organism wolf) {}

    @Override
    public void collisionWithBear(Organism bear) {}

    @Override
    public void collisionWithDoe(Organism doe) {
    }

    @Override
    public Organism collisionWithTheSameOrganism(Organism doe) {
        return getOrganism(doe);
    }


}
