import java.awt.*;
import javax.swing.*;

public class Settings {
    private JPanel settingsPanel;

    public Settings() {
        settingsPanel = new JPanel(null);
        settingsPanel.setSize(800, 550);
        settingsPanel.setBackground(new Color(0xE6E8F0)); // Consistent light blue background

        // HEADER SECTION
        JPanel header = new JPanel(null);
        header.setBackground(new Color(0xFDFDFD));
        header.setBounds(0, 0, 800, 80);
        header.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0x8C95BA)));
        settingsPanel.add(header);

        // Logo
        ImageIcon logoIcon = new ImageIcon("PokemonLogo.png");
        Image scaledImage = logoIcon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        JLabel lblLogo = new JLabel(new ImageIcon(scaledImage));
        lblLogo.setBounds(20, 10, 60, 60);
        header.add(lblLogo);

        // Header Title
        JLabel headerTitle = new JLabel("POKÉMON: MOONVEIL | SETTINGS");
        headerTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        headerTitle.setForeground(new Color(0x1B1F3B));
        headerTitle.setBounds(90, 20, 400, 40);
        header.add(headerTitle);

        // Logout Button (Header)
        JButton btnLogout = new JButton("Logout");
        btnLogout.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        btnLogout.setBounds(640, 25, 100, 30);
        btnLogout.setForeground(Color.WHITE);
        btnLogout.setBackground(new Color(0x9A8FBF));
        btnLogout.setFocusable(false); 
        btnLogout.setBorderPainted(false); 
        btnLogout.setOpaque(true); 
        btnLogout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        header.add(btnLogout);

        // CONTENT SECTION

        // Back to Homepage Button
        JButton btnBack = new JButton("Go back to Homepage");
        btnBack.setBounds(50, 100, 160, 25);
        btnBack.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        btnBack.setForeground(Color.WHITE);
        btnBack.setBackground(new Color(0x9A8FBF));
        btnBack.setFocusable(false); 
        btnBack.setBorderPainted(false); 
        btnBack.setOpaque(true); 
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        settingsPanel.add(btnBack);

        // Account Settings Title
        JLabel lblTitle = new JLabel("Account Settings");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblTitle.setBounds(50, 140, 300, 30);
        settingsPanel.add(lblTitle);

        // First Name Field
        JLabel lblFn = new JLabel("First name");
        lblFn.setBounds(180, 210, 100, 20);
        lblFn.setFont(new Font("Segoe UI", Font.BOLD, 15));
        settingsPanel.add(lblFn);
        
        JTextField fn = new JTextField(Main.currentUser.firstName);
        fn.setBounds(180, 230, 230, 35);
        settingsPanel.add(fn);

        // Last Name Field
        JLabel lblLn = new JLabel("Last name");
        lblLn.setBounds(430, 210, 100, 20);
        settingsPanel.add(lblLn);
        
        JTextField ln = new JTextField(Main.currentUser.lastName);
        ln.setBounds(430, 230, 230, 35);
        settingsPanel.add(ln);

        // Username Field
        JLabel lblUn = new JLabel("Username");
        lblUn.setBounds(180, 280, 100, 20);
        settingsPanel.add(lblUn);
        
        JTextField un = new JTextField(Main.currentUser.username);
        un.setBounds(180, 300, 480, 35);
        settingsPanel.add(un);

        // Update Button
        JButton btnUpdate = new JButton("Update Account");
        btnUpdate.setBounds(230, 370, 380, 45);
        btnUpdate.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnUpdate.setForeground(Color.WHITE);
        btnUpdate.setBackground(new Color(0x9A8FBF));
        btnUpdate.setFocusable(false); 
        btnUpdate.setBorderPainted(false); 
        btnUpdate.setOpaque(true); 
        btnUpdate.setCursor(new Cursor(Cursor.HAND_CURSOR));
        settingsPanel.add(btnUpdate);

        // BUTTON LOGIC
        btnUpdate.addActionListener(e -> {
            Main.currentUser.firstName = fn.getText();
            Main.currentUser.lastName = ln.getText();
            Main.currentUser.username = un.getText();
            JOptionPane.showMessageDialog(null, "Profile Updated Successfully!");
            Main.showHome();
        });

        btnBack.addActionListener(e -> Main.showHome());
        btnLogout.addActionListener(e -> Main.showLogin());
    }

    public JPanel getSettingsPanel() { return settingsPanel; }
}