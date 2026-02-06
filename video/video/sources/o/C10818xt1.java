package o;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: o.xt1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10818xt1 extends AbstractC8387nv2<Object> {
    public static final InterfaceC8631ov2 c = k(EnumC3862Op2.X);
    public final C5523cF0 a;
    public final InterfaceC3959Pp2 b;

    /* renamed from: o.xt1$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC8631ov2 {
        public final /* synthetic */ InterfaceC3959Pp2 X;

        public a(InterfaceC3959Pp2 interfaceC3959Pp2) {
            this.X = interfaceC3959Pp2;
        }

        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            if (rv2.f() != Object.class) {
                return null;
            }
            return new C10818xt1(c5523cF0, this.X, null);
        }
    }

    /* renamed from: o.xt1$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
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

    public /* synthetic */ C10818xt1(C5523cF0 c5523cF0, InterfaceC3959Pp2 interfaceC3959Pp2, a aVar) {
        this(c5523cF0, interfaceC3959Pp2);
    }

    public static InterfaceC8631ov2 j(InterfaceC3959Pp2 interfaceC3959Pp2) {
        if (interfaceC3959Pp2 == EnumC3862Op2.X) {
            return c;
        }
        return k(interfaceC3959Pp2);
    }

    private static InterfaceC8631ov2 k(InterfaceC3959Pp2 interfaceC3959Pp2) {
        return new a(interfaceC3959Pp2);
    }

    @Override // o.AbstractC8387nv2
    public Object e(OV0 ov0) throws IOException {
        String str;
        boolean z;
        XV0 I = ov0.I();
        Object m = m(ov0, I);
        if (m == null) {
            return l(ov0, I);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (ov0.r()) {
                if (m instanceof Map) {
                    str = ov0.A();
                } else {
                    str = null;
                }
                XV0 I2 = ov0.I();
                Object m2 = m(ov0, I2);
                if (m2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (m2 == null) {
                    m2 = l(ov0, I2);
                }
                if (m instanceof List) {
                    ((List) m).add(m2);
                } else {
                    ((Map) m).put(str, m2);
                }
                if (z) {
                    arrayDeque.addLast(m);
                    m = m2;
                }
            } else {
                if (m instanceof List) {
                    ov0.k();
                } else {
                    ov0.l();
                }
                if (arrayDeque.isEmpty()) {
                    return m;
                }
                m = arrayDeque.removeLast();
            }
        }
    }

    @Override // o.AbstractC8387nv2
    public void i(C5589cW0 c5589cW0, Object obj) throws IOException {
        if (obj == null) {
            c5589cW0.u();
            return;
        }
        AbstractC8387nv2 t = this.a.t(obj.getClass());
        if (t instanceof C10818xt1) {
            c5589cW0.i();
            c5589cW0.l();
            return;
        }
        t.i(c5589cW0, obj);
    }

    public final Object l(OV0 ov0, XV0 xv0) throws IOException {
        int i = b.a[xv0.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        ov0.E();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: " + xv0);
                }
                return Boolean.valueOf(ov0.v());
            }
            return this.b.e(ov0);
        }
        return ov0.G();
    }

    public final Object m(OV0 ov0, XV0 xv0) throws IOException {
        int i = b.a[xv0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            ov0.f();
            return new I01();
        }
        ov0.d();
        return new ArrayList();
    }

    public C10818xt1(C5523cF0 c5523cF0, InterfaceC3959Pp2 interfaceC3959Pp2) {
        this.a = c5523cF0;
        this.b = interfaceC3959Pp2;
    }
}
