import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class TestComparator
{

     static Comparator<Integer> comp=new Comparator<Integer>(){

        public int compare(Integer i,Integer j)
        {
            if(String.valueOf(i).length()>String.valueOf(j).length())
            return 1;

            else 
            return -1;
        }



    };

    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(123,22,1,3746));
        Collections.sort(list,comp);
        System.out.println(list);


    }
}
