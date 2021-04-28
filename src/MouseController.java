import java.awt.*;
import java.awt.event.InputEvent;

public class MouseController {
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

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param x x Cordinate
     * @param y y Cordinate
     *
     * Moves the mouse, to the following x and y coordinates.
     */
    public static void MoveMouse(int x, int y){
        robot.mouseMove(x,y);
    }

    /**
     *
     * @param amt scroll amount
     *
     * Scrolls the distance specified
     */
    public static void Scroll(int amt){
        robot.mouseWheel(amt);
    }

    /**
     *
     * @param button which button to click
     *  Clicks the mouse pointer
     *  YOUR OPERATING SYSTEM MAY BLOCK THIS FUNCTION!!
     */
    public static void Click( int button){
        robot.mousePress(button);
    }

    /**
     * Prints mouse location
     */
    public static void printMouseLocation(){
        Thread r = new Thread() {
            @Override
            public void run() {
                while(true){
                    Point p = MouseInfo.getPointerInfo().getLocation();
                    System.out.println("x: " + p.getX() + " || " + "y: " + p.getY());
                }
            }
        };
        r.start();
    }
}
