package controller.organisms;


import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public interface CreateSquare {
    Rectangle moveSquare(Rectangle rectangle, Text text, ImageView imageView);
    Rectangle createSquare(int x, int y);
}
