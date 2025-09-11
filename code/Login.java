
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
public class Login extends JFrame implements ActionListener{
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton loginButton,clearButton,signupButton;
    Login(){
        super("Bank Management System");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon("D:/Bank management oop project/images/bank.png");
        Image i2=i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(590,10,150,150);
        add(image);

        ImageIcon ii1 = new ImageIcon("D:/Bank management oop project/images/card.png");
        Image ii2=ii1.getImage().getScaledInstance(140,140,Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(1100,620,140,140);
        add(iimage);

        label1=new JLabel("WELCOME TO ATM");
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setForeground(Color.WHITE);
        label1.setBounds(500, 200, 450, 40);
        add(label1);

        label2=new JLabel("Card No:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(440, 300, 200, 40);
        add(label2);

        textField2=new JTextField(14);
        textField2.setBounds(660, 300, 280, 35);
        textField2.setFont(new Font("Arial",Font.PLAIN,20));
        add(textField2);

        label3=new JLabel("PIN:");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(440, 380, 200, 40);
        add(label3);

        passwordField3=new JPasswordField(14);
        passwordField3.setBounds(660, 380, 280, 35);
        passwordField3.setFont(new Font("Arial",Font.PLAIN,20));
        add(passwordField3);

        loginButton=new JButton("LOGIN");
        loginButton.setFont(new Font("Arial",Font.BOLD,14));
        loginButton.setBounds(525, 480, 110, 30);
        loginButton.setBackground(Color.LIGHT_GRAY);
        loginButton.setForeground(Color.BLACK);
        loginButton.addActionListener(this);
        add(loginButton);

        clearButton=new JButton("CLEAR");
        clearButton.setFont(new Font("Arial",Font.BOLD,14));
        clearButton.setBounds(730, 480, 110, 30);
        clearButton.setBackground(Color.LIGHT_GRAY);
        clearButton.setForeground(Color.BLACK);
        clearButton.addActionListener(this);
        add(clearButton);

        signupButton=new JButton("SIGNUP");
        signupButton.setFont(new Font("Arial",Font.BOLD,14));
        signupButton.setBounds(525, 550, 315, 35);
        signupButton.setBackground(Color.LIGHT_GRAY);
        signupButton.setForeground(Color.BLACK);
        signupButton.addActionListener(this);
        add(signupButton);

        ImageIcon iii1 = new ImageIcon("D:/Bank management oop project/images/backbg.png");
        Image iii2=iii1.getImage().getScaledInstance(1400,720,Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage=new JLabel(iii3);
        iiimage.setBounds(0,0,1400,720);
        add(iiimage);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            if(e.getSource()==loginButton){
               if (textField2.getText().equals("")||passwordField3.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Please input in both fields");
               }
               else{
                Conn conn=new Conn();
                String cardNo = textField2.getText();
                String pin = new String(passwordField3.getPassword()); 

                String q = "SELECT * FROM login WHERE card_no = ? AND pin = ?";
                java.sql.PreparedStatement ps = conn.connection.prepareStatement(q);
                ps.setString(1, cardNo);
                ps.setString(2, pin);

                ResultSet resultSet = ps.executeQuery();
                if (resultSet.next()) {
                    setVisible(false);
                    new main_class(pin);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card No or Pin");
                }

               }
            }
            else if(e.getSource()==clearButton){

                textField2.setText("");
                passwordField3.setText("");

            }
            else if(e.getSource()==signupButton){
                new Signup();
                setVisible(false);
            }
            
        } catch (Exception E) {
            E.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + E.getMessage());
        }
        
    }
    public static void main(String args[]){
      new Login();
    }
    
}