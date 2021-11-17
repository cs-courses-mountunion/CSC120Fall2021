 
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    
    
    
    
    public MUPanel() {
        initComponents();

        
        
// show # 0:  Counting Crows are in concert on September 20 at Blossom Music Center
// show # 1:  Foo Fighters are in concert on July 19 at PPG Paints Arena
// show # 2:  Green Day is in concert on August 21 at Blossom Music Center
// show # 3:  John Mayer is in concert on August 30 at Blossom Music Center
// show # 4:  Lady Antebellum is in concert on July 21 at Blossom Music Center
// show # 5:  Maroon 5 is in concert on September 29 at PPG Paints Arena
// show # 6:  Sam Hunt is in concert on June 1 at Blossom Music Center
// show # 7:  Shania Twain is in concert on June 16 at Quicken Loans Arena
// show # 8:  Taylor Swift is in concert on July 17 at FirstEnergy Stadium


    
        System.out.println("\nAll Concerts:\n======================");
//        displayAllConcerts();

        System.out.println("\nConcerts in July:\n======================");
//        displayJulyConcerts();



    } // end of MUPanel constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        g.setFont( new Font("SansSerif", Font.BOLD, 18));
        g.setColor(Color.YELLOW);
        g.drawString("Look in Java Console for Output....", 50, 190);        
        
    } // end of method paintComponent
    
    // Add other methods here:
    
	

    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void initComponents() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 400));
        setName("CS 120 Practicum # 2");
        setBackground(new Color(102, 0, 102));
    }

	 
	 public void frame() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    public static void main(String args[]){new MUPanel().frame();}

} // end of class MUPanel
