package HomeWork101;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    private static int BOARD_WIDTH = 500;
    private static int BOARD_HEIGHT = 500;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Simple Picture");
        Canvas canvas = new Canvas();
        canvas.setHeight(BOARD_HEIGHT);
        canvas.setWidth(BOARD_WIDTH);
        BorderPane group = new BorderPane(canvas);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.show();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        simplePicture(gc);
    }

    private void simplePicture(GraphicsContext gc) {
        //House
        gc.setFill(Color.GREEN);
        gc.fillRect(0, 400, 500, 100);
        gc.setFill(Color.PURPLE);
        gc.fillRect(200, 200, 250, 200);
        gc.setFill(Color.RED);
        gc.fillPolygon(new double[]{150, 500, 450, 200}, new double[]{200, 200, 100, 100}, 4);
        gc.setFill(Color.OLIVE);
        gc.fillRect(380, 50, 50, 100);
        gc.setFill(Color.GRAY);
        gc.fillRect(230, 250, 100, 150);
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(350, 280, 80, 80);
        gc.setFill(Color.DARKORANGE);
        gc.setLineWidth(3);
        gc.strokeLine(390, 280, 390, 360);
        gc.strokeLine(350, 320, 430, 320);

        //Human
        gc.setFill(Color.BLACK);
        gc.strokeLine(70, 370, 70, 400);
        gc.strokeLine(90, 370, 90, 400);
        gc.strokeLine(70, 330, 50, 360);
        gc.strokeLine(90, 330, 110, 360);
        gc.fillOval(65, 320, 30, 60);
        gc.fillOval(65, 290, 30, 30);

        //Sun
        gc.setFill(Color.ORANGE);
        gc.setStroke(Color.YELLOW);
        gc.setLineWidth(50);
        gc.strokeOval(50, 50, 70, 70);
        gc.fillOval(50, 50, 70, 70);
    }
}
