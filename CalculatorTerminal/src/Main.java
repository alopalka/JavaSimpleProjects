import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        mainMenu(calculator1);
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }



    private static void mainMenu(Calculator calculator) {
        clearScreen();
        System.out.println("Welcome to the CALCULATOR SYSTEMS \n\n\n");
        System.out.println("1 - Addition (x+y)");
        System.out.println("2 - Subtraction (x-y)");
        System.out.println("3 - Multiplication (x*y)");
        System.out.println("4 - Division (x/y)");
        System.out.println("5 - Exponentiation (x^y)");
        System.out.println("6 - Square Root");
        System.out.println("\n  0 - Exit");

        Scanner scanner = new Scanner(System.in);

        int userOption = 0;
        System.out.println("Your option: ");
        userOption = scanner.nextInt();

        clearScreen();
        System.out.println("Insert x:");
        double userX = scanner.nextDouble();
        clearScreen();
        System.out.println("Insert y:");
        double userY = scanner.nextDouble();

        switch (userOption) {
            case 1 -> calculator.add(userX, userY);
            case 2 -> calculator.subtract(userX, userY);
            case 3 -> calculator.multiply(userX, userY);
            case 4 -> calculator.division(userX, userY);
            case 5 -> calculator.exponentiation(userX, userY);
            case 6 -> calculator.squareRoot(userX);
            case 0 -> {
                clearScreen();
                System.out.println("\n\n Goodbye :-) \n\n");
            }
        }
        System.out.println(calculator.getCachedNumber());
    }
}