import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class pin extends JFrame implements ActionListener{
    String pin;
    JTextField field1,field2;
    JButton changebtn,backbtn;
    pin(String pin){
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        this.pin=pin;

        ImageIcon i1=new ImageIcon("D:/JavaBankATM/images/atm2.png");
        java.awt.Image i2=i1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1400, 700);
        add(image);

        JLabel label1=new JLabel("CHANGE YOUR PIN");
        label1.setFont(new Font("Raleway",Font.BOLD,20));
        label1.setForeground(Color.WHITE);
        label1.setBounds(470, 160, 200, 20);
        image.add(label1);

        JLabel label2=new JLabel("New PIN:");
        label2.setFont(new Font("Raleway",Font.BOLD,18));
        label2.setForeground(Color.WHITE);
        label2.setBounds(400, 210, 200, 18);
        image.add(label2);

        JLabel label3=new JLabel("Re-Enter new PIN:");
        label3.setFont(new Font("Raleway",Font.BOLD,17));
        label3.setForeground(Color.WHITE);
        label3.setBounds(400, 250, 200, 18);
        image.add(label3);

        field1=new JTextField();
        field1.setFont(new Font("Raleway",Font.PLAIN,18));
        field1.setBounds(600,210, 130, 23);
        image.add(field1);

        field2=new JTextField();
        field2.setFont(new Font("Raleway",Font.PLAIN,18));
        field2.setBounds(600,250, 130, 23);
        image.add(field2);

        changebtn=new JButton("CHANGE");
        changebtn.setFont(new Font("Raleway",Font.BOLD,13));
        changebtn.setBounds(670, 307, 90, 28);
        changebtn.addActionListener(this);
        image.add(changebtn);

        backbtn=new JButton("BACK");
        backbtn.setFont(new Font("Raleway",Font.BOLD,13));
        backbtn.setBounds(670, 345, 90, 28);
        backbtn.addActionListener(this);
        image.add(backbtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==backbtn){
            new main_class(pin);
            setVisible(false);
        }
        else if(e.getSource()==changebtn){
            try {
                String pin1=field1.getText();
                String pin2=field2.getText();
                
                if(pin1.equals("")){
                    JOptionPane.showMessageDialog(null, "Enter new pin");
                    return;
                }
                if(pin2.equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new pin");
                    return;
                }
                if(!pin1.equals(pin2)){
                    JOptionPane.showMessageDialog(null, "Re-Entered pin does not match!");
                    return;
                }

                
                Conn conn=new Conn();
                String q1="update bank set pin='"+pin1+"' where pin='"+pin+"'";
                String q2="update login set pin='"+pin1+"' where pin='"+pin+"'";
                String q3="update signup3 set pin='"+pin1+"' where pin='"+pin+"'";
                conn.statement.executeUpdate(q1);
                conn.statement.executeUpdate(q2);
                conn.statement.executeUpdate(q3);
                JOptionPane.showMessageDialog(null, "PIN change successfully");
                new Login();
                setVisible(false);

            } catch (Exception E) {
                JOptionPane.showMessageDialog(null, E.getMessage());
            }
        }
        
    }
    public static void main(String[] args) {
        new pin("");
    }
}
