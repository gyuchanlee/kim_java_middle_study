package mid_study.middle2.set;

import java.util.Arrays;

public class HashStart1 {

    public static void main(String[] args) {
        /**
         * 배열 기존 검색 - O(n)
         * n개 만큼 검색 시간이 증가함
         */
        
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;

        System.out.println(Arrays.toString(inputArray));


        int searchValue = 8;
        for (Integer i : inputArray) {
            if (i == searchValue) {
                System.out.println("i = " + i);
            }
        }
    }
}
