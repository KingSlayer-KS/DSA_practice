import java.util.Stack;

public class Stack_with_min_function {
    private static Stack<Integer> st;
    private static Stack<Integer> minSt;

    private static void push(int x) {
        // Push x to stack st
        st.push(x);
        // If minSt is empty or if top of minSt is greater than x push x to minSt.
        if (minSt.isEmpty() || minSt.peek() > x) {
            minSt.push(x);
        } else {
            // Else push top of minSt to minSt again.
            minSt.push(minSt.peek());
        }
    }

    private static void pop() {
        // Pop element from st and minSt
        st.pop();
        minSt.pop();
    }

    private static int top() {
        // Return top of st
        return st.peek();
    }

    private static int getMin() {
        // Return top of minSt
        return minSt.peek();
    }

    public static void main(String[] args) {
        // Initialise st and minSt
        st = new Stack<>();
        minSt = new Stack<>();
        // Example
        push(-2);
        push(0);
        System.out.println(getMin());
        push(-3);
        push(-3);
        push(-3);
        pop();
        System.out.println(top());
        System.out.println(getMin());
    }
}