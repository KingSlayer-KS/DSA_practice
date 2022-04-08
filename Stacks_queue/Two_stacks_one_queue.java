package Stacks_queue;
import java.util.Stack;

public class Two_stacks_one_queue {
    
    

     static class Queue {
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();


        // mt or not
        public static Boolean is_mt() {
            return s1.isEmpty();
        }

        // adding
        public static void add(int val) {
           while(!s1.isEmpty() ){
                s2.push(s1.pop());
                
           }
           s1.push(val);

           while(!s2.isEmpty() ){
            s1.push(s2.pop());
            
       }
           
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
    }

    public static void main(String[] args) {
        Queue qq = new Queue();
        qq.add(1);
        qq.add(2);
        qq.add(3);
        qq.add(4);
        qq.add(5);
       
      
        while (!qq.is_mt()) {
            System.out.println(qq.pek());
            qq.remove();
        }

    }
}
