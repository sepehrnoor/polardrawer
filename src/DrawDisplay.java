import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by Sepehr on 8/2/2016.
 */
public class DrawDisplay extends JFrame {

    public List<PolarPoint> points;
    public int windowSize = 800;

    public DrawDisplay(List<PolarPoint> points){
        this.points = points;
        setSize(windowSize,windowSize);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        for (int i = 0; i < points.size() - 1; i++){
            g.drawLine((int)points.get(i).x + windowSize/2,(int)points.get(i).y + windowSize/2,(int)points.get(i+1).x + windowSize/2,(int)points.get(i+1).y + windowSize/2);
        }
    }

}
