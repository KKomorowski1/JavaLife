package controller.organisms;

import model.Organism;

public class GrassController implements SpecificCollision{

    @Override
    public void collisionWithWolf(Organism organism) {
        if (organism.getType().equalsIgnoreCase("Wolf")){
            organism.setAverageLifeSpan(organism.getAverageLifeSpan() + 1);
        }
    }

    @Override
    public void collisionWithDoe(Organism organism) {
        organism.setAverageLifeSpan(organism.getAverageLifeSpan() + 3);
    }

    @Override
    public void collisionWithBear(Organism organism) {
    }

    @Override
    public Organism collisionWithTheSameOrganism(Organism organism) {
        return null;
    }

    @Override
    public void collisionWithGrass(Organism organism) {

    }
}
