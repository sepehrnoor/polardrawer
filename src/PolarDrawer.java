import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sepehr on 8/2/2016.
 */
public class PolarDrawer {

    public static void main(String[] args) {
        System.out.println("Polar Drawer!");

        int iterations = 1000;
        double resolution = .5;
        double wa = 5 , wr = 7;
        double baseR = 200;
        double addR = 200;

        List<PolarPoint> points = new ArrayList<>();

        for (double i = 0; i < iterations; i = i + resolution) {
            points.add(new PolarPoint(i * wa / 2 / Math.PI, baseR + Math.sin(i / Math.PI / 2 * wr) * addR));
        }

        DrawDisplay d = new DrawDisplay(points);

    }

}
