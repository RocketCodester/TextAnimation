/* 
   12/2/14
   JDK 1.7
   Animate text using a loop
*/
import java.awt.*;
import javax.swing.*;
public class TextAnimation extends JComponent{
    JFrame frame = new JFrame ("Text Animation");
    Container content = frame.getContentPane();
    int x=112;
    int y=50;
    int size=8;
    int red=0;
    int green=255;
    int blue= 255;
    public static void main(String[] args) {
        TextAnimation drawing = new TextAnimation();
        drawing.setUp();
    }
            public void setUp(){
                content.add(this);
                frame.setSize(500,300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                animate();
            }
    @Override
    public void paintComponent(Graphics g){
        g.setFont(new Font ("TimesRoman", Font.BOLD, size));
        g.setColor(new Color(red, green, blue));
        g.drawString("Java is fun!", x, y);
    }
    public void animate(){
        for(int i=1; i<=37; i++){
            try {Thread.sleep(100);} catch(InterruptedException e){}
            repaint();
            x-=3;
            y+=2;
            size+=2;
            red+=5;
            green-=5;
        }
    }
}