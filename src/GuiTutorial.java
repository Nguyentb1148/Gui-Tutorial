import javax.swing.*;
import java.awt.*;

public class GuiTutorial {
    public static void main(String args[]) {
        //JFrame is a Gui window to add components to
//        JFrame frame=new JFrame();//Creates a frame
//        frame.setVisible(true);//Make frame visible
//        frame.setSize(500,500);//Sets the x and y dimension of frame
//        frame.setTitle("GUI tutorial");//Set title of frame
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exit out of application or (HIDE_ON_CLOSE or DO_NOTHING_ON_CLOSE)
//        //frame.setResizable(false);//Prevent frame from being resized(không thể resize hay fullscreen)
//
//        ImageIcon image=new ImageIcon("db.png");//Create an image
//        frame.setIconImage(image.getImage());//Change icon of frame(can't use with macbook)
//        frame.getContentPane().setBackground(new Color(100,230,150));//Change color of background
//        new MyFrame();

        ImageIcon imageIcon=new ImageIcon("db.png");
        JLabel label1 = new JLabel();//create a label
        label1.setText("First label");//set text of label
        label1.setIcon(imageIcon);
        label1.setHorizontalAlignment(JLabel.CENTER);//set text Left,center,right of imageIcon
        label1.setVerticalTextPosition(JLabel.TOP);//set text top,center,bottom of imageIcon
        //add
        JFrame frame = new JFrame();
        frame.setTitle("dumb");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label1);

    }

}
