import java.util.Scanner;
public class LinearEquationLogic {
    private String coordPair1;
    private String coordPair2;
    private Scanner myScanner;
    private LinearEquation pair;
    private boolean continueSlope = true;
    public LinearEquationLogic() {
        myScanner = new Scanner(System.in);
        pair = null;
    }
    public void start() {
        System.out.println("Welcome to the Linear equation calculator!");
        getCord();
        System.out.print(pair.printInfo());
        System.out.print(pair.printCalcX());
        while (continueSlope){
            System.out.println();
            System.out.print("Would you like to enter another pair of coordinates? y/n: ");
            String choice = myScanner.nextLine();
            if (choice.equals("y")) {
                getCord();
                System.out.println(pair.printInfo());
                if (pair.getX3() != 0) {
                    System.out.print(pair.printCalcX());
                }
            } else if (choice.equals("n")) {
                continueSlope = false;
                System.out.println("Thank you for using the slope calculator, goodbye!");
            } else {
                continueSlope = false;
                System.out.println("Thank you for using the slope calculator, goodbye!");
            }
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
        pair = new LinearEquation(a1,b1,a2,b2);
    }



}
