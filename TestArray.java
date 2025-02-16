import java.util.Arrays;

public class TestArray {

    public static void main(String [] args)
    {
        int a=69420;
        int temp=a;
        int len=0;
        
        int [] arr={5,3,6,2,8,1};

        int [] arr2={5,3,6,2,8,1};

        System.out.println(arr.length);              // length of array
         

        while(a>0)                                   // integer to array          
        {
            a=a/10;
            len++;
            }
        System.out.println(len);// length of integer                  
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
        
        

    

         
        

    }
    
}
