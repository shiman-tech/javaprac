public class Tries {

    static class Node{

        Node children[];
        boolean eow;

        Node(){
            children=new Node[26];
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }
            eow=false;
        }
    }



        static Node root=new Node();
        public static void insert(String str)
        {
            Node currNode=root;
            for(int i=0;i<str.length();i++)
            {
                int pos=str.charAt(i)-'a';
                if(currNode.children[pos]==null)
                {
                    currNode.children[pos]=new Node();
                }

                if(i==str.length()-1)
                {
                    currNode.children[pos].eow=true;
                }
                else{
                    currNode=currNode.children[pos];

                }

            }


        }

        public static boolean search(String key)
        {
            Node curNode=root;

            for(int i=0;i<key.length();i++)
            {
                int pos=key.charAt(i)-'a';
                if(curNode.children[pos]==null)
                {
                    return false;
                }
                if(pos==key.length()-1 && curNode.eow==false)
                {
                    return false;
                }

                curNode=curNode.children[pos];


                
                
            }


            return true;
        }

        public static boolean wordBreak( String key)
        {

            if(key.length()==0)
            {
                return true;
            }

            for(int i=1;i<=key.length();i++)
            {
                String firstPart=key.substring(0,i);
                String secPart=key.substring(i);

                if(search(firstPart) && wordBreak(secPart))
                {
                    return true;
                }
            }

            return false;


        }


        static boolean startsWith(String prefix)
        {
            Node curNode=root;
            for(int i=0;i<prefix.length();i++)
            {
                int idx=prefix.charAt(i)-'a';
                if(curNode.children[idx]==null)
                {
                    return false;
                }
                curNode=curNode.children[idx];
            }
            return true;
        }

        static int countSubstring(Node root)
        {
            if(root==null)
            {
                return 0;
            }

            int count=0;

            
            
            for(int i=0;i<26;i++)
            {

                if(root.children[i]!=null)
                {
                    count=count+countSubstring(root.children[i]);
                    
                }
    
                
            }
            return count+1;


        }
        

        public static void main(String[] args) {

          /*   String words[]={"i","ra","an"};
            String key="iran";
            for(int i=0;i<words.length;i++)
            {
                insert(words[i]);
            }
            System.out.println(search("ir"));

            System.out.println(wordBreak("key"));

            System.out.println(startsWith("an"));*/

            String str="ababa";

            for(int i=0;i<str.length();i++)
            {
                String suffix = str.substring(i);
                insert(suffix) ;
            }

            System.out.println(countSubstring(root));

        }

    
    }
    

