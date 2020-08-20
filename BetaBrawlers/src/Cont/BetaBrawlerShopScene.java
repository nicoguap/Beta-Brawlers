package Cont;

import Mod.Skins;
import View.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BetaBrawlerShopScene {

    @FXML
    Button next = new Button();
    @FXML
    Button prev = new Button();
    @FXML
    Button BuyorSelect = new Button();
    @FXML
    Button MainMenu = new Button();
    @FXML
    Button BuyCoins = new Button();
    @FXML
    Label name = new Label();
    @FXML
    Label price = new Label();

    @FXML
    Rectangle rect = new Rectangle();

    Image rico = new Image("Rico.jpg");

    Main obj = new Main();


    Skins skin1 = new Skins(0, true, Color.WHITE, "\"The Regular\"");
    Skins skin2 = new Skins(10, false, Color.BLACK, "\"Blackout\"");
    Skins skin3 = new Skins(10, false, Color.BLUE, "\"Big Blue\"");
    Skins skin4 = new Skins(20, false, Color.DARKRED, "\"Bloodhound\"");
    Skins skin5 = new Skins(20, false, Color.WHEAT, "\"Whole Grain\"");
    Skins skin6 = new Skins(30, false, Color.GOLD, "\"GoldenBoy\"");
    Skins skin7 = new Skins(30, false, Color.valueOf("#2a3439"), "\"GunMetal\"");
    Skins skin8 = new Skins(50, false, Color.AQUA, "\"Aqua\"");
    Skins skin9 = new Skins(50, false, Color.DARKOLIVEGREEN, "\"The Army\"");
    Skins skin10 = new Skins(100, false, new ImagePattern(rico) , "\"The Rico\"");
    Skins finalSkin;

    ArrayList<Skins> gameSkins = new ArrayList<>();




    int cnt = 0;


    @FXML
    private void mouseClickedonNext(){

        cnt++;

        if(cnt == 10){
            rect.setFill(new ImagePattern(rico));
            name.setText( skin10.getName() );
            price.setText("Cost: "+ skin10.getCost()+ " coins");


        }
        if(cnt == 11){
            cnt = 1;
        }
        if(cnt == 1){
            rect.setFill(skin1.getPaint());
            name.setText(skin1.getName() );
            price.setText("Cost: "+ skin1.getCost()+ " coins");


        }
        if(cnt == 2){
            rect.setFill(skin2.getPaint());
            name.setText( skin2.getName() );
            price.setText("Cost: "+ skin2.getCost()+ " coins");

        }
        if(cnt == 3){
            rect.setFill(skin3.getPaint());
            name.setText(  skin3.getName() );
            price.setText("Cost: "+ skin3.getCost()+ " coins");

        }
        if(cnt == 4){
            rect.setFill(skin4.getPaint());
            name.setText(  skin4.getName()  );
            price.setText("Cost: "+ skin4.getCost()+ " coins");

        }
        if(cnt == 5){
            rect.setFill(skin5.getPaint());
            name.setText(  skin5.getName() );
            price.setText("Cost: "+ skin5.getCost()+ " coins");

        }
        if(cnt == 6){
            rect.setFill(skin6.getPaint());
            name.setText( skin6.getName() );
            price.setText("Cost: "+ skin6.getCost()+ " coins");

        }
        if(cnt == 7){
            rect.setFill(skin7.getPaint());
            name.setText( skin7.getName() );
            price.setText("Cost: "+ skin7.getCost()+ " coins");

        }
        if(cnt == 8){
            rect.setFill(skin8.getPaint());
            name.setText(  skin8.getName() );
            price.setText("Cost: "+ skin8.getCost()+ " coins");

        }
        if(cnt == 9){
            rect.setFill(skin9.getPaint());
            name.setText(  skin9.getName() );
            price.setText("Cost: "+ skin9.getCost()+ " coins");

        }


    }

    @FXML
    private void mouseClickedonPrev(){

        cnt--;

        if(cnt == -1 || cnt == 0){
            cnt = 10;
        }
        if(cnt == 10){
            rect.setFill(new ImagePattern(rico));
            name.setText( skin10.getName() );
            price.setText("Cost: "+ skin10.getCost()+ " coins");


        }

        if(cnt == 1){
            rect.setFill(skin1.getPaint());
            name.setText(skin1.getName() );
            price.setText("Cost: "+ skin1.getCost()+ " coins");


        }
        if(cnt == 2){
            rect.setFill(skin2.getPaint());
            name.setText( skin2.getName() );
            price.setText("Cost: "+ skin2.getCost()+ " coins");

        }
        if(cnt == 3){
            rect.setFill(skin3.getPaint());
            name.setText(  skin3.getName() );
            price.setText("Cost: "+ skin3.getCost()+ " coins");

        }
        if(cnt == 4){
            rect.setFill(skin4.getPaint());
            name.setText(  skin4.getName()  );
            price.setText("Cost: "+ skin4.getCost()+ " coins");

        }
        if(cnt == 5){
            rect.setFill(skin5.getPaint());
            name.setText(  skin5.getName() );
            price.setText("Cost: "+ skin5.getCost()+ " coins");

        }
        if(cnt == 6){
            rect.setFill(skin6.getPaint());
            name.setText( skin6.getName() );
            price.setText("Cost: "+ skin6.getCost()+ " coins");

        }
        if(cnt == 7){
            rect.setFill(skin7.getPaint());
            name.setText( skin7.getName() );
            price.setText("Cost: "+ skin7.getCost()+ " coins");

        }
        if(cnt == 8){
            rect.setFill(skin8.getPaint());
            name.setText(  skin8.getName() );
            price.setText("Cost: "+ skin8.getCost()+ " coins");

        }
        if(cnt == 9){
            rect.setFill(skin9.getPaint());
            name.setText(  skin9.getName() );
            price.setText("Cost: "+ skin9.getCost()+ " coins");

        }


    }


    @FXML
    private void mouseClickedOnPurchase(){

        if(name.getText().equals(skin10.getName())){
            obj.setSkin(skin10.getPaint());

        }

        if(name.getText().equals(skin1.getName())){
            obj.setSkin(skin1.getPaint());
        }
        if(name.getText().equals(skin2.getName())){
            obj.setSkin(skin2.getPaint());
        }
        if(name.getText().equals(skin3.getName())){
            obj.setSkin(skin3.getPaint());
        }
        if(name.getText().equals(skin4.getName())){
            obj.setSkin(skin4.getPaint());
        }
        if(name.getText().equals(skin5.getName())){
            obj.setSkin(skin5.getPaint());

        }
        if(name.getText().equals(skin6.getName())){
            obj.setSkin(skin6.getPaint());
        }
        if(name.getText().equals(skin7.getName())){
            obj.setSkin(skin7.getPaint());
        }
        if(name.getText().equals(skin8.getName())){
            obj.setSkin(skin8.getPaint());
        }
        if(name.getText().equals(skin9.getName())){
            obj.setSkin(skin9.getPaint());
        }

    }


    @FXML
    public void mouseClickedonBuyCoins() throws IOException {
        obj.changeSceneCoins();
    }






}
