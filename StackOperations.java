import java.util.Stack;

public class StackOperations 
{
    public static void main(String[] args) 
    {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Displaying the stack
        System.out.println("Stack: " + stack);

        // Popping element from the stack
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);

        // Peeking top element
        int top = stack.peek();
        System.out.println("Top element: " + top);

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

