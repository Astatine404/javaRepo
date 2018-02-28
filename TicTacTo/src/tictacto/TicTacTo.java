/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictacto;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainFrame extends JFrame implements MouseListener
{
    JPanel p;
    JLabel l[][];
    GridLayout g;
    JLabel status;
    int counter = 0;
    int flag = 0;
    int mat[][] = new int[3][3];
    String str=" ";
    
    public void activate() {
        g = new GridLayout(3,3,20,20);
        p = new JPanel();
        p.setLayout(g);
        l = new JLabel[3][3];
        status = new JLabel("Playing", SwingConstants.CENTER);
        status.setFont(new Font("Serif", Font.BOLD, 20));
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++) {
                l[i][j]= new JLabel(str, SwingConstants.CENTER);
                str = str.concat(" ");
                l[i][j].setFont(new Font("Serif", Font.BOLD, 40));
                l[i][j].addMouseListener(this);
                l[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                p.add(l[i][j]);
            }
        }
        add(p, BorderLayout.CENTER);
        add(status, BorderLayout.SOUTH);
        
        setSize(500,500);
        setVisible(true);
        
    }
    
    public void verify()
    {
        for(int i=0; i<3; i++){ if(l[i][0].getText().equals(l[i][1].getText())&&l[i][1].getText().equals(l[i][2].getText())) flag=1;}
        for(int i=0; i<3; i++){ if(l[0][i].getText().equals(l[1][i].getText())&&l[1][i].getText().equals(l[2][i].getText())) flag=1;}
        if((l[0][0].getText().equals(l[1][1].getText())&&l[1][1].getText().equals(l[2][2].getText()))||(l[0][2].getText().equals(l[1][1].getText())&&l[1][1].getText().equals(l[2][0].getText())))
            flag=1;
    }
    
    public void mousePressed(MouseEvent e)
    {
        JLabel currlbl = (JLabel) e.getSource();
        if(0==counter%2)
            currlbl.setText("X");
        else
            currlbl.setText("O"); 
        verify();
        if(flag==1)
        {
            if(counter%2==0)
                status.setText("X won!");
            else
                status.setText("O won!");
            add(status, BorderLayout.CENTER);
            p.setVisible(false);
            counter--;
        }
        counter++;
        if(counter==9)
        {
            status.setText("Tied!");
            add(status, BorderLayout.CENTER);
            p.setVisible(false);
        }
    }
    
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    
}

public class TicTacTo {

    public static void main(String[] args) {
        MainFrame obj = new MainFrame();
        obj.activate();
    }
    
}
