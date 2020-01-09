package controller.organisms;

import controller.collision.CollisionImpl;
import model.Organism;
import model.mushroom.Poisonous;

public class PoisonousController extends Poisonous implements SpecificCollision {

    @Override
    public void collisionWithWolf(Organism organism) {
        if (organism.getType().equalsIgnoreCase("Wolf")){
            organism.getHealth().setText(String.valueOf(Double.parseDouble(organism.getHealth().getText()) - 50));
            System.out.println(getType());
            System.out.println("Collision between poisonous and wolf ");
        }
    }

    @Override
    public void collisionWithDoe(Organism organism) {
        setType("Poisonous");
        if (organism.getType().equalsIgnoreCase("Doe")){
            organism.getHealth().setText("100");
        }
    }

    @Override
    public void collisionWithBear(Organism organism) {
        setType("Poisonous");
        if (organism.getType().equalsIgnoreCase("Bear")){
            organism.getHealth().setText(String.valueOf(Double.parseDouble(organism.getHealth().getText()) - Math.round(getPower() * 2)));
        }
    }

    @Override
    public Organism collisionWithTheSameOrganism(Organism organism) {
        return null;
    }
}
