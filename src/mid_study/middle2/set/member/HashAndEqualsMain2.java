package mid_study.middle2.set.member;

import mid_study.middle2.set.MyHashSetV2;

public class HashAndEqualsMain2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        // 해시코드, equals 구현 X
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);

        System.out.println(set); // 중복 등록

        // 검색 실패
        MemberOnlyHash search = new MemberOnlyHash("A");
        System.out.println("search.hashCode() = " + search.hashCode());
        System.out.println("set.contains(search) = " + set.contains(search));


        /**
         * 해시코드는 같지만, equals 가 다름
         * - Set에 데이터 중복 삽입 / 검색 실패
         * - 중복 삽입 : equals() 로 중복 체크를 수행하는데 재정의하지 않았음
         */
    }
}
