package model.mushroom;

import controller.shape.CreateSquareImpl;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import model.Plant;

public class Poisonous extends Plant {

    private String type;
    private Text health;
    private Color color;
    private Rectangle rectangle;
    private int power;
    private int spawnX;
    private int spawnY;
    private ImageView imageView;
    private boolean isMoving;
    private double age;
    private int averageLifeSpan;

    public Poisonous() {
    }

    public Poisonous(String type,int spawnX, int spawnY) {
        this.type = type;
        this.health = new Text("1");
        this.color = Color.PURPLE;
        this.rectangle = new CreateSquareImpl().createSquare(spawnX, spawnY);
        this.rectangle.setFill(this.color);
        this.power = 100;
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        this.imageView = new ImageView(new Image(("Resources/iconfinder_Vegetables-10_3765553.png"), 20, 20, false, true));
        this.imageView.setX(spawnX);
        this.imageView.setY(spawnY);
        this.isMoving = false;
        this.age = 0;
        this.averageLifeSpan = 100;
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

    @Override
    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public void setAverageLifeSpan(int averageLifeSpan) {
        this.averageLifeSpan = averageLifeSpan;
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

    @Override
    public String toString() {
        return "Poisonous{}";
    }

}
