/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Nantawat
 */
public class Sudoku {

    /**
     * @param args the command line arguments
     */


    /**
     * Print the specified Sudoku problem and its solution.  The
     * problem is encoded as specified in the class documentation
     * above.
     *
     * @param args The command-line arguments encoding the problem.
     */
    //public static void main(String[] args) {
        //int[][] matrix = parseProblem(args);
        //writeMatrix(matrix);
        //if (solve(0,0,matrix))    // solves in place
            //writeMatrix(matrix);
       // else
            //System.out.println("NONE");
    //}


    static void writeMatrix(int[][] solution) {
        for (int i = 0; i < 9; ++i) {
            if (i % 3 == 0)
                System.out.println(" -----------------------");
            for (int j = 0; j < 9; ++j) {
                if (j % 3 == 0) System.out.print("| ");
               
            }
            System.out.println("|");
        }
        System.out.println(" -----------------------");
    }

}