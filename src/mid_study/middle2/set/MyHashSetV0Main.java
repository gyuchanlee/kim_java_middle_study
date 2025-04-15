package mid_study.middle2.set;

public class MyHashSetV0Main {

    public static void main(String[] args) {
        MyHashSetV0 hashSet = new MyHashSetV0();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        System.out.println(hashSet);

        boolean result = hashSet.contains(4);
        System.out.println("중복 데이터 확인 결과 = " + result);
        System.out.println("hashSet.contains(3) = " + hashSet.contains(3));
        System.out.println(hashSet);
    }
}
