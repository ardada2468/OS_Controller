import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayController {
    /**
     * @author Aranv
     *
     * This was created to automate certian typing tasks
     * Please do not use this to create a malitios program
     * if you use this in a project of yours please give me
     * credit.
     *
     * Thanks,
     * Arnav Dadarya
     **/
    private static Robot robot;

    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param Path File Path ("C:\\Users\\random\\pics\\)
     * @param Name File Name ("ScreenShot")
     * Takes a Screen Shot of what is in the screen
     */
    public static void captureScreenshot(String Path, String Name){
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        BufferedImage img = robot.createScreenCapture(new Rectangle(size));
        File save_path=new File(Path + Name + ".jpg");
        try {
            ImageIO.write(img, "JPG", save_path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Path + Name + ".jpg");
    }

    /**
     *
     * @param x
     * @param y
     * @return color
     * Gets the color of any pixel
     */
    public static Color getColor(int x, int y){
        return robot.getPixelColor(x,y);
    }

}
