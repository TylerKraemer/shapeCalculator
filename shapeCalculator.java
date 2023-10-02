import java.util.Scanner;
/**
This program asks the user for what shape they want to calculate the area and perimeter for.
The program then asks the user for the dimensions of the indicated shape and prints the area and perimeter.
 */
public class shapeCalculator {
    /**
     * This function prints the welcome banner for the program.
     */
    public static void printWelcome() {
        System.out.println("*".repeat(65));
        System.out.println(" ".repeat(23) + "SHAPE CALCULATOR");
        System.out.println("*".repeat(65));
        System.out.println();

    }

    /**
     * This function prints the selection menu for which shape the user wants to calculate.
     */
    public static void printMenu() {
        System.out.print("Enter C for circle, R for rectangle, or T for triangle: ");
    }

    /**
     * This function reads the user input for the radius of the circle.
     * The function then calculates and prints the area and circumference of the circle.
     */
    public static void calculateCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.pow(radius, 2) * Math.PI;
        double circleCircumference  = radius * 2 * Math.PI;
        System.out.printf("The area of the circle is %.2f and the circumference is %.2f", circleArea, circleCircumference);
        System.out.println();
    }

    /**
     * This function reads the user input for the length and width of a rectangle.
     * The function then calculates and prints the area and perimeter of the rectangle.
     */
    public static void calculateRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length and width: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double rectangleArea = length * width;
        double rectanglePerimeter = length + length + width + width;
        System.out.printf("The area of the rectangle is %.2f and the perimeter is %.2f", rectangleArea, rectanglePerimeter);
        System.out.println();
    }

    /**
     * This function reads the user input for the length of 3 sides for a triangle.
     * The function then calculates and prints the perimeter of the triangle.
     * Since it is impossible to find the area of a triangle only knowing the lengths of 3 sides the area is printed with the same value as the perimeter.
     */
    public static void calculateTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lengths of the three sides: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        double trianglePerimeter = side1 + side2 + side3;
        System.out.printf("The are of the Triangle is %.2f and the perimeter is %.2f", trianglePerimeter, trianglePerimeter);
        System.out.println();
    }

    /**
     * This is the main function that prints all the different calculations for the shapes and reads which shape the user wants to calculate.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        printWelcome();
        do {
            printMenu();
            choice = scanner.next().toUpperCase().trim().charAt(0);
            scanner.nextLine();

            switch (choice) {
                case 'C':
                    calculateCircle();
                    break;
                case 'R':
                   calculateRectangle();
                   break;
                case 'T':
                   calculateTriangle();
                    break;
                case 'Q':
                    System.out.println("Thank you for using Shape Calculator!");
                    return;
                default:
                    System.out.println("That is not a recognized shape.");
            }

        } while(choice != 'Q');



    }
}