package mid_study.middle2.LinkedList;

public class MyLinkedListV3Main {

    public static void main(String[] args) {

        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        String str = stringList.get(0);
        System.out.println("str: " + str);

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer: " + integer);
    }
}
