package model;

import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public abstract class Organism {

    public abstract String getType();
    public abstract Text getHealth();
    public abstract Color getColor();
    public abstract Rectangle getRectangle();
    public abstract double getPower();
    public abstract int getSpawnX();
    public abstract int getSpawnY();
    public abstract int getAverageLifeSpan();
    public abstract double getAge();
    public abstract boolean isMoving();
    public abstract ImageView getImageView();

}
