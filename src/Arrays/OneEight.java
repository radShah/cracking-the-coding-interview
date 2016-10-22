package Arrays;

import java.util.ArrayList;

/**
 * Created by radha on 10/2/16.
 */
public class OneEight {

    class Coordinate {
        int x;
        int y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public int[][] zeroOutMatrix(int [][] matrix) {

        ArrayList<Coordinate> coords = new ArrayList();
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j   < matrix[0].length; j++) {
                if (matrix[i][j] ==0) {
                    coords.add(new Coordinate(i,j));
                }
            }
        }
        matrix = zeroOutRowandCol(coords, matrix);
        return matrix;
    }
    public int[][] zeroOutRowandCol(ArrayList<Coordinate> coordinates, int [][] matrix) {

        for (Coordinate coordinate : coordinates) {
            int i = coordinate.x;
            int j = coordinate.y;
            for (int colNum = 0; colNum < matrix[0].length; colNum++) {
                matrix [i][colNum] = 0;
            }
            for (int rowNum = 0; rowNum < matrix.length; rowNum++) {
                matrix [rowNum][j] = 0;
            }
        }

        return matrix;
    }

    public static void main(String [] args) {
        OneEight solver = new OneEight();
        int [][] matrix = new int [][] {
            { 1, 2, 3, 4, 5 },
            { 3, 4, 0, 1, 2 },
            { 3, 0, 2, 1, 2 },
            { 3, 4, 2, 1, 2 },
        };
        System.out.println("Old matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
         System.out.println();
        }


        System.out.println("New matrix:");
        int [][] solved = solver.zeroOutMatrix(matrix);


        for (int i = 0; i < solved.length; i++) {
            for (int j = 0; j < solved[0].length; j++) {
                System.out.print(solved[i][j]);
            }
            System.out.println();
        }


    }

}
