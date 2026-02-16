import java.awt.*;
import javax.swing.*;

public class LogIn {
    private JPanel loginPanel;

    public LogIn() {
        loginPanel = new JPanel(null);
        loginPanel.setSize(800, 550);
        loginPanel.setBackground(new Color(0xE6E8F0)); 

        // HEADER SECTION (copy pasted from SignUp.java since they have the same header format)
        JPanel header = new JPanel(null);
        header.setBackground(new Color(0xFDFDFD));
        header.setBounds(0, 0, 800, 80);
        header.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0x8C95BA)));

        // Logo
        ImageIcon logoIcon = new ImageIcon("PokemonLogo.png");
        Image scaledImage = logoIcon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);    
        JLabel lblLogo = new JLabel(new ImageIcon(scaledImage));
        lblLogo.setBounds(20, 10, 60, 60);
        
        // Header Title (For Welcoming Users)
        JLabel headerTitle = new JLabel("POKÉMON: MOONVEIL | LOG IN");
        headerTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        headerTitle.setForeground(new Color(0x1B1F3B));
        headerTitle.setBounds(90, 20, 300, 40);
    
        // Logo and header title added to header panel
        loginPanel.add(header);
        header.add(lblLogo);
        header.add(headerTitle);

        // Login Button (Active State in Header)
        JButton btnHeaderLogin = new JButton("Login");
        btnHeaderLogin.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        btnHeaderLogin.setForeground(Color.WHITE);
        btnHeaderLogin.setBounds(550, 25, 80, 30);
        btnHeaderLogin.setBackground(new Color(0x9A8FBF));
        btnHeaderLogin.setFocusable(false);
        btnHeaderLogin.setBorderPainted(false);
        btnHeaderLogin.setOpaque(true);
        btnHeaderLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        header.add(btnHeaderLogin);

        // Signup Button (Redirect in Header)
        JButton btnHeaderSignup = new JButton("Signup");
        btnHeaderSignup.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        btnHeaderSignup.setBounds(640, 25, 80, 30);
        btnHeaderSignup.setBackground(Color.WHITE);
        btnHeaderSignup.setFocusable(false);
        btnHeaderSignup.setBorderPainted(false);
        btnHeaderSignup.setOpaque(true);
        btnHeaderSignup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        header.add(btnHeaderSignup);

        btnHeaderSignup.addActionListener(e -> Main.showSignUp()); 

        // LOGIN SECTION
        JSeparator leftSeparator = new JSeparator();
        leftSeparator.setBounds(90, 135, 230, 1);
        loginPanel.add(leftSeparator);

        JLabel lblLoginTitle = new JLabel("Log In", SwingConstants.CENTER);
        lblLoginTitle.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblLoginTitle.setBounds(200, 120, 400, 30);
        loginPanel.add(lblLoginTitle);

        JSeparator rightSeparator = new JSeparator();
        rightSeparator.setBounds(475, 135, 230, 1);
        loginPanel.add(rightSeparator);

        // Username
        JLabel lblUser = new JLabel("Username");
        lblUser.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblUser.setBounds(250, 200, 300, 20);
        loginPanel.add(lblUser);

        JTextField txtUser = new JTextField(); 
        txtUser.setBounds(250, 220, 300, 35);
        txtUser.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        loginPanel.add(txtUser);

        // Password
        JLabel lblPass = new JLabel("Password");
        lblPass.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblPass.setBounds(250, 260, 300, 20);
        loginPanel.add(lblPass);

        JPasswordField txtPass = new JPasswordField(); 
        txtPass.setBounds(250, 280, 300, 35);
        txtPass.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        loginPanel.add(txtPass);

        // Log In Button
        JButton btnLogin = new JButton("Log in"); 
        btnLogin.setBounds(275, 350, 250, 40);
        btnLogin.setBackground(new Color(0x9A8FBF));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnLogin.setFocusable(false);
        btnLogin.setBorderPainted(false);
        btnLogin.setOpaque(true);
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginPanel.add(btnLogin);

        // Log In Button Logic
        btnLogin.addActionListener(e -> {
            String username = txtUser.getText().trim();
            String password = new String(txtPass.getPassword());

            // 1. Check for empty fields
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Please enter both username and password.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // 2. Credential matching
            boolean found = false;
            for (User u : Main.userList) {
                if (u.username.equals(username) && u.password.equals(password)) {
                    Main.currentUser = u;
                    Main.showHome(); // Redirect to Home once logged in
                    found = true;
                    break;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Invalid Credentials!", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public JPanel getLogInPanel() { return loginPanel; }
}