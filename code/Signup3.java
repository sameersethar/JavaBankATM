import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Signup3 extends JFrame implements ActionListener{
    String formNo;
    JRadioButton r1,r2,r3,r4;
    JCheckBox b1,b2,b3,b4,b5,b6,b7;
    JButton submitButton,cancelButton;
    Signup3(String formNo){
        super("Application Form");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(222,255,228));
        this.formNo=formNo;
        JLabel label1=new JLabel("Application Form NO: "+formNo);
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.setBounds(470, 15, 420, 30);
        add(label1);

        JLabel label2=new JLabel("Page 3");
        label2.setFont(new Font("Raleway",Font.BOLD,18));
        label2.setBounds(640, 50, 380, 30);
        add(label2);

        JLabel label3=new JLabel("Account Details");
        label3.setFont(new Font("Raleway",Font.BOLD,20));
        label3.setBounds(595, 75, 400, 50);
        add(label3);

        JLabel accounttype=new JLabel("Account Type:");
        accounttype.setFont(new Font("Raleway",Font.BOLD,22));
        accounttype.setBounds(420, 140, 300, 50);
        add(accounttype);

        r1=new JRadioButton("Saving Account");
        r1.setBounds(420, 190, 200, 40);
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2=new JRadioButton("Fixed Deposit Account");
        r2.setBounds(700, 190, 200, 40);
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(222,255,228));
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setBounds(420, 220, 200, 40);
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(222,255,228));
        add(r3);

        r4=new JRadioButton("Recurring Deposit Account");
        r4.setBounds(700, 220, 250, 40);
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(222,255,228));
        add(r4);

        ButtonGroup group1=new ButtonGroup();
        group1.add(r1);
        group1.add(r2);
        group1.add(r3);
        group1.add(r4);

        JLabel cardnumber=new JLabel("Card Number:");
        cardnumber.setFont(new Font("Raleway",Font.BOLD,22));
        cardnumber.setBounds(420, 270, 300, 50);
        add(cardnumber);

        JLabel cardnumberextension1=new JLabel("(Your 16-digit Card Number)");
        cardnumberextension1.setFont(new Font("Raleway",Font.BOLD,14));
        cardnumberextension1.setBounds(420, 300, 400, 50);
        add(cardnumberextension1);

        JLabel cardnumberextension2=new JLabel("XXXX-XXXX-XXXX-XXXX");
        cardnumberextension2.setFont(new Font("Raleway",Font.BOLD,20));
        cardnumberextension2.setBounds(700, 270, 300, 50);
        add(cardnumberextension2);

        JLabel cardnumberextension3=new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        cardnumberextension3.setFont(new Font("Raleway",Font.BOLD,14));
        cardnumberextension3.setBounds(700, 300, 450, 50);
        add(cardnumberextension3);

        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(420, 360, 300, 50);
        add(pin);

        JLabel pinextension1=new JLabel("(4-digit password)");
        pinextension1.setFont(new Font("Raleway",Font.BOLD,14));
        pinextension1.setBounds(420, 390, 300, 50);
        add(pinextension1);

        JLabel pinextension2=new JLabel("XXXX");
        pinextension2.setFont(new Font("Raleway",Font.BOLD,20));
        pinextension2.setBounds(700, 360, 300, 50);
        add(pinextension2);

        JLabel services=new JLabel("Services required:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(420, 450, 300, 50);
        add(services);

        b1= new JCheckBox("ATM Card");
        b1.setFont(new Font("Raleway",Font.BOLD,18));
        b1.setBackground(new Color(222,255,228));
        b1.setBounds(420, 510, 200, 30);
        add(b1);

        b2= new JCheckBox("Mobile Banking");
        b2.setFont(new Font("Raleway",Font.BOLD,18));
        b2.setBackground(new Color(222,255,228));
        b2.setBounds(650, 510, 200, 30);
        add(b2);

        b3= new JCheckBox("Cheque Book");
        b3.setFont(new Font("Raleway",Font.BOLD,18));
        b3.setBackground(new Color(222,255,228));
        b3.setBounds(900, 510, 200, 30);
        add(b3);

        b4= new JCheckBox("Internet Banking");
        b4.setFont(new Font("Raleway",Font.BOLD,18));
        b4.setBackground(new Color(222,255,228));
        b4.setBounds(420, 550, 200, 30);
        add(b4);

        b5= new JCheckBox("Email Alerts");
        b5.setFont(new Font("Raleway",Font.BOLD,18));
        b5.setBackground(new Color(222,255,228));
        b5.setBounds(650, 550, 200, 30);
        add(b5);

        b6= new JCheckBox("E-Statement");
        b6.setFont(new Font("Raleway",Font.BOLD,18));
        b6.setBackground(new Color(222,255,228));
        b6.setBounds(900, 550, 200, 30);
        add(b6);

        b7= new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge",true);
        b7.setFont(new Font("Raleway",Font.BOLD,18));
        b7.setBackground(new Color(222,255,228));
        b7.setBounds(420, 600, 800, 30);
        add(b7);

        submitButton=new JButton("Submit");
        submitButton.setFont(new Font("Raleway",Font.BOLD,18));
        submitButton.setBounds(420, 650, 100, 30);
        submitButton.addActionListener(this);
        add(submitButton);

        cancelButton=new JButton("Cancel");
        cancelButton.setFont(new Font("Raleway",Font.BOLD,18));
        cancelButton.setBounds(600, 650, 100, 30);
        cancelButton.addActionListener(this);
        add(cancelButton);


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       

        
            String accountType=null;
            if(r1.isSelected()){
                accountType="Saving Account";
            }
            else if(r2.isSelected()){
                accountType="Fixed Deposit Account";
            }
            else if(r3.isSelected()){
                accountType="Current Account";
            }
            else if(r4.isSelected()){
                accountType="Recurring Deposit Account";
            }

            Random rand=new Random();
            String accountNo="";
            for(int i=0;i<16;i++){
                accountNo+=rand.nextInt(10);
            }
            String pin="";
            for(int i=0;i<4;i++){
                pin+=rand.nextInt(10);
            }

            StringBuilder servicesBuilder=new StringBuilder();
            if (b1.isSelected()) {
                servicesBuilder.append("ATM Card, ");
            }
            if (b2.isSelected()) {
                servicesBuilder.append("Mobile Banking, ");
            }
            if (b3.isSelected()) {
                servicesBuilder.append("Cheque Book, ");
            }
            if (b4.isSelected()) {
                servicesBuilder.append("Internet Banking, ");
            }
            if (b6.isSelected()) {
                servicesBuilder.append("Email Alerts, ");
            }
            if (b7.isSelected()) {
                servicesBuilder.append("E-Statement, ");
            }

           String services= servicesBuilder.toString().trim();
           if (services.endsWith(",")) {
            services=services.substring(0, services.length()-1);
           }

           String checkbox=null;
           if (b7.isSelected()) {
            checkbox="Selected";
           }
           

            try {
                if(e.getSource()==submitButton){
                    if (accountType==null||accountNo.isEmpty()||pin.isEmpty()||services.isEmpty()||checkbox==null) {
                    JOptionPane.showMessageDialog(null, "fill all the fields");
                }

                else{
                    Conn conn=new Conn();
                    String q1="insert into signup3 values ('"+formNo+"','"+accountType+"','"+accountNo+"','"+pin+"','"+services+"')";
                    String q2="insert into login values ('"+formNo+"','"+accountNo+"','"+pin+"')";
                    conn.statement.executeUpdate(q1);
                    conn.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: "+accountNo+"\n Pin: "+pin);
                    new Login();
                    this.setVisible(false);
                }
                }

                else if(e.getSource()==cancelButton){
                    System.exit(0);
                }
                







            } catch (Exception E) {
                JOptionPane.showMessageDialog(null, E.getMessage());
            }



        }
        
        
    
    public static void main(String[] args) {
        new Signup3("");
    }
}
