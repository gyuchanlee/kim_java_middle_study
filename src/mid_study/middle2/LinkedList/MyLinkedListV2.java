package mid_study.middle2.LinkedList;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            // 최초로 넣는 경우
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    // V2 추가 코드
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) {
            // 처음 위치에 넣는 경우
            newNode.next = first;
            first = newNode;
        } else {
            // 중간 위치에 넣는 경우
            Node prev = getNode(index - 1);
            // 직전 노드의 다음 포인터를 신규 노드가 가르키도록 변경
            newNode.next = prev.next;
            // 직전 노드의 다음 포인터는 이제 신규 노드를 가르키도록 변경
            prev.next = newNode;
            // prev -> newNode -> (원래 prev.next)노드
        }
        size++;
    }

    // V2 삭제 코드
    public Object remove(int index) {
        Node removedNode = getNode(index);
        Object removedItem = removedNode.item;
        if (index == 0) {
            // 시작 변수가 삭제할 노드의 다음 노드를 바로 가르키도록 변경
            first = removedNode.next;
        } else {
            Node prev = getNode(index - 1);
            // 직전 노드 -- (삭제 대상 노드) --> 다음 노드
            prev.next = removedNode.next;
        }

        removedNode.item = null;
        removedNode.next = null;
        size--;

        return removedItem;
    }

    public Object set(int index, Object e) {
        Node x = getNode(index);
        Object old = x.item;
        x.item = e;
        return old;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    // 인덱스의 노드값을 찾기 위해 for 문을 돌아 계속 링크를 타고 찾아가야함
    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object e) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (x.item.equals(e)) {
                return index;
            }
            index++;
        }

        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
