import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceInquiry extends JFrame implements ActionListener{
    JLabel label2;
    JButton backbtn;
    String pin;
    BalanceInquiry(String pin){
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

        JLabel label=new JLabel("Your current account Balance is: ");
        label.setFont(new Font("Raleway",Font.BOLD,18));
        label.setForeground(Color.WHITE);
        label.setBounds(420,150,500,40);
        image.add(label);

        label2=new JLabel("");
        label2.setFont(new Font("Raleway",Font.BOLD,18));
        label2.setForeground(Color.WHITE);
        label2.setBounds(420,200,500,40);
        image.add(label2);

        backbtn=new JButton("Back");
        backbtn.setFont(new Font("Raleway",Font.BOLD,13));
        backbtn.setBounds(660,345,100,30);
        backbtn.addActionListener(this);
        image.add(backbtn);

        try {
            int balance=0;
            Conn c=new Conn();
            ResultSet resultSet=c.statement.executeQuery("select * from bank where pin='"+pin+"'");
            while(resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }
                else{
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label2.setText(""+balance);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==backbtn){
        new main_class(pin);
        setVisible(false);
       }
        
    }
    public static void main(String[] args) {
        new BalanceInquiry("");
    }
}
