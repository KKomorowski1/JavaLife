package model.world;

import javafx.scene.Group;
import javafx.scene.Scene;
import model.Organism;

import java.util.ArrayList;


public class World{

    private ArrayList<Organism> organisms = new ArrayList<>();
    private Scene scene;
    private Group group = new Group();
    private int width;
    private int height;

    public World() {
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



}
