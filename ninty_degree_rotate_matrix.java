public class ninty_degree_rotate_matrix {

    public static void print_arry(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();
        }
    }

    // transpose of hte array
    public static void rot(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat.length; j++) {
                int mat_tem = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = mat_tem;
            }
        }
        // towasds the middle of the aarray and swapping them
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length / 2; j++) {
                int mat_tem = mat[i][j];
                mat[i][j] = mat[i][mat.length - j - 1];
                mat[i][mat.length - j - 1] = mat_tem;
                System.out.println(mat.length - j - 1);
            }
        }

    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        print_arry(mat);
        rot(mat);
        System.out.println();
        print_arry(mat);
    }
}
