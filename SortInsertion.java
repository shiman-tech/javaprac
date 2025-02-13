import java.util.Scanner;

class SortInsertion{
    static void insertionsort(int a[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int current=a[i];
            int j=i-1;
            while(j>=0 && current<a[j])
            {
                a[j+1]=a[j];
                j--;
            }

            a[j+1]=current;
        }

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

        insertionsort(a, len);
        display(a, len);
    }
}