package us.rlit.oop.composition.stricter;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSize;
    private int cardSlots;

    public MotherBoard(String model, String manufacturer, int ramSize, int cardSlots)   {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSize = ramSize;
        this.cardSlots = cardSlots;
    }

    public void loadProgram(String programName) {
        System.out.println("Loaded program " + programName);
    }


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getCardSlots() {
        return cardSlots;
    }
}
