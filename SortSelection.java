import java.util.Scanner;
class SortSelection
{
    static void selectionsort(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int temp= a[i];
            a[i]=a[min];
            a[min]=temp;
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

        selectionsort(a, len);
        display(a, len);
        
    }
}