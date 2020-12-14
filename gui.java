import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gui {
    // JFrame = GUI window
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // create frame
        JLabel label = new JLabel(); // create labels
        ImageIcon image = new ImageIcon("itachi-Icon.jpg"); // create the image icon
        ImageIcon itachiImage = new ImageIcon("Itachi-Hat-Tip.jpg"); // add label image
        Border border = BorderFactory.createLineBorder(Color.BLACK, 5);

        label.setText("Itachi"); // set text for label
        label.setHorizontalTextPosition(JLabel.CENTER); // set horizontal text position (LEFT, CENTER, RIGHT)
        label.setVerticalTextPosition(JLabel.TOP); // set vertical text position (TOP, CENTER, BOTTOM)
        label.setForeground(new Color(0, 0, 0));
        label.setFont(new Font("MG Boli", Font.PLAIN, 20));
        label.setIconTextGap(10); // set text gap from image
        label.setIcon(itachiImage); // set label image
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBorder(border); // add border
        label.setBounds(200, 200, 300, 300); // set x & y position of border then set size of border

        frame.setIconImage(image.getImage()); //sets frame icon
        frame.setTitle("Ely's GUI Project"); // set top title of frame
        frame.setSize(750, 750); // sets x & y dimension of frame
        frame.setResizable(false); // prevent frame from being resized
        frame.setVisible(true); // make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X button kills application
        frame.getContentPane().setBackground(new Color(201, 42, 42)); // change background color of frame
        frame.add(label);
        frame.setLayout(null);
        //frame.pack(); // automatically resizes window to fit all components


    }
}
