package HomeWork102;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    private static int BOARD_HEIGHT = 500;
    private static int BOARD_WIDTH = 500;
    private static double DX = 0;
    private static double DY = 0;
    private int RADIUS = 10;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Animation");
        Canvas canvas = new Canvas();
        canvas.setWidth(BOARD_WIDTH);
        canvas.setHeight(BOARD_HEIGHT);


        Circle circle = new Circle(RADIUS);
        circle.setCenterX(250);
        circle.setCenterY(RADIUS);
        circle.setFill(Color.BLACK);
        BorderPane group = new BorderPane(canvas);
        group.getChildren().add(circle);
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.show();

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().add(new KeyFrame(
                Duration.millis(8000),
                new KeyValue(circle.translateXProperty(), BOARD_HEIGHT- RADIUS),
                new KeyValue(circle.translateYProperty(),BOARD_WIDTH- RADIUS)
        ));
        timeline.play();


    }
}
