package Arrays_Strings;

public class String_rotation {
    public static boolean st_rot(String s1, String s2) {
        /*
         * max no of rotation for given strings is always a sub string of twice the
         * orignal string
         */
        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s1 = "sirjan",
                s2 = "jansir";
        System.out.println(st_rot(s1, s2));
    }
}
