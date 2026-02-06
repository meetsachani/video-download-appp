package o;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;

/* renamed from: o.w40  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10376w40 {
    public static final Size e = new Size(1920, FC.u);
    public static final Size f = new Size(320, 240);
    public static final Size g = new Size(640, com.facebook.internal.q0.n1);
    public static final Object h = new Object();
    public static volatile C10376w40 i;
    public final DisplayManager a;
    public volatile Size b = null;
    public final C2431Ad1 c = new C2431Ad1();
    public final C11105z40 d = new C11105z40();

    public C10376w40(Context context) {
        this.a = (DisplayManager) context.getSystemService("display");
    }

    public static C10376w40 c(Context context) {
        if (i == null) {
            synchronized (h) {
                try {
                    if (i == null) {
                        i = new C10376w40(context);
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public static void h() {
        i = null;
    }

    public final Size a() {
        Size b = b();
        int width = b.getWidth() * b.getHeight();
        Size size = e;
        if (width > size.getWidth() * size.getHeight()) {
            b = size;
        }
        return this.c.a(b);
    }

    public final Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (W82.d(size, f) && (size = this.d.a()) == null) {
            size = g;
        }
        if (size.getHeight() > size.getWidth()) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    public Display d(boolean z) {
        Display[] displays = this.a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display e2 = e(displays, z);
        if (e2 == null && z) {
            e2 = e(displays, false);
        }
        if (e2 != null) {
            return e2;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Display e(Display[] displayArr, boolean z) {
        Display display = null;
        int i2 = -1;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i3 = point.x;
                int i4 = point.y;
                if (i3 * i4 > i2) {
                    display = display2;
                    i2 = i3 * i4;
                }
            }
        }
        return display;
    }

    public Size f() {
        if (this.b != null) {
            return this.b;
        }
        this.b = a();
        return this.b;
    }

    public void g() {
        this.b = a();
    }
}
