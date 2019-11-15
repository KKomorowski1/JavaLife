package model.mushroom;

import controller.organisms.CreateSquareImpl;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import model.Organism;

public class Poisonous extends Organism {

    public Poisonous(int x, int y) {
        setImageView(new ImageView(new Image(("Resources/iconfinder_Vegetables-10_3765553.png"), 20, 20, false, true)));
        placement(x, y);
        setRectangle(new CreateSquareImpl().createSquare(getSpawnX(), getSpawnY()));
        setColor(Color.PURPLE);
        getRectangle().setFill(getColor());
        setHealth(new Text("1"));
        setType("Muchomor");
        setPower(150);
        setMoving(false);
    }

    @Override
    public String toString() {
        return "Poisonous{}";
    }
}
