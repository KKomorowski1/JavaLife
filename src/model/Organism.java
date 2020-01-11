package model;

import factory.OrganismFactory;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.Random;

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

    public abstract void setType(String type);
    public abstract void setHealth(Text health);
    public abstract void setColor(Color color);
    public abstract void setRectangle(Rectangle rectangle);
    public abstract void setPower(double power);
    public abstract void setSpawnX(int spawnX);
    public abstract void setSpawnY(int spawnY);
    public abstract void setAverageLifeSpan(int averageLifeSpan);
    public abstract void setAge(double age);
    public abstract void setImageView(ImageView imageView);

    protected static Organism getOrganism(Organism organism){
        Random random = new Random();
        if (random.nextInt(100) >= 75) {
            if (organism.getType().equalsIgnoreCase(organism.getType())) {
                return OrganismFactory.getOrganism(organism.getType(), random.nextInt(1000), random.nextInt(1000));
            } else {
                return null;
            }
        }else {
            return null;
        }
    }
}
