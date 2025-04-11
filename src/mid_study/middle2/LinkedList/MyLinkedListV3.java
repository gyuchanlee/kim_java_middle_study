package mid_study.middle2.LinkedList;

/**
 * Node - 중첩 클래스로 구현
 * @param <E>
 */
public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node<E>(e);
        if (first == null) {
            // 최초로 넣는 경우
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    // V2 추가 코드
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            // 처음 위치에 넣는 경우
            newNode.next = first;
            first = newNode;
        } else {
            // 중간 위치에 넣는 경우
            Node<E> prev = getNode(index - 1);
            // 직전 노드의 다음 포인터를 신규 노드가 가르키도록 변경
            newNode.next = prev.next;
            // 직전 노드의 다음 포인터는 이제 신규 노드를 가르키도록 변경
            prev.next = newNode;
            // prev -> newNode -> (원래 prev.next)노드
        }
        size++;
    }

    // V2 삭제 코드
    public E remove(int index) {
        Node<E> removedNode = getNode(index);
        E removedItem = removedNode.item;
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

    public E set(int index, E e) {
        Node<E> x = getNode(index);
        E old = x.item;
        x.item = e;
        return old;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    // 인덱스의 노드값을 찾기 위해 for 문을 돌아 계속 링크를 타고 찾아가야함
    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(E e) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
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

    private static class Node<E> {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        // [A -> B -> C]
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");

            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append(" -> ");
                }
                x = x.next;
            }

            sb.append("]");
            return sb.toString();
        }
    }


}
