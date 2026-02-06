package o;

import android.util.Size;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class W82 {
    public static final Size a = new Size(0, 0);
    public static final Size b = new Size(320, 240);
    public static final Size c = new Size(640, com.facebook.internal.q0.n1);
    public static final Size d = new Size(720, com.facebook.internal.q0.n1);
    public static final Size e = new Size(com.facebook.internal.q0.q1, 720);
    public static final Size f = new Size(1920, FC.u);
    public static final Size g = new Size(1920, 1440);

    public static int a(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static Size b(List<Size> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (Size) Collections.max(list, new C8474oH());
    }

    public static boolean c(Size size, Size size2) {
        if (size.getWidth() <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
            return false;
        }
        return true;
    }

    public static boolean d(Size size, Size size2) {
        if (a(size) < a(size2)) {
            return true;
        }
        return false;
    }
}
