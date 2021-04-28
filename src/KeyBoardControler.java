import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.ArrayList;

public class KeyBoardControler {

    /**
     * @author Arnav Dadarya
     *
     * This was created to automate certian typing tasks
     * Please do not use this to create a malitios program
     * if you use this in a project of yours please credit me
     *
     * Thanks,
     * Arnav Dadarya
     */

    private static Robot robot;
    private static boolean isCaps = false;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param x (KeyEvent)
     * This simulates a keypress for the operating system
     * when given a keyevent.
     */
    public static void Type(KeyEvent keyEvent){
        robot.keyPress(keyEvent.getKeyCode());
    }

    /**
     * @param TypingText
     * This converts a string that you give it to string events
     * and then types them out.
     * THIS MAY NOT WORK WITH SPEICAL SYMOBOLS DEPENDING ON YOU OS LANGUAGE
     * STICK TO BASIC ALPHABET KEYS
     */
    public static void Type( String TypingText){
        ArrayList<Integer> Letter = new ArrayList<>();
        for(int i = 0; i< TypingText.length(); i++){
            Letter.add(KeyEvent.getExtendedKeyCodeForChar(TypingText.charAt(i)));
        }
        for (Integer integer : Letter) {
            try {


                switch (integer) {
                    case 45: {
                        robot.keyPress(KeyEvent.VK_MINUS);
                        break;
                    }
                    case 9: {
                        robot.keyPress(KeyEvent.VK_TAB);
                        break;
                    }
                    case 44: {
                        robot.keyPress(KeyEvent.VK_COMMA);
                        break;
                    }
                    case 46: {
                        robot.keyPress(KeyEvent.VK_PERIOD);
                        break;
                    }
                    case 47: {
                        robot.keyPress(KeyEvent.VK_SLASH);
                        break;
                    }
                    case 59: {
                        robot.keyPress(KeyEvent.VK_SEMICOLON);
                        break;
                    }
                    case 61: {
                        robot.keyPress(KeyEvent.VK_EQUALS);
                        break;
                    }
                    case 91: {
                        robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                        break;
                    }
                    case 92: {
                        robot.keyPress(KeyEvent.VK_BACK_SLASH);
                        break;
                    }
                    case 93: {
                        robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                        break;
                    }
                    case 106: {
                        robot.keyPress(KeyEvent.VK_MULTIPLY);
                        break;
                    }
                    case 151: {
                        robot.keyPress(KeyEvent.VK_ASTERISK);
                        break;
                    }
                    case 160: {
                        robot.keyPress(KeyEvent.VK_GREATER);
                        break;
                    }
                    case 161: {
                        robot.keyPress(KeyEvent.VK_BRACELEFT);
                        break;
                    }
                    case 162: {
                        robot.keyPress(KeyEvent.VK_BRACERIGHT);
                        break;
                    }
                    case 192: {
                        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                        break;
                    }
                    case 222: {
                        robot.keyPress(KeyEvent.VK_QUOTE);
                        break;
                    }
                    case 512: {
                        robot.keyPress(KeyEvent.VK_AT);
                        break;
                    }
                    case 513: {
                        robot.keyPress(KeyEvent.VK_COLON);
                        break;
                    }
                    case 515: {
                        robot.keyPress(KeyEvent.VK_DOLLAR);
                        break;
                    }
                    case 516: {
                        robot.keyPress(KeyEvent.VK_EURO_SIGN);
                        break;
                    }
                    case 517: {
                        robot.keyPress(KeyEvent.VK_EXCLAMATION_MARK);
                        break;
                    }
                    case 518: {
                        robot.keyPress(KeyEvent.VK_INVERTED_EXCLAMATION_MARK);
                        break;
                    }
                    case 519: {
                        robot.keyPress(KeyEvent.VK_LEFT_PARENTHESIS);
                        break;
                    }
                    case 520: {
                        robot.keyPress(KeyEvent.VK_NUM_LOCK);
                        break;
                    }
                    case 521: {
                        robot.keyPress(KeyEvent.VK_PLUS);
                        break;
                    }
                    case 522: {
                        robot.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS);
                        break;
                    }
                    case 523: {
                        robot.keyPress(KeyEvent.VK_UNDERSCORE);
                        break;
                    }
                    default: {
                        robot.keyPress(integer);
                        break;
                    }

                }
            }catch (IllegalArgumentException e){
                System.out.println("Cannot Print Letter!");
            }

        }
    }

    public static void CapsLock(){
        robot.keyPress(KeyEvent.VK_CAPS_LOCK);
        isCaps = !(isCaps);
    }




}
