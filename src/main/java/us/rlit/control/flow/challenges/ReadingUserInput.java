package us.rlit.control.flow.challenges;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 1;
        int sum = 0;
        int number;
        while(numbers <= 10) {
            System.out.println("Enter number #" + numbers);
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                numbers ++;
                sum += number;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum " + sum);
        scanner.close();

    }
}
