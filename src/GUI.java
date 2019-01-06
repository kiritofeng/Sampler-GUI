import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI extends JFrame {

    IconPane battery, voltage, temperature, weight, volume;
    ImagePane feed, sample, colourimetry;
    JProgressBar progress;

    public GUI() {
        JPanel content = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        try {
            init();
        } catch (IOException ex){}
        content.add(battery,c);
    }

    // Initialize all the components
    private void init() throws IOException {
        // Read images
        Image batteryImg = ImageIO.read(new File("battery.jpg"));
        Image voltageImg = ImageIO.read(new File("voltage.jpg"));
        Image temperatureImg = ImageIO.read(new File("temperature.jpg"));
        Image weightImg = ImageIO.read(new File("weight.jpg"));
        Image volumeImg = ImageIO.read(new File("volume.jpg"));
        battery = new IconPane(batteryImg);
        voltage = new IconPane(voltageImg);
        temperature = new IconPane(temperatureImg);
        weight = new IconPane(weightImg);
        volume = new IconPane(volumeImg);
        feed = new ImagePane();
        sample = new ImagePane();
        colourimetry = new ImagePane();
    }
}
