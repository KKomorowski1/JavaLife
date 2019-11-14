package Model.world;

import Model.Organism;
import Model.mammal.Doe;
import Model.mammal.Wolf;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;

import java.util.ArrayList;
import java.util.Comparator;

public class WorldImpl implements World{

    private ArrayList<Organism> organisms = new ArrayList<>();
    private Scene scene;
    private Group group = new Group();
    private int width;
    private int height;

    public WorldImpl() {
    }

    public WorldImpl(int width, int height) {
        this.width = width;
        this.height = height;
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

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ArrayList<Organism> getOrganisms() {
        return organisms;
    }

    public void setOrganisms(ArrayList<Organism> organisms) {
        this.organisms = organisms;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup() {
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
        getOrganisms().add(new Doe("Grass", 300, 300));
        getOrganisms().add(new Doe("Grass", 260, 260));
        getOrganisms().add(new Wolf("Grass", 240, 240));

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
            getOrganisms().add(organism);
            getGroup().getChildren().addAll(organism.getRectangle(), organism.getHealth(), organism.getImageView());
        });
    }
}
