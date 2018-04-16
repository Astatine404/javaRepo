/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputstreamex;
import java.io.*;



public class InputStreamEx {


    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("f1.txt");
        FileInputStream fin = new FileInputStream("f1.txt");
        
        byte b[] = new byte[10];
        
        for(int i=65; i<=90; i++)
            fout.write(i);
        int i;
        
        while((i=fin.read(b,1,4))!=-1)
        {
            System.out.println(i);
            for(int j=0; j<4; j++)
                System.out.print(b[j]+" ");
        }
        
        
    }
    
}
