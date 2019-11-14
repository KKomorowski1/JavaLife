package Model.world;

import Model.Organism;
import javafx.scene.Scene;

import java.util.ArrayList;

public interface World {
    Scene world(int height, int width);
    ArrayList<Organism> addOrganisms();
    void removeOrganism(Organism organism);
    void addOrganism(Organism organism);
}
