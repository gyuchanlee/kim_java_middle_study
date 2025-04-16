package mid_study.middle2.set;

import mid_study.middle2.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        // Object 기본 해시코드 -> 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        System.out.println(Integer.toHexString(obj1.hashCode()));
        System.out.println(Integer.toHexString(obj2.hashCode()));

        // 각 클래스마다 hashCode 를 이미 오버라이딩
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        // hashCode 는 음수 값 들어올 수 있음
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        // 같은 지 비교해보기 -> 인스턴스는 다르지만 equals로 id 같으면 같도록 오버라이딩
        Member memberA = new Member("idA");
        Member memberB = new Member("idA");

        // equals, hashCode 오버라이딩 하지 않은 경우, 한 경우 비교
        System.out.println("memberA == memberB : " + (memberA==memberB));
        System.out.println("memberA == memberB (equals) : " + (memberA.equals(memberB)));
        System.out.println("memberA.hashCode() = " + memberA.hashCode());
        System.out.println("memberB.hashCode() = " + memberB.hashCode());

    }
}
