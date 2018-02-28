/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override;
import java.util.Scanner;

/**
 *
 * @author c167257
 */
class Vehicle
{
    int n;
    public void whoAmI()
    {
        System.out.println("Vehicle!");
    }
}

class Bike extends Vehicle
{
    int b;
    public void whoAmI() //Override
    {
        System.out.println("Bike!");
    }
}

class Car extends Vehicle
{
    int b;
    public void whoAmI() //Override
    {
        System.out.println("Car!");
    }
}

public class Override {

    public static void main(String[] args) {
        Vehicle obj;
        obj = new Bike();
        obj.whoAmI();
    }
    
}
