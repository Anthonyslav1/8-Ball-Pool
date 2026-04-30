package jfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Switch extends Application {
    private static final Logger LOGGER = Logger.getLogger(Switch.class.getName());
    private Main main;
    @FXML
    private Button startButton;

    @FXML
    private Button rulesButton;

    @FXML
    private Button tableButton;

    @FXML
    private Button queButton;

    @FXML
    private Button backButton;

    @FXML
    void goBack(ActionEvent event) {
        try {
            main.showFirstPage();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error going back", e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    void startGame(ActionEvent event) {
        try {
            main.showGamePage();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error starting game", e);
        }
    }

    @FXML
    void rulesOfTheGame(ActionEvent event) {
        try {
            main.showRulesPage();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error showing rules", e);
        }
    }

    @FXML
    void chooseTable(ActionEvent event) {
        try {
            main.showTablePage();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error choosing table", e);
        }
    }

    @FXML
    void chooseQue(ActionEvent event) {
        try {
            main.showQuePage();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error choosing que", e);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("EventTransform");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);

        javafx.scene.shape.Rectangle r = new Rectangle(0, 100, 10, 100);
        r.setFill(Color.RED);
        root.getChildren().add(r);


        primaryStage.show();
    }
    void setMain(Main main) {
        this.main = main;
    }
}
