package model.world;

import model.Organism;
import model.mammal.Doe;
import model.mammal.Wolf;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import model.mushroom.Poisonous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class WorldImpl implements World{

    private ArrayList<Organism> organisms = new ArrayList<>();
    private Scene scene;
    private Group group = new Group();
    private int width;
    private int height;

    public WorldImpl() {
    }


    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public int getWidth() {
        return width;
    }

    private void setWidth(int width) {
        this.width = width;
    }

    private int getHeight() {
        return height;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    public ArrayList<Organism> getOrganisms() {
        return organisms;
    }

    public void setOrganisms(ArrayList<Organism> organisms) {
        this.organisms = organisms;
    }

    private Group getGroup() {
        return group;
    }

    private void setGroup() {
        this.group = new Group();
    }

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

        getOrganisms().add(new Doe(random.nextInt(1000), random.nextInt(1000)));
        getOrganisms().add(new Doe(random.nextInt(1000), random.nextInt(1000)));
        getOrganisms().add(new Poisonous(500, 500));
        getOrganisms().add(new Poisonous(500, 500));
        getOrganisms().add(new Wolf(random.nextInt(1000), random.nextInt(1000)));
        getOrganisms().add(new Wolf(random.nextInt(1000), random.nextInt(1000)));

        getOrganisms().sort(Comparator.comparingInt(Organism::getPower).reversed());

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
