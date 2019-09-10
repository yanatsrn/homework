package Z1;

import java.util.ArrayList;

import static java.lang.Math.abs;

public class Random {

    public static void main(String[] args) {

        int x;
        double y = 0;
        double sr;

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        x = (int) (Math.random() * (50 - (-50) + 1) + (-50));

        for (int i = 0; i < 5; i++) {
            numbers.add(x);
            x = (int) (Math.random() * (50 - (-50) + 1) + (-50));
            y += x;
            System.out.print(x + " ");
        }
        sr = abs(y / 5);
        System.out.println();
        System.out.println(sr);

    }
}
