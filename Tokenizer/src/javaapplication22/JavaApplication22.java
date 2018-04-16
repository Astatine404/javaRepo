/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.StringTokenizer;

public class JavaApplication22 {

    public static void main(String[] args) {
        String str = "I,am,not,a,person!";
        StringTokenizer st = new StringTokenizer(str);
        
        System.out.println(st.countTokens());
        
        while(st.hasMoreTokens())
            System.out.println(st.nextToken(","));
    }
    
}
