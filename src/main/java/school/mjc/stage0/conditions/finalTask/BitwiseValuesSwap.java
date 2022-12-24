package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public static void swap(int first, int second) {
        second^=first;
        first^=second;
        second^=first;
    }
}
