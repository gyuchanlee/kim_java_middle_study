package mid_study.middle2.list;

public class BatchProcessorMain {

    public static void main(String[] args) {

        MyList<Integer> list = new MyLinkedList<>();
//        MyList<Integer> list = new MyArrayList<>();

        BatchProcessor batchProcessor = new BatchProcessor(list);

        batchProcessor.logic(3000);
    }
}
