/**
 * Implementation of a stack
 */
public class MyStack {

    private int[] data;
    private int top;

    MyStack(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    /**
     * Adds a new value to the top of the stack.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @param value the value the user wants to add to the top of the stack
     */
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        data[top] = value;
    }

    /**
     * Removes and returns the value on the top of the stack.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @return the value the user wants to remove from the top of the stack
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        int value = data[top];
        top--;
        return value;
    }

    /**
     * Checks if the stack is empty.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @return true if stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Checks if the stack is full.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @return true if stack is full, false otherwise
     */
    public boolean isFull() {
        return top == data.length - 1;
    }

    /**
     * Returns the value on the top of the stack.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @return the value from the top of the stack
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        int value = data[top];
        return value;
    }

    /**
     * Gets the size of the stack
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @return the size of the stack
     */
    public int size() {
        return top + 1;
    }

    /**
     * Clears what is inside of the stack.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     */
    public void clear() {
        top = -1;
    }

    /**
     * Prints all elements inside of the stack from top to bottom.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     */
    public void print() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}
