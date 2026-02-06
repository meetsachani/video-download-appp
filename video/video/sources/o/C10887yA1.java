package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: o.yA1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10887yA1 {

    /* renamed from: o.yA1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static float[] a(Path path, float f) {
            return path.approximate(f);
        }
    }

    public static Collection<C2906Ez1> a(Path path) {
        return b(path, 0.5f);
    }

    public static Collection<C2906Ez1> b(Path path, float f) {
        float[] a2 = a.a(path, f);
        int length = a2.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = a2[i2];
            float f3 = a2[i2 + 1];
            float f4 = a2[i2 + 2];
            float f5 = a2[i3];
            float f6 = a2[i3 + 1];
            float f7 = a2[i3 + 2];
            if (f2 != f5 && (f3 != f6 || f4 != f7)) {
                arrayList.add(new C2906Ez1(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}
