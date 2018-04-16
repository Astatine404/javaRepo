/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applettest;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


class AppletEx extends Applet
{
    public void init(){}
    public void paint(Graphics g){
        g.drawString("Hello",120,80);
    }
}

public class AppletTest {

  
    public static void main(String[] args) {
        System.out.println(Color.decode("408912"));
    }
    
}
