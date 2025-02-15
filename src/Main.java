import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public Main(){
        setTitle("Swing application");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(new HomePanel(), "Home");
        mainPanel.add(new SettingsPanel(), "settings");

        setJMenuBar(new MenuBar(cardLayout, mainPanel).createMenuBar());

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[]args){
        SwingUtilities.invokeLater(Main::new);

    }

}
