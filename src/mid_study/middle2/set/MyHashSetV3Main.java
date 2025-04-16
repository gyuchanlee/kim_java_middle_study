package mid_study.middle2.set;

public class MyHashSetV3Main {

    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        // 검색
        String searchValue = "A";
        boolean searchResult = set.contains(searchValue);
        System.out.println("set.contains(searchValue) = " + searchResult);

        MySet<Integer> set2 = new MyHashSetV3<>(10);
        set2.add(1);
        set2.add(2);
        set2.add(3);
    }
}
