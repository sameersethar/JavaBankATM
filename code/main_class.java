import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class main_class extends JFrame implements ActionListener{


    JButton depositbtn,withdrawbtn,fastcashbtn,ministatementbtn,pinchangebtn,balanceenquirybtn,exitbtn;
    String pin;
    main_class(String pin){
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        this.pin=pin;
         ImageIcon i1=new ImageIcon("D:/Bank management oop project/images/atm2.png");
        java.awt.Image i2=i1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 1400, 700);
        add(image);

        JLabel label=new JLabel("Please select your transaction");
        label.setFont(new Font("Raleway",Font.BOLD,20));
        label.setForeground(Color.WHITE);
        label.setBounds(420, 150, 500, 30);
        image.add(label);

        depositbtn=new JButton("DEPOSIT");
        depositbtn.setFont(new Font("Raleway",Font.BOLD,12));
        depositbtn.setBounds(380, 228, 130, 31);
        depositbtn.addActionListener(this);
        image.add(depositbtn);

        fastcashbtn=new JButton("FAST CASH");
        fastcashbtn.setFont(new Font("Raleway",Font.BOLD,12));
        fastcashbtn.setBounds(380, 268, 130, 31);
        fastcashbtn.addActionListener(this);
        image.add(fastcashbtn);

        pinchangebtn=new JButton("PIN CHANGE");
        pinchangebtn.setFont(new Font("Raleway",Font.BOLD,12));
        pinchangebtn.setBounds(380, 308, 130, 31);
        pinchangebtn.addActionListener(this);
        image.add(pinchangebtn);

        withdrawbtn=new JButton("WITHDRAW");
        withdrawbtn.setFont(new Font("Raleway",Font.BOLD,12));
        withdrawbtn.setBounds(630, 228, 130, 31);
        withdrawbtn.addActionListener(this);
        image.add(withdrawbtn);

        ministatementbtn=new JButton("MINI STATEMENT");
        ministatementbtn.setFont(new Font("Raleway",Font.BOLD,12));
        ministatementbtn.setBounds(630, 268, 130, 31);
        ministatementbtn.addActionListener(this);
        image.add(ministatementbtn);

        balanceenquirybtn=new JButton("BALANCE INQUIRY");
        balanceenquirybtn.setFont(new Font("Raleway",Font.BOLD,11));
        balanceenquirybtn.setBounds(630, 306, 130, 31);
        balanceenquirybtn.addActionListener(this);
        image.add(balanceenquirybtn);

        exitbtn=new JButton("EXIT");
        exitbtn.setFont(new Font("Raleway",Font.BOLD,12));
        exitbtn.setBounds(630, 345, 130, 31);
        exitbtn.addActionListener(this);
        image.add(exitbtn);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==depositbtn) {
            new Deposit(pin);
            setVisible(false);
        }
        else if(e.getSource()==exitbtn){
            System.exit(0);
        }
        else if (e.getSource()==withdrawbtn) {
            new Withdraw(pin);
            setVisible(false);
        }
        else if(e.getSource()==balanceenquirybtn){
            new BalanceInquiry(pin);
            setVisible(false);
        }
        else if(e.getSource()==fastcashbtn){
            new fastCash(pin);
            setVisible(false);
        }
        else if(e.getSource()==pinchangebtn){
            new pin(pin);
            setVisible(false);
        }
        else if(e.getSource()==ministatementbtn){
            new miniStatement(pin);
        }
        
    }
    public static void main(String[] args) {
        new main_class("");
    }
}
