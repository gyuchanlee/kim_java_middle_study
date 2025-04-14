package mid_study.middle2.list.test.ex1;

import java.util.List;

public class ListEx1 {

    public static void main(String[] args) {
        // 배열을 리스트로 바꾸기
        List<Integer> student = List.of(90, 80, 70, 60 ,50);

        int total = 0;
        for (int i = 0; i < student.size(); i++) {
            total += student.get(i);
        }

        double average = (double) total / student.size();
        System.out.println("총합 = " + total);
        System.out.println("평균 = " + average);
    }
}
