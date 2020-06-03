/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traversal;

/**
 *
 * @author Saahil Kuamr Dhanwani
 */
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
// actual breadth first search algorithm 
public class breadthFirstSearch {
    static void breadthFirstSearch(int[][] matrix, int source) {
        boolean[] visited = new boolean[matrix.length];
        //System.out.println("Boolean array length: "+visited.length);
        visited[source - 1] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        System.out.println("The breadth first order is:");
        while (!queue.isEmpty()) {
            System.out.print("V"+queue.peek()+" ");
            int x = queue.poll();
            int i;
            for (i = 0; i < matrix.length; i++) {
                if (matrix[x - 1][i] == 1 && visited[i] == false) {
                    queue.add(i + 1);
                    visited[i] = true;
                }
            }
        }

    }
}
