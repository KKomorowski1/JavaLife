package controller.world;

import model.Organism;
import model.mammal.Bear;
import model.mammal.Doe;
import model.mammal.Wolf;
import javafx.application.Platform;
import javafx.scene.Scene;
import model.mushroom.Poisonous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class WorldImpl extends model.world.World implements World {

    @Override
    public Scene world(int height, int width){
        setHeight(height);
        setWidth(width);
        setGroup();
        return new Scene(getGroup(), getHeight(), getHeight());
    }

    @Override
    public ArrayList<Organism> addOrganisms(){
        Random random = new Random();

        getOrganisms().add(new Bear(420, 420));
        getOrganisms().add(new Bear(460, 460));
        getOrganisms().add(new Wolf(500, 500));
        getOrganisms().add(new Wolf(540, 540));
        getOrganisms().add(new Doe(random.nextInt(500), random.nextInt(500)));
        getOrganisms().add(new Doe(random.nextInt(500), random.nextInt(500)));

        getOrganisms().sort(Comparator.comparingDouble(Organism::getPower).reversed());

        for(Organism organism : getOrganisms()){
            getGroup().getChildren().addAll(organism.getRectangle(), organism.getHealth(), organism.getImageView());
        }
        return getOrganisms();
    }

    @Override
    public void removeOrganism(Organism organism) {

        Platform.runLater(() -> {
            getGroup().getChildren().removeAll(organism.getRectangle(), organism.getHealth(), organism.getImageView());
            getOrganisms().remove(organism);
        });
    }

    @Override
    public void addOrganism(Organism organism) {

        Platform.runLater(() -> {
            if (organism != null) {
                getOrganisms().add(organism);
                getGroup().getChildren().addAll(organism.getRectangle(), organism.getHealth(), organism.getImageView());
            }
        });
    }
}
