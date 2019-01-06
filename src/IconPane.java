import java.awt.*;
import javax.swing.*;

public class IconPane extends JPanel {

    protected Image icon;

    public IconPane(Image icon) {
        this.icon = icon;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics G) {
        Image scaledImage = icon.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        G.drawImage(scaledImage, 0, 0,getWidth(), getHeight(), null);
    }
}
