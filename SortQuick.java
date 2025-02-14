import java.util.Scanner;

class SortQuick {


    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static int partition(int a[],int st,int ed)
    {
       int pivot= a[ed];
       int idx=st-1;
       for(int i=st;i<ed;i++)
       {
        if(a[i]<=pivot)
        {
            idx++;
            swap(a,idx,i);
        }

       }
       idx++;
       swap(a,idx,ed);
       return idx;


    }
    static void quicksort(int a[],int st,int ed)
    {

        if(st>=ed)
            return;

        int pivindx=partition(a,st,ed);
        quicksort(a,st,pivindx-1);
        quicksort(a,pivindx+1,ed);


    }

  static void display(int a[], int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int len,a[];
        System.out.println("Enter the number of elements: ");
        len=sc.nextInt();
        
        a=new int[len];
        for(int i=0;i<len;i++)
        {
            a[i]=sc.nextInt();
        }

        quicksort(a,0, len-1);
        display(a, len);
    }
 }
    

