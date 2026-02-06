package o;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;

/* loaded from: classes.dex */
public final class AP1 {
    public static final Rect A(Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        rect2.top *= i;
        rect2.left *= i;
        rect2.right *= i;
        rect2.bottom *= i;
        return rect2;
    }

    public static final RectF B(RectF rectF, float f) {
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    public static final RectF C(RectF rectF, int i) {
        float f = i;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    public static final Rect D(RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    public static final RectF E(Rect rect) {
        return new RectF(rect);
    }

    public static final Region F(Rect rect) {
        return new Region(rect);
    }

    public static final Region G(RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    public static final RectF H(RectF rectF, Matrix matrix) {
        matrix.mapRect(rectF);
        return rectF;
    }

    public static final Region I(Rect rect, Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final Region J(RectF rectF, RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final Rect a(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    public static final RectF b(RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final float c(RectF rectF) {
        return rectF.left;
    }

    public static final int d(Rect rect) {
        return rect.left;
    }

    public static final float e(RectF rectF) {
        return rectF.top;
    }

    public static final int f(Rect rect) {
        return rect.top;
    }

    public static final float g(RectF rectF) {
        return rectF.right;
    }

    public static final int h(Rect rect) {
        return rect.right;
    }

    public static final float i(RectF rectF) {
        return rectF.bottom;
    }

    public static final int j(Rect rect) {
        return rect.bottom;
    }

    public static final boolean k(Rect rect, Point point) {
        return rect.contains(point.x, point.y);
    }

    public static final boolean l(RectF rectF, PointF pointF) {
        return rectF.contains(pointF.x, pointF.y);
    }

    public static final Rect m(Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        int i2 = -i;
        rect2.offset(i2, i2);
        return rect2;
    }

    public static final Rect n(Rect rect, Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    public static final RectF o(RectF rectF, float f) {
        RectF rectF2 = new RectF(rectF);
        float f2 = -f;
        rectF2.offset(f2, f2);
        return rectF2;
    }

    public static final RectF p(RectF rectF, PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    public static final Region q(Rect rect, Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    public static final Region r(RectF rectF, RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    public static final Rect s(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final RectF t(RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    public static final Rect u(Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        rect2.offset(i, i);
        return rect2;
    }

    public static final Rect v(Rect rect, Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    public static final Rect w(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final RectF x(RectF rectF, float f) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f, f);
        return rectF2;
    }

    public static final RectF y(RectF rectF, PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    public static final RectF z(RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }
}
