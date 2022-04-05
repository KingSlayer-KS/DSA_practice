
public class is_unique__alt {
    public static boolean is_unique_al(String str) {

        boolean[] unique = new boolean[128];

        if (str.length() > 128)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (unique[str.charAt(i)]) {
                return false;
            }
            unique[str.charAt(i)] = true;
        }
        return true;
    }

    public static void main(String[] args) {

        is_unique_al("AhC");
    }
}
