package Mod;

public class Gun {

    int fireRate;
    int damage;
    int range;

    public int getFireRate() {
        return fireRate;
    }

    public void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Gun(int fireRate, int damage, int range) {
        this.fireRate = fireRate;
        this.damage = damage;
        this.range = range;
    }
}
