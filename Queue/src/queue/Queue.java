/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;
import java.util.Scanner;
/**
 *
 * @author c167257
 */
class que {
        int size;
        int f, r;
        int[] elements;
        
        public que(int size) {
            this.size = size;
            this.f = -1;
            this.r = -1;
            this.elements = new int[this.size];
        }
        public void push(int k) 
        {
            if(this.f == (this.r+1)%this.size)
                System.out.println("Queue Full!");
            else
            {
                if(this.f==-1)
                    this.f = 0;
                this.r++;
                this.elements[this.r] = k;
            }
        }
        public int pop()
        {
            if(this.f==-1&&this.r==-1)
            {
                System.out.println("Queue Empty!");
                return 0;
            }
            else if(this.f==this.r)
            {
                int tmp = this.elements[this.f];
                this.f = -1; this.r = -1;
                return tmp;
            }
            else
            {
                int tmp = this.elements[this.f];
                this.f++;
                return tmp;
            }
        }
        
        public void print()
        {
            if(this.f<=this.r)
            {
                for(int i=this.f; i<=this.r; i++)
                    System.out.println(this.elements[i]);
            }
            else
            {
                for(int i=this.f; i<this.size; i++)
                    System.out.print(this.elements[i]);
                for(int i=0; i<=this.r; i++)
                    System.out.print(this.elements[i]);
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
                this.print();
            }
        }
}

public class Queue {
    public static void main(String[] args) {
        que q = new que(10);
        
        while(true)
            q.init();
                    
    }
    
}
