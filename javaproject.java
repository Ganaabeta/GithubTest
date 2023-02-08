package Exam;

import java.util.ArrayList;
import java.util.List;

public class ThirdOne {

    // fuunnn
    public static List<Integer> hailstoneSequence(int n) {
        List<Integer> list = new ArrayList<Integer>();
        while (n != 1) {
            list.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        list.add(n);
        return list;
    }

    public static void main(String[] args) throws java.lang.Exception {
        int n = 20;
        System.out.println(hailstoneSequence(n));
    }
}
