package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.NV0;

/* loaded from: classes.dex */
public class OX0 {
    public static NV0.a a = NV0.a.a("k");

    public static <T> List<LX0<T>> a(NV0 nv0, C10624x51 c10624x51, float f, GE2<T> ge2, boolean z) throws IOException {
        NV0 nv02;
        C10624x51 c10624x512;
        float f2;
        GE2<T> ge22;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (nv0.q() == NV0.b.STRING) {
            c10624x51.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        nv0.f();
        while (nv0.j()) {
            if (nv0.s(a) != 0) {
                nv0.u();
            } else if (nv0.q() == NV0.b.BEGIN_ARRAY) {
                nv0.d();
                if (nv0.q() == NV0.b.NUMBER) {
                    NV0 nv03 = nv0;
                    C10624x51 c10624x513 = c10624x51;
                    float f3 = f;
                    GE2<T> ge23 = ge2;
                    boolean z3 = z;
                    LX0 c = NX0.c(nv03, c10624x513, f3, ge23, false, z3);
                    nv02 = nv03;
                    c10624x512 = c10624x513;
                    f2 = f3;
                    ge22 = ge23;
                    z2 = z3;
                    arrayList.add(c);
                } else {
                    nv02 = nv0;
                    c10624x512 = c10624x51;
                    f2 = f;
                    ge22 = ge2;
                    z2 = z;
                    while (nv02.j()) {
                        arrayList.add(NX0.c(nv02, c10624x512, f2, ge22, true, z2));
                    }
                }
                nv02.h();
                nv0 = nv02;
                c10624x51 = c10624x512;
                f = f2;
                ge2 = ge22;
                z = z2;
            } else {
                NV0 nv04 = nv0;
                arrayList.add(NX0.c(nv04, c10624x51, f, ge2, false, z));
                nv0 = nv04;
            }
        }
        nv0.i();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends LX0<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            LX0<T> lx0 = list.get(i2);
            i2++;
            LX0<T> lx02 = list.get(i2);
            lx0.h = Float.valueOf(lx02.g);
            if (lx0.c == null && (t = lx02.b) != null) {
                lx0.c = t;
                if (lx0 instanceof C7412jz1) {
                    ((C7412jz1) lx0).j();
                }
            }
        }
        LX0<T> lx03 = list.get(i);
        if ((lx03.b == null || lx03.c == null) && list.size() > 1) {
            list.remove(lx03);
        }
    }
}
