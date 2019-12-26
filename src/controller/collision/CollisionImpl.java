package controller.collision;

import factory.OrganismFactory;
import model.Organism;
import java.util.List;
import java.util.Random;

public class CollisionImpl implements Collision{

    /*
    0 - No Collision detected
    1 - Collision of the same organism detected
    2 - Collision of different organism detected
     */

    @Override
    public int checkShapeCollision(Organism organism, List<Organism> list) {
        int collision = 0;
        for(Organism static_block : list){
            if (static_block.getRectangle() != organism.getRectangle()) {
                if (organism.getRectangle().getBoundsInParent().intersects(static_block.getRectangle().getBoundsInParent())) {
                    if (organism.getType().equals(static_block.getType())){
                        collision = 1;
                    } else {
                        collision = 2;
                    }
                }
            }
        }
        return collision;
    }

    public void attack(Organism organism, Organism organism1){
        //if (checkShapeCollision())
            if (organism1.getPower() > organism.getPower()){
                organism.getHealth().setText(String.valueOf(Integer.parseInt(organism.getHealth().getText()) - 20));
            }
            if (organism1.getType().equalsIgnoreCase("Poisonous")){
                organism.getHealth().setText("10");
            }
    }

    @Override
    public Organism multiple(Organism organism, List<Organism> list){
        Random random = new Random();
        if (random.nextInt(10) >= 6){
            if (checkShapeCollision(organism, list) == 1)
            return OrganismFactory.getOrganism(organism.getType(), random.nextInt(1000), random.nextInt(1000));
        }
        return null;
    }
}
