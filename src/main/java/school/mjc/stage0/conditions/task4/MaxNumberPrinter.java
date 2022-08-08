package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max = first > second ? first : second;
        System.out.println(third > max ? third : max);
    }
}
