import javax.swing.*;
import java.awt.*;

public class Formclass extends JFrame {
    private JLabel heading;
    Font font=new Font("",Font.BOLD, 30);
    private JPanel mainPanel;
    private JLabel nameLabel,passwordLabel;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton button1,button2;
    public Formclass() {
        super.setTitle("my  bcb");
        super.setSize(400, 400);
        super.setLocation(100, 100);
        this.createGUI();
        super.setVisible(true);
        System.out.println("dvcvc");

    }
    public void createGUI(){
        this.setLayout(new BorderLayout());
        heading=new JLabel("my first form");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);
        this.add(heading,BorderLayout.NORTH);
        mainPanel=new JPanel();
        mainPanel.setLayout(new GridLayout(3,2));
   nameLabel=new JLabel("enter name");
    nameLabel.setFont(font);
    passwordLabel=new JLabel("enter password");
    passwordLabel.setFont(font);
    nameTextField=new JTextField();
    nameTextField.setFont(font);
    passwordField=new JPasswordField();
    passwordField.setFont(font);
    button1=new JButton("submit details");
    button1.setFont(font);
    button2=new JButton("reset details");
    button2.setFont(font);
    mainPanel.add(nameLabel);
    mainPanel.add(nameTextField);
    mainPanel.add(passwordLabel);
    mainPanel.add(passwordField);
    mainPanel.add(button1);
    mainPanel.add(button2);
    this.add(mainPanel,BorderLayout.CENTER);
    }



    }

