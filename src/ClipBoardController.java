import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * The type Clip board controller.
 */
public class ClipBoardController {
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

    private Robot robot;

    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the ClipBoard Data
     * SOMETIMES THE OS MIGHT BLOCK THIS
     *
     * @return String string
     */
    public static String getClipboardData(){
        try {
            return (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException | IOException e) {
            System.out.println("Unable to get data");
            return null;
        }
    }

    /**
     * Sets the clipboard data
     * SOMETIMES THE OS MIGHT BLOCK THIS
     *
     * @param newData new Clipboard text
     */
    public static void ChangeClipBoard(String newData){
        Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
        if (t != null && t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            StringSelection ss = new StringSelection(newData);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        }
    }
}
