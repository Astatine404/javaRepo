/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstree;
import java.util.Scanner;

/**
 *
 * @author c167257
 */
class TNode
{
    int key;
    TNode rchild;
    TNode lchild;
    
    public TNode(int k)
    {
        this.key = k;
        this.rchild = null;
        this.lchild = null;
    }
    
    public void insert(int k)
    {
        if(k>this.key)
        {
            if(this.rchild==null)
            {
                TNode tmp = new TNode(k);
                this.rchild = tmp;
            }
            else
                this.rchild.insert(k);
        }
        else
        {
            if(this.lchild==null)
            {
                TNode tmp = new TNode(k);
                this.lchild = tmp;
            }
            else
                this.lchild.insert(k);
        }
    }
    
    public void preorder()
    {
            if(this.lchild!=null)
            this.lchild.preorder();
            System.out.print(this.key); System.out.print(" ");
            if(this.rchild!=null)
            this.rchild.preorder();
    }
    
}

public class BSTree {

    public static void main(String[] args) {
        int k;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        TNode root = new TNode(k);
        root.preorder(); System.out.print('\n');
        while(true)
        {
            k = in.nextInt();
            root.insert(k);
            root.preorder();
            System.out.print('\n');
        }
            
    }
    
}
