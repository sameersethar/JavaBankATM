import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
public class Withdraw extends JFrame implements ActionListener{
    JTextField field;
    JButton withdrawbtn,backbtn;
    String pin;
    Withdraw(String pin){
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        this.pin=pin;

        ImageIcon i1=new ImageIcon("images/atm2.png");
        java.awt.Image i2=i1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1400, 700);
        add(image);

        JLabel label=new JLabel("PLEASE ENTER YOUR AMOUNT");
        label.setFont(new Font("Raleway",Font.BOLD,17));
        label.setForeground(Color.WHITE);
        label.setBounds(440,150,500,40);
        image.add(label);

        field=new JTextField();
        field.setFont(new Font("Raleway",Font.BOLD,17));
        field.setBackground(new Color(65,125,128));
        field.setForeground(Color.WHITE);
        field.setBounds(405,200,330,35);
        image.add(field);

        withdrawbtn=new JButton("Withdraw");
        withdrawbtn.setFont(new Font("Raleway",Font.BOLD,13));
        withdrawbtn.setBounds(660,306,100,30);
        withdrawbtn.addActionListener(this);
        image.add(withdrawbtn);

        backbtn=new JButton("Back");
        backbtn.setFont(new Font("Raleway",Font.BOLD,13));
        backbtn.setBounds(660,345,100,30);
        backbtn.addActionListener(this);
        image.add(backbtn);

        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==withdrawbtn) {
            try {
                String amount=field.getText();
                Date date = new Date();
                if (field.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter amount you want to withdraw");
                }
                else{
                    Conn c=new Conn();
                    ResultSet resultSet=c.statement.executeQuery("select * from bank where pin='"+pin+"'");
                    int netBalance=0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            netBalance+=Integer.parseInt(resultSet.getString("amount"));
                        }
                        else {
                            netBalance-=Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if(netBalance<Integer.parseInt(amount)){
                        JOptionPane.showMessageDialog(null,"Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdraw','"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                    setVisible(false);
                    new main_class(pin);

                }
            } catch (Exception E) {
                JOptionPane.showMessageDialog(null, E.getMessage());
            }
        }

        else if(e.getSource()==backbtn){
            new main_class(pin);
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Withdraw("");
    }
}
