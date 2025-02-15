import java.util.Stack;
import java.util.Collections;
import java.util.List;

public class TestStack {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();

        stack.push(4);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.contains(5));

        System.out.println(stack.indexOf(5));

        System.out.println(stack.search(5));

        System.out.println(stack.isEmpty());

        System.out.println(stack.peek());

       stack.set(0,7);
        

        // Collections.sort(stack);
        // System.out.println(stack);

        // Collections.sort(stack,Collections.reverseOrder());
        // System.out.println(stack);

        System.out.println();
    
        for(int i=stack.size()-1;i>=0;i--)
        {
            System.out.println(stack.get(i));
        }
        System.out.println();

        while(!stack.isEmpty())
        {
            System.err.println(stack.pop());
        }
        

    }
    
}
