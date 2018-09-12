package us.rlit.oop.encapsulation;

public class EnhancedPlayer {
    private String name;
    private int life;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.life = health;
        if(health >= 0 && health <=100) {
            this.life = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.life -= damage;
        if(this.life <=0 ) {
            System.out.println("Player died");
        }
    }

    public int healthRemaining() {
        return this.life;
    }
}
