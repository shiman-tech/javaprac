import java.util.*;

public class TestArrayDeque {
    public static void main(String[] args) {

      
        ArrayDeque<Integer> q = new ArrayDeque<>();


        q.offerFirst(1);
        q.addFirst(3);
        q.offerLast(5);
        q.addLast(4);
        q.addLast(7);

        System.out.println(q); 

        System.out.println(q.peekLast());

        System.out.println(q.peekFirst());

        q.pollFirst();
        q.pollLast();

        q.remove(4);

        System.out.println(q);

        System.out.println(q.contains(5));

        while(!q.isEmpty())
        {
            System.err.println(q.poll());
        }



        
    }
}

        
    

