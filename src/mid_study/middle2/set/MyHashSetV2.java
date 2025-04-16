package mid_study.middle2.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 해시 알고리즘을 적용한 Set 구현
 * java Object 메서드 재정의
 */
public class MyHashSetV2 {

    static final int DEFAULT_INIT_CAPACITY = 16;
    private LinkedList<Object>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INIT_CAPACITY;

    public MyHashSetV2() {
        initBuckets(capacity);
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets(capacity);
    }

    private void initBuckets(int capacity) {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {

        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];

        // 중복 값을 가진 경우 false
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];

        return bucket.contains(value);
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];

        // index 가 아닌 Object 실제 값을 지우도록 한다
        boolean result = bucket.remove(value);
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


    private int hashIndex(Object value) {
        // 해시코드 : - 값 나오면 양수로 반환 후, 해시 인덱스 연산
        return Math.abs(value.hashCode()) % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
