package o;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.NV0;

/* renamed from: o.bW0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5347bW0 {
    public static final NV0.a a = NV0.a.a("x", C5738d80.b);

    /* renamed from: o.bW0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[NV0.b.values().length];
            a = iArr;
            try {
                iArr[NV0.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[NV0.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[NV0.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(NV0 nv0, float f) throws IOException {
        nv0.d();
        float l = (float) nv0.l();
        float l2 = (float) nv0.l();
        while (nv0.q() != NV0.b.END_ARRAY) {
            nv0.u();
        }
        nv0.h();
        return new PointF(l * f, l2 * f);
    }

    public static PointF b(NV0 nv0, float f) throws IOException {
        float l = (float) nv0.l();
        float l2 = (float) nv0.l();
        while (nv0.j()) {
            nv0.u();
        }
        return new PointF(l * f, l2 * f);
    }

    public static PointF c(NV0 nv0, float f) throws IOException {
        nv0.f();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (nv0.j()) {
            int s = nv0.s(a);
            if (s != 0) {
                if (s != 1) {
                    nv0.t();
                    nv0.u();
                } else {
                    f3 = g(nv0);
                }
            } else {
                f2 = g(nv0);
            }
        }
        nv0.i();
        return new PointF(f2 * f, f3 * f);
    }

    public static int d(NV0 nv0) throws IOException {
        nv0.d();
        int l = (int) (nv0.l() * 255.0d);
        int l2 = (int) (nv0.l() * 255.0d);
        int l3 = (int) (nv0.l() * 255.0d);
        while (nv0.j()) {
            nv0.u();
        }
        nv0.h();
        return Color.argb(255, l, l2, l3);
    }

    public static PointF e(NV0 nv0, float f) throws IOException {
        int i = a.a[nv0.q().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return c(nv0, f);
                }
                throw new IllegalArgumentException("Unknown point starts with " + nv0.q());
            }
            return a(nv0, f);
        }
        return b(nv0, f);
    }

    public static List<PointF> f(NV0 nv0, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        nv0.d();
        while (nv0.q() == NV0.b.BEGIN_ARRAY) {
            nv0.d();
            arrayList.add(e(nv0, f));
            nv0.h();
        }
        nv0.h();
        return arrayList;
    }

    public static float g(NV0 nv0) throws IOException {
        NV0.b q = nv0.q();
        int i = a.a[q.ordinal()];
        if (i != 1) {
            if (i == 2) {
                nv0.d();
                float l = (float) nv0.l();
                while (nv0.j()) {
                    nv0.u();
                }
                nv0.h();
                return l;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + q);
        }
        return (float) nv0.l();
    }
}
