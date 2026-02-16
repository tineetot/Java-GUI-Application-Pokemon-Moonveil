import java.awt.*;
import javax.swing.*;

public class Home {
    private JPanel homePanel;
    private int currentPokeIndex = 0;
    private JLabel lblPokeImg; // will be needed for image updates

    // Pokémon Data: Name, HP, DEF, ATTACK, SP. SPEED, SP. ATTACK, SP. DEF, Image Path
    private String[][] pokemonList = {
        {"Ditto", "45", "49", "49", "45", "65", "65", "ditto.png"},
        {"Mewtwo", "60", "62", "63", "60", "80", "80", "mewtwo.png"},
        {"Lunala", "80", "83", "82", "80", "100", "100", "lunala.png"}
    };

    public Home() {
        homePanel = new JPanel();
        homePanel.setLayout(null);
        homePanel.setSize(800, 550);
        homePanel.setBackground(new Color(0xE6E8F0)); 

        // HEADER SECTION
        JPanel header = new JPanel(null);
        header.setBackground(new Color(0xFDFDFD));
        header.setBounds(0, 0, 800, 80);
        header.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0x8C95BA)));
        homePanel.add(header);

        // Logo
        ImageIcon logoIcon = new ImageIcon("PokemonLogo.png");
        Image scaledImage = logoIcon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        JLabel lblLogo = new JLabel(new ImageIcon(scaledImage));
        lblLogo.setBounds(20, 10, 60, 60);
        header.add(lblLogo);

        // Header Title
        JLabel headerTitle = new JLabel("POKÉMON: MOONVEIL");
        headerTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        headerTitle.setForeground(new Color(0x1B1F3B));
        headerTitle.setBounds(90, 20, 300, 40);
        header.add(headerTitle);

        // Logout Button
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
        JLabel lblWelcome = new JLabel("Welcome! " + Main.currentUser.firstName + " " + Main.currentUser.lastName + "!");
        lblWelcome.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblWelcome.setBounds(30, 100, 500, 30);
        homePanel.add(lblWelcome);

        // Settings Button
        JButton btnSettings = new JButton("Settings");
        btnSettings.setBounds(640, 100, 100, 30);
        btnSettings.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        btnSettings.setForeground(Color.WHITE);
        btnSettings.setBackground(new Color(0x9A8FBF));
        btnSettings.setFocusable(false); 
        btnSettings.setBorderPainted(false); 
        btnSettings.setOpaque(true); 
        btnSettings.setCursor(new Cursor(Cursor.HAND_CURSOR));
        homePanel.add(btnSettings);

        // Pokémon Display Container
        JPanel pokeDisplay = new JPanel();
        pokeDisplay.setBounds(30, 150, 725, 330);
        pokeDisplay.setBackground(Color.WHITE);
        pokeDisplay.setLayout(null);
        pokeDisplay.setBorder(BorderFactory.createLineBorder(new Color(0x1B1F3B), 2));
        homePanel.add(pokeDisplay);

        JLabel lblPokeName = new JLabel("Name: " + pokemonList[currentPokeIndex][0], SwingConstants.CENTER);
        lblPokeName.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lblPokeName.setBounds(210, 220, 300, 30);
        pokeDisplay.add(lblPokeName);

        JLabel lblStats = new JLabel("<html><div style='text-align: center;'>"
                + "Attack: " + pokemonList[currentPokeIndex][3] + "<br>"
                + "DEF: " + pokemonList[currentPokeIndex][2] + "<br>"
                + "HP: " + pokemonList[currentPokeIndex][1] + "<br>"
                + "SP. ATTACK: " + pokemonList[currentPokeIndex][5] + "<br>"
                + "SP. DEF: " + pokemonList[currentPokeIndex][6] + "</div></html>", SwingConstants.CENTER);
        lblStats.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        lblStats.setBounds(210, 230, 300, 100);
        pokeDisplay.add(lblStats);

        JLabel homepage = new JLabel ("My Pokémon Homepage");
        homepage.setFont(new Font("Segoe UI", Font.BOLD, 17));
        homepage.setBounds(30, 10, 250, 30);
        pokeDisplay.add(homepage);

        JSeparator homeSeparator = new JSeparator();
        homeSeparator.setBounds(240, 25, 460, 1);
        pokeDisplay.add(homeSeparator);

        JLabel featured = new JLabel ("Most Featured Pokémon", SwingConstants.CENTER);
        featured.setFont(new Font("Segoe UI", Font.BOLD, 15));
        featured.setBounds(270, 40, 200, 30);
        pokeDisplay.add(featured);
        
        // Featured Image
        lblPokeImg = new JLabel("", SwingConstants.CENTER);
        lblPokeImg.setBounds(280, 80, 180, 140);
        pokeDisplay.add(lblPokeImg);
        updatePokeImage();

        // Navigation Buttons
        JButton btnPrev = new JButton("Previous");
        btnPrev.setBounds(110, 140, 100, 30);
        btnPrev.setForeground(Color.WHITE);
        btnPrev.setBackground(new Color(0x1B1F3B));
        btnPrev.setFocusable(false); 
        btnPrev.setBorderPainted(false); 
        btnPrev.setOpaque(true); 
        btnPrev.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pokeDisplay.add(btnPrev);

        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnPrev.setBackground(new Color(0x1B1F3B).darker());
        }
            public void mouseExited(java.awt.event.MouseEvent evt) {
            btnPrev.setBackground(new Color(0x1B1F3B));
        }
        });

        JButton btnNext = new JButton("Next");
        btnNext.setBounds(530, 140, 100, 30);
        btnNext.setFocusable(false);
        btnNext.setForeground(Color.WHITE);
        btnNext.setBackground(new Color(0x1B1F3B));
        btnNext.setFocusable(false); 
        btnNext.setBorderPainted(false); 
        btnNext.setOpaque(true); 
        btnNext.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pokeDisplay.add(btnNext);

        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnNext.setBackground(new Color(0x1B1F3B).darker());
        }
            public void mouseExited(java.awt.event.MouseEvent evt) {
            btnNext.setBackground(new Color(0x1B1F3B));
        }
        });

        // BUTTON LOGIC
        btnNext.addActionListener(e -> updatePokeData(1, lblPokeName, lblStats));
        btnPrev.addActionListener(e -> updatePokeData(-1, lblPokeName, lblStats));
        btnSettings.addActionListener(e -> Main.showSettings());
        btnLogout.addActionListener(e -> Main.showLogin());
    }

    private void updatePokeData(int direction, JLabel name, JLabel stats) {
        currentPokeIndex = (currentPokeIndex + direction + pokemonList.length) % pokemonList.length;
        updatePokeText(name, stats);
        updatePokeImage();
    }

    private void updatePokeText(JLabel name, JLabel stats) {
        name.setText("Name: " + pokemonList[currentPokeIndex][0]);
        stats.setText("<html><div style='text-align: center;'>"
                + "Attack: " + pokemonList[currentPokeIndex][3] + "<br>"
                + "DEF: " + pokemonList[currentPokeIndex][2] + "<br>"
                + "HP: " + pokemonList[currentPokeIndex][1] + "<br>"
                + "SP. ATTACK: " + pokemonList[currentPokeIndex][5] + "<br>"
                + "SP. DEF: " + pokemonList[currentPokeIndex][6] + "</div></html>");
    }

    private void updatePokeImage() {
        try {
            String imagePath = pokemonList[currentPokeIndex][7];
            ImageIcon icon = new ImageIcon(imagePath);
            Image img = icon.getImage().getScaledInstance(180, 140, Image.SCALE_SMOOTH);
            lblPokeImg.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            lblPokeImg.setIcon(null);
            lblPokeImg.setText("Image Not Found");
        }
    }

    public JPanel getHomePanel() { 
        return homePanel; }
}