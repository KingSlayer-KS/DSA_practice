public class one_way {

    public static void allotment(StringBuilder k, StringBuilder l) {
        if (k.length() == l.length()) {
            System.out.print(replace(k, l));
        } else if (k.length() - l.length() == 1) {
            System.out.print(insert_del(l, k));
        } else if (k.length() - l.length() == -1) {
            System.out.print(insert_del(k, l));
        }

    }

    public static boolean replace(StringBuilder k, StringBuilder l) {
        int count = 0;
        for (int i = 0; i < k.length(); i++) {
            if (k.charAt(i) != l.charAt(i)) {
                count++;
            }

        }
        // System.out.println(count);
        if (count > 1 && count <= 0) {
            return false;
        }
        return true;
    }

    public static boolean insert_del(StringBuilder k, StringBuilder l) {

        int i1 = 0, i2 = 0;
        while (i2 < l.length() && i1 < k.length()) {
            if (k.charAt(i1) != l.charAt(i2)) {
                if (i1 != i2) {
                    return false;
                }
                i2++;
            } else {
                i1++;
                i2++;
            }
        }

        System.out.println(i1 + "\n" + i2);
        return true;
    }

    public static void main(String[] args) {
        StringBuilder k = new StringBuilder("alke"),
                l = new StringBuilder("ale");

        allotment(k, l);
    }

}
