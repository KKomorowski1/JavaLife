package model.mammal;

import controller.shape.CreateSquareImpl;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import static javafx.scene.paint.Color.BROWN;

public class Bear extends Mammal {

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

    public Bear() {
    }

    public Bear(String type, int spawnX, int spawnY) {
        this.type = type;
        this.health = new Text("160");
        this.color = BROWN;
        this.rectangle = new CreateSquareImpl().createSquare(spawnX, spawnY);
        this.rectangle.setFill(this.color);
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        this.imageView = new ImageView(new Image(("Resources/bear.png"), 20, 20, false, true));
        this.imageView.setX(spawnX);
        this.imageView.setY(spawnY);
        this.isMoving = true;
        this.age = 0;
        this.averageLifeSpan = 20;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setHealth(Text health) {
        this.health = health;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public void setSpawnX(int spawnX) {
        this.spawnX = spawnX;
    }

    @Override
    public void setSpawnY(int spawnY) {
        this.spawnY = spawnY;
    }

    @Override
    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    @Override
    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public void setAverageLifeSpan(int averageLifeSpan) {
        this.averageLifeSpan = averageLifeSpan;
    }

    @Override
    public String toString() {
        return "Bear{}";
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
        return this.power = (double) Math.round(this.power / this.age);
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
        return this.age = this.age + 0.3;
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
