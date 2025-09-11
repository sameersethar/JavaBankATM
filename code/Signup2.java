import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Signup2 extends JFrame implements ActionListener{
    String formNo;
    JComboBox comboBox1,comboBox2,comboBox3,comboBox4;
    JTextField cnicTextField;
    JRadioButton button1,button2,button3,button4;
    JButton nextButton,backButton;
    
    Signup2(String formNo){
        super("Application Form");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(222,255,228));
        
        this.formNo=formNo;
        JLabel label1=new JLabel("Application Form No: "+formNo);
        label1.setFont(new Font("Raleway",Font.BOLD,28));
        label1.setBounds(470, 15, 420, 30);
        add(label1);

        JLabel label2=new JLabel("Page 2");
        label2.setFont(new Font("Raleway",Font.BOLD,18));
        label2.setBounds(640, 50, 380, 30);
        add(label2);

        JLabel label3=new JLabel("Additional Details");
        label3.setFont(new Font("Raleway",Font.BOLD,20));
        label3.setBounds(595, 75, 400, 50);
        add(label3);

        JLabel religion= new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,22));
        religion.setBounds(410, 200, 400, 30);
        add(religion);

        String Religion[]={"Muslim","Hindu","Christian","other"};
        comboBox1=new JComboBox(Religion);
        comboBox1.setFont(new Font("Raleway",Font.BOLD,17));
        comboBox1.setBounds(700, 200, 260, 27);
        comboBox1.setBackground(new Color(211, 211, 211));
        add(comboBox1);

        JLabel income= new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,22));
        income.setBounds(410, 250, 400, 30);
        add(income);

        String Income[]={"null","<150,000","<250,000","50,000","Upto 10,00,000","Above 10,00,000"};
        comboBox2=new JComboBox(Income);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,17));
        comboBox2.setBounds(700, 250, 260, 27);
        comboBox2.setBackground(new Color(211, 211, 211));
        add(comboBox2);

        JLabel qualification= new JLabel("Educational Qualification:");
        qualification.setBounds(410, 300, 400, 30);
        qualification.setFont(new Font("Raleway",Font.BOLD,22));
        add(qualification);

        String Qualification[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        comboBox3=new JComboBox(Qualification);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,17));
        comboBox3.setBounds(700, 300, 260, 27);
        comboBox3.setBackground(new Color(211, 211, 211));
        add(comboBox3);

        JLabel occupation= new JLabel("Occupation:");
        occupation.setBounds(410, 350, 400, 30);
        occupation.setFont(new Font("Raleway",Font.BOLD,22));
        add(occupation);

        String Occupation[]={"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
        comboBox4=new JComboBox(Occupation);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,17));
        comboBox4.setBounds(700, 350, 260, 27);
        comboBox4.setBackground(new Color(211, 211, 211));
        add(comboBox4);

        JLabel cnic= new JLabel("CNIC:");
        cnic.setBounds(410, 400, 400, 30);
        cnic.setFont(new Font("Raleway",Font.BOLD,22));
        add(cnic);

        cnicTextField=new JTextField();
        cnicTextField.setFont(new Font("Raleway",Font.PLAIN,17));
        cnicTextField.setBounds(700, 400, 260, 27);
        add(cnicTextField);

        JLabel seniorcitizen= new JLabel("Senior Citizen:");
        seniorcitizen.setBounds(410, 450, 400, 30);
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD,22));
        add(seniorcitizen);

        button1=new JRadioButton("Yes");
        button1.setBounds(700,450,80,40);
        button1.setFont(new Font("Raleway",Font.BOLD,16));
        button1.setBackground(new Color(222,255,228));
        add(button1);

        button2=new JRadioButton("No");
        button2.setBounds(800,450,80,40);
        button2.setFont(new Font("Raleway",Font.BOLD,16));
        button2.setBackground(new Color(222,255,228));
        add(button2);

        ButtonGroup group1=new ButtonGroup();
        group1.add(button1);
        group1.add(button2);

        JLabel existingaccount= new JLabel("Existing Account:");
        existingaccount.setBounds(410, 500, 400, 30);
        existingaccount.setFont(new Font("Raleway",Font.BOLD,22));
        add(existingaccount);

        button3=new JRadioButton("Yes");
        button3.setBounds(700,500,80,40);
        button3.setFont(new Font("Raleway",Font.BOLD,16));
        button3.setBackground(new Color(222,255,228));
        add(button3);

        button4=new JRadioButton("No");
        button4.setBounds(800,500,80,40);
        button4.setFont(new Font("Raleway",Font.BOLD,16));
        button4.setBackground(new Color(222,255,228));
        add(button4);

        ButtonGroup group2=new ButtonGroup();
        group2.add(button3);
        group2.add(button4);

        nextButton = new JButton("Next");
        nextButton.setFont(new Font("Raleway",Font.BOLD,18));
        nextButton.setBounds(880,600,80,30);
        nextButton.addActionListener(this);
        add(nextButton);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String form_no=formNo;
        String religion=(String)comboBox1.getSelectedItem(); 
        String income=(String)comboBox2.getSelectedItem(); 
        String educational=(String)comboBox3.getSelectedItem(); 
        String occupation=(String)comboBox4.getSelectedItem(); 
        String cnic=cnicTextField.getText(); 
        String seniorCitizen=null;
        if(button1.isSelected()){
            seniorCitizen="Yes";
        }
        else if(button2.isSelected()){
            seniorCitizen="No";

        }
        String existingAccount=null;
        if(button3.isSelected()){
            existingAccount="Yes";
        }
        else if(button4.isSelected()){
            existingAccount="No";

        }

        try {
            
            if (religion.isEmpty() ||
    income.isEmpty() ||
    educational.isEmpty() ||
    occupation.isEmpty() ||
    cnic.isEmpty() ||
    seniorCitizen == null ||
    existingAccount == null ||
    cnicTextField.getText().isEmpty()) {

    JOptionPane.showMessageDialog(null, "Fill all the fields");
}

            else{
                Conn conn=new Conn();
                String q="insert into signup2 values('"+form_no+"','"+religion+"','"+income+"','"+educational+"','"+occupation+"','"+cnic+"','"+seniorCitizen+"','"+existingAccount+"')";
                conn.statement.executeUpdate(q);
                new Signup3(form_no);
                this.setVisible(false);
            }
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null,"Error"+E.getMessage());
        }
         

        
    }
    public static void main(String[] args) {
        new Signup2("");
    }
}
