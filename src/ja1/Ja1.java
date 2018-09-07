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
import java.util.Scanner;
public class Ja1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int val=1,vol,dim,level,cRow=0,cCol=0;
        Scanner scanner = new Scanner(System.in);
        dim = scanner.nextInt();
        int[][] m1= new int[dim][dim];
        level=dim-1;
        vol=dim*dim;
        while (val<vol){
            //слева направо
                while (cCol<level){
                    m1[cRow][cCol]=val;
                    cCol++;
                    val++;
                }
            //сверху вниз
                while (cRow<level){
                    m1[cRow][cCol]=val;
                    cRow++;
                    val++;
                }
            //справа налево
                while (cCol>dim-level-1){
                    m1[cRow][cCol]=val;
                    cCol--;
                    val++;
                }
                level-=1;
            //снизу вверх
                while (cRow>dim-level-1){
                    m1[cRow][cCol]=val;
                    cRow--;
                    val++;
                }
                
        }
       m1[cRow][cCol]=val;
        mutils.printm(m1);
    }
    
}
