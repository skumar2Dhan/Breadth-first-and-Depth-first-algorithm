/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traversal;

import java.util.Scanner;

/**
 *
 * @author Saahil Kuamr Dhanwani
 */
//Takes the input from the user!
public class ReadInputFromUser {

    public static String ReadingInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Select the starting Node or Vertex from the Vertical column for e.g V2 or v2: ");
        String next = keyboard.nextLine();
        String vertexNumber = next.substring(1);
        String next1 = next.toUpperCase();
        System.out.println("You selected vertex: " + next1);
        return vertexNumber;
    }
}
