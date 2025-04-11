package mid_study.middle2.LinkedList;

public class NodeMain1 {

    public static void main(String[] args) {
        // 첫 노드 생성 및 연결 a -> b -> c
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색");

        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
