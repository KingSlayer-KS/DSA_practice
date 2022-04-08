package Arrays_Strings;

import java.util.Scanner;

public class URLify {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s.trim();
        sc.close();
        String s1 = s.replaceAll("\\s", "%20");

        System.out.println(s1);
    }

}
