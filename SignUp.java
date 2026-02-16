import java.awt.*;
import javax.swing.*;


public class SignUp {
    private JPanel signUpPanel; // I made another panel for the Sign Up screen, this is in private because it's only used here

    public SignUp() {
        signUpPanel = new JPanel(null);
        signUpPanel.setSize(800, 550);
        signUpPanel.setBackground(new Color(0xE6E8F0));

        // HEADER SECTION
        JPanel header = new JPanel(null);
        header.setBackground(new Color(0xFDFDFD));
        header.setBounds(0, 0, 800, 80);
        header.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0x8C95BA)));
        signUpPanel.add(header);

        // Logo
        ImageIcon logoIcon = new ImageIcon("PokemonLogo.png"); // adding the logo on the left side of the header
        Image scaledImage = logoIcon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        
        JLabel lblLogo = new JLabel(new ImageIcon(scaledImage));
        lblLogo.setBounds(20, 10, 60, 60);
        
        // Header Title (For Welcoming Users)
        JLabel headerTitle = new JLabel("POKÉMON: MOONVEIL | SIGN UP");
        headerTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        headerTitle.setForeground(new Color(0x1B1F3B));
        headerTitle.setBounds(90, 20, 400, 40);
        
        // Login Button
        JButton btnLogin = new JButton("Login");
        btnLogin.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        btnLogin.setBounds(550, 25, 80, 30);
        btnLogin.setBackground((Color.WHITE));
        btnLogin.setFocusable(false); // Remove focus border
        btnLogin.setBorderPainted(false); // Remove button border
        btnLogin.setOpaque(true); // Make background color visible
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Action for Header Login button
        btnLogin.addActionListener(e -> Main.showLogin());
        
        // Sign Up Button (Active right now)
        JButton btnSignup = new JButton("Signup");
        btnSignup.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        btnSignup.setForeground(Color.WHITE);
        btnSignup.setBounds(640, 25, 80, 30);
        btnSignup.setBackground(new Color(0x9A8FBF));
        btnSignup.setFocusable(false); // Remove focus border
        btnSignup.setBorderPainted(false); // Remove button border
        btnSignup.setOpaque(true); // Make background color visible
        btnSignup.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Hover effect for Login Button and Sign Up Button
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnLogin.setBackground(new Color(0xF0F0F0));
        }
            public void mouseExited(java.awt.event.MouseEvent evt) {
            btnLogin.setBackground(Color.WHITE);
        }
        });

        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnSignup.setBackground(new Color(0x9A8FBF).darker());
        }
            public void mouseExited(java.awt.event.MouseEvent evt) {
            btnSignup.setBackground(new Color(0x9A8FBF));
        }
        });

        // Adding of panels/elements to panel and header
        signUpPanel.add(header);
        header.add(lblLogo);
        header.add(headerTitle);
        header.add(btnLogin); 
        header.add(btnSignup);

        // SIGN UP FORM SECTION
        // First Name
        JLabel lblFn = new JLabel("First Name:");
        lblFn.setBounds(50, 120, 150, 20);
        lblFn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        signUpPanel.add(lblFn);

        JTextField fn = new JTextField(); 
        fn.setBounds(50, 140, 140, 30);
        fn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        signUpPanel.add(fn);

        // Last Name (Added)
        JLabel lblLn = new JLabel("Last Name:");
        lblLn.setBounds(210, 120, 150, 20);
        lblLn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        signUpPanel.add(lblLn);

        JTextField ln = new JTextField(); 
        ln.setBounds(210, 140, 140, 30);
        ln.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        signUpPanel.add(ln);

        // Username
        JLabel lblUn = new JLabel("Username:");
        lblUn.setBounds(50, 170, 300, 20);
        lblUn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        signUpPanel.add(lblUn);

        JTextField un = new JTextField(); 
        un.setBounds(50, 190, 300, 30);
        un.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        signUpPanel.add(un);

        // Password
        JLabel lblPw = new JLabel("Password:");
        lblPw.setBounds(50, 220, 300, 20);
        lblPw.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        signUpPanel.add(lblPw);

        JPasswordField pw = new JPasswordField(); 
        pw.setBounds(50, 240, 300, 30);
        pw.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        signUpPanel.add(pw);

        // Confirm Password (Added)
        JLabel lblCpw = new JLabel("Confirm Password:");
        lblCpw.setBounds(50, 270, 300, 20);
        lblCpw.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        signUpPanel.add(lblCpw);

        JPasswordField cpw = new JPasswordField(); 
        cpw.setBounds(50, 290, 300, 30);
        cpw.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        signUpPanel.add(cpw);

        // Terms and Conditions
        JCheckBox terms = new JCheckBox();
        terms.setBounds(50, 330, 20, 20);
        terms.setBackground(new Color(0xE6E8F0));
        terms.setFocusPainted(false);
        signUpPanel.add(terms);

        JLabel termsLabel = new JLabel ("<html><body>I have read and agree to the Terms and Conditions and Privacy Policy.</body></html>"); // made it html to wrap text
        termsLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        termsLabel.setBounds(80, 330, 250, 40);
        signUpPanel.add(termsLabel);

        // Sign Up Button
        JButton btn = new JButton("Sign up to be a Moonwarden!"); 
        btn.setBounds(50, 380, 300, 40);
        btn.setBackground(new Color(0x9A8FBF));
        btn.setForeground(Color.WHITE);
        btn.setOpaque(true); 
        btn.setBorderPainted(false);
        btn.setFocusPainted(false); 
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signUpPanel.add(btn);

        // Hover effect for Sign Up Button
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn.setBackground(new Color(0x9A8FBF).darker());
        }
            public void mouseExited(java.awt.event.MouseEvent evt) {
            btn.setBackground(new Color(0x9A8FBF));
        }
        });

        // Sign Up Button Logic
        btn.addActionListener(e -> {
            // Get all input values
            String firstName = fn.getText().trim();
            String lastName = ln.getText().trim();
            String username = un.getText().trim();
            String password = new String(pw.getPassword()); 
            String confirmPassword = new String(cpw.getPassword());

            StringBuilder errors = new StringBuilder(); // compile all the error messages

        // 1. Check for empty fields
            if(fn.getText().isEmpty() || ln.getText().isEmpty() || un.getText().isEmpty()) { 
                errors.append("- All text fields are required.\n");
            }
        // 2. Validate username length
            if (username.length() < 3) {
                errors.append("- Username must be at least be 3 characters.\n");
            }
        // 3. Validate password length
            if (password.length() < 5) {
                errors.append("- Password must be at least 5 characters.\n");
            } else if (password.isEmpty()) {
                errors.append("- Password cannot be empty.\n");
            }
        // 4. Match Passwords
            if (!password.equals(confirmPassword)) { // Check if passwords match
                errors.append("- Passwords do not match.\n");
            }
        // 5. Check Terms and Conditions
            if (!terms.isSelected()) {
                errors.append("- You must agree to the Terms and Conditions.\n");
            }
        // Display errors or proceed with registration
            if (errors.length() > 0) {
                JOptionPane.showMessageDialog(null, "Please fix the following errors:\n" + errors.toString(), "Validation Error", JOptionPane.ERROR_MESSAGE);
            } else {
            // Success: Add user and redirect
                Main.userList.add(new User(firstName, lastName, username, password));
                JOptionPane.showMessageDialog(null, "Registration Successful!");
                Main.showLogin(); 
    }
        });

        JPanel emptyPanel = new JPanel();
        emptyPanel.setBackground(new Color(0x1B1F3B));
        emptyPanel.setBounds(400, 50, 400, 580);
        signUpPanel.add(emptyPanel);
    }

    

    public JPanel getSignUpPanel() { 
        return signUpPanel; 
    }  
}