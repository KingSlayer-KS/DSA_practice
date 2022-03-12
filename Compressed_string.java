public class Compressed_string {
    public static int[] map = new int[128];
    public static StringBuilder comp_st = new StringBuilder();

    public static void compression(String k) {
        for (int i = 0; i < k.length(); i++) {

            if (i + 1 >= k.length() || k.charAt(i) != k.charAt(i + 1)) {
                int val = k.charAt(i);
                comp_st.append(k.charAt(i));
                comp_st.append(map[val] + 1);
                map[val] = 0;

            } else {
                int val = k.charAt(i);
                map[val]++;

            }

        }
    }

    public static void main(String[] args) {
        String k = "aaaaalkea";

        compression(k);
        if (k.length() > comp_st.length()) {
            System.out.println(comp_st);
        } else {
            System.out.println(comp_st);
        }
    }

}
