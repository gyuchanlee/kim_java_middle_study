package mid_study.middle2.list.test.ex1;

public class ArrayEx1 {

    public static void main(String[] args) {
        // 배열을 리스트로 바꾸기 - 배열 예시
        int[] student = {90, 80, 70, 60 ,50};

        int total = 0;
        for (int i = 0; i < student.length; i++) {
            total += student[i];
        }

        double average = (double) total / student.length;
        System.out.println("총합 = " + total);
        System.out.println("평균 = " + average);
    }
}
