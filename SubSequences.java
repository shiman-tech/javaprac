import java.util.HashSet;
public class SubSequences {

    public static void subsequence(String str,int idx,String newstr,HashSet<String> set)
    {

        if(idx==str.length())
        {
            set.add(newstr);
            return;
        }

        char c=str.charAt(idx);


        // wanna append
        
        subsequence(str,idx+1,newstr+c,set);
    

        // not wanna append
        subsequence(str,idx+1,newstr,set);
    }



    public static void main(String[] args) {
        
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        String newstr="";
        subsequence(str,0,newstr,set);

        System.out.println(set);

    }
    
}
