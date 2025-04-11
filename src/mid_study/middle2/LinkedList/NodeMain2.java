package mid_study.middle2.LinkedList;

public class NodeMain2 {

    public static void main(String[] args) {
        // 첫 노드 생성 및 연결 a -> b -> c
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        // toString
        System.out.println(first);
        System.out.println(first.next);
        System.out.println(first.next.next);
    }
}
