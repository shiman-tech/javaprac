import java.util.HashSet;
import java.util.Collections;
import java.util.Set;
import java.util.Iterator;

public class TestHashSet {
    public static void main(String[] args) {

        HashSet <Integer> set=new HashSet<> ();

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

        
        

        
    }
    
}
