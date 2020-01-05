package controller.shape;

import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import model.Organism;

import java.util.Random;

public class CreateSquareImpl implements CreateSquare {
    private Random random = new Random();

    @Override
    public Rectangle moveSquare(Organism organism){

        int moveSize = 20;
        int resetX = 500;
        int resetY = 500;

        int l = random.nextInt(4);

        if (organism.getRectangle().getX() >= 1000 || organism.getRectangle().getY() >= 1000 || organism.getRectangle().getX() <= 0 || organism.getRectangle().getY() <= 0){
            organism.getRectangle().setX(resetX);
            organism.getRectangle().setY(resetY);
            organism.getHealth().setX(resetX);
            organism.getHealth().setY(resetY);
            organism.getImageView().setX(resetX);
            organism.getImageView().setY(resetY);
        }else {
            if (l == 0) {
                organism.getHealth().setX(organism.getRectangle().getX() + moveSize);
                organism.getRectangle().setX(organism.getRectangle().getX() + moveSize);
                organism.getImageView().setX(organism.getImageView().getX() + moveSize);
            } else if (l == 1) {
                organism.getHealth().setX(organism.getRectangle().getX() - moveSize);
                organism.getRectangle().setX(organism.getRectangle().getX() - moveSize);
                organism.getImageView().setX(organism.getImageView().getX() - moveSize);
            } else if (l == 2) {
                organism.getHealth().setY(organism.getRectangle().getY() + moveSize);
                organism.getRectangle().setY(organism.getRectangle().getY() + moveSize);
                organism.getImageView().setY(organism.getImageView().getY() + moveSize);
            } else if (l == 3) {
                organism.getHealth().setY(organism.getRectangle().getY() - moveSize);
                organism.getRectangle().setY(organism.getRectangle().getY() - moveSize);
                organism.getImageView().setY(organism.getImageView().getY() - moveSize);
            }
        }
        organism.getHealth().setFont(Font.font("Verdana", 10));

        return organism.getRectangle();
    }

    @Override
    public Rectangle createSquare(int x, int y) {
        return new Rectangle(x, y, 20 , 20);
    }
}
