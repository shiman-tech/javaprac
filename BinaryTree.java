import java.util.*;

public class BinaryTree {

     static class Node{

        int data;
        Node left;
        Node right;
        int height;
        int diam;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }

        Node(int height,int diam)
        {
            this.height=height;
            this.diam=diam;
        }
    }

    static class Tree{

        static int idx=-1;


        public static Node createTree( int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                if(idx==nodes.length-1)
                {
                    idx=-1;

                }
                
                
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=createTree(nodes);
            newNode.right=createTree(nodes);

            return newNode;

        }

        public static void preOrder(Node root)
        {
            if(root==null)
            {
                return;
            }

            System.out.print(root.data);
            preOrder(root.left);
            preOrder(root.right);

        }
        public static void postOrder(Node root)
        {
            if(root==null)
            {
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data);
        }
        public static void inOrder(Node root)
        {
            if(root==null)
            {
                return;
            }

            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);

        }

        
            
        public static void levelOrder(Node root)
        {

            if(root==null)
            {
                return;
            }

            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty())
            {
                Node currNode=q.poll();
                if(currNode==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else
                    q.add(null);
                }
                else{
                    System.out.print(currNode.data);

                    if(currNode.left!=null)
                    q.add(currNode.left);

                    if(currNode.right!=null)
                    q.add(currNode.right);
                }
            }
        }

        public static int countNode(Node root)
        {
            if(root==null)
            {
                return 0;
            }

            return countNode(root.left)+countNode(root.right)+1;
        }

        public static int sumNode(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            return sumNode(root.left)+sumNode(root.right)+root.data;
        }

        public static int height(Node root)
        {
            if(root==null)
            {
                return 0;
            }

            return Math.max(height(root.left),height(root.right))+1;

        }

        public static int diameter(Node root)             // O(n^2)
        {
            if(root==null)
            {
                return 0;
            }

           /*  int diam1=diameter(root.left);
            int diam2=diameter(root.right);*/
            int diam3=height(root.left)+height(root.right)+1;

            return Math.max(diameter(root.left),Math.max(diameter(root.right),diam3));
        }

        public static Node TreeInfo(Node root)   // both height and diameter  O(n)
        {
            if(root==null)
            {
                return new Node(0,0);
            }

            Node left=TreeInfo(root.left);
            Node right=TreeInfo(root.right);

            int height=Math.max(left.height,right.height)+1;

            int diameter=Math.max((Math.max(left.diam,left.diam)),left.height+right.height+1);

            Node nodeInfo=new Node(height,diameter);

            return nodeInfo;



        }

        public static boolean identical(Node root,Node subroot)
        {
            if(root==null && subroot==null)
            {
                return true;
            }
            if(root==null || subroot==null)
            {
                return false;
            }

            if(root.data==subroot.data)
            {
                return identical(root.left,subroot.left) && identical(root.right,subroot.right);
            }
            
            return false;


        }

        public static boolean subTree(Node root,Node subroot)
        {
            
            if(subroot==null)
            {
                return true;
            }

            if(root==null)
            {
                return false;
            }

            if(root.data==subroot.data)
            {
                if(identical(root,subroot))
                {
                    return true;
                }
                
            }
            

                return (subTree(root.left,subroot) || subTree(root.right,subroot));
            
            
        }
        
        public static int sumlevel(Node root,int k)                                                        
        {
            
            if(root==null)
            {
                return 0;
            }
            Queue<Node> q=new LinkedList<>();
            

            q.add(root);
            q.add(null);

            int level=0;
            int sum=0;



            while(!q.isEmpty())
            {
                Node currNode=q.poll();
                if(currNode==null)
                {
                    if(q.isEmpty())
                    {
                        break;
                    }
                    level++;

                    if(level>k)
                       break;
      
                    q.add(null);
                    
                    
                }
                else
                {
                    if(level==k){
                        sum=sum+currNode.data;

                    }

                   
                    

                    if(currNode.left!=null)
                    q.add(currNode.left);

                    if(currNode.right!=null)
                    q.add(currNode.right);
                }
            }

            return sum;
        }
    }


    public static void main(String[] args) {

        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int nodes2[]={3,-1,6,-1,-1};


        Node root=Tree.createTree(nodes);
        Node subroot=Tree.createTree(nodes2);
        System.out.println(root.data);
        System.out.println(subroot.data);

        Tree.preOrder(root);
        System.out.println();
        Tree.postOrder(root);
        System.out.println();
        Tree.inOrder(root);
        System.out.println();

        Tree.levelOrder(root);

        System.out.println(Tree.countNode(root));

        System.out.println(Tree.sumNode(root));

        System.out.println(Tree.height(root));

        System.out.println(Tree.diameter(root));

        System.out.println(Tree.TreeInfo(root).diam);
        System.out.println(Tree.TreeInfo(root).height);

        System.out.println(Tree.subTree(root,subroot));

        

        int res=Tree.sumlevel(root,4);
        if(res==0)
            System.out.println("level not found");
        else
            System.out.println(res);




        



        
    }
}




    

