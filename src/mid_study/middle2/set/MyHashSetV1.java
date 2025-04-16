package mid_study.middle2.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 해시 알고리즘을 적용한 Set 구현
 */
public class MyHashSetV1 {

    static final int DEFAULT_INIT_CAPACITY = 16;
    LinkedList<Integer>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INIT_CAPACITY;

    public MyHashSetV1() {
        initBuckets(capacity);
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets(capacity);
    }

    private void initBuckets(int capacity) {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {

        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];

        // 중복 값을 가진 경우 false
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];

        return bucket.contains(value);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];

        // index 가 아닌 Object 실제 값을 지우도록 한다
        boolean result = bucket.remove(Integer.valueOf(value));
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    private int hashIndex(int value) {
        return value % capacity;
    }
}
