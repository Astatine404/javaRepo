/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datadialog;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import javax.swing.BoxLayout;

class DialogObj extends Dialog implements ActionListener {
    Button b;
    Label l;
    String DialogString;
    String ButtonString;
    Frame f;
    
    DialogObj(FrameObj obj, String ltext, String btext){
        super(obj, "Dialog Box");
        this.DialogString = ltext;
        this.ButtonString = btext;
        this.f = obj;
    }
    
    public void activate() {
        b = new Button(ButtonString);
        l = new Label(DialogString);
        b.addActionListener(this);
        add(l);
        add(b);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(300, 100);
        this.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        this.dispose();
    }
    
    public void windowClosing(WindowEvent e) {
        this.dispose();
    }
}

class FrameObj extends Frame implements ActionListener {
    Button SubmitButton, CloseButton;
    Label l[];
    TextField tf[];
    Choice ch;
    String LabelString[] = {"Name: ", "Roll No: ", "Email: ", "Gender: "};
    Font font1 = new Font("SansSerif", Font.BOLD, 30);
    DialogObj error, data;
    exit ExitListener = new exit(this);
    
    public void activate() {
        error = new DialogObj(this, "ERROR: Recheck form!", "OK");
        //data = new DialogObj(this, "Correctly filled form!", "OK");
        l = new Label[4];
        tf = new TextField[3];
        ch = new Choice();
        SubmitButton = new Button("Submit");
        CloseButton = new Button("Exit");
        for(int i=0; i<4; i++) {
            l[i] = new Label(LabelString[i]);
            add(l[i]);
            if(i!=3){
                tf[i] = new TextField(20);
                tf[i].setFont(font1);
                add(tf[i]);
            }
        }
        ch.add("Male");
        ch.add("Female");
        add(ch);
        SubmitButton.addActionListener(this);
        CloseButton.addActionListener(ExitListener);
        add(SubmitButton);
        add(CloseButton);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(500, 500);
        setVisible(true);
        error.activate();
        //data.activate();
        this.setLocationRelativeTo(null);
    }
    
    public void displayData() {
        String output="", tmp;
        for(int i=0; i<3; i++) {
            tmp = tf[i].getText();
            output = output + LabelString[i] + tmp + " ";
        }
        data = new DialogObj(this, output, "OK");
        data.activate();
    }
    
    public void close() {
        System.exit(0);
    }
    
    public boolean verifyFields() {
        //Check for NULL String
        String tmp;
        for(int i=0; i<3; i++) {
            tmp = tf[i].getText();
            if(tmp.length() == 0)
                return false;
        }
        //Check email
        tmp = tf[2].getText();
        if(tmp.indexOf('@')==-1 || tmp.indexOf('.')==-1)
            return false;
        
        return true;
    }
    
    public void actionPerformed(ActionEvent e) {
        if(!verifyFields())
            error.setVisible(true);
        else {
            displayData();
            data.setVisible(true);
        }
            
    }
    
    public void windowClosing(WindowEvent e) {
        DialogObj confirm = new DialogObj(this, "Really want to close?", "Yes");
        confirm.setVisible(true);
    }
    
}

class exit implements ActionListener {
        FrameObj f;
        exit(FrameObj f) {
            this.f = f;
        }
        public void actionPerformed(ActionEvent e) {
            f.close();
        }
}

public class DataDialog {

    public static void main(String[] args) {
        FrameObj obj = new FrameObj(); 
        obj.activate();
    }
    
}
