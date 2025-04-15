package mid_study.middle2.set;

import java.util.Arrays;

public class MyHashSetV0 {

        private int[] elements = new int[10];
        private int size = 0;

        // O(N) + O(N)
        public boolean add(int value) {
                // 중복 체크
                if (contains(value)) {
                        return false;
                }

                elements[size] = value;
                size++;
                return true;
        }

        // O(N)
        public boolean contains(int value) {
                for (int element : elements) {
                        if (element == value) {
                                return true;
                        }
                }
                return false;
        }

        public int size() {
                return size;
        }

        @Override
        public String toString() {
                return "MyHashSetV0{" +
                        // 빈값 안보이게 size 까지만 잘라서 보여줌
                        "elements=" + Arrays.toString(Arrays.copyOf(elements, size)) +
                        ", size=" + size +
                        '}';
        }
}
