import java.util.Scanner;
public class checkFibonacci {

    static boolean perfectSquare(int n)
    {
        int sq=(int)Math.sqrt(n);
        if(sq*sq==n)
            return true;
        return false;    
    }

    static void isFibonacci(int n)
    {
        if(perfectSquare(5*n*n+4) || perfectSquare(5*n*n-4))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        isFibonacci(n);
        
    }
    
}
