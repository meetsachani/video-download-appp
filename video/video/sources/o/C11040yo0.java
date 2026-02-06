package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C11040yo0.c;
import o.C9740tS0;
import o.IM2;
import o.InterfaceC3540Li1;
import o.OY0;

/* renamed from: o.yo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11040yo0<T extends c<T>> {
    public static final int d = 16;
    public static final C11040yo0 e = new C11040yo0(true);
    public final C9909u92<T, Object> a;
    public boolean b;
    public boolean c;

    /* renamed from: o.yo0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[IM2.b.values().length];
            b = iArr;
            try {
                iArr[IM2.b.Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[IM2.b.Y0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[IM2.b.Z0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[IM2.b.a1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[IM2.b.b1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[IM2.b.c1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[IM2.b.d1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[IM2.b.e1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[IM2.b.g1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[IM2.b.h1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[IM2.b.f1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[IM2.b.i1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[IM2.b.j1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[IM2.b.l1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[IM2.b.m1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[IM2.b.n1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[IM2.b.o1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[IM2.b.k1.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[IM2.c.values().length];
            a = iArr2;
            try {
                iArr2[IM2.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[IM2.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[IM2.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[IM2.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[IM2.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[IM2.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[IM2.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[IM2.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[IM2.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: o.yo0$b */
    /* loaded from: classes.dex */
    public static final class b<T extends c<T>> {
        public C9909u92<T, Object> a;
        public boolean b;
        public boolean c;
        public boolean d;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public static <T extends c<T>> b<T> e(C11040yo0<T> c11040yo0) {
            b<T> bVar = new b<>(C11040yo0.l(c11040yo0.a, true));
            bVar.b = c11040yo0.c;
            return bVar;
        }

        public static Object p(Object obj) {
            if (obj instanceof InterfaceC3540Li1.a) {
                return ((InterfaceC3540Li1.a) obj).build();
            }
            return obj;
        }

        public static <T extends c<T>> Object q(T t, Object obj) {
            if (obj == null) {
                return obj;
            }
            if (t.z5() == IM2.c.MESSAGE) {
                if (t.g3()) {
                    if (obj instanceof List) {
                        List list = (List) obj;
                        for (int i = 0; i < list.size(); i++) {
                            Object obj2 = list.get(i);
                            Object p = p(obj2);
                            if (p != obj2) {
                                if (list == obj) {
                                    list = new ArrayList(list);
                                }
                                list.set(i, p);
                            }
                        }
                        return list;
                    }
                    throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
                }
                return p(obj);
            }
            return obj;
        }

        public static <T extends c<T>> void r(Map.Entry<T, Object> entry) {
            entry.setValue(q(entry.getKey(), entry.getValue()));
        }

        public static <T extends c<T>> void s(C9909u92<T, Object> c9909u92) {
            for (int i = 0; i < c9909u92.l(); i++) {
                r(c9909u92.k(i));
            }
            for (Map.Entry<T, Object> entry : c9909u92.n()) {
                r(entry);
            }
        }

        public static void v(IM2.b bVar, Object obj) {
            if (!C11040yo0.G(bVar, obj)) {
                if (bVar.e() == IM2.c.MESSAGE && (obj instanceof InterfaceC3540Li1.a)) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }

        public void a(T t, Object obj) {
            boolean z;
            List list;
            d();
            if (t.g3()) {
                if (!this.d && !(obj instanceof InterfaceC3540Li1.a)) {
                    z = false;
                } else {
                    z = true;
                }
                this.d = z;
                v(t.y3(), obj);
                Object g = g(t);
                if (g == null) {
                    list = new ArrayList();
                    this.a.put(t, list);
                } else {
                    list = (List) g;
                }
                list.add(obj);
                return;
            }
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }

        public C11040yo0<T> b() {
            if (this.a.isEmpty()) {
                return C11040yo0.s();
            }
            this.c = false;
            C9909u92<T, Object> c9909u92 = this.a;
            if (this.d) {
                c9909u92 = C11040yo0.l(c9909u92, false);
                s(c9909u92);
            }
            C11040yo0<T> c11040yo0 = new C11040yo0<>(c9909u92, null);
            c11040yo0.c = this.b;
            return c11040yo0;
        }

        public void c(T t) {
            d();
            this.a.remove(t);
            if (this.a.isEmpty()) {
                this.b = false;
            }
        }

        public final void d() {
            if (!this.c) {
                this.a = C11040yo0.l(this.a, true);
                this.c = true;
            }
        }

        public Map<T, Object> f() {
            if (this.b) {
                C9909u92 l = C11040yo0.l(this.a, false);
                if (this.a.t()) {
                    l.u();
                    return l;
                }
                s(l);
                return l;
            } else if (this.a.t()) {
                return this.a;
            } else {
                return Collections.unmodifiableMap(this.a);
            }
        }

        public Object g(T t) {
            return q(t, h(t));
        }

        public Object h(T t) {
            Object obj = this.a.get(t);
            if (obj instanceof OY0) {
                return ((OY0) obj).p();
            }
            return obj;
        }

        public Object i(T t, int i) {
            if (this.d) {
                d();
            }
            return p(j(t, i));
        }

        public Object j(T t, int i) {
            if (t.g3()) {
                Object h = h(t);
                if (h != null) {
                    return ((List) h).get(i);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public int k(T t) {
            if (t.g3()) {
                Object g = g(t);
                if (g == null) {
                    return 0;
                }
                return ((List) g).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public boolean l(T t) {
            if (!t.g3()) {
                if (this.a.get(t) != null) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        public boolean m() {
            for (int i = 0; i < this.a.l(); i++) {
                if (!C11040yo0.F(this.a.k(i))) {
                    return false;
                }
            }
            for (Map.Entry<T, Object> entry : this.a.n()) {
                if (!C11040yo0.F(entry)) {
                    return false;
                }
            }
            return true;
        }

        public void n(C11040yo0<T> c11040yo0) {
            d();
            for (int i = 0; i < c11040yo0.a.l(); i++) {
                o(c11040yo0.a.k(i));
            }
            for (Map.Entry<T, Object> entry : c11040yo0.a.n()) {
                o(entry);
            }
        }

        public final void o(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof OY0) {
                value = ((OY0) value).p();
            }
            if (key.g3()) {
                Object g = g(key);
                if (g == null) {
                    g = new ArrayList();
                }
                for (Object obj : (List) value) {
                    ((List) g).add(C11040yo0.n(obj));
                }
                this.a.put(key, g);
            } else if (key.z5() == IM2.c.MESSAGE) {
                Object g2 = g(key);
                if (g2 == null) {
                    this.a.put(key, C11040yo0.n(value));
                } else if (g2 instanceof InterfaceC3540Li1.a) {
                    key.G3((InterfaceC3540Li1.a) g2, (InterfaceC3540Li1) value);
                } else {
                    this.a.put(key, key.G3(((InterfaceC3540Li1) g2).x(), (InterfaceC3540Li1) value).build());
                }
            } else {
                this.a.put(key, C11040yo0.n(value));
            }
        }

        public void t(T t, Object obj) {
            boolean z;
            d();
            boolean z2 = false;
            if (t.g3()) {
                if (obj instanceof List) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll((List) obj);
                    for (Object obj2 : arrayList) {
                        v(t.y3(), obj2);
                        if (!this.d && !(obj2 instanceof InterfaceC3540Li1.a)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        this.d = z;
                    }
                    obj = arrayList;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            } else {
                v(t.y3(), obj);
            }
            if (obj instanceof OY0) {
                this.b = true;
            }
            this.d = (this.d || (obj instanceof InterfaceC3540Li1.a)) ? true : true;
            this.a.put(t, obj);
        }

        public void u(T t, int i, Object obj) {
            boolean z;
            d();
            if (t.g3()) {
                if (!this.d && !(obj instanceof InterfaceC3540Li1.a)) {
                    z = false;
                } else {
                    z = true;
                }
                this.d = z;
                Object g = g(t);
                if (g != null) {
                    v(t.y3(), obj);
                    ((List) g).set(i, obj);
                    return;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public b() {
            this(C9909u92.v(16));
        }

        public b(C9909u92<T, Object> c9909u92) {
            this.a = c9909u92;
            this.c = true;
        }
    }

    /* renamed from: o.yo0$c */
    /* loaded from: classes.dex */
    public interface c<T extends c<T>> extends Comparable<T> {
        boolean A5();

        InterfaceC3540Li1.a G3(InterfaceC3540Li1.a aVar, InterfaceC3540Li1 interfaceC3540Li1);

        C9740tS0.d<?> Z0();

        boolean g3();

        int k();

        IM2.b y3();

        IM2.c z5();
    }

    public /* synthetic */ C11040yo0(C9909u92 c9909u92, a aVar) {
        this(c9909u92);
    }

    public static int A(IM2.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.g();
    }

    public static <T extends c<T>> boolean F(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.z5() == IM2.c.MESSAGE) {
            if (key.g3()) {
                for (InterfaceC3540Li1 interfaceC3540Li1 : (List) entry.getValue()) {
                    if (!interfaceC3540Li1.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC3540Li1) {
                    if (!((InterfaceC3540Li1) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof OY0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public static boolean G(IM2.b bVar, Object obj) {
        C9740tS0.d(obj);
        switch (a.a[bVar.e().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof AbstractC8616os) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C9740tS0.c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof InterfaceC3540Li1) || (obj instanceof OY0)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public static <T extends c<T>> b<T> L() {
        return new b<>((a) null);
    }

    public static <T extends c<T>> C11040yo0<T> M() {
        return new C11040yo0<>();
    }

    public static Object N(KE ke, IM2.b bVar, boolean z) throws IOException {
        if (z) {
            return IM2.d(ke, bVar, IM2.d.Y);
        }
        return IM2.d(ke, bVar, IM2.d.X);
    }

    public static void R(ME me, IM2.b bVar, int i, Object obj) throws IOException {
        if (bVar == IM2.b.g1) {
            me.F1(i, (InterfaceC3540Li1) obj);
            return;
        }
        me.g2(i, A(bVar, false));
        S(me, bVar, obj);
    }

    public static void S(ME me, IM2.b bVar, Object obj) throws IOException {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                me.A1(((Double) obj).doubleValue());
                return;
            case 2:
                me.E1(((Float) obj).floatValue());
                return;
            case 3:
                me.K1(((Long) obj).longValue());
                return;
            case 4:
                me.i2(((Long) obj).longValue());
                return;
            case 5:
                me.J1(((Integer) obj).intValue());
                return;
            case 6:
                me.D1(((Long) obj).longValue());
                return;
            case 7:
                me.C1(((Integer) obj).intValue());
                return;
            case 8:
                me.t1(((Boolean) obj).booleanValue());
                return;
            case 9:
                me.H1((InterfaceC3540Li1) obj);
                return;
            case 10:
                me.N1((InterfaceC3540Li1) obj);
                return;
            case 11:
                if (obj instanceof AbstractC8616os) {
                    me.z1((AbstractC8616os) obj);
                    return;
                } else {
                    me.f2((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof AbstractC8616os) {
                    me.z1((AbstractC8616os) obj);
                    return;
                } else {
                    me.w1((byte[]) obj);
                    return;
                }
            case 13:
                me.h2(((Integer) obj).intValue());
                return;
            case 14:
                me.b2(((Integer) obj).intValue());
                return;
            case 15:
                me.c2(((Long) obj).longValue());
                return;
            case 16:
                me.d2(((Integer) obj).intValue());
                return;
            case 17:
                me.e2(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C9740tS0.c) {
                    me.B1(((C9740tS0.c) obj).k());
                    return;
                } else {
                    me.B1(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void T(c<?> cVar, Object obj, ME me) throws IOException {
        IM2.b y3 = cVar.y3();
        int k = cVar.k();
        if (cVar.g3()) {
            List<Object> list = (List) obj;
            if (cVar.A5()) {
                me.g2(k, 2);
                int i = 0;
                for (Object obj2 : list) {
                    i += p(y3, obj2);
                }
                me.Z1(i);
                for (Object obj3 : list) {
                    S(me, y3, obj3);
                }
                return;
            }
            for (Object obj4 : list) {
                R(me, y3, k, obj4);
            }
        } else if (obj instanceof OY0) {
            R(me, y3, k, ((OY0) obj).p());
        } else {
            R(me, y3, k, obj);
        }
    }

    public static <T extends c<T>> C9909u92<T, Object> l(C9909u92<T, Object> c9909u92, boolean z) {
        C9909u92<T, Object> v = C9909u92.v(16);
        for (int i = 0; i < c9909u92.l(); i++) {
            m(v, c9909u92.k(i), z);
        }
        for (Map.Entry<T, Object> entry : c9909u92.n()) {
            m(v, entry, z);
        }
        return v;
    }

    public static <T extends c<T>> void m(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof OY0) {
            map.put(key, ((OY0) value).p());
        } else if (z && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    public static Object n(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static int o(IM2.b bVar, int i, Object obj) {
        int X0 = ME.X0(i);
        if (bVar == IM2.b.g1) {
            X0 *= 2;
        }
        return X0 + p(bVar, obj);
    }

    public static int p(IM2.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return ME.j0(((Double) obj).doubleValue());
            case 2:
                return ME.r0(((Float) obj).floatValue());
            case 3:
                return ME.z0(((Long) obj).longValue());
            case 4:
                return ME.b1(((Long) obj).longValue());
            case 5:
                return ME.x0(((Integer) obj).intValue());
            case 6:
                return ME.p0(((Long) obj).longValue());
            case 7:
                return ME.n0(((Integer) obj).intValue());
            case 8:
                return ME.b0(((Boolean) obj).booleanValue());
            case 9:
                return ME.u0((InterfaceC3540Li1) obj);
            case 10:
                if (obj instanceof OY0) {
                    return ME.C0((OY0) obj);
                }
                return ME.H0((InterfaceC3540Li1) obj);
            case 11:
                if (obj instanceof AbstractC8616os) {
                    return ME.h0((AbstractC8616os) obj);
                }
                return ME.W0((String) obj);
            case 12:
                if (obj instanceof AbstractC8616os) {
                    return ME.h0((AbstractC8616os) obj);
                }
                return ME.d0((byte[]) obj);
            case 13:
                return ME.Z0(((Integer) obj).intValue());
            case 14:
                return ME.O0(((Integer) obj).intValue());
            case 15:
                return ME.Q0(((Long) obj).longValue());
            case 16:
                return ME.S0(((Integer) obj).intValue());
            case 17:
                return ME.U0(((Long) obj).longValue());
            case 18:
                if (obj instanceof C9740tS0.c) {
                    return ME.l0(((C9740tS0.c) obj).k());
                }
                return ME.l0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int q(c<?> cVar, Object obj) {
        IM2.b y3 = cVar.y3();
        int k = cVar.k();
        if (cVar.g3()) {
            int i = 0;
            if (cVar.A5()) {
                for (Object obj2 : (List) obj) {
                    i += p(y3, obj2);
                }
                return ME.X0(k) + i + ME.L0(i);
            }
            for (Object obj3 : (List) obj) {
                i += o(y3, k, obj3);
            }
            return i;
        }
        return o(y3, k, obj);
    }

    public static <T extends c<T>> C11040yo0<T> s() {
        return e;
    }

    public boolean B(T t) {
        if (!t.g3()) {
            if (this.a.get(t) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public boolean C() {
        return this.a.isEmpty();
    }

    public boolean D() {
        return this.b;
    }

    public boolean E() {
        for (int i = 0; i < this.a.l(); i++) {
            if (!F(this.a.k(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.n()) {
            if (!F(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> H() {
        if (this.c) {
            return new OY0.c(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public void I() {
        if (this.b) {
            return;
        }
        this.a.u();
        this.b = true;
    }

    public void J(C11040yo0<T> c11040yo0) {
        for (int i = 0; i < c11040yo0.a.l(); i++) {
            K(c11040yo0.a.k(i));
        }
        for (Map.Entry<T, Object> entry : c11040yo0.a.n()) {
            K(entry);
        }
    }

    public final void K(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof OY0) {
            value = ((OY0) value).p();
        }
        if (key.g3()) {
            Object u = u(key);
            if (u == null) {
                u = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) u).add(n(obj));
            }
            this.a.put(key, u);
        } else if (key.z5() == IM2.c.MESSAGE) {
            Object u2 = u(key);
            if (u2 == null) {
                this.a.put(key, n(value));
                return;
            }
            this.a.put(key, key.G3(((InterfaceC3540Li1) u2).x(), (InterfaceC3540Li1) value).build());
        } else {
            this.a.put(key, n(value));
        }
    }

    public void O(T t, Object obj) {
        if (t.g3()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    Q(t.y3(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            Q(t.y3(), obj);
        }
        if (obj instanceof OY0) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    public void P(T t, int i, Object obj) {
        if (t.g3()) {
            Object u = u(t);
            if (u != null) {
                Q(t.y3(), obj);
                ((List) u).set(i, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public final void Q(IM2.b bVar, Object obj) {
        if (G(bVar, obj)) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final void U(Map.Entry<T, Object> entry, ME me) throws IOException {
        T key = entry.getKey();
        if (key.z5() == IM2.c.MESSAGE && !key.g3() && !key.A5()) {
            Object value = entry.getValue();
            if (value instanceof OY0) {
                value = ((OY0) value).p();
            }
            me.P1(entry.getKey().k(), (InterfaceC3540Li1) value);
            return;
        }
        T(key, entry.getValue(), me);
    }

    public void V(ME me) throws IOException {
        for (int i = 0; i < this.a.l(); i++) {
            U(this.a.k(i), me);
        }
        for (Map.Entry<T, Object> entry : this.a.n()) {
            U(entry, me);
        }
    }

    public void W(ME me) throws IOException {
        for (int i = 0; i < this.a.l(); i++) {
            Map.Entry<T, Object> k = this.a.k(i);
            T(k.getKey(), k.getValue(), me);
        }
        for (Map.Entry<T, Object> entry : this.a.n()) {
            T(entry.getKey(), entry.getValue(), me);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11040yo0)) {
            return false;
        }
        return this.a.equals(((C11040yo0) obj).a);
    }

    public void h(T t, Object obj) {
        List list;
        if (t.g3()) {
            Q(t.y3(), obj);
            Object u = u(t);
            if (u == null) {
                list = new ArrayList();
                this.a.put(t, list);
            } else {
                list = (List) u;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i() {
        this.a.clear();
        this.c = false;
    }

    public void j(T t) {
        this.a.remove(t);
        if (this.a.isEmpty()) {
            this.c = false;
        }
    }

    /* renamed from: k */
    public C11040yo0<T> clone() {
        C11040yo0<T> M = M();
        for (int i = 0; i < this.a.l(); i++) {
            Map.Entry<T, Object> k = this.a.k(i);
            M.O(k.getKey(), k.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.n()) {
            M.O(entry.getKey(), entry.getValue());
        }
        M.c = this.c;
        return M;
    }

    public Iterator<Map.Entry<T, Object>> r() {
        if (this.c) {
            return new OY0.c(this.a.i().iterator());
        }
        return this.a.i().iterator();
    }

    public Map<T, Object> t() {
        if (this.c) {
            C9909u92 l = l(this.a, false);
            if (this.a.t()) {
                l.u();
            }
            return l;
        } else if (this.a.t()) {
            return this.a;
        } else {
            return Collections.unmodifiableMap(this.a);
        }
    }

    public Object u(T t) {
        Object obj = this.a.get(t);
        if (obj instanceof OY0) {
            return ((OY0) obj).p();
        }
        return obj;
    }

    public int v() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.l(); i2++) {
            i += w(this.a.k(i2));
        }
        for (Map.Entry<T, Object> entry : this.a.n()) {
            i += w(entry);
        }
        return i;
    }

    public final int w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.z5() == IM2.c.MESSAGE && !key.g3() && !key.A5()) {
            if (value instanceof OY0) {
                return ME.A0(entry.getKey().k(), (OY0) value);
            }
            return ME.E0(entry.getKey().k(), (InterfaceC3540Li1) value);
        }
        return q(key, value);
    }

    public Object x(T t, int i) {
        if (t.g3()) {
            Object u = u(t);
            if (u != null) {
                return ((List) u).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int y(T t) {
        if (t.g3()) {
            Object u = u(t);
            if (u == null) {
                return 0;
            }
            return ((List) u).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int z() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.l(); i2++) {
            Map.Entry<T, Object> k = this.a.k(i2);
            i += q(k.getKey(), k.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.n()) {
            i += q(entry.getKey(), entry.getValue());
        }
        return i;
    }

    public C11040yo0() {
        this.a = C9909u92.v(16);
    }

    public C11040yo0(boolean z) {
        this(C9909u92.v(0));
        I();
    }

    public C11040yo0(C9909u92<T, Object> c9909u92) {
        this.a = c9909u92;
        I();
    }
}
