package o;

import java.nio.ByteBuffer;
import java.util.ArrayList;

@Deprecated
/* renamed from: o.md  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8069md extends U72 {
    public static final int a = 2;
    public static final int b = 21;
    public static final int c = 3;
    public static final int d = 116;

    @InterfaceC11300zs1
    public static C4224Si1 c(C2903Ey1 c2903Ey1) {
        c2903Ey1.s(12);
        int d2 = (c2903Ey1.d() + c2903Ey1.h(12)) - 4;
        c2903Ey1.s(44);
        c2903Ey1.t(c2903Ey1.h(12));
        c2903Ey1.s(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (c2903Ey1.d() >= d2) {
                break;
            }
            c2903Ey1.s(48);
            int h = c2903Ey1.h(8);
            c2903Ey1.s(4);
            int d3 = c2903Ey1.d() + c2903Ey1.h(12);
            String str2 = null;
            while (c2903Ey1.d() < d3) {
                int h2 = c2903Ey1.h(8);
                int h3 = c2903Ey1.h(8);
                int d4 = c2903Ey1.d() + h3;
                if (h2 == 2) {
                    int h4 = c2903Ey1.h(16);
                    c2903Ey1.s(8);
                    if (h4 != 3) {
                    }
                    while (c2903Ey1.d() < d4) {
                        str = c2903Ey1.m(c2903Ey1.h(8), KB.a);
                        int h5 = c2903Ey1.h(8);
                        for (int i = 0; i < h5; i++) {
                            c2903Ey1.t(c2903Ey1.h(8));
                        }
                    }
                } else if (h2 == 21) {
                    str2 = c2903Ey1.m(h3, KB.a);
                }
                c2903Ey1.q(d4 * 8);
            }
            c2903Ey1.q(d3 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new C7808ld(h, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4224Si1(arrayList);
    }

    @Override // o.U72
    @InterfaceC11300zs1
    public C4224Si1 b(C5638cj1 c5638cj1, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new C2903Ey1(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
