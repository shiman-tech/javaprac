import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class TestArrayList {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

         List<String> list1= new ArrayList<>(Arrays.asList("hello","puppy")) ;   //list is mutable
        // list= Arrays.asList("hello","puppy");     list is immutable
        // list.add("yo");                           throws an error
        list1.add("yo");
        System.out.println(list1);

        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println(list);

        list.add(1,5);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        

        

        list.set(2,1);
        System.out.println(list);

        list.remove(Integer.valueOf(4));
        System.out.println(list);

        System.out.println(list.contains(2));

        System.out.println(list.get(1));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        System.out.println(list.size());


        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));
        }

        for(Integer i:list)
        {
            System.out.print(i);
        }

        Iterator <Integer> it=list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next());
        }
        

        ArrayList <Integer> sublist=new ArrayList<>(list.subList(0,2));
        System.out.println(sublist);

        ArrayList<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,3,3,4,5,5));
        int n=Collections.frequency(l,3);
        System.out.println(n);

        







    }

    
    
    

    
}
