import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Queue;
public class TestPriorityQueue {

    public static void main(String [] args)
    {
        Queue <Integer> q= new PriorityQueue<>(); //min heap property

        PriorityQueue <Integer> qmax=new PriorityQueue<>(Collections.reverseOrder()); // max heap property

        // q.add(5);
        // q.add(3);
        // q.add(4);
        // q.add(1);

        q.offer(5);
        q.offer(3);
        q.offer(4);
        q.offer(1);

        

        System.out.println(q);

        qmax.offer(5);
        qmax.offer(3);
        qmax.offer(4);
        qmax.offer(1);

        System.out.println(qmax);

       System.out.println( q.poll());
       System.out.println(q);

       System.out.println(q.peek());

       q.remove(4);
       System.out.println(q);

       System.out.println(q.contains(5));

       while(!q.isEmpty())
       {
        System.out.println(q.poll());
       }

      // Collections.sort(q,Collections.reverseOrder());          #not applicable
      // System.out.println(q);
      //q.set()


    }
    
    


}
