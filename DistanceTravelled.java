package coding;

import java.util.Scanner;

public class DistanceTravelled {
    private int t1, t2;
    private int a = 5, u = 10;

    public void calculate() {
        Scanner in = new Scanner(System.in);
        t1 = in.nextInt();
        t2 = in.nextInt();

        int distance1 = u * t1 + ((a * t1 * t1) / 2);
        int distance2 = u * t2 + ((a * t2 * t2) / 2);

        System.out.println(distance1);
        System.out.println(distance2);
    }

    public static void main(String[] args) {
        DistanceTravelled dt = new DistanceTravelled();
        dt.calculate();
    }
}