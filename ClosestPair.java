import java.util.Arrays;

public class ClosestPair {
    public static class Point {
        public double x, y;
        public Point(double x, double y) { this.x = x; this.y = y; }
    }

    public static double closestPair(Point[] points) {
        Arrays.sort(points, (a, b) -> Double.compare(a.x, b.x));
        return closest(points, 0, points.length - 1);
    }

    private static double closest(Point[] points, int left, int right) {
        if (right - left <= 3) {
            return bruteForce(points, left, right);
        }

        int mid = (left + right) / 2;
        double d1 = closest(points, left, mid);
        double d2 = closest(points, mid + 1, right);
        double d = Math.min(d1, d2);

        return Math.min(d, stripCheck(points, left, right, points[mid].x, d));
    }

    private static double bruteForce(Point[] points, int left, int right) {
        double min = Double.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            for (int j = i + 1; j <= right; j++) {
                min = Math.min(min, distance(points[i], points[j]));
            }
        }
        return min;
    }

    private static double stripCheck(Point[] points, int left, int right, double midX, double d) {
        Point[] strip = Arrays.stream(points, left, right + 1)
                .filter(p -> Math.abs(p.x - midX) < d)
                .sorted((a, b) -> Double.compare(a.y, b.y))
                .toArray(Point[]::new);

        double min = d;
        for (int i = 0; i < strip.length; i++) {
            for (int j = i + 1; j < strip.length && (strip[j].y - strip[i].y) < min; j++) {
                min = Math.min(min, distance(strip[i], strip[j]));
            }
        }
        return min;
    }

    private static double distance(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
}
