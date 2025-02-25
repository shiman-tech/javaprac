import java.util.Arrays;

public class SortQuick2 {


    public static int partition(int a[],int low,int high)
    {
        int pivot=a[low];
        int i=low;
        int j=high;

        while(i<j){

        
            while(a[i]<=pivot && i<high)
            {
                i++;
            }

            while(a[j]>pivot && j>low)
            {
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }

        int temp=a[j];
        a[j]=a[low];
        a[low]=temp;

        return j;
    }
    public static void quicksort(int a[],int low,int high){


        int pivotIdx;

        if(low<high)
        {
            pivotIdx=partition(a,low,high);
            quicksort(a,low,pivotIdx-1);
            quicksort(a,pivotIdx+1,high);
        }
    }

    public static void main(String[] args)
    {
        int [] a={5,4,3,2,1};
        quicksort(a,0,a.length-1);

        System.out.println(Arrays.toString(a));
    }
    
}
