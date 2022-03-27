import java.util.Stack;

public class Sort_stack {

	static Stack<Integer> s1 = new Stack<>();

	public static void sort(Stack<Integer> s1) {
		Stack<Integer> s2 = new Stack<Integer>();
		while (!s1.isEmpty()) {
			/* Insert each element of stack1 in sorted order into stak2 . */
			int temporary = s1.pop();// temporaty elemet
			while (!s2.isEmpty() && s2.peek() > temporary) {
				s1.push(s2.pop());
			}
			s2.push(temporary);
		}

		/* jab tak stak2 khali na ho pop kri jao stack2 ==> stack1 */
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}

	}

	// mt or not
	public static Boolean is_mt() {
		return s1.isEmpty();
	}

	// adding
	public static void add(int val) {

		s1.push(val);

	}

	// deleting and returning
	public static int remove() {
		if (is_mt()) {
			System.out.println("khali hai bro");
			return -1;
		}

		return s1.pop();
	}

	// peek
	public static int pek() {

		if (is_mt()) {
			System.out.println("khali hai bro");
			return -1;
		}

		return s1.peek();
	}

	public static void main(String[] args) {
		// Stack<Integer> s1 = new Stack<>();
		s1.add(4);
		s1.add(3);
		s1.add(2);
		s1.add(1);
		s1.add(5);
		sort(s1);

		while (!is_mt()) {
			System.out.println(pek());
			remove();
		}

	}
}
