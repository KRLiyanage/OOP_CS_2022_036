package LW_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {


    JTextField nameText,mobileText;
    JRadioButton male,female;
    JComboBox day,month,year;
    JTextArea addressText,outText;
    JCheckBox terms;
    JButton submit,reset;

    final String[] dates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    final String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    final String[] years = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};

    RegistrationForm(){

        setTitle("My Form");
        setSize(1000,650);
        setResizable(false);
        setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        JLabel titel = new JLabel("Registration Form");
        titel.setForeground(Color.black);
        titel.setSize(230,75);
        titel.setFont(new Font("Arial", Font.BOLD, 26));
        titel.setLocation(370,10);
        contentPane.add(titel);

        JLabel name = new JLabel("Name :");
        name.setSize(150,60);
        name.setForeground(Color.BLACK);
        name.setFont(new Font("Arial", Font.BOLD, 18));
        name.setLocation(60,80);
        contentPane.add(name);

        nameText = new JTextField();
        nameText.setSize(300,30);
        nameText.setForeground(Color.BLACK);
        nameText.setFont(new Font("Arial", Font.BOLD, 18));
        nameText.setLocation(150,95);
        contentPane.add(nameText);

        JLabel mobile = new JLabel("Mobile :");
        mobile.setSize(150,60);
        mobile.setForeground(Color.BLACK);
        mobile.setFont(new Font("Arial", Font.BOLD, 18));
        mobile.setLocation(60,125);
        contentPane.add(mobile);

        mobileText = new JTextField();
        mobileText.setSize(200,30);
        mobileText.setForeground(Color.BLACK);
        mobileText.setFont(new Font("Arial", Font.BOLD, 18));
        mobileText.setLocation(150,140);
        contentPane.add(mobileText);

        JLabel gender = new JLabel("Gender :");
        gender.setSize(150,60);
        gender.setForeground(Color.BLACK);
        gender.setFont(new Font("Arial", Font.BOLD, 18));
        gender.setLocation(60,180);
        contentPane.add(gender);

        male = new JRadioButton("Male");
        male.setSelected(true);
        male.setSize(90,30);
        male.setForeground(Color.BLACK);
        male.setFont(new Font("Arial", Font.BOLD, 18));
        male.setLocation(160,195);
        contentPane.add(male);

        female = new JRadioButton("Female");
        female.setSelected(false);
        female.setSize(100,30);
        female.setForeground(Color.BLACK);
        female.setFont(new Font("Arial", Font.BOLD, 18));
        female.setLocation(250,195);
        contentPane.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JLabel dob = new JLabel("DOB :");
        dob.setSize(150,30);
        dob.setForeground(Color.BLACK);
        dob.setFont(new Font("Arial", Font.BOLD, 18));
        dob.setLocation(60,250);
        contentPane.add(dob);

        day = new JComboBox<>(dates);
        day.setForeground(Color.BLACK);
        day.setSize(50,30);
        day.setFont(new Font("Arial", Font.BOLD, 18));
        day.setLocation(130,250);
        contentPane.add(day);

        month = new JComboBox<>(months);
        month.setForeground(Color.BLACK);
        month.setSize(120,30);
        month.setFont(new Font("Arial", Font.BOLD, 18));
        month.setLocation(180,250);
        contentPane.add(month);

        year = new JComboBox<>(years);
        year.setForeground(Color.BLACK);
        year.setSize(70,30);
        year.setFont(new Font("Arial", Font.BOLD, 18));
        year.setLocation(300,250);
        contentPane.add(year);

        JLabel address = new JLabel("Address :");
        address.setSize(150,30);
        address.setForeground(Color.BLACK);
        address.setFont(new Font("Arial", Font.BOLD, 18));
        address.setLocation(60,300);
        contentPane.add(address);

        addressText = new JTextArea();
        addressText.setForeground(Color.BLACK);
        addressText.setSize(250,90);
        addressText.setFont(new Font("Arial", Font.BOLD, 18));
        addressText.setLocation(150,305);
        addressText.setLineWrap(true);
        contentPane.add(addressText);

        outText = new JTextArea();
        outText.setSize(300,400);
        outText.setForeground(Color.BLACK);
        outText.setFont(new Font("Arial", Font.BOLD, 18));
        outText.setLocation(600,95);
        outText.setLineWrap(true);
        contentPane.add(outText);

        terms = new JCheckBox("Accept terms & conditions.");
        terms.setSize(300,30);
        terms.setForeground(Color.BLACK);
        terms.setLocation(110,425);
        terms.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(terms);

        submit = new JButton("Submit");
        submit.setSize(120,25);
        submit.setFont(new Font("Arial", Font.BOLD, 18));
        submit.setLocation(110,500);
        submit.addActionListener(this);
        contentPane.add(submit);

        reset = new JButton("Reset");
        reset.setSize(120,25);
        reset.setFont(new Font("Arial", Font.BOLD, 18));
        reset.setLocation(250,500);
        reset.addActionListener(this);
        contentPane.add(reset);

    }

    public void actionPerformed(ActionEvent e){
        String nameTxt = nameText.getText();
        String mobileTxt = mobileText.getText();
        String genderTxt = "";
        if (male.isSelected()) {
            genderTxt = "Male";
        } else if (female.isSelected()) {
            genderTxt = "Female";
        }
        String dayTxt = day.getSelectedItem().toString();
        String monthTxt = month.getSelectedItem().toString();
        String yearTxt = year.getSelectedItem().toString();
        String addressTxt = addressText.getText();

        JButton selectedBtn = (JButton) e.getSource();
        if(selectedBtn == submit) {
            if (terms.isSelected()){
                System.out.println("Printing details.");
                outText.setText(" Name: " + nameTxt + "\n Mobile: " + mobileTxt+ "\n Gender: " + genderTxt + "\n Date: " + dayTxt + "-" + monthTxt + "-" + yearTxt + "\n Address: " + addressTxt);
            } else {
                JOptionPane.showMessageDialog(this, "Please accept terms & conditions to submit.");
            }
        } else if (selectedBtn == reset) {

            System.out.println("Resetting everything");
            nameText.setText("");
            mobileText.setText("");
            male.setSelected(true);
            female.setSelected(false);
            day.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            addressText.setText("");
            terms.setSelected(false);
            outText.setText("");
        }


    }


}
