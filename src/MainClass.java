import java.util.Collections;
import java.util.PriorityQueue;

public class MainClass {

    public static void main(String[] args) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new Pair(10, 20));
        pq.add(new Pair(20, 10));

        pq.stream().forEach(pair -> System.out.println(pair.toString()));
    }

}
