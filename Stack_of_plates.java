import java.util.ArrayList;
import java.util.Stack;

public class Stack_of_plates {

    public static ArrayList<Stack> arr_of_stacks = new ArrayList<Stack>();
    public static int counter_for_stacks = 0;
    public static int topple_after = 10;
    public static Stack<Integer> set_of_stacks;

    public static void push(int val) {

        if (counter_for_stacks == topple_after || counter_for_stacks == 0) {
            counter_for_stacks = 0;
            set_of_stacks = new Stack<>();
            arr_of_stacks.add(set_of_stacks);

        }
        set_of_stacks.push(val);
        counter_for_stacks++;

    }

    public static int pop() {
        if (counter_for_stacks == 1) {
            // if a stack has only one elment and we wan to initilize new stack
            counter_for_stacks = topple_after;
        } else
            counter_for_stacks--;
        // got to (arr_of_stacks.size() - 1)TH stack an pop the hell out of it lol
        return (Integer) arr_of_stacks.get(arr_of_stacks.size() - 1).pop();
    }

    public static int popat(int val) {
        if (val > arr_of_stacks.size() - 1) {
            // if a stack has only one elment and we wan to initilize new stack
            System.out.println("not possible");
            return -1;
        } else {
            counter_for_stacks--;
            return (Integer) arr_of_stacks.get(val).pop();
        }
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);
        push(7);
        push(8);
        push(8);
        push(8);
        push(8);
        pop();
        push(8);
        popat(0);
        push(8);
        push(8);
        push(8);
        push(8);
        push(8);
        push(8);
        push(8);
        push(8);
        pop();

    }
}
