package mid_study.middle2.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        /**
         * 해시 인덱스 -> 해시 충돌 해결 구현
         */
        // {1,2,5,8,14,99} , 자료구조를 담는 배열
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        System.out.println("buckets = " + Arrays.toString(buckets));

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); // 해시 충돌 -> 해시 인덱스 중복

        System.out.println("buckets = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 9;
        boolean isContains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " + isContains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        // 해시 인덱스 구하기
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if (!bucket.contains(value)) { // O(n) -> 같은 값은 안들어가도록 중복 체크 (hashSet)
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int search) {
        int hashIndex = hashIndex(search);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(search);
    }
    
    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
