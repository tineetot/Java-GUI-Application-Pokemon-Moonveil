import java.util.ArrayList;
import javax.swing.*; 

public class Main {
    public static ArrayList<User> userList = new ArrayList<>(); // shared database
    public static User currentUser = null; // track who is logged in, which is initally null
    public static myFrame frame;

    public static void main(String [] args) {
        //
        frame = new myFrame();
        // // I used this to easily check the home / settings screens without logging in
        // currentUser = new User("tinetot", "devtine", "tinee", "ARIGATU");
        // showHome();
        showSignUp(); // Initial screen
    }

    public static void showSignUp() {
        new frameDisplay(frame, new SignUp().getSignUpPanel());
    }

    public static void showLogin() {
        new frameDisplay(frame, new LogIn().getLogInPanel());
    }

    public static void showHome() {
        new frameDisplay(frame, new Home().getHomePanel());
    }

    public static void showSettings() {
        new frameDisplay(frame, new Settings().getSettingsPanel());
    }
}

class frameDisplay {
    public frameDisplay(myFrame frameObject, JPanel panel) {
        JFrame frame = frameObject.getSignUp();
        frame.getContentPane().removeAll(); // Clear current screen
        frame.add(panel);
        frame.revalidate();
        frame.repaint(); 
        frame.setVisible(true);
    }
}

class myFrame {
    JFrame frame = new JFrame("Pokémon: Moonveil");
    public myFrame() {
        frame.setSize(800, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
    }
    public JFrame getSignUp() { return frame; }
}

// YES YES YES