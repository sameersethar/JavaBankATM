import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

public class Deposit extends JFrame implements ActionListener{
    JTextField field;
    JButton depositButton,backButton;
    String pin;
    Deposit(String pin){
        super("Deposit");
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pin=pin;
        ImageIcon i1=new ImageIcon("D:/Bank management oop project/images/atm2.png");
        java.awt.Image i2=i1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 1400, 700);
        add(image);

    

        JLabel l1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setFont(new Font("Raleway",Font.BOLD,17));
        l1.setForeground(Color.WHITE);
        l1.setBounds(400,150,500,40);
        image.add(l1);

        field=new JTextField();
        field.setFont(new Font("Raleway",Font.BOLD,17));
        field.setBackground(new Color(65,125,128));
        field.setForeground(Color.WHITE);
        field.setBounds(400,200,330,35);
        image.add(field);

        depositButton=new JButton("Deposit");
        depositButton.setFont(new Font("Raleway",Font.BOLD,17));
        depositButton.setBounds(670,300,100,30);
        depositButton.addActionListener(this);
        image.add(depositButton);

        backButton=new JButton("Back");
        backButton.setFont(new Font("Raleway",Font.BOLD,17));
        backButton.setBounds(670,350,100,30);
        backButton.addActionListener(this);
        image.add(backButton);


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String amount=field.getText();
        Date date=new Date();

        try {
            
            if (e.getSource()==depositButton) {
                if (field.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter amount you want to deposit");
                }
                else{
                    Conn conn=new Conn();
                    conn.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs:"+amount+" deposit successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            }

            else if(e.getSource()==backButton){
                setVisible(false);
                new main_class(pin);
            }



        } catch (Exception E) {
            JOptionPane.showMessageDialog(null,E.getMessage());
        }
        
    }

    
    public static void main(String[] args) {
        new Deposit("");
    }
}
