package us.rlit.oop.encapsulation;

public class Encapsulator {
    public static void main(String[] args) {

        // No encapsulation
        // Access maybe not wanted
        // No guarantee things are set
        // change classes and this code must change
        // NO Control.
        NoEnapPlayer player = new NoEnapPlayer();
        player.name = "Rob";
        player.health = 20;
        player.weapon = "Sword";

        System.out.println("Remaining health " + player.healthRemaining());
        int damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health " + player.healthRemaining());
        player.loseHealth(damage);
        System.out.println("Remaining health " + player.healthRemaining());


        System.out.println();
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Rob", 10, "Sword");


        /*
         Encapsulate you can change the EnhancedPlayer class without having to
         change or worry about anything out here.
          - change var health to life or anything
         */
        System.out.println("Current health " + enhancedPlayer.healthRemaining());

    }
}
