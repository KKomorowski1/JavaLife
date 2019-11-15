package controller.collision;

import Model.Organism;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

public class CollisionImpl implements Collision {


    @Override
    public boolean checkShapeCollision(Organism organism, List<Organism> list) {
        boolean collision = false;
        for(Organism static_block : list){
            if (static_block.getRectangle() != organism.getRectangle()) {
                if (organism.getRectangle().getBoundsInParent().intersects(static_block.getRectangle().getBoundsInParent())) {
                    collision = true;
                    attack(organism, static_block);
                }
            }
        }
        return collision;
    }

    private void attack(Organism organism, Organism organism1){
        if (!organism.getClass().equals(organism1.getClass())){
            if (organism1.getPower() > organism.getPower()){
                organism.getHealth().setText(String.valueOf(Integer.parseInt(organism.getHealth().getText()) - 20));
            }
        }
    }

    @Override
    public Organism multiple(Organism organism, List<Organism> list) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Random random = new Random();
        if (random.nextInt(10) >= 6){
        for (Organism static_block : list) {
            if (static_block.getRectangle() != organism.getRectangle()) {
                if (organism.getRectangle().getBoundsInParent().intersects(static_block.getRectangle().getBoundsInParent())) {
                    if (organism.getClass().equals(static_block.getClass())) {
                        Class<?> clazz = Class.forName(organism.getClass().getName());
                        Constructor<?> ctor = clazz.getConstructor(String.class, int.class, int.class);
                        Object object = ctor.newInstance("", random.nextInt(1000), random.nextInt(1000));
                        return (Organism) object;
                    }
                }
                }
            }
        }
        return null;
    }
}
