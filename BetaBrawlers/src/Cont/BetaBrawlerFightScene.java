package Cont;

import Mod.Bullet;
import View.Main;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;



public class BetaBrawlerFightScene {

    public boolean a = true;

    Label lost = new Label("YOU LOSE! Exit to choose new power up, or exit again to go back to main menu");
    Label won = new Label("Champion of the platform! Exit to choose new power up, or exit again to go back to main menu ");
    Label inst = new Label("You are on the bottom left. Use wasd to move, and click to shoot. Press space to begin.");

    Rectangle worl = new Rectangle();


    BetaBrawlerShopScene skin = new BetaBrawlerShopScene();

    @FXML
    Label health = new Label();

    int moveAmt=4;

    int distX;
    int distY;

    boolean rightCaused;
    boolean leftCaused;

    Main obj = new Main();

    private AnimationTimer timer = new UpdatePlayers();
    private AnimationTimer timer2 = new UpdateBullets();
    private AnimationTimer timer3 = new Bots();
    private AnimationTimer timer4 = new checkBulletCollision();

    int botHealth = 100;
    int playHealth = 100;

    @FXML
    Rectangle playerHealth = new Rectangle();

    @FXML
    Pane pane = new Pane();

    @FXML
    Pane playerPane = new Pane();

    @FXML
    Rectangle player1Rect = new Rectangle();

    volatile List<Bullet> bulletArray = new ArrayList <> ();

    @FXML
    Rectangle player2Rect = new Rectangle();

    @FXML
    Rectangle player3Rect = new Rectangle();

    @FXML
    Rectangle player4Rect = new Rectangle();

    @FXML
    Rectangle Rect1 = new Rectangle();

    @FXML
    Rectangle Rect2 = new Rectangle();

    @FXML
    Rectangle Rect3 = new Rectangle();

    @FXML
    Rectangle Rect4 = new Rectangle();

    @FXML
    Rectangle Rect5 = new Rectangle();

    @FXML
    Rectangle Rect6 = new Rectangle();

    @FXML
    Rectangle Rect7 = new Rectangle();

    @FXML
    Rectangle Rect8 = new Rectangle();

    @FXML
    Rectangle Rect9 = new Rectangle();

    @FXML
    Rectangle Rect10 = new Rectangle();

    @FXML
    Rectangle Rect11 = new Rectangle();

    @FXML
    Rectangle Rect12 = new Rectangle();

    @FXML
    Rectangle Rect13 = new Rectangle();

    @FXML
    Rectangle Rect14 = new Rectangle();

    @FXML
    Rectangle Rect15 = new Rectangle();

    @FXML
    Rectangle Rect16 = new Rectangle();

    @FXML
    Rectangle Rect17 = new Rectangle();

    @FXML
    Rectangle Rect18 = new Rectangle();

    @FXML
    Rectangle Rect19 = new Rectangle();

    @FXML
    Rectangle Rect20 = new Rectangle();

    @FXML
    Rectangle Rect21 = new Rectangle();

    @FXML
    Rectangle Rect22= new Rectangle();

    @FXML
    Rectangle Rect23= new Rectangle();

    @FXML
    Rectangle Rect24= new Rectangle();

    @FXML
    Rectangle Rect25= new Rectangle();

    @FXML
    Rectangle Rect26= new Rectangle();

    @FXML
    Rectangle Rect27= new Rectangle();

    @FXML
    Rectangle Rect28= new Rectangle();

    @FXML
    Rectangle Rect29= new Rectangle();

    @FXML
    Rectangle Rect30= new Rectangle();

    @FXML
    Rectangle Rect31= new Rectangle();

    ArrayList<Rectangle> rectangles= new ArrayList<>();

    public void fillArray(){
        rectangles.add(Rect1);
        rectangles.add(Rect2);
        rectangles.add(Rect3);
        rectangles.add(Rect4);
        rectangles.add(Rect5);
        rectangles.add(Rect6);
        rectangles.add(Rect7);
        rectangles.add(Rect8);
        rectangles.add(Rect9);


        rectangles.add(Rect10);
        rectangles.add(Rect11);
        rectangles.add(Rect12);
        rectangles.add(Rect13);
        rectangles.add(Rect14);
        rectangles.add(Rect15);
        rectangles.add(Rect16);
        rectangles.add(Rect17);
        rectangles.add(Rect18);
        rectangles.add(Rect19);
        rectangles.add(Rect20);
        rectangles.add(Rect21);
        rectangles.add(Rect22);
        rectangles.add(Rect23);


        rectangles.add(Rect24);
        rectangles.add(Rect25);
        rectangles.add(Rect26);
        rectangles.add(Rect27);
        rectangles.add(Rect31);
        rectangles.add(Rect30);


        rectangles.add(Rect28);
        rectangles.add(Rect29);

    }







    private double newY, newX = 0;

    int cnt = 0;


    static boolean dPressed = false;
    static boolean aPressed = false;
    boolean wPressed = false;
    boolean sPressed = false;



    @FXML
    private void initialize(){
        worl.setWidth(1400);
        worl.setHeight(300);
        worl.setFill(Color.BLACK);
        inst.setTextFill(Color.WHITE);
        pane.getChildren().add(worl);
        pane.getChildren().add(inst);








        try{
            player1Rect.setFill(obj.getskin());
        }
        catch (Exception e){

            player1Rect.setFill(Color.WHITE);
        }

        if(player1Rect.getFill() == null){
            player1Rect.setFill(Color.WHITE);

        }



    }

    boolean playcnt = true;

    public void playerKeyPressed(javafx.scene.input.KeyEvent keyEvent) {

        if(keyEvent.getCode() == KeyCode.D ){
            dPressed = true;
            moveAmt=4;




        }
        else if(keyEvent.getCode() == KeyCode.A){
            aPressed =true;
            moveAmt=4;

        }
        else if(keyEvent.getCode()== KeyCode.W){
            wPressed=true;
            moveAmt=4;
        }

        else if(keyEvent.getCode()== KeyCode.S){
            sPressed=true;
            moveAmt=4;
        }
        else if(keyEvent.getCode()== KeyCode.SPACE){


                timer.start();
                timer2.start();
                timer3.start();
                timer4.start();
                pane.getChildren().remove(inst);
                pane.getChildren().remove(worl);
                playcnt = false;

        }
    }

    public void playerKeyReleased(KeyEvent keyEvent) {
        if(keyEvent.getCode() == KeyCode.D){
            dPressed =false;


        }
        if(keyEvent.getCode() == KeyCode.A){
            aPressed =false;
        }
        if(keyEvent.getCode() == KeyCode.W){
            wPressed =false;

        }
        if(keyEvent.getCode() == KeyCode.S){
            sPressed =false;
        }


    }
    double angle;
    @FXML
    public void playerMousePressed(MouseEvent event){

        double playerX = (player1Rect.getBoundsInParent().getMaxX() + player1Rect.getBoundsInParent().getMinX())/2;
        double playerY = (player1Rect.getBoundsInParent().getMaxY() + player1Rect.getBoundsInParent().getMinY())/2;

        angle = Math.toDegrees(Math.atan(-(event.getY()-playerY)/(event.getX()-playerX)));

        distX = (int)(event.getX() - playerX);
        distY = (int)(event.getY() - playerY);



        bulletArray.add(new Bullet(new Rectangle(20,7),0,0,angle, distX, distY, false));



        Rectangle shot = bulletArray.get(bulletArray.size()-1).getRect();
        shot.setFill(Color.BLUE);

        shot.setX(playerX);
        shot.setY(playerY);
        shot.setRotate(-angle);




        playerPane.getChildren().add(shot);



    }

    public  void Dcollision(){
        fillArray();
        newX = player1Rect.getX() + 4+ newX;
        player1Rect.setTranslateX(newX);
        for(int i = 0; i <31; i++){

            if(rectangles.get(i).getBoundsInParent().intersects(player1Rect.getBoundsInParent())) {

                newX = player1Rect.getX() - 4+ newX;
                player1Rect.setTranslateX(newX);
            }

        }


    }
    public void Acollision(){
        fillArray();
        newX = player1Rect.getX() -4 +newX;

        player1Rect.setTranslateX(newX);
        for(int i = 0; i <31; i++){

            if(rectangles.get(i).getBoundsInParent().intersects(player1Rect.getBoundsInParent())) {

                newX = player1Rect.getX() +4+newX;

                player1Rect.setTranslateX(newX);


            }

        }


    }
    public void Wcollision(){
        fillArray();
        newY = player1Rect.getY() - 6 + newY;
        player1Rect.setTranslateY(newY);
        for(int i = 0; i <31; i++){
            if(rectangles.get(i).getBoundsInParent().intersects(player1Rect.getBoundsInParent())) {
                newY = player1Rect.getY() + 6 + newY;
                player1Rect.setTranslateY(newY);



            }

        }


    }


    double fallTime =1;
    public void Scollision(){
        fillArray();
        newY = player1Rect.getY() + (.16 * fallTime++) + newY;
        player1Rect.setTranslateY(newY);

        if (newY > 75.75){

            newY = -630;
            player1Rect.setTranslateY(newY);
        }

        for(int i = 0; i <31; i++){
            if(rectangles.get(i).getBoundsInParent().intersects(player1Rect.getBoundsInParent())) {

                newY = player1Rect.getY() - 4 + newY;
                player1Rect.setTranslateY(newY);

                fallTime = 1;



            }

        }


    }
    public boolean Botcollision(){
        fillArray();

        for(int i = 0; i <31; i++){

            if(rectangles.get(i).getBoundsInParent().intersects(player3Rect.getBoundsInParent())) {
                if((rectangles.get(i).getBoundsInParent().getMinY() - player3Rect.getBoundsInParent().getMinY()) > 0){
                    return true;
                }
                return false;
            }

        }
        return true;


    }



    double bot1y = 0;
    int Botfalltime = 1;
    public void SBotcollision(){
        fillArray();
        bot1y = player3Rect.getY() + (.16 * Botfalltime++) + bot1y;
        player3Rect.setTranslateY(bot1y);

        if ( bot1y > 600){
            bot1y = -24;
            player3Rect.setTranslateY(bot1y);
        }


        for(int i = 0; i <31; i++){
            if(rectangles.get(i).getBoundsInParent().intersects(player3Rect.getBoundsInParent())) {

                bot1y = player3Rect.getY() - 4 + bot1y;
                player3Rect.setTranslateY(bot1y);

               Botfalltime = 1;



            }

        }


    }


    private class UpdatePlayers extends AnimationTimer{



        @Override
        public void handle(long now) {



            Scollision();



            if(aPressed){



                Acollision();




            }
            if(dPressed) {
               Dcollision();


            }
            if(wPressed){

                Wcollision();

            }

        }
    }





    private class UpdateBullets extends AnimationTimer{



        @Override
        public void handle(long now) {



            if(bulletArray.size() != 0){



                for(int i = 0; i < bulletArray.size(); i ++){





                        if (bulletArray.get(i).getDistX() < 0) {
                            bulletArray.get(i).decrementBulletNewX();
                        } else {
                            bulletArray.get(i).incrementBulletNewX();
                        }
                        if (bulletArray.get(i).getDistY() > 0) {
                            bulletArray.get(i).incrementBulletNewY();

                        } else {
                            bulletArray.get(i).decrementBulletNewY();
                        }


                        bulletArray.get(i).getRect().setTranslateX(bulletArray.get(i).getBulletNewX() * Math.abs((Math.abs(bulletArray.get(i).getAngle()) - 90) / 45));


                        bulletArray.get(i).getRect().setTranslateY(bulletArray.get(i).getBulletNewY() * Math.abs(Math.abs(bulletArray.get(i).getAngle()) / 45));


            }



            }

        }
    }

    private class checkBulletCollision extends AnimationTimer{
        @Override
        public void handle(long now) {

            for(Bullet i : bulletArray) {
                if(i.getRect().getBoundsInParent().intersects(player1Rect.getBoundsInParent())){
                    if(i.isBot()){
                        playerPane.getChildren().remove(i.getRect());
                        bulletArray.remove(i);
                        if(playHealth-15 <1){
                            playerPane.getChildren().remove(player1Rect);
                            timer.stop();
                            timer2.stop();
                            timer3.stop();
                            timer4.stop();
                            health.setText("0/100");

                            worl.setFill(Color.WHITE);
                            worl.setWidth(1400);
                            worl.setHeight(400);
                            playerHealth.setWidth(playerHealth.getWidth()- (15*2.5));
                            lost.fontProperty().setValue(Font.font(30));
                            lost.setTextFill(Color.BLACK);
                            pane.getChildren().add(worl);
                            pane.getChildren().add(lost);
                        }
                        else{
                            playHealth-=15;
                            playerHealth.setWidth(playerHealth.getWidth()- (15*2.5));

                            health.setText(playHealth + "/100");

                        }


                    }

                }
                else if(i.getRect().getBoundsInParent().intersects(player3Rect.getBoundsInParent())){
                    if(!i.isBot()) {
                        playerPane.getChildren().remove(i.getRect());
                        bulletArray.remove(i);
                        if(botHealth<1){
                            playerPane.getChildren().remove(player3Rect);
                            timer.stop();
                            timer2.stop();
                            timer3.stop();
                            timer4.stop();
                            worl.setFill(Color.WHITE);
                            worl.setWidth(1400);
                            worl.setHeight(400);

                            won.fontProperty().setValue(Font.font(28));
                            won.setTextFill(Color.BLACK);
                            pane.getChildren().add(worl);
                            pane.getChildren().add(won);
                        }
                        else{
                            botHealth-= 15;

                        }

                    }
                }
                if(i.getRect().getBoundsInParent().getMaxY() > 700){
                    playerPane.getChildren().remove(i.getRect());
                    bulletArray.remove(i);
                }
                if(i.getRect().getBoundsInParent().getMaxY() < -300){
                    playerPane.getChildren().remove(i.getRect());
                    bulletArray.remove(i);
                }
                if(i.getRect().getBoundsInParent().getMaxX() > 1400){
                    playerPane.getChildren().remove(i.getRect());
                    bulletArray.remove(i);
                }
                if(i.getRect().getBoundsInParent().getMaxX() < -300){
                    playerPane.getChildren().remove(i.getRect());
                    bulletArray.remove(i);
                }



            }



        }
    }



   public void botShots(){
       double botX = (player3Rect.getBoundsInParent().getMaxX() + player3Rect.getBoundsInParent().getMinX())/2;
       double botY = (player3Rect.getBoundsInParent().getMaxY() + player3Rect.getBoundsInParent().getMinY())/2;

       angle = Math.toDegrees(Math.atan(-(player1Rect.getBoundsInParent().getMaxY()-botY)/(player1Rect.getBoundsInParent().getMaxX()-botX)));

       distX = (int)(player1Rect.getBoundsInParent().getMaxX() - botX);
       distY = (int)(player1Rect.getBoundsInParent().getMaxY() - botY);



       bulletArray.add(new Bullet(new Rectangle(20,7),0,0,angle, distX, distY, true));



       Rectangle shot = bulletArray.get(bulletArray.size()-1).getRect();
       shot.setFill(Color.BLUE);

       shot.setX(botX);
       shot.setY(botY);
       shot.setRotate(-angle);




       playerPane.getChildren().add(shot);


   }


   double bot1x=0;
    double bot2x=0;
    int botcnt = 0;
   private class Bots extends AnimationTimer{



       @Override
       public void handle(long now){
           SBotcollision();


           if(!Botcollision()){
               botcnt++;
           }
           if(botcnt % 2 == 0){
               bot1x = player3Rect.getX() - 4 + bot1x;
               player3Rect.setTranslateX(bot1x);
           }

           else{
               bot1x = player3Rect.getX() + 4 + bot1x;
               player3Rect.setTranslateX(bot1x);
           }
           if((Math.random() * 10)  > 9.6){
               botShots();


           }
           if((Math.random() * 10)  > 9.93){
               botcnt++;


           }



       }
   }
}
