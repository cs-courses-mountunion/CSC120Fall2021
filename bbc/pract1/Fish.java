import java.awt.*;

public class Fish {

    private Color color;
    private Integer over, down;
	
	
    public Fish(Color c) {
        color = c;
    } // end of constructor

	
    public void setOver(Integer x) {
        over = x;
    } // end of setOver()
	
    public void setDown(Integer y) {
        down = y;
    } // end of setDown()
        

    public void draw(Graphics g) {

        Color fishColor;
  
  
        fishColor = color;
        
        
        
        
        // body of the Fish
        g.setColor(fishColor);
        g.fillArc(over, down, 50, 50, 210, 300);
        g.setColor(Color.BLACK);
        g.drawArc(over, down, 50, 50, 210, 300);
        g.drawLine(over+25, down+25, (int) (over+25+ 25*Math.cos(3.14159*150/180)),(int) (down+25+ 25*Math.sin(3.14159*150/180)) );
        g.drawLine(over+25, down+25, (int) (over+25+ 25*Math.cos(3.14159*210/180)),(int) (down+25+ 25*Math.sin(3.14159*210/180)) );
        
        // tail of the Fish
        g.setColor(fishColor);
        g.fillArc(over+30, down+5, 40, 40, 330, 60);
        g.setColor(Color.BLACK);
        g.drawArc(over+30, down+5, 40, 40, 330, 60);
        g.drawLine(over+50, down+25, (int) (over+50+ 20*Math.cos(3.14159*30/180)),(int) (down+25+ 20*Math.sin(3.14159*30/180)) );
        g.drawLine(over+50, down+25, (int) (over+50+ 20*Math.cos(3.14159*330/180)),(int) (down+25+ 20*Math.sin(3.14159*330/180)) );
        
        // eye of the Fish
        g.fillOval(over+20, down+10, 5, 5);
    } // end of draw()

	
} // end of class Fish
