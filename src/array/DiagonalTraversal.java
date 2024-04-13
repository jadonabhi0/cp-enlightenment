package array;

public class DiagonalTraversal {
    public static void main(String[] args) {
        int[][] mat = new int[][]{
                {1, 2, 3, 4,  5},
                {6, 7,  8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};

        print(mat);

    }


    public static void print(int[][]  matrix) {
        int rows =  matrix.length;
        int cols =  matrix[0].length;
        int noOfDia = 2  *  rows -1;
        int a = 1;
        for(int i = 0 ; i < noOfDia ; i++){
            int row = i;
            int col = 0;
            if (i < rows){ // print the upper diagonals of array.matrix
                while(row >= 0 && col <= i) {
                    System.out.print(matrix[row][col] + " ");
                    row--;
                    col++;
                }
                System.out.println();
            }else { //  print the lower part of array.matrix
                col = a;
                row = rows-1;
                while(row >= a && col <= cols-1){
                    System.out.print(matrix[row][col] + " ");
                    row--;
                    col++;
                }
                a++;
                System.out.println();
            }

        }
    }
}
