package utils;

import java.awt.*;

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
