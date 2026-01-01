package LW_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingUp extends JFrame implements ActionListener {

    private JTextField nameField,emailField,siEmailField;
    private JRadioButton male,female;
    private ButtonGroup group;
    private JComboBox day,month,year;
    private JPasswordField passWordField,siPassWordField;
    private JCheckBox robot;
    private JButton singIn,singUp;

    final String[] dates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    final String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    final String[] years = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};

    SingUp(){

        setTitle("Registration Form");
        setBounds(570,140,400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Container container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.white);

        JLabel suTitle = new JLabel("Sing Up");
        suTitle.setFont(new Font("Arial",Font.BOLD,21));
        suTitle.setForeground(Color.blue);
        suTitle.setSize(200,30);
        suTitle.setLocation(150,12);
        container.add(suTitle);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Arial",Font.BOLD,16));
        name.setForeground(Color.BLACK);
        name.setSize(60,30);
        name.setLocation(20,53);
        container.add(name);

        nameField = new JTextField();
        nameField.setFont(new Font("Calibre",Font.BOLD,16));
        nameField.setSize(200,25);
        nameField.setLocation(140,55);
        nameField.setForeground(Color.BLACK);
        container.add(nameField);

        JLabel email = new JLabel("Email");
        email.setFont(new Font("Arial",Font.BOLD,16));
        email.setForeground(Color.BLACK);
        email.setSize(60,30);
        email.setLocation(20,93);
        container.add(email);

        emailField = new JTextField();
        emailField.setFont(new Font("Calibre",Font.BOLD,16));
        emailField.setSize(200,25);
        emailField.setLocation(140,95);
        emailField.setForeground(Color.BLACK);
        container.add(emailField);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Arial",Font.BOLD,16));
        gender.setForeground(Color.BLACK);
        gender.setSize(60,30);
        gender.setLocation(20,138);
        container.add(gender);

        male = new JRadioButton("Male");
        male.setSize(90,30);
        male.setFont(new Font("Arial",Font.BOLD,16));
        male.setSelected(true);
        male.setLocation(140,133);
        container.add(male);

        female = new JRadioButton("Female");
        female.setSize(90,30);
        female.setFont(new Font("Arial",Font.BOLD,16));
        female.setLocation(240,133);
        container.add(female);

        group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JLabel birthday = new JLabel("Birthday");
        birthday.setFont(new Font("Arial",Font.BOLD,16));
        birthday.setForeground(Color.BLACK);
        birthday.setSize(90,30);
        birthday.setLocation(20,180);
        container.add(birthday);

        day = new JComboBox<>(dates);
        day.setForeground(Color.BLACK);
        day.setSize(45,25);
        day.setFont(new Font("Calibre",Font.BOLD,15));
        day.setLocation(140,183);
        container.add(day);

        month = new JComboBox<>(months);
        month.setForeground(Color.BLACK);
        month.setSize(105,25);
        month.setFont(new Font("Calibre",Font.BOLD,15));
        month.setLocation(185,183);
        container.add(month);

        year = new JComboBox<>(years);
        year.setForeground(Color.BLACK);
        year.setSize(70,25);
        year.setFont(new Font("Calibre",Font.BOLD,15));
        year.setLocation(290,183);
        container.add(year);

        JLabel password = new JLabel("Password");
        password.setFont(new Font("Arial",Font.BOLD,16));
        password.setForeground(Color.BLACK);
        password.setSize(90,30);
        password.setLocation(20,228);
        container.add(password);

        passWordField = new JPasswordField();
        passWordField.setFont(new Font("Calibre",Font.BOLD,16));
        passWordField.setSize(200,25);
        passWordField.setLocation(140,230);
        passWordField.setForeground(Color.BLACK);
        container.add(passWordField);

        robot = new JCheckBox("I am not robot.");
        robot.setForeground(Color.BLACK);
        robot.setSize(200,25);
        robot.setFont(new Font("Calibre",Font.BOLD,16));
        robot.setLocation(20,275);
        container.add(robot);

        singUp = new JButton("Sing Up");
        singUp.setSize(350,33);
        singUp.setLocation(23,320);
        singUp.setForeground(Color.white);
        singUp.setBackground(Color.BLUE);
        singUp.setFont(new Font("Calibre",Font.BOLD,16));
        singUp.addActionListener(this);
        container.add(singUp);

        JLabel siTitle = new JLabel("Sing In");
        siTitle.setFont(new Font("Arial",Font.BOLD,21));
        siTitle.setForeground(Color.blue);
        siTitle.setSize(200,30);
        siTitle.setLocation(165,365);
        container.add(siTitle);

        JLabel siEmail = new JLabel("Email");
        siEmail.setFont(new Font("Arial",Font.BOLD,16));
        siEmail.setForeground(Color.BLACK);
        siEmail.setSize(90,30);
        siEmail.setLocation(20,405);
        container.add(siEmail);

        siEmailField = new JTextField();
        siEmailField.setFont(new Font("Calibre",Font.BOLD,16));
        siEmailField.setSize(200,25);
        siEmailField.setLocation(140,408);
        siEmailField.setForeground(Color.BLACK);
        container.add(siEmailField);

        JLabel siPassword = new JLabel("Password");
        siPassword.setFont(new Font("Arial",Font.BOLD,16));
        siPassword.setForeground(Color.BLACK);
        siPassword.setSize(90,30);
        siPassword.setLocation(20,445);
        container.add(siPassword);

        siPassWordField = new JPasswordField();
        siPassWordField.setFont(new Font("Calibre",Font.BOLD,16));
        siPassWordField.setSize(200,25);
        siPassWordField.setLocation(140,448);
        siPassWordField.setForeground(Color.BLACK);
        container.add(siPassWordField);

        singIn = new JButton("Sing In");
        singIn.setSize(350,33);
        singIn.setLocation(23,  500);
        singIn.setForeground(Color.white);
        singIn.setBackground(Color.BLUE);
        singIn.setFont(new Font("Calibre",Font.BOLD,16));
        singIn.addActionListener(this);
        container.add(singIn);

    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == singUp){
            if(robot.isSelected()){
                if(nameField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Please Enter Your Name.");
                }
                if(emailField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Please Enter Your Email.");
                }
                if(passWordField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Please Enter Your Password.");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Registration Successful .");

                }
            }
            else {
                JOptionPane.showMessageDialog(this,"Please Confirm you are not a robot. ");
            }

        }

        if(e.getSource() == singIn){
            if(siEmailField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please Enter Your Email.");
            }
            if(siPassWordField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please Enter Your Password.");
            }
            else{
                JOptionPane.showMessageDialog(this, "Login Successful.");
            }
        }

    }

}
