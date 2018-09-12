package us.rlit.rob;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Print every number
            //System.out.print(i);
            String fizzBuzz = "";
            fizzBuzz += i % 3 == 0 ? " fizz" : "";
            fizzBuzz += i % 5 == 0 ? " buzz" : "";

            // Just numbers that satisfy fizz buzz
            fizzBuzz = fizzBuzz.length() == 0 ? "" : i + fizzBuzz + "\n";
            System.out.print(fizzBuzz);

            // Print every number
            //System.out.println(fizzBuzz);
        }
    }
}
