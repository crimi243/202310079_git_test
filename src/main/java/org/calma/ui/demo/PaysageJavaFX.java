package org.calma.ui.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaysageJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();

        // Ciel
        Rectangle ciel = new Rectangle(800, 600);
        ciel.setFill(Color.SKYBLUE);

        // Sol
        Rectangle sol = new Rectangle(800, 100);
        sol.setFill(Color.GREEN);
        sol.setTranslateY(250);

        // Montagnes
        Polygon montagne1 = new Polygon();
        montagne1.getPoints().addAll(200.0, 250.0, 400.0, 100.0, 600.0, 250.0);
        montagne1.setFill(Color.GRAY);

        Polygon montagne2 = new Polygon();
        montagne2.getPoints().addAll(100.0, 250.0, 350.0, 150.0, 600.0, 250.0);
        montagne2.setFill(Color.DARKGRAY);

        // Soleil
        Circle soleil = new Circle(50, Color.YELLOW);
        soleil.setTranslateX(300);
        soleil.setTranslateY(-150);

        // Ajouter tous les éléments à la scène
        root.getChildren().addAll(ciel, sol, montagne1, montagne2, soleil);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Paysage JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
