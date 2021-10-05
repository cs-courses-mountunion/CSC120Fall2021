import java.awt.*;

public class Baby {

    private Boolean isHappy, isHuman;
    private Integer over, down;
	
	
    public Baby(Boolean hap, Boolean hum) {
        isHappy = hap;
        isHuman = hum;
    } // end of constructor

	
    public void setOver(Integer x) {
        over = x;
    } // end of setOver()
	
    public void setDown(Integer y) {
        down = y;
    } // end of setDown()
        

    public void draw(Graphics g) {

        Color babyColor;
        
        if (isHuman) {
            babyColor = new Color(0xA2, 0x8A, 0x72);
        }
        else {
            babyColor = Color.GREEN;
        }
        


        
        
        // draw the Baby
        g.setColor(babyColor);
        g.fillOval(over, down, 100, 88);
        g.fillOval(over-10,down+34, 10, 20);
        g.fillOval(over+100,down+34, 10, 20);
       
        g.setColor(Color.BLACK);
        g.drawOval(over, down, 100, 88);
        g.drawOval(over-10,down+34, 10, 20);
        g.drawOval(over+100,down+34, 10, 20);
        g.fillRect(over+49, down-10, 3, 10);
       
        if (!isHappy) {
            g.fillRect(over+20, down+30, 15, 5);
            g.fillRect(over+65, down+30, 15, 5);
            g.fillOval(over+25, down+53, 50, 35);
            g.setColor(Color.WHITE);
            g.fillArc(over+42, down+80, 16, 10, 180, 180);
            g.fillRect(over+42, down+75, 16, 10);
        }
        else {
            g.fillOval(over+20, down+20, 15, 15);
            g.fillOval(over+65, down+20, 15, 15);
            g.drawArc(over+25,down+35,50,40,170, 200);
        }
    } // end of draw()

	
} // end of class Baby
