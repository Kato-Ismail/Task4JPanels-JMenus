import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MenuBar {
    private final CardLayout cardLayout;
    private final JPanel mainPanel;

    public MenuBar(CardLayout cardLayout, JPanel mainPanel){
        this.cardLayout = cardLayout;
        this.mainPanel = mainPanel;
    }

    public JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Navigate");

        JMenuItem homeItem = new JMenuItem(new AbstractAction("Home") {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Home");
            }
        });
        return menuBar;
    }

        JMenuItem settingsItem = new JMenuItem(new AbstractAction("Settings") {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "settings");
            }
        });
}
