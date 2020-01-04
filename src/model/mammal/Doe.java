package model.mammal;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import model.Organism;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import controller.organisms.CreateSquareImpl;

import static javafx.scene.paint.Color.BLUE;

public class Doe extends Organism {

    private String type;
    private Text health;
    private Color color;
    private Rectangle rectangle;
    private double power;
    private int spawnX;
    private int spawnY;
    private ImageView imageView;
    private boolean isMoving;
    private double age;
    private int averageLifeSpan;

    public Doe(int spawnX, int spawnY) {
        this.type = "Doe";
        this.health = new Text("60");
        this.color = BLUE;
        this.rectangle = new CreateSquareImpl().createSquare(spawnX, spawnY);
        this.rectangle.setFill(this.color);
        this.power = 10;
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        this.imageView = new ImageView(new Image(("Resources/iconfinder_Rudolf_Deer_1651900.png"), 20, 20, false, true));
        this.imageView.setX(spawnX);
        this.imageView.setY(spawnY);
        this.isMoving = true;
        this.age = 0;
        this.averageLifeSpan = 14;
    }

    @Override
    public String toString() {
        return "Doe{}";
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public Text getHealth() {
        return this.health;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Rectangle getRectangle() {
        return this.rectangle;
    }

    @Override
    public double getPower() {
        return (double) Math.round(this.power / this.age) * 2;
    }

    @Override
    public int getSpawnX() {
        return this.spawnX;
    }

    @Override
    public int getSpawnY() {
        return this.spawnY;
    }

    @Override
    public int getAverageLifeSpan() {
        return this.averageLifeSpan;
    }

    @Override
    public double getAge() {
        return this.age=this.age + 0.1;
    }

    @Override
    public boolean isMoving() {
        return this.isMoving;
    }

    @Override
    public ImageView getImageView() {
        return this.imageView;
    }
}
