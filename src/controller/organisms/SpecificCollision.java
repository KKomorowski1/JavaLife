package controller.organisms;

import model.Organism;

public interface SpecificCollision {
    void collisionWithWolf(Organism organism);
    void collisionWithDoe(Organism organism);
    void collisionWithBear(Organism organism);
    Organism collisionWithTheSameOrganism(Organism organism);
    void collisionWithGrass(Organism organism);
}
