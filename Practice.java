import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class LoginController {
    
    public static void main(String[] args) {
        LoginView log = new LoginView();

        log.loginGui();
    
    }
}
class LoginView{

    void loginGui(){

        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
         
        JPanel panel1 = new JPanel();
        panel1.setSize(400,400);
        panel1.setLayout(null);
        panel1.setBackground(new Color(255,255,255));
        frame.add(panel1);

        JLabel loginLabel = new JLabel("LOGIN");
        loginLabel.setBounds(150,30,100,30);
        loginLabel.setFont(new Font("Serif",  Font.BOLD, 24));
        loginLabel.setForeground(new Color(0,0,0));
        panel1.add(loginLabel);

        JLabel labelUsername = new JLabel("Username");
        labelUsername.setBounds(50,100,100,30);
        labelUsername.setForeground(new Color(0,0,0));
        panel1.add(labelUsername);

        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(50,135,300,30);
        panel1.add(usernameTxt);

        JLabel labelPassword = new JLabel("Password");
        labelPassword.setBounds(50,170,100,30);
        labelPassword.setForeground(new Color(0,0,0));
        panel1.add(labelPassword);

        JTextField passwordTxt = new JTextField();
        passwordTxt.setBounds(50,205,300,30);
        panel1.add(passwordTxt);

        JButton loginBtn = new JButton("LOGIN");
        loginBtn.setBounds(100,250,200,30);
        loginBtn.setBackground(new Color(0,89,179));
        loginBtn.setForeground(new Color(255,255,255));
        panel1.add(loginBtn);

        JButton registerBtn = new JButton("REGISTER");
        registerBtn.setBounds(100,290,200,30);
        registerBtn.setBackground(new Color(0,204,0));
        registerBtn.setForeground(new Color(255,255,255));
        registerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current registration window
                frame.dispose();

                // Open the login window
                 RegisterView registerView = new RegisterView();
                registerView.registerGui();
            }
        });
        panel1.add(registerBtn);




        frame.setVisible(true);
        

       
       
    }

}
class RegisterView{

   public void registerGui(){

        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
         
        JPanel panel2 = new JPanel();
        panel2.setSize(400,400);
        panel2.setLayout(null);
        panel2.setBackground(new Color(255,255,255));
        frame.add(panel2);
//----------------------------------------------------------
        JLabel registerLabel = new JLabel("REGISTER");
        registerLabel.setBounds(150,30,100,30);
        registerLabel.setFont(new Font("Serif",  Font.BOLD, 18));
        registerLabel.setForeground(new Color(0,0,0));
        panel2.add(registerLabel);
//--------------------------------------------------------------
        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(50,70,50,20);
        panel2.add(nameLabel);

        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(100,70,200,20);
        panel2.add(nameTxt);
//------------------------------------------------------------
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(20,100,70,20);
        panel2.add(usernameLabel);

        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(100,100,200,20);
        panel2.add(usernameTxt);
//-------------------------------------------------------
        JLabel passLabel = new JLabel("Password: ");
        passLabel.setBounds(20,130,70,20);
        panel2.add(passLabel);

        JTextField passTxt = new JTextField();
        passTxt.setBounds(100,130,200,20);
        panel2.add(passTxt);
//-----------------------------------------------------
        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(150,200,100,30);
         cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Go back to the login window
                frame.dispose();
                LoginView loginView = new LoginView();
                loginView.loginGui();
            }
        });
        panel2.add(cancelBtn);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(260,200,100,30);
        panel2.add(registerBtn);



        frame.setVisible(true);
}

}