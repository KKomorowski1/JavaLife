package sample;

import Model.Organism;
import Model.mammal.Wolf;
import Model.world.WorldImpl;
import controller.collision.CollisionImpl;
import controller.organisms.CreateSquareImpl;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {
    private CreateSquareImpl createSquare = new CreateSquareImpl();
    private CollisionImpl collision = new CollisionImpl();
    private WorldImpl worldImpl = new WorldImpl();
    private Scene scene = worldImpl.world(600, 600);

    @Override
    public void start(Stage primaryStage){
        worldImpl.addOrganisms();
        Timeline oneSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            for (Organism organism : worldImpl.getOrganisms()) {
                createSquare.moveSquare(organism.getRectangle(), organism.getHealth(), organism.getImageView());

                if (collision.checkShapeCollision(organism, worldImpl.getOrganisms())) {
                    if (organism.getHealth().getText().equals("0")) {
                        worldImpl.addOrganism(new Wolf("Type", 40, 40));
                        worldImpl.removeOrganism(organism);
                    }
                }
            }
        }));

        oneSecondsWonder.setCycleCount(Timeline.INDEFINITE);
        oneSecondsWonder.play();

        primaryStage.setScene(scene);
        primaryStage.setTitle("Life");
        primaryStage.show();
        scene.getStylesheets().add("grid-with-borders.css");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
