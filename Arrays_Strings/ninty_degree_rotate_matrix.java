package Arrays_Strings;

public class ninty_degree_rotate_matrix {

    public static void print_arry(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    // transpose of hte array
    public static void rot(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int mat_tem = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = mat_tem;
            }
        }
        // towards the middle of the aarray and swapping them
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int mat_tem = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = mat_tem;
                System.out.println(matrix.length - j - 1);
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        print_arry(matrix);
        rot(matrix);
        System.out.println();
        print_arry(matrix);
    }
}
