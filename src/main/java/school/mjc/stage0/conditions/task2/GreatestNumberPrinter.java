package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    int res;
    public void printGreatest(int first, int second) {
        if (first >= second)
            res = first;
        else res = second;
        System.out.println(res);
    }
}
