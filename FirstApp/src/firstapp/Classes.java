/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapp;
import java.util.Scanner;
/**
 *
 * @author c167257
 */
public class Classes {
    public class Put {
        int val;
        void input() {
            Scanner in = new Scanner(System.in);
            val = in.nextInt();
        }
        void print() {
            System.out.print(val);
        }
    }
    
    public static void main(String args[]) {
        Put obj = new Put();
        obj.input();
        obj.print();
    }
}
