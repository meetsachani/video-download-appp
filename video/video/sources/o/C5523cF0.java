package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: o.cF0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5523cF0 {
    public static final EnumC7572ke2 A = null;
    public static final boolean C = true;
    public static final boolean D = false;
    public static final boolean E = false;
    public static final boolean F = false;
    public static final boolean G = true;
    public static final String L = ")]}'\n";
    public static final boolean z = false;
    public final ThreadLocal<Map<Rv2<?>, AbstractC8387nv2<?>>> a;
    public final ConcurrentMap<Rv2<?>, AbstractC8387nv2<?>> b;
    public final C9954uL c;
    public final C9994uV0 d;
    public final List<InterfaceC8631ov2> e;
    public final C4308Tf0 f;
    public final InterfaceC10308vo0 g;
    public final Map<Type, InterfaceC10218vQ0<?>> h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final C3693Mx0 m;
    public final EnumC7572ke2 n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f704o;
    public final boolean p;
    public final String q;
    public final int r;
    public final int s;
    public final Z41 t;
    public final List<InterfaceC8631ov2> u;
    public final List<InterfaceC8631ov2> v;
    public final InterfaceC3959Pp2 w;
    public final InterfaceC3959Pp2 x;
    public final List<InterfaceC7278jQ1> y;
    public static final C3693Mx0 B = C3693Mx0.d;
    public static final String H = null;
    public static final InterfaceC10308vo0 I = EnumC10065uo0.X;
    public static final InterfaceC3959Pp2 J = EnumC3862Op2.X;
    public static final InterfaceC3959Pp2 K = EnumC3862Op2.Y;

    /* renamed from: o.cF0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC8387nv2<Number> {
        public a() {
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Double e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            return Double.valueOf(ov0.x());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Number number) throws IOException {
            if (number == null) {
                c5589cW0.u();
                return;
            }
            double doubleValue = number.doubleValue();
            C5523cF0.d(doubleValue);
            c5589cW0.M(doubleValue);
        }
    }

    /* renamed from: o.cF0$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC8387nv2<Number> {
        public b() {
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Float e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            return Float.valueOf((float) ov0.x());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Number number) throws IOException {
            if (number == null) {
                c5589cW0.u();
                return;
            }
            float floatValue = number.floatValue();
            C5523cF0.d(floatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(floatValue);
            }
            c5589cW0.Q(number);
        }
    }

    /* renamed from: o.cF0$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC8387nv2<Number> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Number e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            return Long.valueOf(ov0.z());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Number number) throws IOException {
            if (number == null) {
                c5589cW0.u();
            } else {
                c5589cW0.R(number.toString());
            }
        }
    }

    /* renamed from: o.cF0$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractC8387nv2<AtomicLong> {
        public final /* synthetic */ AbstractC8387nv2 a;

        public d(AbstractC8387nv2 abstractC8387nv2) {
            this.a = abstractC8387nv2;
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public AtomicLong e(OV0 ov0) throws IOException {
            return new AtomicLong(((Number) this.a.e(ov0)).longValue());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, AtomicLong atomicLong) throws IOException {
            this.a.i(c5589cW0, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: o.cF0$e */
    /* loaded from: classes3.dex */
    public class e extends AbstractC8387nv2<AtomicLongArray> {
        public final /* synthetic */ AbstractC8387nv2 a;

        public e(AbstractC8387nv2 abstractC8387nv2) {
            this.a = abstractC8387nv2;
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public AtomicLongArray e(OV0 ov0) throws IOException {
            ArrayList arrayList = new ArrayList();
            ov0.d();
            while (ov0.r()) {
                arrayList.add(Long.valueOf(((Number) this.a.e(ov0)).longValue()));
            }
            ov0.k();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, AtomicLongArray atomicLongArray) throws IOException {
            c5589cW0.h();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.a.i(c5589cW0, Long.valueOf(atomicLongArray.get(i)));
            }
            c5589cW0.k();
        }
    }

    /* renamed from: o.cF0$f */
    /* loaded from: classes3.dex */
    public static class f<T> extends AbstractC9877u12<T> {
        public AbstractC8387nv2<T> a = null;

        private AbstractC8387nv2<T> k() {
            AbstractC8387nv2<T> abstractC8387nv2 = this.a;
            if (abstractC8387nv2 != null) {
                return abstractC8387nv2;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // o.AbstractC8387nv2
        public T e(OV0 ov0) throws IOException {
            return k().e(ov0);
        }

        @Override // o.AbstractC8387nv2
        public void i(C5589cW0 c5589cW0, T t) throws IOException {
            k().i(c5589cW0, t);
        }

        @Override // o.AbstractC9877u12
        public AbstractC8387nv2<T> j() {
            return k();
        }

        public void l(AbstractC8387nv2<T> abstractC8387nv2) {
            if (this.a == null) {
                this.a = abstractC8387nv2;
                return;
            }
            throw new AssertionError("Delegate is already set");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5523cF0() {
        this(r1, r2, r3, false, false, false, true, r8, r9, false, true, r12, r13, 2, 2, r16, r16, r16, J, K, r16);
        C4308Tf0 c4308Tf0 = C4308Tf0.c1;
        InterfaceC10308vo0 interfaceC10308vo0 = I;
        Map map = Collections.EMPTY_MAP;
        C3693Mx0 c3693Mx0 = B;
        EnumC7572ke2 enumC7572ke2 = A;
        Z41 z41 = Z41.X;
        String str = H;
        List list = Collections.EMPTY_LIST;
    }

    public static void a(Object obj, OV0 ov0) {
        if (obj != null) {
            try {
                if (ov0.I() != XV0.END_DOCUMENT) {
                    throw new WV0("JSON document was not fully consumed.");
                }
            } catch (A71 e2) {
                throw new WV0(e2);
            } catch (IOException e3) {
                throw new GV0(e3);
            }
        }
    }

    public static AbstractC8387nv2<AtomicLong> b(AbstractC8387nv2<Number> abstractC8387nv2) {
        return new d(abstractC8387nv2).d();
    }

    public static AbstractC8387nv2<AtomicLongArray> c(AbstractC8387nv2<Number> abstractC8387nv2) {
        return new e(abstractC8387nv2).d();
    }

    public static void d(double d2) {
        if (!Double.isNaN(d2) && !Double.isInfinite(d2)) {
            return;
        }
        throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public static AbstractC8387nv2<Number> x(Z41 z41) {
        if (z41 == Z41.X) {
            return C9117qv2.t;
        }
        return new c();
    }

    public C5589cW0 A(Writer writer) throws IOException {
        if (this.k) {
            writer.write(L);
        }
        C5589cW0 c5589cW0 = new C5589cW0(writer);
        c5589cW0.A(this.m);
        c5589cW0.C(this.l);
        EnumC7572ke2 enumC7572ke2 = this.n;
        if (enumC7572ke2 == null) {
            enumC7572ke2 = EnumC7572ke2.LEGACY_STRICT;
        }
        c5589cW0.H(enumC7572ke2);
        c5589cW0.G(this.i);
        return c5589cW0;
    }

    public boolean B() {
        return this.i;
    }

    public String C(Object obj) {
        if (obj == null) {
            return E(HV0.X);
        }
        return D(obj, obj.getClass());
    }

    public String D(Object obj, Type type) {
        StringBuilder sb = new StringBuilder();
        G(obj, type, sb);
        return sb.toString();
    }

    public String E(DV0 dv0) {
        StringBuilder sb = new StringBuilder();
        I(dv0, sb);
        return sb.toString();
    }

    public void F(Object obj, Appendable appendable) throws GV0 {
        if (obj != null) {
            G(obj, obj.getClass(), appendable);
        } else {
            I(HV0.X, appendable);
        }
    }

    public void G(Object obj, Type type, Appendable appendable) throws GV0 {
        try {
            H(obj, type, A(C4690Xd2.c(appendable)));
        } catch (IOException e2) {
            throw new GV0(e2);
        }
    }

    public void H(Object obj, Type type, C5589cW0 c5589cW0) throws GV0 {
        AbstractC8387nv2 u = u(Rv2.c(type));
        EnumC7572ke2 o2 = c5589cW0.o();
        EnumC7572ke2 enumC7572ke2 = this.n;
        if (enumC7572ke2 != null) {
            c5589cW0.H(enumC7572ke2);
        } else if (c5589cW0.o() == EnumC7572ke2.LEGACY_STRICT) {
            c5589cW0.H(EnumC7572ke2.LENIENT);
        }
        boolean p = c5589cW0.p();
        boolean n = c5589cW0.n();
        c5589cW0.C(this.l);
        c5589cW0.G(this.i);
        try {
            try {
                try {
                    u.i(c5589cW0, obj);
                } catch (IOException e2) {
                    throw new GV0(e2);
                }
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e3.getMessage(), e3);
            }
        } finally {
            c5589cW0.H(o2);
            c5589cW0.C(p);
            c5589cW0.G(n);
        }
    }

    public void I(DV0 dv0, Appendable appendable) throws GV0 {
        try {
            J(dv0, A(C4690Xd2.c(appendable)));
        } catch (IOException e2) {
            throw new GV0(e2);
        }
    }

    public void J(DV0 dv0, C5589cW0 c5589cW0) throws GV0 {
        EnumC7572ke2 o2 = c5589cW0.o();
        boolean p = c5589cW0.p();
        boolean n = c5589cW0.n();
        c5589cW0.C(this.l);
        c5589cW0.G(this.i);
        EnumC7572ke2 enumC7572ke2 = this.n;
        if (enumC7572ke2 != null) {
            c5589cW0.H(enumC7572ke2);
        } else if (c5589cW0.o() == EnumC7572ke2.LEGACY_STRICT) {
            c5589cW0.H(EnumC7572ke2.LENIENT);
        }
        try {
            try {
                C4690Xd2.b(dv0, c5589cW0);
            } catch (IOException e2) {
                throw new GV0(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e3.getMessage(), e3);
            }
        } finally {
            c5589cW0.H(o2);
            c5589cW0.C(p);
            c5589cW0.G(n);
        }
    }

    public DV0 K(Object obj) {
        if (obj == null) {
            return HV0.X;
        }
        return L(obj, obj.getClass());
    }

    public DV0 L(Object obj, Type type) {
        ZV0 zv0 = new ZV0();
        H(obj, type, zv0);
        return zv0.U();
    }

    public final AbstractC8387nv2<Number> e(boolean z2) {
        if (z2) {
            return C9117qv2.v;
        }
        return new a();
    }

    @Deprecated
    public C4308Tf0 f() {
        return this.f;
    }

    public InterfaceC10308vo0 g() {
        return this.g;
    }

    public final AbstractC8387nv2<Number> h(boolean z2) {
        if (z2) {
            return C9117qv2.u;
        }
        return new b();
    }

    public <T> T i(Reader reader, Class<T> cls) throws WV0, GV0 {
        return (T) k(reader, Rv2.b(cls));
    }

    public <T> T j(Reader reader, Type type) throws GV0, WV0 {
        return (T) k(reader, Rv2.c(type));
    }

    public <T> T k(Reader reader, Rv2<T> rv2) throws GV0, WV0 {
        OV0 z2 = z(reader);
        T t = (T) s(z2, rv2);
        a(t, z2);
        return t;
    }

    public <T> T l(String str, Class<T> cls) throws WV0 {
        return (T) n(str, Rv2.b(cls));
    }

    public <T> T m(String str, Type type) throws WV0 {
        return (T) n(str, Rv2.c(type));
    }

    public <T> T n(String str, Rv2<T> rv2) throws WV0 {
        if (str == null) {
            return null;
        }
        return (T) k(new StringReader(str), rv2);
    }

    public <T> T o(DV0 dv0, Class<T> cls) throws WV0 {
        return (T) q(dv0, Rv2.b(cls));
    }

    public <T> T p(DV0 dv0, Type type) throws WV0 {
        return (T) q(dv0, Rv2.c(type));
    }

    public <T> T q(DV0 dv0, Rv2<T> rv2) throws WV0 {
        if (dv0 == null) {
            return null;
        }
        return (T) s(new YV0(dv0), rv2);
    }

    public <T> T r(OV0 ov0, Type type) throws GV0, WV0 {
        return (T) s(ov0, Rv2.c(type));
    }

    public <T> T s(OV0 ov0, Rv2<T> rv2) throws GV0, WV0 {
        boolean z2;
        EnumC7572ke2 q = ov0.q();
        EnumC7572ke2 enumC7572ke2 = this.n;
        if (enumC7572ke2 != null) {
            ov0.S(enumC7572ke2);
        } else if (ov0.q() == EnumC7572ke2.LEGACY_STRICT) {
            ov0.S(EnumC7572ke2.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        ov0.I();
                        z2 = false;
                    } catch (AssertionError e2) {
                        throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
                    } catch (IllegalStateException e3) {
                        throw new WV0(e3);
                    }
                } catch (IOException e4) {
                    throw new WV0(e4);
                }
            } finally {
                ov0.S(q);
            }
        } catch (EOFException e5) {
            e = e5;
            z2 = true;
        }
        try {
            AbstractC8387nv2<T> u = u(rv2);
            T e6 = u.e(ov0);
            Class d2 = C8962qH1.d(rv2.f());
            if (e6 != null && !d2.isInstance(e6)) {
                throw new ClassCastException("Type adapter '" + u + "' returned wrong type; requested " + rv2.f() + " but got instance of " + e6.getClass() + "\nVerify that the adapter was registered for the correct type.");
            }
            return e6;
        } catch (EOFException e7) {
            e = e7;
            if (z2) {
                ov0.S(q);
                return null;
            }
            throw new WV0(e);
        }
    }

    public <T> AbstractC8387nv2<T> t(Class<T> cls) {
        return u(Rv2.b(cls));
    }

    public String toString() {
        return "{serializeNulls:" + this.i + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        r2.l(r4);
        r0.put(r7, r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> AbstractC8387nv2<T> u(Rv2<T> rv2) {
        boolean z2;
        Objects.requireNonNull(rv2, "type must not be null");
        AbstractC8387nv2<T> abstractC8387nv2 = (AbstractC8387nv2<T>) this.b.get(rv2);
        if (abstractC8387nv2 != null) {
            return abstractC8387nv2;
        }
        Map<Rv2<?>, AbstractC8387nv2<?>> map = this.a.get();
        if (map == null) {
            map = new HashMap<>();
            this.a.set(map);
            z2 = true;
        } else {
            AbstractC8387nv2<T> abstractC8387nv22 = (AbstractC8387nv2<T>) map.get(rv2);
            if (abstractC8387nv22 != null) {
                return abstractC8387nv22;
            }
            z2 = false;
        }
        try {
            f fVar = new f();
            map.put(rv2, fVar);
            Iterator<InterfaceC8631ov2> it = this.e.iterator();
            AbstractC8387nv2<T> abstractC8387nv23 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC8387nv23 = it.next().b(this, rv2);
                if (abstractC8387nv23 != null) {
                    break;
                }
            }
            if (abstractC8387nv23 != null) {
                if (z2) {
                    this.b.putAll(map);
                }
                return abstractC8387nv23;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + rv2);
        } finally {
            if (z2) {
                this.a.remove();
            }
        }
    }

    public <T> AbstractC8387nv2<T> v(InterfaceC8631ov2 interfaceC8631ov2, Rv2<T> rv2) {
        Objects.requireNonNull(interfaceC8631ov2, "skipPast must not be null");
        Objects.requireNonNull(rv2, "type must not be null");
        if (this.d.e(rv2, interfaceC8631ov2)) {
            interfaceC8631ov2 = this.d;
        }
        boolean z2 = false;
        for (InterfaceC8631ov2 interfaceC8631ov22 : this.e) {
            if (!z2) {
                if (interfaceC8631ov22 == interfaceC8631ov2) {
                    z2 = true;
                }
            } else {
                AbstractC8387nv2<T> b2 = interfaceC8631ov22.b(this, rv2);
                if (b2 != null) {
                    return b2;
                }
            }
        }
        if (!z2) {
            return u(rv2);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + rv2);
    }

    public boolean w() {
        return this.l;
    }

    public C6008eF0 y() {
        return new C6008eF0(this);
    }

    public OV0 z(Reader reader) {
        OV0 ov0 = new OV0(reader);
        EnumC7572ke2 enumC7572ke2 = this.n;
        if (enumC7572ke2 == null) {
            enumC7572ke2 = EnumC7572ke2.LEGACY_STRICT;
        }
        ov0.S(enumC7572ke2);
        return ov0;
    }

    public C5523cF0(C4308Tf0 c4308Tf0, InterfaceC10308vo0 interfaceC10308vo0, Map<Type, InterfaceC10218vQ0<?>> map, boolean z2, boolean z3, boolean z4, boolean z5, C3693Mx0 c3693Mx0, EnumC7572ke2 enumC7572ke2, boolean z6, boolean z7, Z41 z41, String str, int i, int i2, List<InterfaceC8631ov2> list, List<InterfaceC8631ov2> list2, List<InterfaceC8631ov2> list3, InterfaceC3959Pp2 interfaceC3959Pp2, InterfaceC3959Pp2 interfaceC3959Pp22, List<InterfaceC7278jQ1> list4) {
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        this.f = c4308Tf0;
        this.g = interfaceC10308vo0;
        this.h = map;
        C9954uL c9954uL = new C9954uL(map, z7, list4);
        this.c = c9954uL;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = c3693Mx0;
        this.n = enumC7572ke2;
        this.f704o = z6;
        this.p = z7;
        this.t = z41;
        this.q = str;
        this.r = i;
        this.s = i2;
        this.u = list;
        this.v = list2;
        this.w = interfaceC3959Pp2;
        this.x = interfaceC3959Pp22;
        this.y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C9117qv2.W);
        arrayList.add(C10818xt1.j(interfaceC3959Pp2));
        arrayList.add(c4308Tf0);
        arrayList.addAll(list3);
        arrayList.add(C9117qv2.C);
        arrayList.add(C9117qv2.m);
        arrayList.add(C9117qv2.g);
        arrayList.add(C9117qv2.i);
        arrayList.add(C9117qv2.k);
        AbstractC8387nv2<Number> x = x(z41);
        arrayList.add(C9117qv2.a(Long.TYPE, Long.class, x));
        arrayList.add(C9117qv2.a(Double.TYPE, Double.class, e(z6)));
        arrayList.add(C9117qv2.a(Float.TYPE, Float.class, h(z6)));
        arrayList.add(C3384Js1.j(interfaceC3959Pp22));
        arrayList.add(C9117qv2.f844o);
        arrayList.add(C9117qv2.q);
        arrayList.add(C9117qv2.b(AtomicLong.class, b(x)));
        arrayList.add(C9117qv2.b(AtomicLongArray.class, c(x)));
        arrayList.add(C9117qv2.s);
        arrayList.add(C9117qv2.x);
        arrayList.add(C9117qv2.E);
        arrayList.add(C9117qv2.G);
        arrayList.add(C9117qv2.b(BigDecimal.class, C9117qv2.z));
        arrayList.add(C9117qv2.b(BigInteger.class, C9117qv2.A));
        arrayList.add(C9117qv2.b(DY0.class, C9117qv2.B));
        arrayList.add(C9117qv2.I);
        arrayList.add(C9117qv2.K);
        arrayList.add(C9117qv2.O);
        arrayList.add(C9117qv2.Q);
        arrayList.add(C9117qv2.U);
        arrayList.add(C9117qv2.M);
        arrayList.add(C9117qv2.d);
        arrayList.add(BY.d);
        arrayList.add(C9117qv2.S);
        if (C8794pb2.a) {
            arrayList.add(C8794pb2.e);
            arrayList.add(C8794pb2.d);
            arrayList.add(C8794pb2.f);
        }
        arrayList.add(C4009Qe.c);
        arrayList.add(C9117qv2.b);
        arrayList.add(new C6505gF(c9954uL));
        arrayList.add(new C5981e81(c9954uL, z3));
        C9994uV0 c9994uV0 = new C9994uV0(c9954uL);
        this.d = c9994uV0;
        arrayList.add(c9994uV0);
        arrayList.add(C9117qv2.X);
        arrayList.add(new C8998qQ1(c9954uL, interfaceC10308vo0, c4308Tf0, c9994uV0, list4));
        this.e = Collections.unmodifiableList(arrayList);
    }
}
