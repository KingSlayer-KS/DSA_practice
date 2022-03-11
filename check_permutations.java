public class check_permutations {

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letters = new int[128]; // Assumption
        char[] s_array = s.toCharArray();
        for (char c : s_array) { // count number of each char in s.
            letters[c]++;
           
        }
        for (int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            letters[c]--;
            System.out.println(c);
            System.out.println(letters[c]);
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc",t="cba";
        System.out.print(permutation(s,t));

    }

}
/*
length of both strings should be same
creat empty arry of 127 size of zeros
add 1 to the int value of the assccired character
then subract if the charate rof the othe string matcjhe at that position 
where the value becoem -1 it becoem s false
*/

/*
another approach may be to convert each strings to arrya sort then then equate 
them provided length of both is same 
*/