/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constinherit;

/**
 *
 * @author c167257
 */
class A
{
    
    A()
    {
        System.out.println("A Class");
    }
    
    int a;
}

class B extends A
{
    B()
    {
        System.out.println("B Class");
    }
    public void assignA()
    {
        a = 10;
    }
}
public class ConstInherit {
    
    public static void main(String[] args) {
        B obj = new B();
        obj.assignA();
        System.out.println(obj.a);
    }
    
}
