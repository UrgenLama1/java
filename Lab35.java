import java.applet.Applet;
import java.awt.Graphics;

public class Lab35 extends Applet {
    
    // Method called when the applet is first loaded into the browser
    public void init() {
        System.out.println("Applet initialized");
    }

    // Method called when the applet is started
    public void start() {
        System.out.println("Applet starting");
    }

    // Method called when the applet is stopped
    public void stop() {
        System.out.println("Applet stopped");
    }

    // Method called when the applet is destroyed
    public void destroy() {
        System.out.println("Applet destroyed");
    }

    // Method called to draw the applet
    public void paint(Graphics g) {
        System.out.println("Painting Applet");
        g.drawString("Applet Lifecycle Demo", 20, 20);
    }
}
