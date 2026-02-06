package o;

import java.lang.Comparable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import o.AbstractC5470c2;
import o.VH;

/* renamed from: o.c2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5470c2<I, K extends Comparable<K>, C extends VH<I, K, T>, T> implements InterfaceC7449k81<T> {
    public static final Set<Class> g = new HashSet(Arrays.asList(Byte.TYPE, Short.TYPE, Integer.TYPE, Float.TYPE, Double.TYPE, Boolean.TYPE, Long.TYPE, Character.TYPE));
    public Class<? extends T> a;
    public a c;
    public final WG0 b = new WG0();
    public InterfaceC7846lm1<Class<?>, Field> d = new C11242ze();
    public Locale e = Locale.getDefault();
    public String f = "";

    /* renamed from: o.c2$a */
    /* loaded from: classes3.dex */
    public static class a {
        public final Class<?> a;
        public final Map<C4631Wn0<Object>, a> b = new HashMap();

        public a(Class<?> cls) {
            this.a = cls;
        }

        public void b(C4631Wn0<Object> c4631Wn0, a aVar) {
            this.b.put(c4631Wn0, aVar);
        }

        public Map<C4631Wn0<Object>, a> c() {
            return this.b;
        }

        public Class<?> d() {
            return this.a;
        }
    }

    public static void B(a aVar, Map<Class<?>, Object> map, Object obj) throws IllegalAccessException, InvocationTargetException {
        Object i;
        for (Map.Entry<C4631Wn0<Object>, a> entry : aVar.c().entrySet()) {
            if (obj == null) {
                i = null;
            } else {
                i = entry.getKey().i(obj);
            }
            map.put(entry.getValue().d(), i);
            B(entry.getValue(), map, i);
        }
    }

    public static /* synthetic */ void i(Set set, Map map, final Map.Entry entry) {
        if (set.stream().anyMatch(new Predicate() { // from class: o.U1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean isAnnotationPresent;
                isAnnotationPresent = ((Field) entry.getValue()).isAnnotationPresent((Class) obj);
                return isAnnotationPresent;
            }
        })) {
            ((InterfaceC7664l11) map.get(Boolean.TRUE)).put(entry.getKey(), entry.getValue());
        } else {
            ((InterfaceC7664l11) map.get(Boolean.FALSE)).put(entry.getKey(), entry.getValue());
        }
    }

    public static /* synthetic */ boolean l(Map.Entry entry) {
        return !((Field) entry.getValue()).isSynthetic();
    }

    public static /* synthetic */ void n(AbstractC5470c2 abstractC5470c2, U71 u71, Class cls) {
        abstractC5470c2.getClass();
        Field field = (Field) u71.getValue();
        if (cls != null && field != null && field.getDeclaringClass().isAssignableFrom(cls)) {
            return;
        }
        throw new IllegalArgumentException(ResourceBundle.getBundle(UI0.k, abstractC5470c2.e).getString("ignore.field.inconsistent"));
    }

    public static void r(a aVar, Map<Class<?>, Object> map, Object obj) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        for (Map.Entry<C4631Wn0<Object>, a> entry : aVar.c().entrySet()) {
            Object i = entry.getKey().i(obj);
            if (i == null) {
                i = entry.getValue().a.newInstance();
                entry.getKey().j(obj, i);
            }
            map.put(entry.getValue().d(), i);
            r(entry.getValue(), map, i);
        }
    }

    public Map<Class<?>, Object> A(T t) throws IllegalAccessException, InvocationTargetException {
        HashMap hashMap = new HashMap();
        hashMap.put(this.a, t);
        B(this.c, hashMap, t);
        return hashMap;
    }

    public abstract void C();

    public InterfaceC8348nm<T, K> D(Class<? extends V<T, K>> cls) throws C8027mR {
        try {
            V<T, K> newInstance = cls.newInstance();
            newInstance.d(this.e);
            return newInstance;
        } catch (IllegalAccessException | InstantiationException e) {
            C8027mR c8027mR = new C8027mR(cls, String.format(ResourceBundle.getBundle(UI0.k, this.e).getString("custom.converter.invalid"), cls.getCanonicalName()));
            c8027mR.initCause(e);
            throw c8027mR;
        }
    }

    public boolean E(Class<?> cls) {
        return g.contains(cls);
    }

    public void G() throws C8027mR {
        C();
        this.c = H(this.a, new HashSet());
        Map<Boolean, InterfaceC7664l11<Class<?>, Field>> J = J();
        Boolean bool = Boolean.TRUE;
        if (!J.get(bool).isEmpty()) {
            F(J.get(bool));
        } else {
            I(J.get(Boolean.FALSE));
        }
    }

    public a H(Class<?> cls, Set<Class<?>> set) {
        if (!E(cls)) {
            if (!set.contains(cls)) {
                set.add(cls);
                a aVar = new a(cls);
                for (final Field field : t(cls, C2474Ao0.h(cls, VR.class))) {
                    Stream<Class<? extends Annotation>> stream = w().stream();
                    field.getClass();
                    if (!stream.anyMatch(new Predicate() { // from class: o.T1
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return field.isAnnotationPresent((Class) obj);
                        }
                    })) {
                        aVar.b(new C4631Wn0<>(field), H(field.getType(), set));
                    } else {
                        throw new WR(ResourceBundle.getBundle(UI0.k, this.e).getString("recursion.binding.mutually.exclusive"), field.getType());
                    }
                }
                return aVar;
            }
            throw new WR(String.format(ResourceBundle.getBundle(UI0.k, this.e).getString("recursive.type.encountered.twice"), cls.toString()), cls);
        }
        throw new WR(ResourceBundle.getBundle(UI0.k, this.e).getString("recursion.on.primitive"), cls);
    }

    public abstract void I(InterfaceC7664l11<Class<?>, Field> interfaceC7664l11);

    public Map<Boolean, InterfaceC7664l11<Class<?>, Field>> J() {
        C11242ze c11242ze = new C11242ze();
        o(this.c, c11242ze);
        final Set<Class<? extends Annotation>> w = w();
        final TreeMap treeMap = new TreeMap();
        treeMap.put(Boolean.TRUE, new C11242ze());
        treeMap.put(Boolean.FALSE, new C11242ze());
        c11242ze.r().stream().filter(new Predicate() { // from class: o.Z1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC5470c2.l((Map.Entry) obj);
            }
        }).forEach(new Consumer() { // from class: o.a2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AbstractC5470c2.i(w, treeMap, (Map.Entry) obj);
            }
        });
        return treeMap;
    }

    public <A extends Annotation> A K(A[] aArr, Function<A, String[]> function) {
        String[] apply;
        A a2 = null;
        for (A a3 : aArr) {
            for (String str : function.apply(a3)) {
                if (this.f.equals(str)) {
                    return a3;
                }
                if ("".equals(str)) {
                    a2 = a3;
                }
            }
        }
        return a2;
    }

    public void L(Map<Class<?>, Object> map, String str, int i) throws JR, XR, DR, C5817dS {
        InterfaceC8348nm<T, K> u = u(i);
        if (u != null) {
            u.g(map.get(u.getType()), str, v(i));
        }
    }

    public abstract void M(int i) throws XR;

    @Override // o.InterfaceC7449k81
    public void a(InterfaceC7846lm1<Class<?>, Field> interfaceC7846lm1) throws IllegalArgumentException {
        if (interfaceC7846lm1 == null) {
            this.d = new C11242ze();
        } else {
            this.d = interfaceC7846lm1;
            final U71<Class<?>, Field> p = interfaceC7846lm1.p();
            p.forEachRemaining(new Consumer() { // from class: o.V1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    AbstractC5470c2.n(AbstractC5470c2.this, p, (Class) obj);
                }
            });
        }
        if (this.a != null) {
            G();
        }
    }

    @Override // o.InterfaceC7449k81
    public void d(Locale locale) {
        this.e = (Locale) C11304zt1.t(locale, Locale.getDefault());
        if (y() != null) {
            y().d(this.e);
            y().values().forEach(new Consumer() { // from class: o.b2
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((InterfaceC8348nm) obj).d(AbstractC5470c2.this.e);
                }
            });
        }
    }

    @Override // o.InterfaceC7449k81
    public void e(Class<? extends T> cls) throws C8027mR {
        this.a = cls;
        G();
    }

    @Override // o.InterfaceC7449k81
    public String[] f(T t) throws XR {
        if (this.a != null) {
            if (this.b.h()) {
                String[] f = y().f(t);
                this.b.g(f);
                return f;
            }
            return this.b.e();
        }
        throw new IllegalStateException(ResourceBundle.getBundle(UI0.k, this.e).getString("type.before.header"));
    }

    @Override // o.InterfaceC7449k81
    public T g(String[] strArr) throws C8270nR, PR, CR {
        M(strArr.length);
        Map<Class<?>, Object> q = q();
        CR cr = null;
        for (int i = 0; i < strArr.length; i++) {
            try {
                L(q, strArr[i], i);
            } catch (PR e) {
                if (cr != null) {
                    cr.g(e);
                } else {
                    cr = new CR(e);
                }
            }
        }
        if (cr != null) {
            if (cr.j()) {
                throw cr.i();
            }
            throw cr;
        }
        return (T) q.get(this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
        r2 = u(r0);
        r8 = p(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (java.util.Objects.equals(r9, r2) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (java.util.Objects.equals(r10, r8) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
        if (r0 >= r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
        r4.add("");
        r0 = r0 + 1;
        r2 = u(r0);
        r8 = p(r0);
     */
    @Override // o.InterfaceC7449k81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] h(T t) throws PR, CR {
        int i = 1;
        int b = this.b.b() + 1;
        ArrayList arrayList = new ArrayList(Math.max(b, 0));
        try {
            Map<Class<?>, Object> A = A(t);
            CR cr = null;
            int i2 = 0;
            while (i2 < b) {
                InterfaceC8348nm<T, K> u = u(i2);
                K p = p(i2);
                String[] strArr = C4206Se.u;
                if (u != null) {
                    try {
                        strArr = u.h(A.get(u.getType()), p);
                    } catch (JR | XR e) {
                        if (cr != null) {
                            cr.g(e);
                        } else {
                            cr = new CR(e);
                        }
                    }
                }
                if (strArr.length == 0) {
                    arrayList.add("");
                    i2++;
                } else {
                    arrayList.add(C4500Ve2.L(strArr[0]));
                    int i3 = i2 + 1;
                    InterfaceC8348nm<T, K> u2 = u(i3);
                    K p2 = p(i3);
                    int i4 = i;
                    while (i4 < strArr.length && i3 < b && Objects.equals(u, u2) && Objects.equals(p, p2)) {
                        arrayList.add(C4500Ve2.L(strArr[i4]));
                        i4++;
                        i3 = i2 + i4;
                        u2 = u(i3);
                        p2 = p(i3);
                    }
                    i2 = i3;
                }
                i = 1;
            }
            if (cr != null) {
                if (cr.j()) {
                    throw cr.i();
                }
                throw cr;
            }
            return (String[]) arrayList.toArray(C4206Se.u);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            C8270nR c8270nR = new C8270nR(ResourceBundle.getBundle(UI0.k, this.e).getString("error.introspecting.beans"));
            c8270nR.initCause(e2);
            throw c8270nR;
        }
    }

    public final void o(a aVar, final InterfaceC7664l11<Class<?>, Field> interfaceC7664l11) {
        interfaceC7664l11.e0(aVar.a, t(aVar.a, C2474Ao0.a(aVar.a)));
        aVar.c().values().forEach(new Consumer() { // from class: o.Y1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AbstractC5470c2.this.o((AbstractC5470c2.a) obj, interfaceC7664l11);
            }
        });
    }

    public abstract K p(int i);

    public Map<Class<?>, Object> q() throws C8270nR, IllegalStateException {
        if (this.a != null) {
            HashMap hashMap = new HashMap();
            try {
                T newInstance = this.a.newInstance();
                hashMap.put(this.a, newInstance);
                r(this.c, hashMap, newInstance);
                return hashMap;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                C8270nR c8270nR = new C8270nR(ResourceBundle.getBundle(UI0.k, this.e).getString("bean.instantiation.impossible"));
                c8270nR.initCause(e);
                throw c8270nR;
            }
        }
        throw new IllegalStateException(ResourceBundle.getBundle(UI0.k, this.e).getString("type.unset"));
    }

    public ER s(Field field, Class<?> cls, String str, String str2, Class<? extends AbstractC10113v0> cls2) throws C8027mR {
        String writeFormat;
        String writeChronology;
        String writeFormat2;
        if (cls2 != null && !cls2.equals(AbstractC10113v0.class)) {
            try {
                AbstractC10113v0 newInstance = cls2.newInstance();
                newInstance.e(cls);
                newInstance.f(str);
                newInstance.c(str2);
                newInstance.d(this.e);
                return newInstance;
            } catch (IllegalAccessException | InstantiationException e) {
                C8027mR c8027mR = new C8027mR(cls2, String.format(ResourceBundle.getBundle(UI0.k, this.e).getString("custom.converter.invalid"), cls2.getCanonicalName()));
                c8027mR.initCause(e);
                throw c8027mR;
            }
        } else if (!field.isAnnotationPresent(KR.class) && !field.isAnnotationPresent(MR.class)) {
            if (!field.isAnnotationPresent(TR.class) && !field.isAnnotationPresent(UR.class)) {
                if (cls.equals(Currency.class)) {
                    return new C8011mN(this.e);
                }
                if (cls.isEnum()) {
                    return new C9241rP(cls, str, str2, this.e);
                }
                if (cls.equals(UUID.class)) {
                    return new EP(this.e);
                }
                return new DP(cls, str, str2, this.e);
            }
            TR tr = (TR) K(field.getAnnotationsByType(TR.class), new Function() { // from class: o.X1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((TR) obj).profiles();
                }
            });
            if (tr != null) {
                String value = tr.value();
                if (tr.writeFormatEqualsReadFormat()) {
                    writeFormat2 = value;
                } else {
                    writeFormat2 = tr.writeFormat();
                }
                return new CP(cls, str, str2, this.e, value, writeFormat2);
            }
            throw new C8027mR(TR.class, String.format(ResourceBundle.getBundle(UI0.k).getString("profile.not.found.number"), this.f));
        } else {
            KR kr = (KR) K(field.getAnnotationsByType(KR.class), new Function() { // from class: o.W1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((KR) obj).profiles();
                }
            });
            if (kr != null) {
                String value2 = kr.value();
                if (kr.writeFormatEqualsReadFormat()) {
                    writeFormat = value2;
                } else {
                    writeFormat = kr.writeFormat();
                }
                String chronology = kr.chronology();
                if (kr.writeChronologyEqualsReadChronology()) {
                    writeChronology = chronology;
                } else {
                    writeChronology = kr.writeChronology();
                }
                return new C8992qP(cls, str, str2, this.e, value2, writeFormat, chronology, writeChronology);
            }
            throw new C8027mR(KR.class, String.format(ResourceBundle.getBundle(UI0.k).getString("profile.not.found.date"), this.f));
        }
    }

    @Override // o.InterfaceC7449k81
    public void setProfile(String str) {
        this.f = C4500Ve2.L(str);
    }

    public List<Field> t(Class<?> cls, Field[] fieldArr) {
        Set hashSet;
        LinkedList linkedList = new LinkedList();
        for (Field field : fieldArr) {
            QR qr = (QR) field.getAnnotation(QR.class);
            if (qr == null) {
                hashSet = C10124v22.d();
            } else {
                hashSet = new HashSet(Arrays.asList(qr.profiles()));
            }
            if (!this.d.g0(cls, field) && !hashSet.contains(this.f) && !hashSet.contains("")) {
                linkedList.add(field);
            }
        }
        return linkedList;
    }

    public abstract InterfaceC8348nm<T, K> u(int i);

    public abstract String v(int i);

    public Set<Class<? extends Annotation>> w() {
        return Collections.EMPTY_SET;
    }

    public String x(int i) {
        return this.b.d(i);
    }

    public abstract InterfaceC6142eo0<I, K, ? extends C, T> y();

    public Class<? extends T> z() {
        return this.a;
    }

    public void F(InterfaceC7664l11<Class<?>, Field> interfaceC7664l11) {
    }
}
