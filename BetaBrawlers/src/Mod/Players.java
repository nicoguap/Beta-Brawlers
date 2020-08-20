package Mod;

public class Players {

    int powerUp;
    Gun gun;
    Shield shield;


    public Players(int powerUp, Gun gun, Shield shield) {
        this.powerUp = powerUp;
        this.gun = gun;
        this.shield = shield;
    }

    public Players(int powerUp) {
        this.powerUp = powerUp;
    }

    public int getPowerUp() {
        return powerUp;
    }

    public void setPowerUp(int powerUp) {
        this.powerUp = powerUp;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }
}
