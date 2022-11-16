package java_awt;

import drivers_web.DriversFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class JavaUploudPictures_Achives extends DriversFactory {



        public void uploadArquivo()throws AWTException{

            Robot robot = new Robot();
            robot.delay(1000);
            StringSelection ss = new StringSelection("C:\\Users\\decio.silva\\Pictures\\Saved Pictures\\test.jpg");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(700);
            robot.keyRelease(KeyEvent.VK_V);
            robot.delay(900);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(900);


        }
    }


