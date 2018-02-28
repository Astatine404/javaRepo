/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.Scanner;
/**
 *
 * @author c167257
 */
class stk {
        int size;
        int top;
        int[] elements;
        
        public stk(int size) {
            this.size = size;
            this.top = -1;
            this.elements = new int[this.size];
        }
        public void push(int k) 
        {
            if(this.top==this.size-1)
                System.out.println("Stack Full!");
            else
            {
                this.top++;
                this.elements[this.top] = k;
            }
        }
        public int pop()
        {
            if(this.top==-1)
            {
                System.out.println("Stack Empty!");
                return 0;
            }
            else
            {
                int tmp = this.elements[this.top];
                this.top--;
                return tmp;
            }
        }
        
        public void init()
        {
            int ch, val;
            System.out.print("1) Push\n2) Pop\n3) Print All\nEnter Choice: ");
            Scanner in = new Scanner(System.in);
            ch = in.nextInt();
            if(ch==1)
            {
                System.out.print("Value to push? ");
                val = in.nextInt();
                this.push(val);
            }
            else if(ch==2)
            {
                System.out.println(this.pop());
            }
            else
            {
                for(int i=0; i<=this.top; i++)
                {
                    System.out.println(this.elements[i]);
                }
            }
        }
}

public class Stack {
    public static void main(String[] args) {
        stk s = new stk(10);
        
        while(true)
            s.init();
                    
    }
    
}
