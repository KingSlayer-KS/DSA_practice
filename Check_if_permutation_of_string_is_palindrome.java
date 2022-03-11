import java.util.Scanner;

/*
some basic stuff: if u look at a palindrome with some attention u will find
that if the length is even the all the charactes occures twice
and if length is odd all the chars occures twice except one which sit in the
middle*/
public class Check_if_permutation_of_string_is_palindrome {
    public static int count=0;
    public static boolean is_or_not =false;
    public static boolean palindrome_or_not(String s) {
        int[] chr = new int[128];// empty array of zeros
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            chr[val]++;
        }
        for (int i = 0; i < chr.length; i++) {//iterate through every number fro the array and modlus by 2
            count+=chr[i]%2;
        }
        if(count<=1){
            is_or_not= true;
        }
        return is_or_not;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=(sc.nextLine()).replaceAll(" ","");
        sc.close();
        System.out.println(palindrome_or_not(s));
    }

}
