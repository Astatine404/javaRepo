/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectserialize;
import java.io.*;

class Student implements Serializable
{
    private int rno;
    public static final long serialVersionUID = 2L;
    public void setRno(int r){
        this.rno = r;
    }
            
    public int getRno(){
        return this.rno;
    }
}

public class ObjectSerialize {

    
    public static void main(String[] args) throws Exception {
        Student obj = new Student();
        obj.setRno(164);
        
        /*FileOutputStream fout = new FileOutputStream("f1.txt");
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        
        oout.writeObject(obj);*/
        System.out.println(obj.serialVersionUID);
        FileInputStream fin = new FileInputStream("f1.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        
        Student new_obj = (Student)oin.readObject();
        
        System.out.println(new_obj.getRno());
        
    }
    
}
