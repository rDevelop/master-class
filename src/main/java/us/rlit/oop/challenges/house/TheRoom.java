package us.rlit.oop.challenges.house;

public class TheRoom {

    public static void main(String[] args) {
        Pillows pillows = new Pillows(4, 1);
        Bed bed = new Bed(6, pillows);
        Clothes mensClothes = new Clothes(15, "Mens", "Black");
        Clothes womensClothes = new Clothes(8, "Womens", "Red");
        Dresser dresser = new Dresser(9, "Black",  mensClothes);
        Closet closet = new Closet(10, womensClothes);
        Room room = new Room(bed, closet, dresser);

        System.out.println("Closet clothes are " + room.getClothesFromCloset());
        System.out.println("Dresser clothes are " + room.getClothesFromDresser());

    }

}
