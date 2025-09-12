import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;
public class Signup extends JFrame implements ActionListener{
    JDateChooser dateChooser;
    JRadioButton maleButton,femaleButton,marriedButton,unmarriedButton,otherButton;
    Random ran = new Random();
    int first4 = ran.nextInt(9000)+1000;
    String first =String.valueOf(first4);
    JButton nextButton;
    JTextField nameTextField,fnameTextField,genderTextField,emailTextField,msTextField,addressTextField,cityTextField,pincodeTextField,stateTextField;
    Signup(){
        super("Application Form");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(222,255,228));

        ImageIcon i1=new ImageIcon("D:/JavaBankATM/images/bank.png");
        Image i2=i1.getImage().getScaledInstance(130,130, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(30, 20, 130, 130);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO."+" "+first);
        label1.setFont(new Font("Raleway",Font.BOLD,28));
        label1.setBounds(470, 15, 420, 30);
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,18));
        label2.setBounds(640, 50, 380, 30);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,20));
        label3.setBounds(595, 75, 400, 50);
        add(label3);

        JLabel name= new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(460, 155, 400, 30);
        add(name);

        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.PLAIN,17));
        nameTextField.setBounds(670, 155, 260, 27);
        add(nameTextField);

        JLabel fname= new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(460, 200, 400, 30);
        add(fname);

        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.PLAIN,17));
        fnameTextField.setBounds(670, 200, 260, 27);
        add(fnameTextField);

        JLabel gender= new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(460, 245, 400, 30);
        add(gender);

        maleButton=new JRadioButton("Male");
        maleButton.setFont(new Font("Raleway",Font.BOLD,13));
        maleButton.setBounds(670, 245, 70, 30);
        maleButton.setBackground(new Color(222,255,228));
        add(maleButton);

        femaleButton=new JRadioButton("Female");
        femaleButton.setFont(new Font("Raleway",Font.BOLD,13));
        femaleButton.setBounds(800, 245, 80, 30);
        femaleButton.setBackground(new Color(222,255,228));
        add(femaleButton);

        ButtonGroup genderButtonGroup=new ButtonGroup();
        genderButtonGroup.add(maleButton);
        genderButtonGroup.add(femaleButton);

        JLabel dateOfBirth= new JLabel("Date of Birth:");
        dateOfBirth.setFont(new Font("Raleway",Font.BOLD,22));
        dateOfBirth.setBounds(460, 290, 400, 30);
        add(dateOfBirth);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(670, 290, 260, 27);
        add(dateChooser);

        JLabel email= new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(460, 335, 400, 30);
        add(email);

        emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.PLAIN,17));
        emailTextField.setBounds(670, 335, 260, 27);
        add(emailTextField);

        JLabel ms= new JLabel("Marital Status:");
        ms.setFont(new Font("Raleway",Font.BOLD,22));
        ms.setBounds(460, 380, 400, 30);
        add(ms);

        marriedButton=new JRadioButton("Married");
        marriedButton.setFont(new Font("Raleway",Font.BOLD,13));
        marriedButton.setBounds(670, 380, 90, 30);
        marriedButton.setBackground(new Color(222,255,228));
        add(marriedButton);

        unmarriedButton=new JRadioButton("Unmarried");
        unmarriedButton.setFont(new Font("Raleway",Font.BOLD,13));
        unmarriedButton.setBounds(760, 380, 110, 30);
        unmarriedButton.setBackground(new Color(222,255,228));
        add(unmarriedButton);

        otherButton=new JRadioButton("Other");
        otherButton.setFont(new Font("Raleway",Font.BOLD,13));
        otherButton.setBounds(870, 380, 110, 30);
        otherButton.setBackground(new Color(222,255,228));
        add(otherButton);

        ButtonGroup msButtonGroup=new ButtonGroup();
        msButtonGroup.add(marriedButton);
        msButtonGroup.add(unmarriedButton);
        msButtonGroup.add(otherButton);

        

        JLabel address= new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(460, 425, 400, 30);
        add(address);

        addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.PLAIN,17));
        addressTextField.setBounds(670, 425, 260, 27);
        add(addressTextField);

        JLabel city= new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(460, 470, 400, 30);
        add(city);

        cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.PLAIN,17));
        cityTextField.setBounds(670, 470, 260, 27);
        add(cityTextField);

        JLabel pincode= new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(460, 515, 400, 30);
        add(pincode);

        pincodeTextField=new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.PLAIN,17));
        pincodeTextField.setBounds(670, 515, 260, 27);
        add(pincodeTextField);

        JLabel state= new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(460, 560, 400, 30);
        add(state);

        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.PLAIN,17));
        stateTextField.setBounds(670, 560, 260, 27);
        add(stateTextField);

        nextButton=new JButton("Next");
        nextButton.setFont(new Font("Arial",Font.BOLD,14));
        nextButton.setBounds(840, 610, 90, 28);
        nextButton.setBackground(Color.LIGHT_GRAY);
        nextButton.setForeground(Color.BLACK);
        nextButton.addActionListener(this);
        add(nextButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==nextButton){
            String formNo=first;
        String name=nameTextField.getText();
        String fName=fnameTextField.getText();
        String gender=null;
        if(maleButton.isSelected()){
            gender="Male";
        }
        else if(femaleButton.isSelected()){
            gender="Female";
        }
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String email=emailTextField.getText();
        String ms=null;
        if(marriedButton.isSelected()){
            ms="Married";
        }
        else if(unmarriedButton.isSelected()){
            ms="Unmarried";
        }
        else if(otherButton.isSelected()){
            ms="Other";
        }
        String address=addressTextField.getText();
        String city=cityTextField.getText();
        String pincode=pincodeTextField.getText();
        String state=stateTextField.getText();

        try {
            
            if(name.equals("") || fName.equals("") || gender == null || dob.equals("") || email.equals("") || ms == null || address.equals("") || city.equals("") || pincode.equals("") || state.equals("")){
    JOptionPane.showMessageDialog(null, "Please fill all the fields!");
    return; 
}

if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
    JOptionPane.showMessageDialog(null, "Please enter a valid email address!");
    return;
}

            else{
                Conn conn=new Conn();
                String q="insert into signup values ('"+formNo+"','"+name+"','"+fName+"','"+gender+"','"+dob+"','"+email+"','"+ms+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                conn.statement.executeUpdate(q);
                new Signup2(formNo);
                this.setVisible(false);
            }


        } catch (Exception E) {
            E.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + E.getMessage());
        }
        
        }
        
    }
    public static void main(String[] args) {
        new Signup();
    }
}
