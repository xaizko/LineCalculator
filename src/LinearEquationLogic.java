import java.util.Scanner;
public class LinearEquationLogic {
    private String coordPair1;
    private String coordPair2;
    private Scanner myScanner;
    private LinearEquation pair;
    public LinearEquationLogic() {
        myScanner = new Scanner(System.in);
        pair = null;
    }
    public void start() {
        System.out.println("Welcome to the Linear equation calculator!");
        getCord();
        printInfo();

        System.out.print("Would you like to enter another pair of coordinates? y/n: ");
        String choice = myScanner.nextLine();
        if (choice.equals("y")) {
            getCord();
            printInfo();
        } else if (choice.equals("n")) {
            System.out.println("Thank you for using the slope calculator, goodbye!");
        }
    }
    public void getCord() {
        System.out.print("Enter coordinate 1: ");
        String c1 = myScanner.nextLine();
        coordPair1 = c1;
        int a1 = Integer.parseInt(c1.substring(1,c1.indexOf(",")));
        int b1 = Integer.parseInt(c1.substring(c1.indexOf(" ")+1, c1.indexOf(")")));
        System.out.print("Enter coordinate 2: ");
        String c2 = myScanner.nextLine();
        coordPair2 = c2;
        int a2 = Integer.parseInt(c2.substring(1,c2.indexOf(",")));
        int b2 = Integer.parseInt(c2.substring(c2.indexOf(" ")+1, c2.indexOf(")")));
        pair = new LinearEquation(a1,a2,b1,b2);
    }

    public void printInfo() {
        System.out.println();
        System.out.println("The two points are: " + coordPair1 + " and " + coordPair2);
        System.out.println("The equation of the line between these points is: " + pair.equation());
        System.out.println("The slope of the line is: " + pair.slope());
        System.out.println("The y-intercept of the line is: " + pair.yIntercept());
        System.out.println("The distance between the two points is: " + pair.distance());
        System.out.println();

        System.out.print("Enter a value for x: ");
        double newX = myScanner.nextDouble();
        System.out.println("The point on the line is: " + pair.coordinateForX(newX));

    }
}
