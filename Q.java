import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(5);
        q.add(6);
        q.add(23);
        q.add(5);
        q.add(57);
        q.add(54);
        q.add(545);
        q.add(51);
        q.add(89);
        System.out.println(q.peek());
        System.out.println(q.size());

        System.out.println(q);/////////////////////////////////////////////////.////////////////////;
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.contains(23));
        System.out.println(2<<(4));
    }
}
