/**
 * Created by Sepehr on 8/2/2016.
 */
public class PolarPoint {

    public double x, y, arg, r;

    public PolarPoint(double arg, double r) {
        this.arg = arg;
        this.r = r;
        this.x = r * (Math.cos(arg));
        this.y = r * (Math.sin(arg));
    }
}
