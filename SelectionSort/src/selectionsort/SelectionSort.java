/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Scanner;

/**
 *
 * @author c167257
 */

abstract class B
{
    int a[];
    int size;
    abstract public void input();
}

class SSort extends B
{
    public SSort(int size)
    {
        this.size = size;
        this.a = new int[size];
    }
    
    public void input()
    {
        System.out.println("Enter the numbers:");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<this.size; i++)
        {
            a[i] = in.nextInt();
        }
    }
    
    public void swap(int i, int j)
    {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
    public void SelectionSort()
    {
        int min;
        for(int i=0; i<this.size; i++)
        {
            print();
            //Find min
            min = i;
            for(int j=i; j<this.size; j++)
            {
                if(a[j]<a[min])
                    min = j;
            }
            //Swap
            swap(i, min);
        }
    }
    public void print()
    {
        for(int i=0; i<size; i++)
            System.out.print(String.valueOf(a[i])+" ");
        System.out.print('\n');
    }
    
}
public class SelectionSort {

    public static void main(String[] args) {
        System.out.print("Size: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        SSort obj = new SSort(size);
        obj.input();
        obj.SelectionSort();
        obj.print();
    }
    
}
