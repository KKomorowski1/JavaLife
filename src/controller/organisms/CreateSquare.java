package controller.organisms;


import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import model.Organism;


public interface CreateSquare {
    Rectangle moveSquare(Organism organism);
    Rectangle createSquare(int x, int y);
}
