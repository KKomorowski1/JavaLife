package controller.collision;

import Model.Organism;

import java.util.List;

public interface Collision {
    boolean checkShapeCollision(Organism organism, List<Organism> list);
    //void attack(Organism organism, Organism organism1);
}
