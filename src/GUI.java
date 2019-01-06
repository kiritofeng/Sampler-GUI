import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI extends JFrame {

    private IconPane battery, weight, volume;
    private JLabel voltage;
    private ImagePane feed, sample, colourimetry;
    private JProgressBar temperature, progress;
    public static int MINIMUM_TEMPERATURE = 0, MAXIMUM_TEMPERATURE = 100;

    public GUI() {
        setTitle("Sand Sampler");
        try {
            init();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        Container container = getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 5;
        c.gridwidth = 4;
        c.insets = new Insets(10,10,10,10);
        container.add(feed, c);
        c.gridx = 4;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        container.add(battery, c);
        c.gridx = 6;
        c.gridheight = 2;
        c.fill = GridBagConstraints.NONE;
        container.add(temperature, c);
        c.gridx = 4;
        c.gridy = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        container.add(voltage, c);
        c.gridy = 2;
        container.add(volume, c);
        c.gridx = 5;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.VERTICAL;
        container.add(weight, c);
        c.gridx = 4;
        c.gridy = 3;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.insets = new Insets(30,10,10,10);
        c.fill = GridBagConstraints.HORIZONTAL;
        container.add(sample, c);
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 7;
        c.gridheight = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10,10,10,10);
        container.add(progress, c);
        c.gridy = 6;
        c.gridheight = 2;
        c.gridwidth = 7;
        container.add(colourimetry, c);
        pack();
        setPreferredSize(new Dimension(400, 300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Initialize all the components
    private void init() throws IOException {
        // Read images
        ImageIcon batteryImg = new ImageIcon(ImageIO.read(new File("battery.png")));
        ImageIcon weightImg = new ImageIcon(ImageIO.read(new File("mass.png")));
        ImageIcon volumeImg = new ImageIcon(ImageIO.read(new File("volume.png")));
        battery = new IconPane(batteryImg);
        weight = new IconPane(weightImg);
        volume = new IconPane(volumeImg);
        voltage = new JLabel("Voltage");
        feed = new ImagePane();
        feed.setPreferredSize(new Dimension(640,480));
        sample = new ImagePane();
        sample.setPreferredSize(new Dimension(320,240));
        colourimetry = new ImagePane();
        colourimetry.setPreferredSize(new Dimension(640,120));
        temperature = new JProgressBar(JProgressBar.VERTICAL, MINIMUM_TEMPERATURE, MAXIMUM_TEMPERATURE);
        progress = new JProgressBar();
    }

    public void setTemperature(int temp) {
        temperature.setValue(temp);
        temperature.setString(String.valueOf(temp));
    }
}
