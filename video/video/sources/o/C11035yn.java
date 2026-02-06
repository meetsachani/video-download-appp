package o;

import java.util.List;

/* renamed from: o.yn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11035yn {
    public static C10792xn a(List<C8577oi0> list) {
        int size = list.size() << 1;
        int i = size - 1;
        if (list.get(list.size() - 1).d() == null) {
            i = size - 2;
        }
        C10792xn c10792xn = new C10792xn(i * 12);
        int i2 = 0;
        int b = list.get(0).d().b();
        for (int i3 = 11; i3 >= 0; i3--) {
            if (((1 << i3) & b) != 0) {
                c10792xn.r(i2);
            }
            i2++;
        }
        for (int i4 = 1; i4 < list.size(); i4++) {
            C8577oi0 c8577oi0 = list.get(i4);
            int b2 = c8577oi0.c().b();
            for (int i5 = 11; i5 >= 0; i5--) {
                if (((1 << i5) & b2) != 0) {
                    c10792xn.r(i2);
                }
                i2++;
            }
            if (c8577oi0.d() != null) {
                int b3 = c8577oi0.d().b();
                for (int i6 = 11; i6 >= 0; i6--) {
                    if (((1 << i6) & b3) != 0) {
                        c10792xn.r(i2);
                    }
                    i2++;
                }
            }
        }
        return c10792xn;
    }
}
