package us.rlit.oop.challenges.house;

public class Closet {
    private int size;
    private Clothes clothes;

    public Closet(int size, Clothes clothes) {
        this.size = size;
        this.clothes = clothes;
    }

    public Clothes getClothes() {
        return clothes;
    }
}
