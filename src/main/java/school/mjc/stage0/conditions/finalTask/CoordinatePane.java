package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (y == 0 && x == 0) {
            System.out.println("zero");
        } else if (x > 0) {
            if (y > 0) System.out.println("first");
            else System.out.println("fourth");
        } else {
            if (y > 0) System.out.println("second");
            else System.out.println("third");
        }
    }
}
