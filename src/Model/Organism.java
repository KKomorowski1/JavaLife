package Model;

import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Organism {
    private String type;
    private Text health;
    private Color color;
    private Rectangle rectangle;
    private int power;
    private int spawnX;
    private int spawnY;
    private ImageView imageView;

    public Organism(String type, Text health, Color color, Rectangle rectangle, int power, int spawnX, int spawnY, ImageView imageView) {
        this.type = type;
        this.health = health;
        this.color = color;
        this.rectangle = rectangle;
        this.power = power;
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        this.imageView = imageView;
    }

    protected Organism() {
    }

    public ImageView getImageView() {
        return imageView;
    }

    protected void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public int getPower() {
        return power;
    }

    protected void setPower(int power) {
        this.power = power;
    }


    protected int getSpawnX() {
        return spawnX;
    }

    private void setSpawnX(int spawnX) {
        this.spawnX = spawnX;
    }

    protected int getSpawnY() {
        return spawnY;
    }

    private void setSpawnY(int spawnY) {
        this.spawnY = spawnY;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    protected void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
        rectangle.setOpacity(0.5);
    }

    protected Color getColor() {
        return color;
    }

    protected void setColor(Color color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public Text getHealth() {
        return health;
    }

    protected void setHealth(Text health) {
        this.health = health;
        health.setX(getSpawnX());
        health.setY(getSpawnY());
    }

    @Override
    public String toString() {
        return "Organism{" +
                "type='" + type + '\'' +
                ", health=" + health +
                ", color=" + color +
                ", rectangle=" + rectangle +
                '}';
    }
    protected void placement(int x, int y){
        getImageView().setX(x);
        getImageView().setY(y);
        setSpawnX(x);
        setSpawnY(y);
    }


}
