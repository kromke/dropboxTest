import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DropBoxThread dropBoxThread = new DropBoxThread();
        dropBoxThread.start();
            }

    public static String getFormattedCurrentDate() {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date date = new Date();
        return formatter.format(date);
    }

    public static BufferedImage getScreenShot() {

        BufferedImage image = null;
        try {
            Robot robot = new Robot();

            Rectangle screenSquare = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            image = robot.createScreenCapture(screenSquare);
        } catch (AWTException e) {
            e.printStackTrace();
        }

        return image;
    }


}
