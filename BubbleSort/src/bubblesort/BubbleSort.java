/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;
import java.util.Scanner;
/**
 *
 * @author c167257
 */

interface B
{
    int a[] = new int[10];
    int size = 5;
    public void input();
}

class BSort implements B
{
    /*BSort(int s)
    {
        size = s;
        a = new int[size];
    }*/
    
    public void input()
    {
        System.out.println("Enter the numbers:");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<this.size; i++)
        {
            a[i] = in.nextInt();
        }
    }
    
    public void swap(int j)
    {
        int tmp = a[j];
        a[j] = a[j+1];
        a[j+1] = tmp;
    }
    
    public void BubbleSort()
    {
        for(int i=0; i<this.size; i++)
        {
            for(int j=0; j<this.size-i-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    print();
                    swap(j);
                }
            }
        }
    }
    public void print()
    {
        for(int i=0; i<size; i++)
            System.out.print(String.valueOf(a[i])+" ");
        System.out.print('\n');
    }
    
}
public class BubbleSort {
    public static void main(String[] args) {
        BSort obj = new BSort();
        obj.input();
        obj.BubbleSort();
        obj.print();
    }
    
}