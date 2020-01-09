package controller.organisms;

import model.Organism;

public class PoisonousController implements SpecificCollision {

    @Override
    public void collisionWithWolf(Organism organism) {
        if (organism.getType().equalsIgnoreCase("Wolf")){
            organism.getHealth().setText(String.valueOf(Double.parseDouble(organism.getHealth().getText()) - 50));
        }
    }

    @Override
    public void collisionWithDoe(Organism organism) {
        if (organism.getType().equalsIgnoreCase("Doe")){
            organism.getHealth().setText("100");
        }
    }

    @Override
    public void collisionWithBear(Organism organism) {
        if (organism.getType().equalsIgnoreCase("Bear")){
            organism.getHealth().setText(String.valueOf(Double.parseDouble(organism.getHealth().getText()) - 160));
        }
    }

    @Override
    public Organism collisionWithTheSameOrganism(Organism organism) {
        return null;
    }
}
