import java.awt.Image;
import java.awt.Graphics;
import java.lang.String;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Coin
{
    // instance variables
    private Image head;
    private Image tail;
    private int side; // 1 is head, -1 is tail
    
    //Constructor
    public Coin(Image h, Image t)
    {
        head = h;
        tail = t;
        side = 1;
    }

    /**
     * Flips this coin
     */
    public void flip()
    {
        side = -side;
    }
    
    /**
     * Draws the appropriate side of the coin
     * centered at (x,y)
     */
    public void draw(Graphics g, int x, int y)
    {
        if (side == 1)
        {
            int xCordHead = x - head.getWidth(null)/2;
            int yCorHead = y - head.getHeight(null)/2;
            g.drawImage(head, xCordHead, yCorHead, null);
        }
        else // side == -1
        {
            int xCorHead = x - tail.getWidth(null)/2;
            int yCorTail = y - tail.getHeight(null)/2;
            g.drawImage(tail, xCorHead, yCorTail, null);
        }
    }
}
