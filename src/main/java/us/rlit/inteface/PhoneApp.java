package us.rlit.inteface;

public class PhoneApp {
    public static void main(String[] args) {
        Telephone myPhone = new DeskPhone(525_5974);
        myPhone.powerOn();
        myPhone.dial(525_6000);
        myPhone.isRinging();
    }
}
