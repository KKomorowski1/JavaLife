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

import java.lang.reflect.InvocationTargetException;


public class Main extends Application {
    private CreateSquareImpl createSquare = new CreateSquareImpl();
    private CollisionImpl collision = new CollisionImpl();
    private WorldImpl worldImpl = new WorldImpl();
    private Scene scene = worldImpl.world(1000, 1000);

    @Override
    public void start(Stage primaryStage){
        worldImpl.addOrganisms();
        Timeline oneSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(0.5), event -> {
            System.out.println(worldImpl.getOrganisms());

            for (Organism organism : worldImpl.getOrganisms()) {
                try {
                createSquare.moveSquare(organism.getRectangle(), organism.getHealth(), organism.getImageView());
                    if (collision.checkShapeCollision(organism, worldImpl.getOrganisms())) {
                        worldImpl.addOrganism(collision.multiple(organism, worldImpl.getOrganisms()));
                        if (Integer.parseInt(organism.getHealth().getText()) <= 0) {
                            worldImpl.removeOrganism(organism);
                        }
                    }
                } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                    System.out.println("null");
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
