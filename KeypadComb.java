import java.util.ArrayList;

public class KeypadComb {

    static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void combinations(String digits,int idx,String combination,ArrayList<String> list)
    {

        if(idx==digits.length())
        {
            list.add(combination);
            return;

        }
        char curdigit=digits.charAt(idx);
        int mapidx=curdigit-'0';
        for(int i=0;i<keypad[mapidx].length();i++)
        {
            combinations(digits,idx+1,combination+keypad[mapidx].charAt(i),list);
            

        }
    }
    static String[] keypad2={"0",".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void keypadSequence(String digits)  //7777266 - san
    {
        String sequence="";


        for(int idx=0;idx<digits.length();idx++)
        {
            
            char digit=digits.charAt(idx);
            if((idx!=0 && digit==digits.charAt(idx-1)) || digit ==' ' )
            {
                continue;
            }
            int count=0;
            for(int i=idx+1;i<digits.length() && digits.charAt(i)==digit;i++)
            {
                count++;
            }
            int mapidx=digit-'0';
            System.out.println(count);
          /*  if(count >= (keypad[mapidx].length()))
            {
                System.out.println("invalid combination");
                return;
            }*/
            sequence=sequence+keypad2[mapidx].charAt(count);

        }

        System.out.println(sequence);



    }

    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<>();
        String digits="666";
        String combination="";
        combinations(digits,0,combination,list);
        System.out.println(list);

        keypadSequence("7777266");
    }
    
}
