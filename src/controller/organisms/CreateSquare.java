package controller.organisms;

import javafx.scene.shape.Rectangle;
import model.Organism;


public interface CreateSquare {
    Rectangle moveSquare(Organism organism);
    Rectangle createSquare(int x, int y);
}
