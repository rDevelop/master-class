package us.rlit.oop.encapsulation;

public class NoEnapPlayer {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if(this.health <=0 ) {
            System.out.println("Player died");
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}
