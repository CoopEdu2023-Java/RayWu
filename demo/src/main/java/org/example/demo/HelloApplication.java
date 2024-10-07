package org.example.demo;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class HelloApplication extends Application {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int BUTTON_WIDTH = 300;
    private static final int BUTTON_HEIGHT = 60;
    private static final int INITIAL_X = 800;
    private static final double SPEED = 1;
    private static final double INITIAL_Y = 500;

    private Button button;
    private Timeline timeline;
    private List<Button> buttons = new ArrayList<>();
    private Button createButton(int x, int y, String title) {
        Button newButton = new Button(title);
        newButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        newButton.setLayoutX(x);
        newButton.setLayoutY(y);
        return newButton;
    }
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        root.setPrefSize(WIDTH, HEIGHT);
        root.setStyle("-fx-background-color: white;");
        // buttons
        Button button1 = createButton(800, 500, " ");
        Button button2 = createButton(480,500, " ");
        Button button3 = createButton(160, 500, " ");
        Button button4 = createButton(-170, 500, " ");
        Button button5 = createButton(700, 410, " ");
        Button button6 = createButton(380,410, " ");
        Button button7 = createButton(60,410, " ");
        Button button8 = createButton(-270,410, " ");
        Button button9 = createButton(800, 320, " ");
        Button button10 = createButton(480,320, "数学组");
        Button button11 = createButton(160, 320, " ");
        Button button12 = createButton(-170, 320, " ");

        root.getChildren().addAll(button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12);
        buttons.addAll(Arrays.asList(button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12));

        timeline = new Timeline(new KeyFrame(Duration.millis(16), e -> moveButton()));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        Scene scene = new Scene(root);
        File file = new File("C:\\Users\\dolph\\Desktop\\demo\\src\\main\\java\\org\\example\\demo\\styles.css");
        scene.getStylesheets().add(file.toURI().toString());
        Text title = new Text("目录");
        Text title2 = new Text("Content");
        title.setLayoutX(70);
        title.setLayoutY(100);
        title2.setLayoutX(70);
        title2.setLayoutY(150);
        title.setFont(Font.font("Songti SC",50));
        title2.setFont(Font.font("Songti SC",50));
        root.getChildren().add(title);
        root.getChildren().add(title2);
        primaryStage.setTitle("Moving Button Demo");
        primaryStage.setWidth(1024);
        primaryStage.setHeight(640);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    private void moveButton() {
        for (Button button : buttons) {
            double newX = button.getLayoutX() - SPEED;
            if (newX < -300) {
                newX = 1000;
            }
            button.setLayoutX(newX);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}