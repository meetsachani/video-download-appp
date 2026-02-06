package o;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class EV0 extends AbstractC8387nv2<DV0> {
    public static final EV0 a = new EV0();

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[XV0.values().length];
            a = iArr;
            try {
                iArr[XV0.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[XV0.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[XV0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[XV0.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[XV0.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[XV0.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private EV0() {
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: j */
    public DV0 e(OV0 ov0) throws IOException {
        String str;
        boolean z;
        if (ov0 instanceof YV0) {
            return ((YV0) ov0).e0();
        }
        XV0 I = ov0.I();
        DV0 l = l(ov0, I);
        if (l == null) {
            return k(ov0, I);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (ov0.r()) {
                if (l instanceof IV0) {
                    str = ov0.A();
                } else {
                    str = null;
                }
                XV0 I2 = ov0.I();
                DV0 l2 = l(ov0, I2);
                if (l2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (l2 == null) {
                    l2 = k(ov0, I2);
                }
                if (l instanceof C10237vV0) {
                    ((C10237vV0) l).a0(l2);
                } else {
                    ((IV0) l).U(str, l2);
                }
                if (z) {
                    arrayDeque.addLast(l);
                    l = l2;
                }
            } else {
                if (l instanceof C10237vV0) {
                    ov0.k();
                } else {
                    ov0.l();
                }
                if (arrayDeque.isEmpty()) {
                    return l;
                }
                l = (DV0) arrayDeque.removeLast();
            }
        }
    }

    public final DV0 k(OV0 ov0, XV0 xv0) throws IOException {
        int i = a.a[xv0.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        ov0.E();
                        return HV0.X;
                    }
                    throw new IllegalStateException("Unexpected token: " + xv0);
                }
                return new MV0(Boolean.valueOf(ov0.v()));
            }
            return new MV0(new DY0(ov0.G()));
        }
        return new MV0(ov0.G());
    }

    public final DV0 l(OV0 ov0, XV0 xv0) throws IOException {
        int i = a.a[xv0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            ov0.f();
            return new IV0();
        }
        ov0.d();
        return new C10237vV0();
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: m */
    public void i(C5589cW0 c5589cW0, DV0 dv0) throws IOException {
        if (dv0 != null && !dv0.L()) {
            if (dv0.Q()) {
                MV0 D = dv0.D();
                if (D.Y()) {
                    c5589cW0.Q(D.G());
                    return;
                } else if (D.V()) {
                    c5589cW0.S(D.h());
                    return;
                } else {
                    c5589cW0.R(D.J());
                    return;
                }
            } else if (dv0.K()) {
                c5589cW0.h();
                Iterator<DV0> it = dv0.r().iterator();
                while (it.hasNext()) {
                    i(c5589cW0, it.next());
                }
                c5589cW0.k();
                return;
            } else if (dv0.M()) {
                c5589cW0.i();
                for (Map.Entry<String, DV0> entry : dv0.B().entrySet()) {
                    c5589cW0.s(entry.getKey());
                    i(c5589cW0, entry.getValue());
                }
                c5589cW0.l();
                return;
            } else {
                throw new IllegalArgumentException("Couldn't write " + dv0.getClass());
            }
        }
        c5589cW0.u();
    }
}
