import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        
        this.setVisible(true);//Make this visible
        this.setSize(500,500);//Sets the x and y dimension of this
        this.setTitle("GUI tutorial");//Set title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exit out of application or (HIDE_ON_CLOSE or DO_NOTHING_ON_CLOSE)
        //this.setResizable(false);//Prevent this from being resized(không thể resize hay fullscreen)

        ImageIcon image=new ImageIcon("db.png");//Create an image
        this.setIconImage(image.getImage());//Change icon of this(can't use with macbook)
        this.getContentPane().setBackground(new Color(100,230,150));//Change color of background

    }
}
