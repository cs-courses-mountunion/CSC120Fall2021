import java.awt.*;

public class Piano {

    private Color color;
    private int anchorX, anchorY;
	
	
    public Piano(Color c) {
        color = c;
    } // end of constructor

	
    public void setAnchorX(Integer x) {
        anchorX = x;
    } // end of setAnchorX()
	
    public void setAnchorY(Integer y) {
        anchorY = y;
    } // end of setAnchorY()
        

    public void draw(Graphics g) {

        Color pianoColor;
  

        
        pianoColor = color;
        
        
        
        
        // Piano body
        g.setColor(pianoColor);
        g.fillArc(anchorX, anchorY-10, 80, 70, 0, 180);
        g.fillRect(anchorX+1, anchorY+20, 80, 40);
        g.fillRoundRect(anchorX+1, anchorY+40, 99, 50, 10, 10);
        g.setColor(Color.WHITE);
        g.fillRoundRect(anchorX+6, anchorY+60, 89, 25, 5, 5);
        g.setColor(pianoColor);
        g.fillRect(anchorX+5, anchorY+60, 90, 10);
        
        // black keys
        g.setColor(Color.BLACK);

        g.fillRect(anchorX+10, anchorY+70, 3, 8);
        g.fillRect(anchorX+15, anchorY+70, 3, 8);
        g.fillRect(anchorX+20, anchorY+70, 3, 8);

        g.fillRect(anchorX+30, anchorY+70, 3, 8);
        g.fillRect(anchorX+35, anchorY+70, 3, 8);
        
        g.fillRect(anchorX+45, anchorY+70, 3, 8);
        g.fillRect(anchorX+50, anchorY+70, 3, 8);
        g.fillRect(anchorX+55, anchorY+70, 3, 8);

        g.fillRect(anchorX+65, anchorY+70, 3, 8);
        g.fillRect(anchorX+70, anchorY+70, 3, 8);
        
        g.fillRect(anchorX+80, anchorY+70, 3, 8);
        g.fillRect(anchorX+85, anchorY+70, 3, 8);
        g.fillRect(anchorX+90, anchorY+70, 3, 8);

    } // end of draw()
    

	
} // end of class Piano
