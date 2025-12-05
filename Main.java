/**
 * Using methods to implement how the stack works 
 */
public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(4);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
    
        int size = stack.size();
        System.out.println("The size of the stack is "+size);

        int poppedValue = stack.pop();
        System.out.println("The value that we are taking out is "+poppedValue);
        
        int currentTop = stack.peek();
        System.out.println("The current top is now "+currentTop);

        System.out.println("Printing all the values in the stack we have");
        stack.print();

        System.out.println("We are clearing the values that are held in stack");
        stack.clear();

        size = stack.size();
        System.out.println("After clear the size of the stack is " + stack.size());

    }
}