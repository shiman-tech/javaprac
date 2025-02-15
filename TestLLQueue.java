import java.util.LinkedList;
import java.util.Collections;
import java.util.Queue;

public class TestLLQueue {

    public static void main(String[] args) {
        
    Queue <Integer> q=new LinkedList<> ();

    q.offer(5);
    q.offer(3);
    q.offer(4);
    q.offer(1);

    System.out.println(q);

    System.out.println(q.contains(4));
    System.out.println(q.peek());
    System.out.println(q.isEmpty());

   // q.set(1,6); not applicable
   
   q.poll();
   
   System.out.println(q);

   q.remove(4);
   
   System.out.println(q);
   


   while(!q.isEmpty())
    {
        System.err.println(q.poll());
    }

    Collections.sort(q);

    





    }
}
