package mid_study.middle2.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50000;

        System.out.println("=== MyArrayList 처음 추가 ===");
        addFirst(new MyArrayList<>(), size);
        System.out.println("=== MyArrayList 평균 추가 ===");
        addMiddle(new MyArrayList<>(), size); // 찾는데 O(1), 데이터 추가하고 인덱스 밀기 O(N)
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        System.out.println("=== MyArrayList 마지막 추가 ===");
        addLast(arrayList, size); // 찾는데 O(1), 데이터 추가하고 인덱스 밀기 O(1)

        System.out.println("=== MyArrayList 조회 ===");
        int loop = 10000;
        getIndex(arrayList, loop, 0); // 처음
        getIndex(arrayList, loop, size/2); // 중간
        getIndex(arrayList, loop, size - 1); // 마지막

        System.out.println("=== MyArrayList 검색 ===");
        search(arrayList, loop, 0); // 처음
        search(arrayList, loop, size/2); // 중간
        search(arrayList, loop, size - 1); // 마지막


        System.out.println("=== MyLinkedList 처음 추가 ===");
        addFirst(new MyLinkedList<>(), size); // O(1) -> 찾는데 첫번째이므로 시간이 안듬
        System.out.println("=== MyLinkedList 평균 추가 ===");
        addMiddle(new MyLinkedList<>(), size); // 찾는데 O(N), 데이터 추가 O(1)
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        System.out.println("=== MyLinkedList 마지막 추가 ===");
        addLast(linkedList, size); // 찾는데 O(N), 데이터 추가 O(1)

        System.out.println("=== MyLinkedList 조회 ===");
        getIndex(linkedList, loop, 0); // 처음
        getIndex(linkedList, loop, size/2); // 중간
        getIndex(linkedList, loop, size - 1); // 마지막

        System.out.println("=== MyLinkedList 검색 ===");
        search(linkedList, loop, 0); // 처음
        search(linkedList, loop, size/2); // 중간
        search(linkedList, loop, size - 1); // 마지막

    }

    private static void addFirst(MyList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.print("size = " + size);
        System.out.println(", time = " + (end - start) + "ms");
    }

    private static void addMiddle(MyList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long end = System.currentTimeMillis();
        System.out.print("size = " + size);
        System.out.println(", time = " + (end - start) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.print("size = " + size);
        System.out.println(", time = " + (end - start) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long end = System.currentTimeMillis();
        System.out.print("index = " + index);
        System.out.print(", loop = " + loop);
        System.out.println(", time = " + (end - start) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long end = System.currentTimeMillis();
        System.out.print("findValue = " + findValue);
        System.out.print(", loop = " + loop);
        System.out.println(", time = " + (end - start) + "ms");
    }
}
