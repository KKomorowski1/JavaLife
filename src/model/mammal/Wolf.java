package model.mammal;

import controller.organisms.CreateSquareImpl;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import model.Organism;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Wolf extends Organism {

    private String type;
    private Text health;
    private Color color;
    private Rectangle rectangle;
    private int power;
    private int spawnX;
    private int spawnY;
    private ImageView imageView;
    private boolean isMoving;

    public Wolf(int spawnX, int spawnY) {
        this.type = "Wolf";
        this.health = new Text("200");
        this.color = Color.RED;
        this.rectangle = new CreateSquareImpl().createSquare(spawnX, spawnY);
        this.rectangle.setFill(this.color);
        this.power = 20;
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        this.imageView = new ImageView(new Image(("Resources/iconfinder_overwolf_logo_4177735.png"), 20, 20, false, true));
        this.imageView.setX(spawnX);
        this.imageView.setY(spawnY);
        this.isMoving = true;
    }

    @Override
    public String toString() {
        return "Wolf{}";
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
    public int getPower() {
        return this.power;
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
    public boolean isMoving() {
        return this.isMoving;
    }

    @Override
    public ImageView getImageView() {
        return this.imageView;
    }
}
