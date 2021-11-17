 
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    
    
    
    
    public MUPanel() {
        initComponents();

        
        
// school # 0:  University name is Mount Union, state is OH, founded in 1846, does offer PhD degrees
// school # 1:  University name is Heidelberg, state is OH, founded in 1850, does not offer PhD degrees
// school # 2:  University name is Purdue, state is IN, founded in 1874, does offer PhD degrees
// school # 3:  University name is Marietta, state is OH, founded in 1835, does not offer PhD degrees
// school # 4:  University name is Waynesburg, state is PA, founded in 1849, does not offer PhD degrees
// school # 5:  University name is Ohio State, state is OH, founded in 1870, does offer PhD degrees
// school # 6:  University name is Ball State, state is IN, founded in 1918, does offer PhD degrees
// school # 7:  University name is Capital, state is OH, founded in 1830, does not offer PhD degrees



    
        System.out.println("\nAll Universities:\n======================");
//        displayAllUniversities();

        System.out.println("\nUniversities in Ohio:\n======================");
//        displayOhioUniversities();



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
