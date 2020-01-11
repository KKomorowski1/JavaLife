package controller.collision;

import model.Organism;
import java.util.List;

public class CollisionImpl implements Collision{

    private String type;
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
                    setType(static_block.getType());
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

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }
}
