import java.util.Scanner;

public class is_unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        boolean is_unique = true;
        sc.close();

        if (a.length() > 128) {
            is_unique = false;
        } else {

            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < i; j++) {
                    if (a.charAt(j) == a.charAt(i)) {
                        is_unique = false;
                    }

                }
            }
        }

        System.out.println(is_unique);
    }

}
