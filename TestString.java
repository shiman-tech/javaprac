import java.util.Arrays;

public class TestString {

    public static void main(String[] args) {
        
        String s= "Hello";
        String sdummy=s;
        
        int len=s.length();
        System.out.println("len"); // length of a string

        System.out.println(s.charAt(1));

        for(int i=0;i<s.length();i++)    // iterating over a string
        {
            System.out.print(s.charAt(i));
        }
        
        int a =3;
        boolean b=true;

        String s1=String.valueOf(a);  // to convert any datatype to string
        System.out.println();

        String s2=String.valueOf(b);
        System.out.println(s2);

        String s3= s.substring(1,4);  // obtain a substring 
        System.out.println(s3);

        String str="  puppy the king  ";
        s1= str.trim();            // removes leading and trailing white spaces
        System.out.println(s1);

        int index=s.indexOf('l');  // returns the index of first occurence of character
        System.out.println(index);

        index=s.lastIndexOf('l');  // returns the index of last occurence of character
        System.out.println(index);

        String[]  sarr=s.split("");  // to split a string and convert it into string array
        System.out.println(Arrays.toString(sarr));

        char[] carr=s.toCharArray();      // to convert a string into a character array
        System.out.println(Arrays.toString(carr));

        s2=s.toLowerCase();      //to convert a string to lowercase
        System.out.println(s2);

        s2=s.toUpperCase();      // to convert a string to uppercase
        System.out.println(s2);

 // STRING COMPARISONS

        b=s.equals(sdummy);
        System.out.println(b);

        b=s.equalsIgnoreCase(s2);
        System.out.println(b);

        int val=s.compareTo(sdummy);
        if(val==0)
            System.out.println(" s is equal to sdummy");
        else if(val<0)
            System.out.println("s is lexicographically smaller than sdummy ");   
        else
            System.out.println("s is lexicographically larger than s dummy");

         val=s.compareToIgnoreCase(sdummy);
         System.out.println(" s is equal to sdummy");


         b=s.startsWith("he");      // to check prefix
         System.out.println(b);

         b=s.endsWith("llo");       // to check suffix
         System.out.println(b);

         b=s.contains("pop");      // to check the occurence of a substring
         System.out.println(b);
         

          // STRING BUILDER OPERATIONS

         StringBuilder strB= new StringBuilder("Choppermon");
         System.out.println(strB);

         String string=strB.toString();  // string builder to string conversion
         System.out.println(string);

         string=strB.reverse().toString();  // reversing a string(applies to the original itslef)
         System.out.println(string);

         string=strB.append("peppa").toString();  // append a character or a string to the end of another stirng
         System.out.println(string);

         string=strB.insert(0,"peppa").toString(); // insert a character or a string to an of an another string
         System.out.println(string);

         string=strB.delete(0,5).toString();
         System.out.println(string);

         strB.setCharAt(0,'P'); // over writes an existing character in a string
         System.out.println(strB);



         // VERY IMPORTANT STUFF         

         // regex doesnt work with replace


         String S=" IAM shiman KUMAR@69_420";
         String res="";                  // empty string declaration



         res=S.replace("man","Man"); 
         System.out.println(res);



         res=S.replaceAll("\\d","He"); // \d- digits(works on individual digits)
         System.out.println(res);

         res=S.replaceFirst("\\d","He"); // \d- digits(works on individual digits)
         System.out.println(res);

         res=S.replaceFirst("\\d+","He"); // \d+ - replaces first occurence of one or more digits
         System.out.println(res);

         res=S.replaceAll("\\D","He"); // \D - everything except digits
         System.out.println(res);                        // non digit character

         res=S.replaceAll("\\D+","He"); 
         System.out.println(res);


         System.out.println();
         res=S.replaceAll("\\w","He"); // \w - word character(letters,digits and underscore))
         System.out.println(res);

         res=S.replaceFirst("\\w","He"); 
         System.out.println(res);

         res=S.replaceFirst("\\w+","He"); // \w+ - replaces first occurence of one or more word character
         System.out.println(res);

         res=S.replaceAll("\\W","He"); // \W - everything except word character
         System.out.println(res);                        // non word character - special character including whitespace

         res=S.replaceAll("\\W+","He"); 
         System.out.println(res);




         System.out.println();
         res=S.replaceAll("\\s","He"); // \w - whitespace character
         System.out.println(res);

         res=S.replaceFirst("\\s","He"); 
         System.out.println(res);

         res=S.replaceFirst("\\s+","He"); // \s+ - replaces first occurence of one or more whitespace character
         System.out.println(res);

         res=S.replaceAll("\\S","He"); // \S - everything except whitwspace character
         System.out.println(res);                        // non whitespace character

         res=S.replaceAll("\\S+","He"); 
         System.out.println(res);

         System.out.println();
         String S2="aeiouzzzzz";

         res=S2.replaceAll("z{2}","V");  //Matches exactly n occurrences
         System.out.println(res);

         res=S2.replaceAll("z{2,}","V");  //Matches n or more occurrences
         System.out.println(res);

         res=S2.replaceAll("z{2,4}","V"); //Matches between n and m occurrences
         System.out.println(res);



         System.out.println();
         res=S2.replaceAll("[aeiou]",""); //Matches any character in the brackets
         System.out.println(res);



         

         














         
        


    }
    
}

