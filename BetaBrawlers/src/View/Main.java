package View;

import Mod.Skins;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public Stage window = new Stage();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("View/BetaBrawlersStartScene.fxml"));
        Scene scene = new Scene(loader.load());
         window.setScene(scene);
        window.centerOnScreen();


         window.show();
    }


    public void changeSceneShop()throws IOException {
        FXMLLoader loader;
        loader = new FXMLLoader(getClass().getClassLoader().getResource("View/BetaBrawlerShopScene.fxml"));

        window.close();
        window.setScene(new Scene(loader.load()));

        window.show();

    }
    public void changeSceneSelect() throws IOException{
        FXMLLoader loader;
        loader = new FXMLLoader(getClass().getClassLoader().getResource("View/BetaBrawlerSelectScene.fxml"));

        window.close();
        window.setScene(new Scene(loader.load()));

        window.show();

    }
    public void changeSceneFight() throws IOException{
        FXMLLoader loader;
        loader = new FXMLLoader(getClass().getClassLoader().getResource("View/BetaBrawlerFightScene.fxml"));

        Scene root = new Scene(loader.load());
        root.getRoot().requestFocus();

        window.close();
        window.setScene(root);

        window.show();
    }
    public void changeSceneCoins() throws IOException{
        FXMLLoader loader;
        loader = new FXMLLoader(getClass().getClassLoader().getResource("View/BetaBrawlerCoinScene.fxml"));


        window.close();
        window.setScene(new Scene(loader.load()));

        window.show();
    }

    static Skins skin = new Skins(0,false,null,null);

    public static void setSkin(Paint paint){

        skin.setPaint(paint);
    }


    public static Paint getskin(){

        return skin.getPaint();

    }
}
