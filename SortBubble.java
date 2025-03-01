import java.util.Scanner;

class SortBubble
{
    static void bubblesort(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    static void display(int a[], int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int len,a[];
        System.out.println("Enter the number of elements: ");
        len=sc.nextInt();
        
        a=new int[len];
        for(int i=0;i<len;i++)
        {
            a[i]=sc.nextInt();
        }

        bubblesort(a, len);
        display(a, len);
        
    }


}