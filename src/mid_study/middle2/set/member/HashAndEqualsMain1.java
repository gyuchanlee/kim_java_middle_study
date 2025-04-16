package mid_study.middle2.set.member;

import mid_study.middle2.set.MyHashSetV2;

public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        // 해시코드, equals 구현 X
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);

        System.out.println(set); // 중복 등록

        // 검색 실패
        MemberNoHashNoEq search = new MemberNoHashNoEq("A");
        System.out.println("search.hashCode() = " + search.hashCode());
        System.out.println("set.contains(search) = " + set.contains(search));


        /**
         * 해시코드도 다르고, equals 또한 틀림
         * - Set에 데이터 중복 삽입 / 검색 실패
         */
    }
}
