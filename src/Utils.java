import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Utils {
    public static Image readImage(String S) throws IOException {
        File F = new File(S);
        Image img = ImageIO.read(F);
        return img;
    }
}
