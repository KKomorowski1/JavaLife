package controller.collision;

import model.Organism;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface Collision {
    int checkShapeCollision(Organism organism, List<Organism> list);
}
