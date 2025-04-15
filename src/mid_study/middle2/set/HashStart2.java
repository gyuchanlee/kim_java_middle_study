package mid_study.middle2.set;

import java.util.Arrays;

public class HashStart2 {

    public static void main(String[] args) {
        /**
         * 배열 인덱스 검색 - O(1)
         */

        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;

        // 낭비되는 배열 공간이 많음
        System.out.println(Arrays.toString(inputArray));

        // O(1) - 인덱스 검색
        int searchValue = 8;
        Integer result = inputArray[searchValue];
        System.out.println(result);
    }
}