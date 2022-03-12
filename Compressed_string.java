public class Compressed_string {
    public static int[] map = new int[128];
    public static StringBuilder comp_st = new StringBuilder();

    public static void compression(String l) {
        for (int i = 0; i < l.length(); i++) {

            if (i + 1 >= l.length() || l.charAt(i) != l.charAt(i + 1)) {
                int val = l.charAt(i);
                comp_st.append(l.charAt(i));
                comp_st.append(map[val] + 1);
                map[val] = 0;

            } else {
                int val = l.charAt(i);
                map[val]++;

            }

        }
    }

    public static void main(String[] args) {
        String l = "aaaaalkea";

        compression(l);
        if (l.length() > comp_st.length()) {
            System.out.println(comp_st);
        } else {
            System.out.println(comp_st);
        }
    }

}
