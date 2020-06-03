/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traversal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.util.*;

/**
 *
 * @author Saahil Kuamr Dhanwani
 */
// reading text file and printing it on screen with proper formatting!
public class FileRead {

    public static int intLength = 0;
    public static int[][] create2DMatrixFromFile() throws Exception {
        File file = new File("C:\\Users\\user\\Desktop\\Spring 2020\\Graph Theory\\HW1\\Adjency matrix.txt");
        Scanner Scan = new Scanner(file);
        int line1;
        int line2;
        String[] length = Scan.nextLine().trim().split("\\s+");
        for (int i = 0; i < length.length; i++) {
            intLength++;
        }
        Scan.close();
        int[][] matrix = new int[intLength][intLength];
        Scan = new Scanner(file);
        int lineCount = 0;
        while (Scan.hasNextLine()) {
            String[] currentLine = Scan.nextLine().trim().split("\\s+");
            for (int i = 0; i < currentLine.length; i++) {
                matrix[lineCount][i] = Integer.parseInt(currentLine[i]);
            }
            lineCount++;
        }
        System.out.print("   ");
        for (int x = 0; x < matrix.length; x++) {
            line2 = x + 1;
            System.out.print("V" + line2 + " ");
        }
        System.out.println();
        for (int line = 0; line < matrix.length; line++) {
            line1 = line + 1;
            System.out.print("V" + line1);
            for (int a = 0; a < matrix.length; a++) {
                if (line == matrix.length - 1 && line > 8) {
                    System.out.print(" ");
                    System.out.print(matrix[line][a] + " ");

                } else {
                    System.out.print("  " + matrix[line][a]);
                }
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }
    public static int returnNumberOfVerticesTextFile() {
        return intLength;

    }
}
