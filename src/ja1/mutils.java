/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja1;

/**
 *
 * @author бегемот
 */
public class mutils {
    int[][] m1;
//    m1=matrix;
    public static void printm(int[][] matrix){
        for (int[] row : matrix) {
            for (int col=0;col<row.length;col++) {
                System.out.print(row[col] + " ");
            }
            System.out.println();
        }
    }
}
