/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traversal;

/**
 *
 * @Saahil Kumar Dhanwani
 *
 */
import java.io.*;
import java.util.*;
//import static traversal.FileRead.fileReadMethod;
import static traversal.FileRead.create2DMatrixFromFile;
import static traversal.ReadInputFromUser.ReadingInput;
import java.util.Scanner;
import static traversal.FileRead.returnNumberOfVerticesTextFile;
import static traversal.breadthFirstSearch.breadthFirstSearch;

public class Traversal {

    /**
     * @param args the command line arguments
     */
    //Driver Program--calls all the methods in all other classes!
    public static void main(String[] args) throws IOException, Exception {
        int matrix[][] = create2DMatrixFromFile();
        int vertexNumber = Integer.parseInt(ReadingInput());
        System.out.println("Source Node number is: V" + vertexNumber);
        System.out.println();
        //The following breadthFirstSearch algorithm is working perfect!
        System.out.println("Using algorirthm in breadthFirstSearch file");
        breadthFirstSearch(matrix, vertexNumber);
        System.out.println();
    }
}
