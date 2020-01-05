package controller.organisms;

import model.Organism;

public interface SpecificCollision {
    void collisionWithWolf(Organism organism);
    void collisionWithDoe(Organism organism);
    Organism collisionWithBear(Organism organism);
}
