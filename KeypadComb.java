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

    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<>();
        String digits="666";
        String combination="";
        combinations(digits,0,combination,list);
        System.out.println(list);
    }
    
}
