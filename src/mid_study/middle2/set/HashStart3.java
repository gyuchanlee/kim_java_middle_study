package mid_study.middle2.set;

import java.util.Arrays;

public class HashStart3 {

    public static void main(String[] args) {
        /**
         * 메모리 낭비
         * - 0 ~ 99 범위
         */

        // 입력 {1, 2, 5, 8, 14, 99}
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;

        // 낭비되는 배열 공간이 많음
        System.out.println(Arrays.toString(inputArray));

        // O(1) - 인덱스 검색
        int searchValue = 99;
        Integer result = inputArray[searchValue];
        System.out.println(result);
    }
}