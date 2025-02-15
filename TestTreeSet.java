import java.util.TreeSet;
import java.util.Collections;
import java.util.Set;
import java.util.Iterator;

public class TestTreeSet {
    public static void main(String[] args) {

        TreeSet <Integer> set=new TreeSet<> ();

        set.add(3);
        set.add(4);
        set.add(2);
        set.add(5);
        set.add(1);
        set.add(2);
        
        
        System.out.println(set);

        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.remove(1);
        System.out.println(set);

        Iterator<Integer> it= set.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

        System.out.println(set.first());

        System.out.println(set.last());

        System.out.println(set.higher(2));

        System.out.println(set.lower(4));

        System.out.println(set.ceiling(2));

        System.out.println(set.floor(4));

        


        

        
    }
    
}