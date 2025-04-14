package mid_study.middle2.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        /**
         * n개의 정수를 입력 받아서 List 보관
         * 보관한 정수의 합계 / 평균 계산
         */

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        int total = 0;
        double average = 0d;

        while (true) {
            int value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            list.add(value);
            total += value;
        }
        average = (double) total / list.size();

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
