

public class is_unique_alt {
    public static boolean is_u(String str) {

        boolean[] is_unique = new boolean[128];

        if (str.length() > 128)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (is_unique[str.charAt(i)]) {
                return false;
            }
            is_unique[str.charAt(i)]= true;
        }
        return true;
    }

    public static void main(String[] args) {
        
        is_u("abc");
    }    
}
