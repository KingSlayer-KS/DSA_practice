import java.util.Stack;

public class Stack_with_min_function {
    private static Stack<Integer> st;
    private static Stack<Integer> mini;

    public static int min() {
        return mini.peek();

    }

    public static void push(int val) {
        st.push(val);
        if (mini.isEmpty() || mini.peek() > val) {
            mini.push(val);
        }

    }

    public static int top() {
        return st.peek();

    }

    public static void pop() {
        if (st.peek() == mini.peek()) {
            st.pop();
            mini.pop();
        } else {
            st.pop();

        }

    }

    public static void main(String[] args) {
        st = new Stack<>();
        mini = new Stack<>();
        push(-1);
        push(2);
        push(3);
        push(4);
        pop();
        System.out.println(min());
        System.out.println(top());

    }

}
