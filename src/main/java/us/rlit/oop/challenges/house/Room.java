package us.rlit.oop.challenges.house;

public class Room {
    private Bed bed;
    private Closet closet;
    private Dresser dresser;

    public Room(Bed bed, Closet closet, Dresser dresser) {
        this.bed = bed;
        this.closet = closet;
        this.dresser = dresser;
    }

    public Clothes getClothesFromCloset() {
        return closet.getClothes();
    }
    public Clothes getClothesFromDresser() {
        return dresser.getClothes();
    }


}
