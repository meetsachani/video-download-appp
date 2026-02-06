package o;

import android.graphics.Point;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class VD1 {
    public static final float a(PointF pointF) {
        return pointF.x;
    }

    public static final int b(Point point) {
        return point.x;
    }

    public static final float c(PointF pointF) {
        return pointF.y;
    }

    public static final int d(Point point) {
        return point.y;
    }

    public static final Point e(Point point, float f) {
        return new Point(Math.round(point.x / f), Math.round(point.y / f));
    }

    public static final PointF f(PointF pointF, float f) {
        return new PointF(pointF.x / f, pointF.y / f);
    }

    public static final Point g(Point point, int i) {
        Point point2 = new Point(point.x, point.y);
        int i2 = -i;
        point2.offset(i2, i2);
        return point2;
    }

    public static final Point h(Point point, Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    public static final PointF i(PointF pointF, float f) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f2 = -f;
        pointF2.offset(f2, f2);
        return pointF2;
    }

    public static final PointF j(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    public static final Point k(Point point, int i) {
        Point point2 = new Point(point.x, point.y);
        point2.offset(i, i);
        return point2;
    }

    public static final Point l(Point point, Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    public static final PointF m(PointF pointF, float f) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f, f);
        return pointF2;
    }

    public static final PointF n(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    public static final Point o(Point point, float f) {
        return new Point(Math.round(point.x * f), Math.round(point.y * f));
    }

    public static final PointF p(PointF pointF, float f) {
        return new PointF(pointF.x * f, pointF.y * f);
    }

    public static final Point q(PointF pointF) {
        return new Point((int) pointF.x, (int) pointF.y);
    }

    public static final PointF r(Point point) {
        return new PointF(point);
    }

    public static final Point s(Point point) {
        return new Point(-point.x, -point.y);
    }

    public static final PointF t(PointF pointF) {
        return new PointF(-pointF.x, -pointF.y);
    }
}
