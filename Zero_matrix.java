public class Zero_matrix {
    public static int col = 0;
    public static int row = 0;

    public static void print_arry(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void xero(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    col = i;
                    row = j;
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            mat[col][i] = 0;
        }
        for (int i = 0; i < mat[0].length; i++) {
            mat[i][row] = 0;
        }

    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 3, 2, 5 }, { 1, 0, 5 } };
        print_arry(mat);
        xero(mat);
        System.out.println();
        print_arry(mat);
    }
}
