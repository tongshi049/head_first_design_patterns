package com.example.designpatterns.proxy.virtual_proxy_ex;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {

    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    /*
    *  pass the URL of the image into the constructor.
    *  This is the image we need to display once it's loaded!
    * */
    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    /*
    *  This method is called when it's time to paint the icon on the screen
    *
    *
    * */
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            // if we've got an icon already, we go ahead and tell it to paint itself.
            imageIcon.paintIcon(c, g, x, y);
        } else {
            // otherwise we display the "loading" message
            g.drawString("Loading CD cover, please wait ... ", x + 300, y + 190);

            // Here is where we load the REAL icon image.
            // Note that the image loading with IconImage is synchronous: the ImageIcon constructor
            // doesn't return until the image is loaded.
            // That doesn't give us much of a chance to do screen updates and have our message displayed,
            // so we're going ot do this asynchronously.
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(imageURL, "CD Cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null)
            return imageIcon.getIconWidth();
        return 800;
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null)
            return imageIcon.getIconHeight();
        return 600;
    }
}
