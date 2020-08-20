package Mod;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Skins {
    int cost;
    boolean isOwned;
    Paint paint;
    String name;

    public Skins(int cost, boolean isOwned, Paint paint, String name) {
        this.cost = cost;
        this.isOwned = isOwned;
        this.paint = paint;
        this.name = name;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isOwned() {
        return isOwned;
    }

    public void setOwned(boolean owned) {
        isOwned = owned;
    }


}
