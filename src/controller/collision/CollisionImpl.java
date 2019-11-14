package controller.collision;

import Model.Organism;

import java.util.List;

public class CollisionImpl implements Collision {

    @Override
    public boolean checkShapeCollision(Organism organism, List<Organism> list) {
        boolean collision = false;
        for(Organism static_block : list){
            if (static_block.getRectangle() != organism.getRectangle()) {
                if (organism.getRectangle().getBoundsInParent().intersects(static_block.getRectangle().getBoundsInParent())) {
                    collision = true;
                    System.out.println("LoL");
                    attack(organism, static_block);
                }
            }
        }
        return collision;
    }

    private void attack(Organism organism, Organism organism1) {
                if (!organism.getClass().equals(organism1.getClass())){
                    if (organism1.getPower() > organism.getPower()){
                        organism.getHealth().setText(String.valueOf(Integer.parseInt(organism.getHealth().getText()) - 20));
            }
        }
    }
}
