package controller.organisms;

import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.Random;

public class CreateSquareImpl implements CreateSquare {
    private Random random = new Random();

    @Override
    public Rectangle moveSquare(Rectangle rectangle, Text text, ImageView imageView){

        int moveSize = 20;
        int resetX = 500;
        int resetY = 500;

        int l = random.nextInt(4);

        if (rectangle.getX() >= 1000 || rectangle.getY() >= 1000 || rectangle.getX() <= 0 || rectangle.getY() <= 0){
            rectangle.setX(resetX);
            rectangle.setY(resetY);
            text.setX(resetX);
            text.setY(resetY);
            imageView.setX(resetX);
            imageView.setY(resetY);
        }else {
            if (l == 0) {
                text.setX(rectangle.getX() + moveSize);
                rectangle.setX(rectangle.getX() + moveSize);
                imageView.setX(imageView.getX() + moveSize);
            } else if (l == 1) {
                text.setX(rectangle.getX() - moveSize);
                rectangle.setX(rectangle.getX() - moveSize);
                imageView.setX(imageView.getX() - moveSize);
            } else if (l == 2) {
                text.setY(rectangle.getY() + moveSize);
                rectangle.setY(rectangle.getY() + moveSize);
                imageView.setY(imageView.getY() + moveSize);
            } else if (l == 3) {
                text.setY(rectangle.getY() - moveSize);
                rectangle.setY(rectangle.getY() - moveSize);
                imageView.setY(imageView.getY() - moveSize);
            }
        }
        text.setFont(Font.font("Verdana", 10));

        return rectangle;
    }

    @Override
    public Rectangle createSquare(int x, int y) {
        return new Rectangle(x, y, 20 , 20);
    }
}
