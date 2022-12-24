package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result = dividend / divider;
        if (result * divider == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("division by zero");
        }
    }
}
