package us.rlit.inteface;

public class DeskPhone implements Telephone {
    private long myNumber;
    private boolean isRinging;

    public DeskPhone(long myNumber) {
        this.myNumber = myNumber;
        isRinging = false;
    }

    @Override
    public void powerOn() {
        System.out.println("Phone is always on.");
    }

    @Override
    public void dial(long phoneNumber) {
        System.out.printf("Calling " + phoneNumber);

    }

    @Override
    public void answer() {
        System.out.println("Answering telephone... Halo");

    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
