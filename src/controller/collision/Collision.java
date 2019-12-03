package controller.collision;

import model.Organism;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface Collision {
    boolean checkShapeCollision(Organism organism, List<Organism> list);
    Organism multiple(Organism organism,  List<Organism> list);
}
