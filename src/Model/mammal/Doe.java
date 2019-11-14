package Model.mammal;

import Model.Organism;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import controller.organisms.CreateSquareImpl;

import static javafx.scene.paint.Color.BLUE;

public class Doe extends Organism {

    private String typeOfFoodEaten;

    public String getTypeOfFoodEaten() {
        return typeOfFoodEaten;
    }

    public void setTypeOfFoodEaten(String typeOfFoodEaten) {
        this.typeOfFoodEaten = typeOfFoodEaten;
    }

    public Doe() {
    }

    public Doe(String typeOfFoodEaten, int x, int y) {

        setImageView(new ImageView(new Image(("Resources/iconfinder_Rudolf_Deer_1651900.png"), 20, 20, false, true)));
        placement(x, y);
        setRectangle(new CreateSquareImpl().createSquare(getSpawnX(), getSpawnY()));
        setColor(BLUE);
        getRectangle().setFill(getColor());
        setHealth(new Text("60"));
        setType("Nie Drapieznik");
        setPower(10);
        this.typeOfFoodEaten = typeOfFoodEaten;
    }

    @Override
    public String toString() {
        return "Doe{" +
                "typeOfFoodEaten='" + typeOfFoodEaten + '\'' +
                '}';
    }
}
