import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.*;

public class TestArray {

    public static void main(String [] args)
    {
       /*  int a=69420;
        int temp=a;
        int len=0;
        
        

        System.out.println(arr.length);              // length of array
         

        while(a>0)                                   // integer to array   (approach 1)      
        {
            a=a/10;
            len++;
            }
        System.out.println(len);// length of integer (approach 1)
        len= Integer.toString(temp).length();//length of integer(approach 2)
        System.out.println(len);

        int[] ar=new int[len];
        
        int i=len-1;
        while(temp>0)
        {
            int rem= temp%10;
            ar[i]=rem;
            temp=temp/10;
            i--;
            
        }
        System.out.println(Arrays.toString(ar));  


        int b=69420;

        int [] array=Integer.toString(b).chars().map(c->c-'0').toArray();   // integer to array  (appraoch 2);
        System.out.println(Arrays.toString(array)); */

        
        
       /*  List<String> list= new ArrayList<>(Arrays.asList("hello","puppy")) ;   //list is mutable
        // list= Arrays.asList("hello","puppy");     list is immutable
        // list.add("yo");                           throws an error
        list.add("yo");
        array =list.stream().mapToInt(str->str.length()).toArray();
        System.out.println(Arrays.toString(array)); */


        int [] arr={5,3,6,2,8,1};
        int [] arr2={5,3,6,2,8,2};
        int [] arr3=new int[10];

       System.out.println( Arrays.equals(arr,arr2));  //Comparison of two arrays

       Arrays.sort(arr);                             // soring in ascending order
       System.out.println(Arrays.toString(arr));

       System.out.println(Arrays.binarySearch(arr, 2)); /*searches the occurence of an 
                                                        element in a sorted array and return
                                                             its index*/

       Arrays.fill(arr3,1);  // initializes all elements of array to a specic value
       System.out.println(Arrays.toString(arr3));

       Arrays.fill(arr3,0,3,2); // fromIndex to toIndex(not included)
       System.out.println(Arrays.toString(arr3));

       int [] arr4=arr3;     // Arrys can be directly initialized to another array 
       System.out.println(Arrays.toString(arr4));

        arr4=  Arrays.copyOf(arr2,10); //copy an array to another array of new length
        System.out.println(Arrays.toString(arr4));


        // STREAMS operation on arrays

        IntStream s= Arrays.stream(arr); // converts an integer array to IntStream
        System.out.println(s);

        int sum=Arrays.stream(arr).sum(); //sum of all elements of array
        System.out.println(sum);

        int max= s.max().getAsInt();  // max element
                                      // a stream can be used only once so s cannot be used again
        System.out.println(max);
         
        int min=Arrays.stream(arr).min().getAsInt();  // min element
        System.out.println(min);

        arr=Arrays.stream(arr).map(x->x*2).toArray(); //mapping each element through as operation
        System.out.println(Arrays.toString(arr));


        arr=Arrays.stream(arr).filter(x->x>=10).toArray(); // filtering elements of an array
        System.out.println(Arrays.toString(arr));

        boolean m=Arrays.stream(arr).anyMatch(x->x<10);
        System.out.println(m);
        

        int product=Arrays.stream(arr).reduce(1,(a , b) -> a*b); //when working with corresponding elements of arrays
        System.out.println(product); 

        





                                                            





        





        
        


        

    

         
        

    }
    
}
