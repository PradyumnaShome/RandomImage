package randomimage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.util.Random;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RandomImage {

    static JFrame frame;
    static BufferedImage img;
    static JPanel panel;
    static int width, height;
    static Random random;

    public static void main(String[] args) {
        frame = new JFrame("Image comes here");
        panel = new JPanel();
        random = new Random();
        /*System.out.println("Enter the width: ");
        width = new Scanner(System.in).nextInt();
        System.out.println("Enter the height: ");
        height = new Scanner(System.in).nextInt();*/
        width = random.nextInt(4000);
        height = random.nextInt(4000);
        img = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        frame.setSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(panel);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int a = random.nextInt(50);
                int r = random.nextInt(256);
                int g = random.nextInt(256);
                int b = random.nextInt(256);
                Color color = new Color(r, g, b,a);
                img.setRGB(i, j, color.getRGB());
            }
        }
        File file = new File(random.nextInt(200000) + "YourRandomImage.png");
        try {
            ImageIO.write(img, "png", file);
        } catch (IOException ex) {

        }

    }
}
