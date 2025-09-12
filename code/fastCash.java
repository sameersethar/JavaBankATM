import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;

import javax.swing.*;

public class fastCash extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,backbtn;
    String pin;
    fastCash(String pin){
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

        JLabel label=new JLabel("Select Withdrawal amount: ");
        label.setFont(new Font("Raleway",Font.BOLD,18));
        label.setForeground(Color.WHITE);
        label.setBounds(455,150,500,40);
        image.add(label);

        b1=new JButton("Rs 100");
        b1.setFont(new Font("Raleway",Font.BOLD,15));
        b1.setBounds(380, 230, 90, 28);
        b1.addActionListener(this);
        image.add(b1);

        b2=new JButton("Rs 1000");
        b2.setFont(new Font("Raleway",Font.BOLD,15));
        b2.setBounds(380, 270, 90, 28);
        b2.addActionListener(this);
        image.add(b2);

        b3=new JButton("Rs 5000");
        b3.setFont(new Font("Raleway",Font.BOLD,15));
        b3.setBounds(380, 308, 90, 28);
        b3.addActionListener(this);
        image.add(b3);

        b4=new JButton("Rs 500");
        b4.setFont(new Font("Raleway",Font.BOLD,15));
        b4.setBounds(670, 230, 90, 28);
        b4.addActionListener(this);
        image.add(b4);

        b5=new JButton("Rs 2000");
        b5.setFont(new Font("Raleway",Font.BOLD,15));
        b5.setBounds(670, 270, 90, 28);
        b5.addActionListener(this);
        image.add(b5);

        b6=new JButton("Rs 10000");
        b6.setFont(new Font("Raleway",Font.BOLD,13));
        b6.setBounds(670, 308, 90, 28);
        b6.addActionListener(this);
        image.add(b6);

        backbtn=new JButton("Back");
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

        else{
            String amount=((JButton)e.getSource()).getText().substring(3);
            Conn c=new Conn();
            Date date=new Date();
            try {
                ResultSet resultSet=c.statement.executeQuery("select * from bank where pin='"+pin+"'");
                int balance=0;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(resultSet.getString("amount"));
                    }
                    else{
                        balance-=Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if(balance<Integer.parseInt(amount)){
                   JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                }
                c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','Withdraw','"+amount+"')");
                JOptionPane.showMessageDialog(null, "Amount Rs."+amount+" Debited successfully");
                

            } catch (Exception E) {
                JOptionPane.showMessageDialog(null, E.getMessage());
            }
            new main_class(pin);
             setVisible(false);
        }

        
    }
    public static void main(String[] args) {
        new fastCash("");
    }
}
