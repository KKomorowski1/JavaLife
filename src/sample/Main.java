package sample;

import model.Organism;
import controller.world.WorldImpl;
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
    private Scene scene = worldImpl.world(1000, 1000);

    @Override
    public void start(Stage primaryStage){
        worldImpl.addOrganisms();
        Timeline oneSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(0.5), event -> {
            for (Organism organism : worldImpl.getOrganisms()) {
                if (organism.isMoving()) {
                    createSquare.moveSquare(organism);

                    if (collision.checkShapeCollision(organism, worldImpl.getOrganisms()) == 1) {
                        worldImpl.addOrganism(collision.multiple(organism));
                    }

                    if (Integer.parseInt(organism.getHealth().getText()) <= 0 || organism.getAge() >= organism.getAverageLifeSpan()) {
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
