package us.rlit.oop.challenges.house;

public class Clothes {
    private int size;
    private String color;
    private String style;

    public Clothes(int size, String color, String style) {
        this.size = size;
        this.color = color;
        this.style = style;
    }

    @Override
    public String toString(){
        return color +  " " + style  + " size: " + size;
    }
}
