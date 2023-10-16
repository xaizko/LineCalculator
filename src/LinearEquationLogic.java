import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner myScanner;
    public LinearEquationLogic() {
        myScanner = new Scanner(System.in);
    }
    public void start() {
        System.out.println("Welcome to the Linear equation calculator!");
        getCord();
    }
    public void getCord() {
        System.out.print("Enter coordinate 1: ");
        String c1 = myScanner.nextLine();
        int a1 = Integer.parseInt(c1.substring(1,c1.indexOf(",")));
        int b1 = Integer.parseInt(c1.substring(c1.indexOf(" ")+1, c1.indexOf(")")));
        System.out.print("Enter coordinate 2: ");
        String c2 = myScanner.nextLine();
        int a2 = Integer.parseInt(c2.substring(1,c2.indexOf(",")));
        int b2 = Integer.parseInt(c2.substring(c2.indexOf(" ")+1, c2.indexOf(")")));
        LinearEquation pair = new LinearEquation(a1,a2,b1,b2);
    }
}
