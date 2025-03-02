import java.util.ArrayList;

public class BinarySearchTree {

    static class Node{

        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class Tree
    {
        static Node insert(Node root,int data)
        {
            if(root==null)
            {
                Node newnode=new Node(data);
                return newnode;
            }

            if(data<root.data)
            {
                root.left=insert(root.left,data);
            }
            else if(data>root.data)
            {
                root.right=insert(root.right,data);
            }
            else
            {
                System.out.println(root.data+" alredy exists ");
                return root;
            }

            return root;



        }

        public static void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

            
        }

        public static boolean search(Node root,int key)
        {
            if(root==null)
            {
                return false;

            }

            if(key>root.data)
            {
                return search(root.right,key);
            }
            else if(key<root.data)
            {
                return search(root.left,key);
            }
            else{
                return true;
            }
        }

        public static Node delete(Node root,int key)
        {
            if(root==null)
            {
                System.out.println(key+" doesnt exist");
                return root;
            }

            if(key>root.data)
            {
                root.right=delete(root.right,key);
            }
            else if(key<root.data)
            {
                root.left=delete(root.left,key);
            }
            else
            {

                //no child
                if(root.left==null && root.right==null)
                {
                    return null;
                }
                //single child
                if(root.left==null)
                {
                    return root.right;
                }
                if(root.right==null)
                {
                    return root.left;
                }
                // two children

                Node IS=inorderSuccessor(root.right);
                root.data=IS.data;
                root.right=delete(root.right,IS.data);


            }

            return root;


        }

        public static Node inorderSuccessor(Node root)
        {
            while(root.left!=null)
            {
                root=root.left;
            }

            return root;

        }

        public static void printInRange(Node root,int min,int max)
        {
            if(root==null)
            {
                return;
            }

            if(root.data>=min && root.data<=max)
            {

                printInRange(root.left,min,max);
                System.out.print(root.data+" ");
                printInRange(root.right,min,max);

            }
            else if(root.data<=min)
            {
                printInRange(root.right,min,max);
            }
            else
            {
                printInRange(root.left,min,max);
            }



        }

        static void path(Node root,ArrayList<Node> path)
        {
            if(root==null)
            {
                return;
            }

            path.add(root);
            if(root.left==null && root.right==null)
            {
                for(int i=0;i<path.size();i++)
                {
                    System.out.print(path.get(i).data+ " ");
                }
                System.out.println();
            }
            else{

                path(root.left,path);
                path(root.right,path);
            }

            path.remove(root);


        }

        
    }

    public static void main(String[] args) {

        Node root=null;

        int nodes[]={5,1,3,4,2,7,4};
        for(int i=0;i<nodes.length;i++)
        {
            root=Tree.insert(root,nodes[i]);

        }

        Tree.inorder(root);

        System.out.println(Tree.search(root,4));

        Tree.delete(root,4);
        Tree.inorder(root);

        System.out.println();
        Tree.delete(root,8);
        Tree.inorder(root);

        System.out.println();
        Tree.printInRange(root,2,7);


        
        System.out.println();
        ArrayList<Node> path=new ArrayList<>();
        Tree.path(root,path);

    

    


        

    }
    
}
