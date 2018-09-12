package us.rlit.oop.challenges.house;

public class Dresser {
    private int size;
    private String color;
    private Clothes clothes;

    public Dresser(int size, String color, Clothes clothes) {
        this.size = size;
        this.color = color;
        this.clothes = clothes;
    }

    public Clothes getClothes() {
        return clothes;
    }
}
