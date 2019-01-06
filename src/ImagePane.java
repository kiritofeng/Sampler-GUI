import javax.swing.*;
import java.awt.*;

public class ImagePane extends JPanel {

    private Image img;

    public Image getImage() {
        return img;
    }

    public void setImage(Image newImg) {
        img = newImg;
        repaint();
    }

    @Override
    public void paintComponent(Graphics G) {
        if(img == null) {
            G.setColor(Color.BLACK);
            G.fillRect(0, 0, getWidth(), getHeight());
        } else {
            Image scaledImage = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
            G.drawImage(scaledImage, 0, 0,getWidth(), getHeight(), null);
        }
    }
}
