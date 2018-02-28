/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;
import java.util.Scanner;

/**
 *
 * @author c167257
 */

class A
{
    int a, b;
    public void f() 
    {
        System.out.println("F Method");
    }
}

class B extends A
{
    int c;
    public void g()
    {
        System.out.println(this.toString());
    }
}

public class Inherit {

    public static void main(String[] args) {
        B obj = new B();
        obj.a = 10;
        obj.f();
        obj.g();
    }
    
}
