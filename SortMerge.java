import java.util.Scanner;

class SortMerge{

    static void conquer(int a[],int st,int mid,int ed)
    {
        int merge[]=new int[ed-st+1];
        int indx1=st;
        int indx2=mid+1;
        int x=0;
        while(indx1<= mid && indx2<= ed)
        {
            if(a[indx1]<=a[indx2])
            {
                merge[x]=a[indx1];
                x++;indx1++;

            }
            if(a[indx1]>=a[indx2])
            {
                merge[x]=a[indx2];
                x++;indx2++;
            }
        }
        while(indx1<=mid)
        {
            merge[x]=a[indx1];
            x++;indx1++;

        }
        while(indx2<=ed)
        {
            merge[x]=a[indx2];
            x++;indx2++;
        }

        for(int i=0,j=st;i<merge.length;i++,j++)
        {
            a[j]=merge[i];
        }
        


    }
    static void divide(int a[],int st,int ed)
    {

        if(st>=ed)
        {
            return;
        }

        int mid=st+(ed-st)/2;
        
        divide(a,st,mid);
        divide(a,mid+1,ed);
        conquer(a,st,mid,ed);

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

        divide(a,0,len-1);
        display(a, len);
    }
    
}