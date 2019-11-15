package controller.collision;

import Model.Organism;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface Collision {
    boolean checkShapeCollision(Organism organism, List<Organism> list);
    Organism multiple(Organism organism,  List<Organism> list) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}
