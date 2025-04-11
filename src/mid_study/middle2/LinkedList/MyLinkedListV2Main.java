package mid_study.middle2.LinkedList;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println("데이터 추가");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 첫번째 항목 추가, 삭제
        list.add(0,"d"); //O(1)
        System.out.println(list);

        list.remove(0); // O(1)
        System.out.println(list);

        // 중간 항목 추가, 삭제
        list.add(1, "e"); // O(n)
        System.out.println(list);

        list.remove(1); // O(n)
        System.out.println(list);

        /**
         * 실행결과 -> 추가 / 삭제에 시간이 드는 것이 아니라
         * 중간에 있을 때, 대상을 찾는 시간 O(n)이 많이 걸림
         */
    }
}
