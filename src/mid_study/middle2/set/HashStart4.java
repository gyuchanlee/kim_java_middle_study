package mid_study.middle2.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        /**
         * 해시 인덱스 -> 인덱스로 사용
         * value % CAPACITY
         */
        // {1,2,5,8,14,99}
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] intArray = new Integer[CAPACITY];
        intArray[hashIndex(1)] = 1;
        intArray[hashIndex(2)] = 2;
        intArray[hashIndex(5)] = 5;
        intArray[hashIndex(8)] = 8;
        intArray[hashIndex(14)] = 14;
        intArray[hashIndex(99)] = 99;

        System.out.println("Arrays.toString(intArray) = " + Arrays.toString(intArray));

        // 검색 - 14
        int searchValue = 14;
        Integer result = intArray[hashIndex(searchValue)];
        System.out.println("result = " + result);

    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
