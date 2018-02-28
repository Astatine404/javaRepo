/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llist;
import java.util.Scanner;

/**
 *
 * @author c167257
 */

class LNode
{
    int key;
    LNode next;
    
    public LNode(int k)
    {
        this.key = k;
        this.next = null;
    }
    
    public void insertEnd(int k)
    {
        LNode iter = this;
        while(iter.next!=null)
        {
            iter = iter.next;
        }
        iter.next = new LNode(k);
    }
    
    public void print()
    {
        for(LNode i=this; i!=null; i=i.next)
        {
            System.out.print(i.key); System.out.print(" ");
        }
        System.out.print('\n');
    }
}

public class LList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt(), ch;
        LNode root = new LNode(k);
        while(true)
        {
            root.print();
            System.out.print("Choice: "); ch = in.nextInt();
            if(ch==1)
            root.insertEnd(in.nextInt());
            else if(ch==2)
            root = root.next;
        }
    }
    
}
