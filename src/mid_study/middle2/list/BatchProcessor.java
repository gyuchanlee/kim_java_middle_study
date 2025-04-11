package mid_study.middle2.list;

/**
 * 추상화 - 의존 관계 주입
 */
public class BatchProcessor {

    // 추상화를 통해 인터페이스에 의존 하도록
    private MyList<Integer> list;

    // 생성자를 통해 구체적인 클래스를 밖에서 결정하도록 미룸 -> 의존 관계 주입
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i); // 앞에 계속해서 추가
        }
        long end = System.currentTimeMillis();
        System.out.println("size = " + size);
        System.out.println("Batch processing time: " + (end - start) + " ms");
    }
}
