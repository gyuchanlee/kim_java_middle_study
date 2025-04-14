package mid_study.middle2.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        /**
         * 사용자에게 n개의 정수를 입력받아서 List 에 저장, 입력 순서대로 출력
         * 0을 입력하면 종료
         */

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {
            int value = sc.nextInt();
            if (value == 0) {
                break;
            }
            list.add(value);
        }

        System.out.println("출력");
        System.out.println(list);
    }
}
