package Mod;

import javafx.scene.shape.Rectangle;

public class Bullet {
    Rectangle rect;
    int BulletNewX;
    int BulletNewY;
    double angle;
    int distX;
    int distY;
    boolean isBot;

    public Bullet(Rectangle rect, int bulletNewX, int bulletNewY, double angle, int distX, int distY, boolean isBot) {
        this.rect = rect;
        BulletNewX = bulletNewX;
        BulletNewY = bulletNewY;
        this.angle = angle;
        this.distX = distX;
        this.distY = distY;
        this.isBot = isBot;
    }

    public boolean isBot() {
        return isBot;
    }

    public void setBot(boolean bot) {
        isBot = bot;
    }

    public int getDistX() {
        return distX;
    }

    public void setDistX(int distX) {
        this.distX = distX;
    }

    public int getDistY() {
        return distY;
    }

    public void setDistY(int distY) {
        this.distY = distY;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public int getBulletNewY() {
        return BulletNewY;
    }

    public void setBulletNewY(int bulletNewY) {
        BulletNewY = bulletNewY;
    }

    public Rectangle getRect() {
        return rect;
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }

    public int getBulletNewX() {
        return BulletNewX;
    }

    public void setBulletNewX(int bulletNewX) {
        BulletNewX = bulletNewX;
    }
    public void incrementBulletNewX(){
        BulletNewX+=5;
    }
    public void decrementBulletNewY(){
        BulletNewY-=5;
    }
    public void decrementBulletNewX(){
        BulletNewX-=5;
    }
    public void incrementBulletNewY(){
        BulletNewY+=5;
    }


}


