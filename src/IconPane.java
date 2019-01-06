import java.awt.*;
import javax.swing.*;

public class IconPane extends JPanel {

    protected ImageIcon icon;

    public IconPane(ImageIcon icon) {
        this.icon = icon;
        setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        repaint();
    }

    @Override
    public void paintComponent(Graphics G) {
        G.drawImage(icon.getImage(), 0, 0,getWidth(), getHeight(), null);
    }
}
