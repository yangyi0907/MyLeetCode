package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author YANGYI
 * @create 2021/11/10
 */
public class MinDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/homework/data.txt"));
        String s;
        ArrayList<Point> temp = new ArrayList<>();
        int n = 0;
        while ((s = br.readLine()) != null) {
            double a = Double.parseDouble(s.substring(2, 5));
            double b = Double.parseDouble(s.substring(7, 10));
            temp.add(new Point(n++, a, b));
        }
        br.close();
        Point[] points = new Point[temp.size()];
        for (int i = 0; i < points.length; i++) {
            points[i] = temp.get(i);
        }
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return Double.compare(p1.x, p2.x);
            }
        });
        System.out.println(getMinDistance(points, 0, points.length - 1));
    }

    public static MinDis getMinDistance(Point[] points, int left, int right) {
        if (left == right) return new MinDis(points[left].n, points[right].n, Double.MAX_VALUE);
        if (left + 1 == right)
            return new MinDis(points[left].n, points[right].n, getDistance(points[left], points[right]));
        int mid = (left + right) / 2;
        MinDis lMinDis = getMinDistance(points, left, mid);
        MinDis rMinDis = getMinDistance(points, mid, right);
        MinDis curMinDis;
        if (lMinDis.distance > rMinDis.distance) {
            curMinDis = new MinDis(rMinDis.n1, rMinDis.n2, rMinDis.distance);
        } else {
            curMinDis = new MinDis(lMinDis.n1, lMinDis.n2, lMinDis.distance);
        }
        ArrayList<Point> tempPoint = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i >= mid - curMinDis.distance && i <= mid + curMinDis.distance) {
                tempPoint.add(points[i]);
            }
        }
        //
        tempPoint.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return (int) (o1.y * 100 - o2.y * 100);
            }
        });
        for (int i = 0; i < tempPoint.size() - 1; i++) {
            for (int j = i + 1; j < tempPoint.size(); j++) {
                if (tempPoint.get(i).y - tempPoint.get(j).y >= curMinDis.distance) {
                    break;
                }
                if (Math.abs(tempPoint.get(i).y - tempPoint.get(j).y) < curMinDis.distance) {
                    double distance = getDistance(tempPoint.get(i), tempPoint.get(j));
                    if (distance < curMinDis.distance) {
                        curMinDis.distance = distance;
                        curMinDis.n1 = tempPoint.get(i).n;
                        curMinDis.n2 = tempPoint.get(j).n;
                    }
                }
            }
        }
        return curMinDis;
    }

    public static double getDistance(Point p1, Point p2) {
        return Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x));
    }
}

class Point {
    int n;
    double x;
    double y;

    public Point(int n, double x, double y) {
        this.n = n;
        this.x = x;
        this.y = y;
    }
}

class MinDis {
    int n1;
    int n2;
    double distance;

    public MinDis(int n1, int n2, double distance) {
        this.n1 = n1;
        this.n2 = n2;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "MinDis{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                ", distance=" + distance +
                '}';
    }
}