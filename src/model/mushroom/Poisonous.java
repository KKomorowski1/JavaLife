package model.mushroom;

import controller.organisms.CreateSquareImpl;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import model.Organism;

public class Poisonous extends Organism {

    private String type;
    private Text health;
    private Color color;
    private Rectangle rectangle;
    private int power;
    private int spawnX;
    private int spawnY;
    private ImageView imageView;
    private boolean isMoving;

    public Poisonous(int spawnX, int spawnY) {
        this.type = "Poisonous";
        this.health = new Text("1");
        this.color = Color.PURPLE;
        this.rectangle = new CreateSquareImpl().createSquare(spawnX, spawnY);
        this.power = 150;
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        this.imageView = new ImageView(new Image(("Resources/iconfinder_Vegetables-10_3765553.png"), 20, 20, false, true));
        this.isMoving = false;
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

    @Override
    public String toString() {
        return "Poisonous{}";
    }
}
