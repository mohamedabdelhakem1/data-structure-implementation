package eg.edu.alexu.csd.datastructure.iceHockey.cs44;
import java.awt.Point;
import java.util.Comparator;
public class PointCompare implements Comparator<Point> {

	@Override
	public int compare(Point a, Point b) {
		if (a.x<b.x) {
			return -1;
		}
		else if (a.x>b.x) {
			return 1;
		}
		else if (a.x == b.x)
		{
			if (a.y < b.y) {
				return -1;
			}
			else if (a.y>b.y) {
				return 1;
			}
		}
		return 0;

	}

}
