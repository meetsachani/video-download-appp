package o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import o.TD0;

/* renamed from: o.Sp2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4253Sp2 implements Serializable {
    private static final long serialVersionUID = -2587890625525655916L;
    public boolean Z;
    public boolean c1;
    public boolean d1;
    public static final AbstractC4253Sp2 p1 = new a();
    public static final AbstractC4253Sp2 q1 = new c();
    public static final AbstractC4253Sp2 r1 = new e();
    public static final AbstractC4253Sp2 s1 = new f();
    public static final AbstractC4253Sp2 t1 = new g();
    public static final AbstractC4253Sp2 u1 = new d();
    public static final AbstractC4253Sp2 v1 = new b();
    public static final ThreadLocal<WeakHashMap<Object, Object>> w1 = new ThreadLocal<>();
    public boolean X = true;
    public boolean Y = true;
    public boolean Y0 = true;
    public String Z0 = C6566gU0.f;
    public String a1 = C6566gU0.g;
    public String b1 = "=";
    public String e1 = ",";
    public String f1 = "{";
    public String g1 = ",";
    public boolean h1 = true;
    public String i1 = "}";
    public boolean j1 = true;
    public String k1 = "<null>";
    public String l1 = "<size=";
    public String m1 = ">";
    public String n1 = "<";
    public String o1 = ">";

    /* renamed from: o.Sp2$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4253Sp2 {
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return AbstractC4253Sp2.p1;
        }
    }

    /* renamed from: o.Sp2$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC4253Sp2 {
        private static final long serialVersionUID = 1;
        public static final String x1 = "\"";

        public b() {
            f1(false);
            h1(false);
            T0("{");
            R0("}");
            Q0(C6566gU0.f);
            O0(C6566gU0.g);
            X0(",");
            W0(":");
            a1("null");
            e1("\"<");
            d1(">\"");
            c1("\"<size=");
            b1(">\"");
        }

        private Object readResolve() {
            return AbstractC4253Sp2.v1;
        }

        @Override // o.AbstractC4253Sp2
        public void D(StringBuffer stringBuffer, String str, Object obj) {
            if (obj == null) {
                X(stringBuffer, str);
            } else if (!(obj instanceof String) && !(obj instanceof Character)) {
                if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                    String obj2 = obj.toString();
                    if (!m1(obj2) && !l1(obj2)) {
                        D(stringBuffer, str, obj2);
                        return;
                    } else {
                        stringBuffer.append(obj);
                        return;
                    }
                }
                stringBuffer.append(obj);
            } else {
                k1(stringBuffer, obj.toString());
            }
        }

        @Override // o.AbstractC4253Sp2
        public void E(StringBuffer stringBuffer, String str, Collection<?> collection) {
            if (collection != null && !collection.isEmpty()) {
                stringBuffer.append(o0());
                Iterator<?> it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    B(stringBuffer, str, i, it.next());
                    i++;
                }
                stringBuffer.append(m0());
                return;
            }
            stringBuffer.append(collection);
        }

        @Override // o.AbstractC4253Sp2
        public void F(StringBuffer stringBuffer, String str, Map<?, ?> map) {
            if (map != null && !map.isEmpty()) {
                stringBuffer.append(q0());
                boolean z = true;
                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    String objects = Objects.toString(entry.getKey(), null);
                    if (objects != null) {
                        if (z) {
                            z = false;
                        } else {
                            S(stringBuffer, objects);
                        }
                        U(stringBuffer, objects);
                        Object value = entry.getValue();
                        if (value == null) {
                            X(stringBuffer, objects);
                        } else {
                            W(stringBuffer, objects, value, true);
                        }
                    }
                }
                stringBuffer.append(p0());
                return;
            }
            stringBuffer.append(map);
        }

        @Override // o.AbstractC4253Sp2
        public void U(StringBuffer stringBuffer, String str) {
            if (str != null) {
                super.U(stringBuffer, x1 + C9049qe2.f(str) + x1);
                return;
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // o.AbstractC4253Sp2
        public void g(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
            if (str != null) {
                if (E0(bool)) {
                    super.g(stringBuffer, str, obj, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // o.AbstractC4253Sp2
        public void j(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
            if (str != null) {
                if (E0(bool)) {
                    super.j(stringBuffer, str, bArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // o.AbstractC4253Sp2
        public void k(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
            if (str != null) {
                if (E0(bool)) {
                    super.k(stringBuffer, str, cArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        public final void k1(StringBuffer stringBuffer, String str) {
            stringBuffer.append('\"');
            stringBuffer.append(C9049qe2.f(str));
            stringBuffer.append('\"');
        }

        @Override // o.AbstractC4253Sp2
        public void l(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
            if (str != null) {
                if (E0(bool)) {
                    super.l(stringBuffer, str, dArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        public final boolean l1(String str) {
            if (str.startsWith(o0()) && str.endsWith(m0())) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC4253Sp2
        public void m(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
            if (str != null) {
                if (E0(bool)) {
                    super.m(stringBuffer, str, fArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        public final boolean m1(String str) {
            if (str.startsWith(q0()) && str.endsWith(p0())) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC4253Sp2
        public void n(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
            if (str != null) {
                if (E0(bool)) {
                    super.n(stringBuffer, str, iArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // o.AbstractC4253Sp2
        public void o(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
            if (str != null) {
                if (E0(bool)) {
                    super.o(stringBuffer, str, jArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // o.AbstractC4253Sp2
        public void p(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
            if (str != null) {
                if (E0(bool)) {
                    super.p(stringBuffer, str, objArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // o.AbstractC4253Sp2
        public void q(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
            if (str != null) {
                if (E0(bool)) {
                    super.q(stringBuffer, str, sArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // o.AbstractC4253Sp2
        public void r(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
            if (str != null) {
                if (E0(bool)) {
                    super.r(stringBuffer, str, zArr, bool);
                    return;
                }
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
        }

        @Override // o.AbstractC4253Sp2
        public void x(StringBuffer stringBuffer, String str, char c) {
            k1(stringBuffer, String.valueOf(c));
        }
    }

    /* renamed from: o.Sp2$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC4253Sp2 {
        private static final long serialVersionUID = 1;

        public c() {
            T0(C6566gU0.f);
            X0(System.lineSeparator() + TD0.a.Y0);
            Z0(true);
            R0(System.lineSeparator() + C6566gU0.g);
        }

        private Object readResolve() {
            return AbstractC4253Sp2.q1;
        }
    }

    /* renamed from: o.Sp2$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC4253Sp2 {
        private static final long serialVersionUID = 1;

        public d() {
            f1(false);
            h1(false);
        }

        private Object readResolve() {
            return AbstractC4253Sp2.u1;
        }
    }

    /* renamed from: o.Sp2$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC4253Sp2 {
        private static final long serialVersionUID = 1;

        public e() {
            g1(false);
        }

        private Object readResolve() {
            return AbstractC4253Sp2.r1;
        }
    }

    /* renamed from: o.Sp2$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC4253Sp2 {
        private static final long serialVersionUID = 1;

        public f() {
            i1(true);
            h1(false);
        }

        private Object readResolve() {
            return AbstractC4253Sp2.s1;
        }
    }

    /* renamed from: o.Sp2$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC4253Sp2 {
        private static final long serialVersionUID = 1;

        public g() {
            f1(false);
            h1(false);
            g1(false);
            T0("");
            R0("");
        }

        private Object readResolve() {
            return AbstractC4253Sp2.t1;
        }
    }

    public static boolean F0(Object obj) {
        Map<Object, Object> u0 = u0();
        if (u0 != null && u0.containsKey(obj)) {
            return true;
        }
        return false;
    }

    public static void L0(Object obj) {
        if (obj != null) {
            if (u0() == null) {
                w1.set(new WeakHashMap<>());
            }
            u0().put(obj, null);
        }
    }

    public static void j1(Object obj) {
        Map<Object, Object> u0;
        if (obj != null && (u0 = u0()) != null) {
            u0.remove(obj);
            if (u0.isEmpty()) {
                w1.remove();
            }
        }
    }

    public static Map<Object, Object> u0() {
        return w1.get();
    }

    public void A(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(i);
    }

    public boolean A0() {
        return this.h1;
    }

    public void B(StringBuffer stringBuffer, String str, int i, Object obj) {
        if (i > 0) {
            stringBuffer.append(this.g1);
        }
        if (obj == null) {
            X(stringBuffer, str);
        } else {
            W(stringBuffer, str, obj, this.h1);
        }
    }

    public boolean B0() {
        return this.j1;
    }

    public void C(StringBuffer stringBuffer, String str, long j) {
        stringBuffer.append(j);
    }

    public boolean C0() {
        return this.d1;
    }

    public void D(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    public boolean D0() {
        return this.c1;
    }

    public void E(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    public boolean E0(Boolean bool) {
        if (bool == null) {
            return this.j1;
        }
        return bool.booleanValue();
    }

    public void F(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    public void G(StringBuffer stringBuffer, String str, short s) {
        stringBuffer.append((int) s);
    }

    public boolean G0() {
        return this.Y;
    }

    public void H(StringBuffer stringBuffer, String str, boolean z) {
        stringBuffer.append(z);
    }

    public boolean H0() {
        return this.X;
    }

    public void I(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.f1);
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.g1);
            }
            w(stringBuffer, str, bArr[i]);
        }
        stringBuffer.append(this.i1);
    }

    public boolean I0() {
        return this.Y0;
    }

    public void J(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.f1);
        for (int i = 0; i < cArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.g1);
            }
            x(stringBuffer, str, cArr[i]);
        }
        stringBuffer.append(this.i1);
    }

    public boolean J0() {
        return this.Z;
    }

    public void K(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.f1);
        for (int i = 0; i < dArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.g1);
            }
            y(stringBuffer, str, dArr[i]);
        }
        stringBuffer.append(this.i1);
    }

    public void K0(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f1);
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            B(stringBuffer, str, i, Array.get(obj, i));
        }
        stringBuffer.append(this.i1);
    }

    public void L(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.f1);
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.g1);
            }
            z(stringBuffer, str, fArr[i]);
        }
        stringBuffer.append(this.i1);
    }

    public void M(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.f1);
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.g1);
            }
            A(stringBuffer, str, iArr[i]);
        }
        stringBuffer.append(this.i1);
    }

    public void M0(StringBuffer stringBuffer) {
        if (C4500Ve2.P(stringBuffer, this.e1)) {
            stringBuffer.setLength(stringBuffer.length() - this.e1.length());
        }
    }

    public void N(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.f1);
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.g1);
            }
            C(stringBuffer, str, jArr[i]);
        }
        stringBuffer.append(this.i1);
    }

    public void N0(boolean z) {
        this.h1 = z;
    }

    public void O(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.f1);
        for (int i = 0; i < objArr.length; i++) {
            B(stringBuffer, str, i, objArr[i]);
        }
        stringBuffer.append(this.i1);
    }

    public void O0(String str) {
        if (str == null) {
            str = "";
        }
        this.i1 = str;
    }

    public void P(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.f1);
        for (int i = 0; i < sArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.g1);
            }
            G(stringBuffer, str, sArr[i]);
        }
        stringBuffer.append(this.i1);
    }

    public void P0(String str) {
        if (str == null) {
            str = "";
        }
        this.g1 = str;
    }

    public void Q(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.f1);
        for (int i = 0; i < zArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.g1);
            }
            H(stringBuffer, str, zArr[i]);
        }
        stringBuffer.append(this.i1);
    }

    public void Q0(String str) {
        if (str == null) {
            str = "";
        }
        this.f1 = str;
    }

    public void R(StringBuffer stringBuffer, Object obj) {
        if (!this.d1) {
            M0(stringBuffer);
        }
        t(stringBuffer);
        j1(obj);
    }

    public void R0(String str) {
        if (str == null) {
            str = "";
        }
        this.a1 = str;
    }

    public void S(StringBuffer stringBuffer, String str) {
        T(stringBuffer);
    }

    public void T(StringBuffer stringBuffer) {
        stringBuffer.append(this.e1);
    }

    public void T0(String str) {
        if (str == null) {
            str = "";
        }
        this.Z0 = str;
    }

    public void U(StringBuffer stringBuffer, String str) {
        if (this.X && str != null) {
            stringBuffer.append(str);
            stringBuffer.append(this.b1);
        }
    }

    public void U0(boolean z) {
        this.j1 = z;
    }

    public void V(StringBuffer stringBuffer, Object obj) {
        if (I0() && obj != null) {
            L0(obj);
            stringBuffer.append(C11304zt1.a);
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public void W(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        if (F0(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            v(stringBuffer, str, obj);
            return;
        }
        L0(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    E(stringBuffer, str, (Collection) obj);
                } else {
                    j0(stringBuffer, str, ((Collection) obj).size());
                }
            } else if (obj instanceof Map) {
                if (z) {
                    F(stringBuffer, str, (Map) obj);
                } else {
                    j0(stringBuffer, str, ((Map) obj).size());
                }
            } else if (obj instanceof long[]) {
                if (z) {
                    N(stringBuffer, str, (long[]) obj);
                } else {
                    f0(stringBuffer, str, (long[]) obj);
                }
            } else if (obj instanceof int[]) {
                if (z) {
                    M(stringBuffer, str, (int[]) obj);
                } else {
                    e0(stringBuffer, str, (int[]) obj);
                }
            } else if (obj instanceof short[]) {
                if (z) {
                    P(stringBuffer, str, (short[]) obj);
                } else {
                    h0(stringBuffer, str, (short[]) obj);
                }
            } else if (obj instanceof byte[]) {
                if (z) {
                    I(stringBuffer, str, (byte[]) obj);
                } else {
                    a0(stringBuffer, str, (byte[]) obj);
                }
            } else if (obj instanceof char[]) {
                if (z) {
                    J(stringBuffer, str, (char[]) obj);
                } else {
                    b0(stringBuffer, str, (char[]) obj);
                }
            } else if (obj instanceof double[]) {
                if (z) {
                    K(stringBuffer, str, (double[]) obj);
                } else {
                    c0(stringBuffer, str, (double[]) obj);
                }
            } else if (obj instanceof float[]) {
                if (z) {
                    L(stringBuffer, str, (float[]) obj);
                } else {
                    d0(stringBuffer, str, (float[]) obj);
                }
            } else if (obj instanceof boolean[]) {
                if (z) {
                    Q(stringBuffer, str, (boolean[]) obj);
                } else {
                    i0(stringBuffer, str, (boolean[]) obj);
                }
            } else if (obj.getClass().isArray()) {
                if (z) {
                    O(stringBuffer, str, (Object[]) obj);
                } else {
                    g0(stringBuffer, str, (Object[]) obj);
                }
            } else if (z) {
                D(stringBuffer, str, obj);
            } else {
                Z(stringBuffer, str, obj);
            }
            j1(obj);
        } catch (Throwable th) {
            j1(obj);
            throw th;
        }
    }

    public void W0(String str) {
        if (str == null) {
            str = "";
        }
        this.b1 = str;
    }

    public void X(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.k1);
    }

    public void X0(String str) {
        if (str == null) {
            str = "";
        }
        this.e1 = str;
    }

    public void Y(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            s(stringBuffer, obj);
            V(stringBuffer, obj);
            u(stringBuffer);
            if (this.c1) {
                T(stringBuffer);
            }
        }
    }

    public void Y0(boolean z) {
        this.d1 = z;
    }

    public void Z(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.n1);
        stringBuffer.append(v0(obj.getClass()));
        stringBuffer.append(this.o1);
    }

    public void Z0(boolean z) {
        this.c1 = z;
    }

    public void a(StringBuffer stringBuffer, String str, byte b2) {
        U(stringBuffer, str);
        w(stringBuffer, str, b2);
        S(stringBuffer, str);
    }

    public void a0(StringBuffer stringBuffer, String str, byte[] bArr) {
        j0(stringBuffer, str, bArr.length);
    }

    public void a1(String str) {
        if (str == null) {
            str = "";
        }
        this.k1 = str;
    }

    public void b(StringBuffer stringBuffer, String str, char c2) {
        U(stringBuffer, str);
        x(stringBuffer, str, c2);
        S(stringBuffer, str);
    }

    public void b0(StringBuffer stringBuffer, String str, char[] cArr) {
        j0(stringBuffer, str, cArr.length);
    }

    public void b1(String str) {
        if (str == null) {
            str = "";
        }
        this.m1 = str;
    }

    public void c(StringBuffer stringBuffer, String str, double d2) {
        U(stringBuffer, str);
        y(stringBuffer, str, d2);
        S(stringBuffer, str);
    }

    public void c0(StringBuffer stringBuffer, String str, double[] dArr) {
        j0(stringBuffer, str, dArr.length);
    }

    public void c1(String str) {
        if (str == null) {
            str = "";
        }
        this.l1 = str;
    }

    public void d(StringBuffer stringBuffer, String str, float f2) {
        U(stringBuffer, str);
        z(stringBuffer, str, f2);
        S(stringBuffer, str);
    }

    public void d0(StringBuffer stringBuffer, String str, float[] fArr) {
        j0(stringBuffer, str, fArr.length);
    }

    public void d1(String str) {
        if (str == null) {
            str = "";
        }
        this.o1 = str;
    }

    public void e(StringBuffer stringBuffer, String str, int i) {
        U(stringBuffer, str);
        A(stringBuffer, str, i);
        S(stringBuffer, str);
    }

    public void e0(StringBuffer stringBuffer, String str, int[] iArr) {
        j0(stringBuffer, str, iArr.length);
    }

    public void e1(String str) {
        if (str == null) {
            str = "";
        }
        this.n1 = str;
    }

    public void f(StringBuffer stringBuffer, String str, long j) {
        U(stringBuffer, str);
        C(stringBuffer, str, j);
        S(stringBuffer, str);
    }

    public void f0(StringBuffer stringBuffer, String str, long[] jArr) {
        j0(stringBuffer, str, jArr.length);
    }

    public void f1(boolean z) {
        this.Y = z;
    }

    public void g(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        U(stringBuffer, str);
        if (obj == null) {
            X(stringBuffer, str);
        } else {
            W(stringBuffer, str, obj, E0(bool));
        }
        S(stringBuffer, str);
    }

    public void g0(StringBuffer stringBuffer, String str, Object[] objArr) {
        j0(stringBuffer, str, objArr.length);
    }

    public void g1(boolean z) {
        this.X = z;
    }

    public void h(StringBuffer stringBuffer, String str, short s) {
        U(stringBuffer, str);
        G(stringBuffer, str, s);
        S(stringBuffer, str);
    }

    public void h0(StringBuffer stringBuffer, String str, short[] sArr) {
        j0(stringBuffer, str, sArr.length);
    }

    public void h1(boolean z) {
        this.Y0 = z;
    }

    public void i(StringBuffer stringBuffer, String str, boolean z) {
        U(stringBuffer, str);
        H(stringBuffer, str, z);
        S(stringBuffer, str);
    }

    public void i0(StringBuffer stringBuffer, String str, boolean[] zArr) {
        j0(stringBuffer, str, zArr.length);
    }

    public void i1(boolean z) {
        this.Z = z;
    }

    public void j(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
        U(stringBuffer, str);
        if (bArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            I(stringBuffer, str, bArr);
        } else {
            a0(stringBuffer, str, bArr);
        }
        S(stringBuffer, str);
    }

    public void j0(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(this.l1);
        stringBuffer.append(i);
        stringBuffer.append(this.m1);
    }

    public void k(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
        U(stringBuffer, str);
        if (cArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            J(stringBuffer, str, cArr);
        } else {
            b0(stringBuffer, str, cArr);
        }
        S(stringBuffer, str);
    }

    public void k0(StringBuffer stringBuffer, String str) {
        l0(stringBuffer, str);
    }

    public void l(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
        U(stringBuffer, str);
        if (dArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            K(stringBuffer, str, dArr);
        } else {
            c0(stringBuffer, str, dArr);
        }
        S(stringBuffer, str);
    }

    public void l0(StringBuffer stringBuffer, String str) {
        int indexOf;
        int lastIndexOf;
        if (str != null && (indexOf = str.indexOf(this.Z0) + this.Z0.length()) != (lastIndexOf = str.lastIndexOf(this.a1)) && indexOf >= 0 && lastIndexOf >= 0) {
            if (this.c1) {
                M0(stringBuffer);
            }
            stringBuffer.append((CharSequence) str, indexOf, lastIndexOf);
            T(stringBuffer);
        }
    }

    public void m(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
        U(stringBuffer, str);
        if (fArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            L(stringBuffer, str, fArr);
        } else {
            d0(stringBuffer, str, fArr);
        }
        S(stringBuffer, str);
    }

    public String m0() {
        return this.i1;
    }

    public void n(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
        U(stringBuffer, str);
        if (iArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            M(stringBuffer, str, iArr);
        } else {
            e0(stringBuffer, str, iArr);
        }
        S(stringBuffer, str);
    }

    public String n0() {
        return this.g1;
    }

    public void o(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
        U(stringBuffer, str);
        if (jArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            N(stringBuffer, str, jArr);
        } else {
            f0(stringBuffer, str, jArr);
        }
        S(stringBuffer, str);
    }

    public String o0() {
        return this.f1;
    }

    public void p(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
        U(stringBuffer, str);
        if (objArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            O(stringBuffer, str, objArr);
        } else {
            g0(stringBuffer, str, objArr);
        }
        S(stringBuffer, str);
    }

    public String p0() {
        return this.a1;
    }

    public void q(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
        U(stringBuffer, str);
        if (sArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            P(stringBuffer, str, sArr);
        } else {
            h0(stringBuffer, str, sArr);
        }
        S(stringBuffer, str);
    }

    public String q0() {
        return this.Z0;
    }

    public void r(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
        U(stringBuffer, str);
        if (zArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            Q(stringBuffer, str, zArr);
        } else {
            i0(stringBuffer, str, zArr);
        }
        S(stringBuffer, str);
    }

    public String r0() {
        return this.b1;
    }

    public void s(StringBuffer stringBuffer, Object obj) {
        if (this.Y && obj != null) {
            L0(obj);
            if (this.Z) {
                stringBuffer.append(v0(obj.getClass()));
            } else {
                stringBuffer.append(obj.getClass().getName());
            }
        }
    }

    public String s0() {
        return this.e1;
    }

    public void t(StringBuffer stringBuffer) {
        stringBuffer.append(this.a1);
    }

    public String t0() {
        return this.k1;
    }

    public void u(StringBuffer stringBuffer) {
        stringBuffer.append(this.Z0);
    }

    public void v(StringBuffer stringBuffer, String str, Object obj) {
        C11304zt1.C(stringBuffer, obj);
    }

    public String v0(Class<?> cls) {
        return C8457oD.G(cls);
    }

    public void w(StringBuffer stringBuffer, String str, byte b2) {
        stringBuffer.append((int) b2);
    }

    public String w0() {
        return this.m1;
    }

    public void x(StringBuffer stringBuffer, String str, char c2) {
        stringBuffer.append(c2);
    }

    public String x0() {
        return this.l1;
    }

    public void y(StringBuffer stringBuffer, String str, double d2) {
        stringBuffer.append(d2);
    }

    public String y0() {
        return this.o1;
    }

    public void z(StringBuffer stringBuffer, String str, float f2) {
        stringBuffer.append(f2);
    }

    public String z0() {
        return this.n1;
    }
}
