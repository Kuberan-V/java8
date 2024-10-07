package classandmethods;

import java.util.LinkedList;
import java.util.Queue;

public class Queuedem {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(10);
        q.add(8);
        q.add(5);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        System.out.println(q.poll());
    }


}
