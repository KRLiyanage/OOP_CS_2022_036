package LW_09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

    JButton back;

    Home() {

        setTitle("Name and Address");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(240, 240, 240));
        headerPanel.setPreferredSize(new Dimension(800, 60));

        back = new JButton(" < ");
        back.setFont(new Font("Arial", Font.BOLD, 20));
        back.setFocusPainted(false);
        back.addActionListener(this);


        JLabel title = new JLabel("Home", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.BLUE);

        headerPanel.add(back, BorderLayout.WEST);
        headerPanel.add(title, BorderLayout.CENTER);


        ImageIcon icon = new ImageIcon("src/LW_09/home.png");
        JLabel imgLabel = new JLabel(icon);
        imgLabel.setHorizontalAlignment(JLabel.CENTER);


        JScrollPane scrollPane = new JScrollPane(imgLabel);

        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            this.dispose();
            new SingUp();
        }
    }


}