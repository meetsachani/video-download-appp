package o;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.w50  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10380w50 extends AbstractMap {
    public static final int b1 = 0;
    public static final int c1 = 1;
    public static final int d1 = 1;
    public static final int e1 = 0;
    public static final int f1 = 2;
    public static final String[] g1 = {"key", "value"};
    public b[] X;
    public int Y;
    public Set[] Y0;
    public int Z;
    public Set[] Z0;
    public Collection[] a1;

    /* renamed from: o.w50$a */
    /* loaded from: classes4.dex */
    public abstract class a implements Iterator {
        public int X;
        public b Y = null;
        public int Y0;
        public b Z;

        public a(int i) {
            this.Y0 = i;
            this.X = C10380w50.this.Z;
            b[] bVarArr = C10380w50.this.X;
            int i2 = this.Y0;
            this.Z = C10380w50.J(bVarArr[i2], i2);
        }

        public abstract Object b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.Z != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() throws NoSuchElementException, ConcurrentModificationException {
            if (this.Z != null) {
                if (C10380w50.this.Z == this.X) {
                    b bVar = this.Z;
                    this.Y = bVar;
                    this.Z = C10380w50.this.P(bVar, this.Y0);
                    return b();
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() throws IllegalStateException, ConcurrentModificationException {
            if (this.Y != null) {
                if (C10380w50.this.Z == this.X) {
                    C10380w50.this.r(this.Y);
                    this.X++;
                    this.Y = null;
                    return;
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.w50$b */
    /* loaded from: classes4.dex */
    public static final class b implements Map.Entry, KX0 {
        public Comparable[] X;
        public int a1;
        public b[] Y = {null, null};
        public b[] Z = {null, null};
        public b[] Y0 = {null, null};
        public boolean[] Z0 = {true, true};
        public boolean b1 = false;

        public b(Comparable comparable, Comparable comparable2) {
            this.X = new Comparable[]{comparable, comparable2};
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (this.X[0].equals(entry.getKey()) && this.X[1].equals(entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry, o.KX0
        public Object getKey() {
            return this.X[0];
        }

        @Override // java.util.Map.Entry, o.KX0
        public Object getValue() {
            return this.X[1];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.b1) {
                this.a1 = this.X[0].hashCode() ^ this.X[1].hashCode();
                this.b1 = true;
            }
            return this.a1;
        }

        public final void n(b bVar, int i) {
            this.Z0[i] = bVar.Z0[i];
        }

        public final Comparable o(int i) {
            return this.X[i];
        }

        public final b p(int i) {
            return this.Y[i];
        }

        public final b q(int i) {
            return this.Y0[i];
        }

        public final b r(int i) {
            return this.Z[i];
        }

        public final boolean s(int i) {
            return this.Z0[i];
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Map.Entry.setValue is not supported");
        }

        public final boolean t(int i) {
            return !this.Z0[i];
        }

        public final void u(int i) {
            this.Z0[i] = true;
        }

        public final void v(b bVar, int i) {
            this.Y[i] = bVar;
        }

        public final void w(b bVar, int i) {
            this.Y0[i] = bVar;
        }

        public final void x(int i) {
            this.Z0[i] = false;
        }

        public final void y(b bVar, int i) {
            this.Z[i] = bVar;
        }

        public final void z(b bVar, int i) {
            boolean[] zArr = this.Z0;
            boolean z = zArr[i];
            boolean[] zArr2 = bVar.Z0;
            boolean z2 = z ^ zArr2[i];
            zArr[i] = z2;
            boolean z3 = z2 ^ zArr2[i];
            zArr2[i] = z3;
            zArr[i] = zArr[i] ^ z3;
        }
    }

    public C10380w50() {
        this.X = new b[]{null, null};
        this.Y = 0;
        this.Z = 0;
        this.Y0 = new Set[]{null, null};
        this.Z0 = new Set[]{null, null};
        this.a1 = new Collection[]{null, null};
    }

    public static b A(b bVar, int i) {
        if (bVar != null) {
            return bVar.q(i);
        }
        return null;
    }

    public static b B(b bVar, int i) {
        if (bVar != null) {
            return bVar.r(i);
        }
        return null;
    }

    public static boolean E(b bVar, int i) {
        if (bVar != null) {
            return bVar.s(i);
        }
        return true;
    }

    public static boolean F(b bVar, int i) {
        if (bVar == null) {
            return true;
        }
        if (bVar.q(i) != null && bVar == bVar.q(i).p(i)) {
            return true;
        }
        return false;
    }

    public static boolean G(b bVar, int i) {
        if (bVar != null) {
            return bVar.t(i);
        }
        return false;
    }

    public static boolean H(b bVar, int i) {
        if (bVar == null) {
            return true;
        }
        if (bVar.q(i) != null && bVar == bVar.q(i).r(i)) {
            return true;
        }
        return false;
    }

    public static b J(b bVar, int i) {
        if (bVar != null) {
            while (bVar.p(i) != null) {
                bVar = bVar.p(i);
            }
        }
        return bVar;
    }

    public static void L(b bVar, int i) {
        if (bVar != null) {
            bVar.u(i);
        }
    }

    public static void N(b bVar, int i) {
        if (bVar != null) {
            bVar.x(i);
        }
    }

    public static void i(Object obj) {
        k(obj, 0);
    }

    public static void j(Object obj, Object obj2) {
        i(obj);
        l(obj2);
    }

    public static void k(Object obj, int i) {
        if (obj != null) {
            if (obj instanceof Comparable) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(g1[i]);
            stringBuffer.append(" must be Comparable");
            throw new ClassCastException(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(g1[i]);
        stringBuffer2.append(" cannot be null");
        throw new NullPointerException(stringBuffer2.toString());
    }

    public static void l(Object obj) {
        k(obj, 1);
    }

    public static int m(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static void n(b bVar, b bVar2, int i) {
        if (bVar2 != null) {
            if (bVar == null) {
                bVar2.u(i);
            } else {
                bVar2.n(bVar, i);
            }
        }
    }

    public static b x(b bVar, int i) {
        return A(A(bVar, i), i);
    }

    public static b z(b bVar, int i) {
        if (bVar != null) {
            return bVar.p(i);
        }
        return null;
    }

    public final void C() {
        O();
        this.Y++;
    }

    public final void D(b bVar) throws IllegalArgumentException {
        b bVar2 = this.X[1];
        while (true) {
            int m = m(bVar.o(1), bVar2.o(1));
            if (m != 0) {
                if (m < 0) {
                    if (bVar2.p(1) != null) {
                        bVar2 = bVar2.p(1);
                    } else {
                        bVar2.v(bVar, 1);
                        bVar.w(bVar2, 1);
                        u(bVar, 1);
                        return;
                    }
                } else if (bVar2.r(1) != null) {
                    bVar2 = bVar2.r(1);
                } else {
                    bVar2.y(bVar, 1);
                    bVar.w(bVar2, 1);
                    u(bVar, 1);
                    return;
                }
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Cannot store a duplicate value (\"");
                stringBuffer.append(bVar.o(1));
                stringBuffer.append("\") in this Map");
                throw new IllegalArgumentException(stringBuffer.toString());
            }
        }
    }

    public Set I() {
        Set[] setArr = this.Y0;
        if (setArr[1] == null) {
            setArr[1] = new C8183n50(this);
        }
        return this.Y0[1];
    }

    public final b K(Comparable comparable, int i) {
        b bVar = this.X[i];
        while (bVar != null) {
            int m = m(comparable, bVar.o(i));
            if (m == 0) {
                return bVar;
            }
            bVar = m < 0 ? bVar.p(i) : bVar.r(i);
        }
        return null;
    }

    public final void O() {
        this.Z++;
    }

    public final b P(b bVar, int i) {
        if (bVar == null) {
            return null;
        }
        if (bVar.r(i) == null) {
            b q = bVar.q(i);
            while (true) {
                b bVar2 = q;
                b bVar3 = bVar;
                bVar = bVar2;
                if (bVar == null || bVar3 != bVar.r(i)) {
                    break;
                }
                q = bVar.q(i);
            }
            return bVar;
        }
        return J(bVar.r(i), i);
    }

    public final int Q(int i) {
        return 1 - i;
    }

    public final void R(b bVar, int i) {
        b r = bVar.r(i);
        bVar.y(r.p(i), i);
        if (r.p(i) != null) {
            r.p(i).w(bVar, i);
        }
        r.w(bVar.q(i), i);
        if (bVar.q(i) == null) {
            this.X[i] = r;
        } else if (bVar.q(i).p(i) == bVar) {
            bVar.q(i).v(r, i);
        } else {
            bVar.q(i).y(r, i);
        }
        r.v(bVar, i);
        bVar.w(r, i);
    }

    public final void S(b bVar, int i) {
        b p = bVar.p(i);
        bVar.v(p.r(i), i);
        if (p.r(i) != null) {
            p.r(i).w(bVar, i);
        }
        p.w(bVar.q(i), i);
        if (bVar.q(i) == null) {
            this.X[i] = p;
        } else if (bVar.q(i).r(i) == bVar) {
            bVar.q(i).y(p, i);
        } else {
            bVar.q(i).v(p, i);
        }
        p.y(bVar, i);
        bVar.w(p, i);
    }

    public final void T() {
        O();
        this.Y--;
    }

    public final void W(b bVar, b bVar2, int i) {
        boolean z;
        b q = bVar.q(i);
        b p = bVar.p(i);
        b r = bVar.r(i);
        b q2 = bVar2.q(i);
        b p2 = bVar2.p(i);
        b r2 = bVar2.r(i);
        boolean z2 = false;
        if (bVar.q(i) != null && bVar == bVar.q(i).p(i)) {
            z = true;
        } else {
            z = false;
        }
        if (bVar2.q(i) != null && bVar2 == bVar2.q(i).p(i)) {
            z2 = true;
        }
        if (bVar == q2) {
            bVar.w(bVar2, i);
            if (z2) {
                bVar2.v(bVar, i);
                bVar2.y(r, i);
            } else {
                bVar2.y(bVar, i);
                bVar2.v(p, i);
            }
        } else {
            bVar.w(q2, i);
            if (q2 != null) {
                if (z2) {
                    q2.v(bVar, i);
                } else {
                    q2.y(bVar, i);
                }
            }
            bVar2.v(p, i);
            bVar2.y(r, i);
        }
        if (bVar2 == q) {
            bVar2.w(bVar, i);
            if (z) {
                bVar.v(bVar2, i);
                bVar.y(r2, i);
            } else {
                bVar.y(bVar2, i);
                bVar.v(p2, i);
            }
        } else {
            bVar2.w(q, i);
            if (q != null) {
                if (z) {
                    q.v(bVar2, i);
                } else {
                    q.y(bVar2, i);
                }
            }
            bVar.v(p2, i);
            bVar.y(r2, i);
        }
        if (bVar.p(i) != null) {
            bVar.p(i).w(bVar, i);
        }
        if (bVar.r(i) != null) {
            bVar.r(i).w(bVar, i);
        }
        if (bVar2.p(i) != null) {
            bVar2.p(i).w(bVar2, i);
        }
        if (bVar2.r(i) != null) {
            bVar2.r(i).w(bVar2, i);
        }
        bVar.z(bVar2, i);
        b[] bVarArr = this.X;
        b bVar3 = bVarArr[i];
        if (bVar3 == bVar) {
            bVarArr[i] = bVar2;
        } else if (bVar3 == bVar2) {
            bVarArr[i] = bVar;
        }
    }

    public Collection X() {
        Collection[] collectionArr = this.a1;
        if (collectionArr[1] == null) {
            collectionArr[1] = new C8670p50(this);
        }
        return this.a1[1];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        O();
        this.Y = 0;
        b[] bVarArr = this.X;
        bVarArr[0] = null;
        bVarArr[1] = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) throws ClassCastException, NullPointerException {
        i(obj);
        if (K((Comparable) obj, 0) == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        l(obj);
        if (K((Comparable) obj, 1) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set[] setArr = this.Z0;
        if (setArr[0] == null) {
            setArr[0] = new C10134v50(this);
        }
        return this.Z0[0];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) throws ClassCastException, NullPointerException {
        return o((Comparable) obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set[] setArr = this.Y0;
        if (setArr[0] == null) {
            setArr[0] = new C9162r50(this);
        }
        return this.Y0[0];
    }

    public Object l0(Object obj) {
        return v((Comparable) obj, 1);
    }

    public final Object o(Comparable comparable, int i) {
        k(comparable, i);
        b K = K(comparable, i);
        if (K != null) {
            return K.o(Q(i));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) throws ClassCastException, NullPointerException, IllegalArgumentException {
        j(obj, obj2);
        b bVar = this.X[0];
        if (bVar == null) {
            b bVar2 = new b((Comparable) obj, (Comparable) obj2);
            b[] bVarArr = this.X;
            bVarArr[0] = bVar2;
            bVarArr[1] = bVar2;
            C();
            return null;
        }
        while (true) {
            Comparable comparable = (Comparable) obj;
            int m = m(comparable, bVar.o(0));
            if (m != 0) {
                if (m < 0) {
                    if (bVar.p(0) != null) {
                        bVar = bVar.p(0);
                    } else {
                        b bVar3 = new b(comparable, (Comparable) obj2);
                        D(bVar3);
                        bVar.v(bVar3, 0);
                        bVar3.w(bVar, 0);
                        u(bVar3, 0);
                        C();
                        return null;
                    }
                } else if (bVar.r(0) != null) {
                    bVar = bVar.r(0);
                } else {
                    b bVar4 = new b(comparable, (Comparable) obj2);
                    D(bVar4);
                    bVar.y(bVar4, 0);
                    bVar4.w(bVar, 0);
                    u(bVar4, 0);
                    C();
                    return null;
                }
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Cannot store a duplicate key (\"");
                stringBuffer.append(obj);
                stringBuffer.append("\") in this Map");
                throw new IllegalArgumentException(stringBuffer.toString());
            }
        }
    }

    public final void r(b bVar) {
        for (int i = 0; i < 2; i++) {
            if (bVar.p(i) != null && bVar.r(i) != null) {
                W(P(bVar, i), bVar, i);
            }
            b p = bVar.p(i) != null ? bVar.p(i) : bVar.r(i);
            if (p != null) {
                p.w(bVar.q(i), i);
                if (bVar.q(i) == null) {
                    this.X[i] = p;
                } else if (bVar == bVar.q(i).p(i)) {
                    bVar.q(i).v(p, i);
                } else {
                    bVar.q(i).y(p, i);
                }
                bVar.v(null, i);
                bVar.y(null, i);
                bVar.w(null, i);
                if (E(bVar, i)) {
                    t(p, i);
                }
            } else if (bVar.q(i) == null) {
                this.X[i] = null;
            } else {
                if (E(bVar, i)) {
                    t(bVar, i);
                }
                if (bVar.q(i) != null) {
                    if (bVar == bVar.q(i).p(i)) {
                        bVar.q(i).v(null, i);
                    } else {
                        bVar.q(i).y(null, i);
                    }
                    bVar.w(null, i);
                }
            }
        }
        T();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return v((Comparable) obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.Y;
    }

    public final void t(b bVar, int i) {
        while (bVar != this.X[i] && E(bVar, i)) {
            if (F(bVar, i)) {
                b B = B(A(bVar, i), i);
                if (G(B, i)) {
                    L(B, i);
                    N(A(bVar, i), i);
                    R(A(bVar, i), i);
                    B = B(A(bVar, i), i);
                }
                if (E(z(B, i), i) && E(B(B, i), i)) {
                    N(B, i);
                    bVar = A(bVar, i);
                } else {
                    if (E(B(B, i), i)) {
                        L(z(B, i), i);
                        N(B, i);
                        S(B, i);
                        B = B(A(bVar, i), i);
                    }
                    n(A(bVar, i), B, i);
                    L(A(bVar, i), i);
                    L(B(B, i), i);
                    R(A(bVar, i), i);
                    bVar = this.X[i];
                }
            } else {
                b z = z(A(bVar, i), i);
                if (G(z, i)) {
                    L(z, i);
                    N(A(bVar, i), i);
                    S(A(bVar, i), i);
                    z = z(A(bVar, i), i);
                }
                if (E(B(z, i), i) && E(z(z, i), i)) {
                    N(z, i);
                    bVar = A(bVar, i);
                } else {
                    if (E(z(z, i), i)) {
                        L(B(z, i), i);
                        N(z, i);
                        R(z, i);
                        z = z(A(bVar, i), i);
                    }
                    n(A(bVar, i), z, i);
                    L(A(bVar, i), i);
                    L(z(z, i), i);
                    S(A(bVar, i), i);
                    bVar = this.X[i];
                }
            }
        }
        L(bVar, i);
    }

    public final void u(b bVar, int i) {
        N(bVar, i);
        while (bVar != null && bVar != this.X[i] && G(bVar.q(i), i)) {
            if (F(A(bVar, i), i)) {
                b B = B(x(bVar, i), i);
                if (G(B, i)) {
                    L(A(bVar, i), i);
                    L(B, i);
                    N(x(bVar, i), i);
                    bVar = x(bVar, i);
                } else {
                    if (H(bVar, i)) {
                        bVar = A(bVar, i);
                        R(bVar, i);
                    }
                    L(A(bVar, i), i);
                    N(x(bVar, i), i);
                    if (x(bVar, i) != null) {
                        S(x(bVar, i), i);
                    }
                }
            } else {
                b z = z(x(bVar, i), i);
                if (G(z, i)) {
                    L(A(bVar, i), i);
                    L(z, i);
                    N(x(bVar, i), i);
                    bVar = x(bVar, i);
                } else {
                    if (F(bVar, i)) {
                        bVar = A(bVar, i);
                        S(bVar, i);
                    }
                    L(A(bVar, i), i);
                    N(x(bVar, i), i);
                    if (x(bVar, i) != null) {
                        R(x(bVar, i), i);
                    }
                }
            }
        }
        L(this.X[i], i);
    }

    public final Object v(Comparable comparable, int i) {
        b K = K(comparable, i);
        if (K != null) {
            Comparable o2 = K.o(Q(i));
            r(K);
            return o2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection[] collectionArr = this.a1;
        if (collectionArr[0] == null) {
            collectionArr[0] = new C9648t50(this);
        }
        return this.a1[0];
    }

    public Set w() {
        Set[] setArr = this.Z0;
        if (setArr[1] == null) {
            setArr[1] = new C7679l50(this);
        }
        return this.Z0[1];
    }

    public Object y(Object obj) throws ClassCastException, NullPointerException {
        return o((Comparable) obj, 1);
    }

    public C10380w50(Map map) throws ClassCastException, NullPointerException, IllegalArgumentException {
        this.X = new b[]{null, null};
        this.Y = 0;
        this.Z = 0;
        this.Y0 = new Set[]{null, null};
        this.Z0 = new Set[]{null, null};
        this.a1 = new Collection[]{null, null};
        putAll(map);
    }
}
