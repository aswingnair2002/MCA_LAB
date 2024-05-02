import java.awt.*;
import java.applet.*;
public class DrawShapes extends Applet{
    public void paint(Graphics g){
        g.drawOval(20, 20, 150, 150);
        g.drawRect(20, 200, 200, 100);
        g.drawLine(20, 350, 220, 350);
    }
}
