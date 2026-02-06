package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: o.Xj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4713Xj1 {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static double b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static float c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int d(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static boolean e(float f, float f2, float f3) {
        if (f >= f2 && f <= f3) {
            return true;
        }
        return false;
    }

    public static int f(int i, int i2) {
        boolean z;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            return i3 - 1;
        }
        return i3;
    }

    public static int g(float f, float f2) {
        return h((int) f, (int) f2);
    }

    public static int h(int i, int i2) {
        return i - (i2 * f(i, i2));
    }

    public static void i(R22 r22, Path path) {
        Path path2;
        path.reset();
        PointF b = r22.b();
        path.moveTo(b.x, b.y);
        a.set(b.x, b.y);
        int i = 0;
        while (i < r22.a().size()) {
            C6557gS c6557gS = r22.a().get(i);
            PointF a2 = c6557gS.a();
            PointF b2 = c6557gS.b();
            PointF c = c6557gS.c();
            PointF pointF = a;
            if (a2.equals(pointF) && b2.equals(c)) {
                path.lineTo(c.x, c.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(a2.x, a2.y, b2.x, b2.y, c.x, c.y);
            }
            pointF.set(c.x, c.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (r22.d()) {
            path3.close();
        }
    }

    public static double j(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static float k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int l(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static void m(AX0 ax0, int i, List<AX0> list, AX0 ax02, CX0 cx0) {
        if (ax0.c(cx0.getName(), i)) {
            list.add(ax02.a(cx0.getName()).j(cx0));
        }
    }
}
