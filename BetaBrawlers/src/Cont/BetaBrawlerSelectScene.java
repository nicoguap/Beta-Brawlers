package Cont;

import Mod.Gun;
import Mod.Players;
import Mod.Shield;
import View.Main;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;



public class BetaBrawlerSelectScene {

    public static Players player;

    Gun glock = new Gun(1,10,10 );

    Shield smallShield = new Shield(30);

    Main obj = new Main();

    @FXML
    HBox hbox1 = new HBox();

    @FXML
    ImageView pot1 = new ImageView(new Image("potion1.png"));


    @FXML
    ImageView pot2 = new ImageView(new Image("potion2.png"));

    @FXML
    ImageView pot3 = new ImageView(new Image("potion3.png"));


    /*private void  selectSceneSChance()throws Exception{
        player = new Players(1);
        obj.changeSceneFight();

    }*/

    @FXML
    private void selectSceneHStart()throws Exception{
        player = new Players(2,glock,smallShield);
        obj.changeSceneFight();
    }


    /*private void selectSceneQuickness() throws Exception{
        player = new Players(3);
        obj.changeSceneFight();
    }*/



}
