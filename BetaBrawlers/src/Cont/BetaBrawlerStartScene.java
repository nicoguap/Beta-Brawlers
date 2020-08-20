package Cont;

import View.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BetaBrawlerStartScene {

    @FXML
    private StackPane
            stackP = new StackPane();


    Main obj = new Main();
    @FXML
    public void mouseClickedOnStartSceneGame() throws IOException {



            obj.window.close();
            obj.changeSceneSelect();
            //FXMLLoader loader;
            //loader = new FXMLLoader(getClass().getResource("View/BetaBrawlerSelectScene.fxml"));
            //Stage stage = (Stage) stackP.getScene().getWindow();

            //stage.setScene(new Scene(loader.load()));


    }
    public void mouseClickedOnStartSceneShop() throws IOException {



        obj.window.close();
        obj.changeSceneShop();
        //FXMLLoader loader;
        //loader = new FXMLLoader(getClass().getResource("View/BetaBrawlerSelectScene.fxml"));
        //Stage stage = (Stage) stackP.getScene().getWindow();

        //stage.setScene(new Scene(loader.load()));


    }


}