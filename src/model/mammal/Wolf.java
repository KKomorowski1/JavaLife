package model.mammal;

import model.Organism;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import controller.organisms.CreateSquareImpl;

import static javafx.scene.paint.Color.*;

public class Wolf extends Organism {

    private String typeOfFoodEaten;

    public Wolf() {
    }

    public String getTypeOfFoodEaten() {
        return typeOfFoodEaten;
    }

    public void setTypeOfFoodEaten(String typeOfFoodEaten) {
        this.typeOfFoodEaten = typeOfFoodEaten;
    }

    public Wolf(String typeOfFoodEaten, int x, int y ){
        setImageView(new ImageView(new Image(("Resources/iconfinder_overwolf_logo_4177735.png"), 20, 20, false, true)));
        placement(x, y);
        setRectangle(new CreateSquareImpl().createSquare(getSpawnX(), getSpawnY()));
        setColor(RED);
        getRectangle().setFill(getColor());
        setHealth(new Text("100"));
        setType("Drapieznik");
        setPower(20);
        this.typeOfFoodEaten = typeOfFoodEaten;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "typeOfFoodEaten='" + typeOfFoodEaten + '\'' +
                '}';
    }
}
