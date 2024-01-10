import java.util.Scanner;

public class stringtoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to convert to an integer: ");
        String inputString = scanner.nextLine();

        try {
            int convertedInteger = Integer.parseInt(inputString);
            System.out.println("Output Integer: " + convertedInteger);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer string.");
        }
        scanner.close();
    }
}
