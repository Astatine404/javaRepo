/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendinherit;

/**
 *
 * @author c167257
 */

class Def
{
    int a, b;
    public void swap(Def obj1)
    {
        int tmp = obj1.a;
        obj1.a = obj1.b;
        obj1.b = tmp;
    }
}
public class ExtendInherit {

    public static void main(String[] args) {
        Def obj1 = new Def();
        Def obj2 = new Def();
        obj1.a = 10;
        obj1.b = 20;
        obj1.swap(obj1);
        System.out.println(obj1.a);
        System.out.println(obj1.b);
    }
    
}
