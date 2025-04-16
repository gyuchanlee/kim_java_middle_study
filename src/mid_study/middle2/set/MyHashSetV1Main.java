package mid_study.middle2.set;

public class MyHashSetV1Main {

    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); // 해시 충돌
        System.out.println("set = " + set);

        // 검색
        int searchValue = 9;
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);

        // 삭제
        boolean removed = set.remove(searchValue);
        System.out.println("removed = " + removed);

        System.out.println(set);
    }
}
