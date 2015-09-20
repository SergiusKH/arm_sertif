package arm_sertif.utils;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * Created by sergius on 06.09.15.
 */
public class Display {

    public static Dimension windowCenter(int width, int height) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        return new Dimension(screenSize.width / 2 - width / 2, screenSize.height / 2 - height / 2);
    }
}
