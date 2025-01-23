package org.calma.ui.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
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

        // Soleil
        Circle soleil = new Circle(50, Color.YELLOW);
        soleil.setTranslateX(300);
        soleil.setTranslateY(-150);

        // Dromadaire (corps)
        Ellipse corpsDromadaire = new Ellipse(70, 40);
        corpsDromadaire.setFill(Color.BROWN);
        corpsDromadaire.setTranslateY(170);
        corpsDromadaire.setTranslateX(-100);

        Circle teteDromadaire = new Circle(20, Color.BROWN);
        teteDromadaire.setTranslateY(140);
        teteDromadaire.setTranslateX(-120);

        // Ajout du lion
        // Corps du lion
        Ellipse corpsLion = new Ellipse(60, 35);
        corpsLion.setFill(Color.GOLDENROD);
        corpsLion.setTranslateY(180);
        corpsLion.setTranslateX(100);

        // Tête du lion
        Circle teteLion = new Circle(30, Color.GOLDENROD);
        teteLion.setTranslateY(160);
        teteLion.setTranslateX(150);

        // Crinière du lion
        Circle criniere = new Circle(40, Color.ORANGE);
        criniere.setTranslateY(160);
        criniere.setTranslateX(150);

        // Pattes du lion
        Rectangle patte1 = new Rectangle(10, 40, Color.GOLDENROD);
        patte1.setTranslateX(85);
        patte1.setTranslateY(210);

        Rectangle patte2 = new Rectangle(10, 40, Color.GOLDENROD);
        patte2.setTranslateX(115);
        patte2.setTranslateY(210);

        Rectangle patte3 = new Rectangle(10, 40, Color.GOLDENROD);
        patte3.setTranslateX(125);
        patte3.setTranslateY(210);

        Rectangle patte4 = new Rectangle(10, 40, Color.GOLDENROD);
        patte4.setTranslateX(155);
        patte4.setTranslateY(210);

        // Queue du lion
        Rectangle queue = new Rectangle(50, 5, Color.GOLDENROD);
        queue.setTranslateX(60);
        queue.setTranslateY(180);
        queue.setRotate(-30);

        Circle boutQueue = new Circle(10, Color.ORANGE);
        boutQueue.setTranslateX(30);
        boutQueue.setTranslateY(165);

        // Ajouter tous les éléments à la scène
        root.getChildren().addAll(ciel, sol, soleil, corpsDromadaire, teteDromadaire, corpsLion, criniere, teteLion, patte1, patte2, patte3, patte4, queue, boutQueue);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Paysage JavaFX avec Dromadaire et Lion");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
