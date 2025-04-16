package mid_study.middle2.set.member;

import mid_study.middle2.set.MyHashSetV2;

public class HashAndEqualsMain3 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        // 해시코드, equals 구현 X
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);

        System.out.println(set); // 중복 등록 불가

        // 검색 성공
        Member search = new Member("A");
        System.out.println("search.hashCode() = " + search.hashCode());
        System.out.println("set.contains(search) = " + set.contains(search));


        /**
         * 해시 코드도 id 기반으로 생성해서 같고, equals 또한 id 기반으로 비교를 수행
         */
    }
}
