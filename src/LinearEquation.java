import static java.lang.Integer.parseInt;

public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }


    public double distance() {
        double dx = Math.pow(x2-x1, 2);
        double dy = Math.pow(y2-y1, 2);
        return (double) Math.round(Math.sqrt(dx + dy) * 100) / 100;
    }

    public double slope() {
        double slope = (double) (y2 - y1) / (x2-x1);
        return (double) Math.round(slope * 100) / 100;
    }

    public double yIntercept() {
        double slope = slope();
        double b = y1 - (slope * x1);
        return (double) Math.round(b * 100) / 100;
    }
    public String equation() {
        int y3 = y2-y1;
        int x3 = x2-x1;
        if (y3 == 0) {
            return "y = " + yIntercept();
        } else {
            return "y = " + y3 + "/" + x3 + "x + " + yIntercept();
        }
    }

    public String coordinateForX(double x) {
        double newY = x*slope()+yIntercept();
        return "(" + x + ", " + newY + ")";
    }
}
