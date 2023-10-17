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
        return  Math.round(Math.sqrt(dx+dy * 100) / 100);
    }

    public double slope() {
        double slope = (y2-y1) / (x2-x1);
        return Math.round(slope * 100) / 100;
    }

    public double yIntercept() {
        double slope = slope();
        double b = y1 / (slope * x1);
        return Math.round(b * 100) / 100;
    }
//    public String equation() {
//
//    }
}
