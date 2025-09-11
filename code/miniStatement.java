import java.awt.*;
import java.sql.ResultSet;

import javax.swing.*;

public class miniStatement extends JFrame{
    String pin;
    miniStatement(String pin){
        this.pin=pin;
        setSize(400, 600);
        getContentPane().setBackground(new Color(255,204,204));
        setLocation(30, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1=new JLabel();
        label1.setBounds(20, 80, 400, 200);
        add(label1);

        JLabel label2=new JLabel("Bank AL-Sheeraz");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(130, 20, 200, 20);
        add(label2);

        JLabel label3=new JLabel();
        label3.setBounds(20, 80, 300, 20);
        add(label3);

        JLabel label4=new JLabel();
        label4.setBounds(20, 450, 300, 20);
        add(label4);

        try {
            Conn conn=new Conn();
            ResultSet resultSet=conn.statement.executeQuery("select * from login where pin='"+pin+"'");
            while(resultSet.next()){
                label3.setText("Card Number: "+resultSet.getString("card_no").substring(0,4)+"XXXXXXXX"+resultSet.getString("card_no").substring(12));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            int balance=0;
            Conn conn=new Conn();
            ResultSet resultSet=conn.statement.executeQuery("select * from bank where pin='"+pin+"'");
            while(resultSet.next()){
                label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");
                if(resultSet.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }
                else{
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs: "+balance);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


        setVisible(true);
    }

    public static void main(String[] args) {
        new miniStatement("");
    }
}
