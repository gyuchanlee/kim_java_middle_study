package mid_study.middle2.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + charA);
        System.out.println("(int) charA = " + (int) charA);
        System.out.println("charB = " + charB);
        System.out.println("(int) charB = " + (int) charB);

        // 문자열 hashCode 생성
        int hashCodeA = hashCode("A");
        int hashCodeB = hashCode("B");
        int hashCodeAB = hashCode("AB");
        System.out.println("hashCode('A') = " + hashCodeA);
        System.out.println("hashCode('B') = " + hashCodeB);
        System.out.println("hashCode('AB') = " + hashCodeAB);

        // hashIndex
        int hashIndexA = hashIndex(hashCodeA);
        System.out.println("hashIndexA = " + hashIndexA);
        int hashIndexB = hashIndex(hashCodeB);
        System.out.println("hashIndexB = " + hashIndexB);
        int hashIndexAB = hashIndex(hashCodeAB);
        System.out.println("hashIndexAB = " + hashIndexAB);
    }

    static int hashCode(String str) {
        // 65 + 66
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
