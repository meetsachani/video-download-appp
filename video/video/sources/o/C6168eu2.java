package o;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.eu2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6168eu2 implements InterfaceC8634ow1 {
    public static final int c1 = 0;
    public static final int d1 = 1;
    public static final int e1 = 2;
    public static final int f1 = 3;
    public static final int g1 = 1;
    public static final int h1 = 0;
    public static final int i1 = 2;
    public static final String[] j1 = {"key", "value"};
    public c[] X;
    public int Y;
    public Set Y0;
    public int Z;
    public Set Z0;
    public Set a1;
    public b b1;

    /* renamed from: o.eu2$a */
    /* loaded from: classes4.dex */
    public static class a extends d {
        public final int Y0;

        public a(C6168eu2 c6168eu2, int i, int i2) {
            super(c6168eu2, i, i2);
            this.Y0 = C6168eu2.g0(i);
        }

        @Override // o.C6168eu2.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            c Z = this.X.Z((Comparable) entry.getKey(), this.Y);
            if (Z == null || !Z.o(this.Y0).equals(value)) {
                return false;
            }
            return true;
        }

        @Override // o.C6168eu2.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            c Z = this.X.Z((Comparable) entry.getKey(), this.Y);
            if (Z != null && Z.o(this.Y0).equals(value)) {
                this.X.F(Z);
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.eu2$b */
    /* loaded from: classes4.dex */
    public static class b implements InterfaceC8634ow1 {
        public final C6168eu2 X;
        public Set Y;
        public Set Y0;
        public Set Z;

        public b(C6168eu2 c6168eu2) {
            this.X = c6168eu2;
        }

        @Override // o.InterfaceC5167an
        public Object b0(Object obj) {
            return this.X.get(obj);
        }

        @Override // o.InterfaceC9612sw1
        public InterfaceC10098uw1 c2() {
            if (isEmpty()) {
                return C7074ib0.X;
            }
            return new f(this.X, 1);
        }

        @Override // java.util.Map
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.X.containsKey(obj);
        }

        @Override // o.InterfaceC8634ow1
        public InterfaceC8634ow1 e1() {
            return this.X;
        }

        @Override // java.util.Map
        public Set entrySet() {
            Set set = this.Y0;
            if (set == null) {
                return new a(this.X, 1, 3);
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return this.X.B(obj, 1);
        }

        @Override // o.InterfaceC9612sw1
        public Object firstKey() {
            if (this.X.Y != 0) {
                return C6168eu2.Y(this.X.X[1], 1).getValue();
            }
            throw new NoSuchElementException("Map is empty");
        }

        @Override // java.util.Map
        public Object get(Object obj) {
            return this.X.b0(obj);
        }

        @Override // o.InterfaceC8634ow1, o.X92
        public InterfaceC5167an h() {
            return this.X;
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.X.D(1);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // o.InterfaceC9612sw1
        public Object j0(Object obj) {
            C6168eu2.v(obj);
            C6168eu2 c6168eu2 = this.X;
            c f0 = c6168eu2.f0(c6168eu2.Z((Comparable) obj, 1), 1);
            if (f0 == null) {
                return null;
            }
            return f0.getValue();
        }

        @Override // java.util.Map
        public Set keySet() {
            if (this.Y == null) {
                this.Y = new d(this.X, 1, 1);
            }
            return this.Y;
        }

        @Override // o.InterfaceC5167an
        public Object l0(Object obj) {
            return this.X.remove(obj);
        }

        @Override // o.InterfaceC9612sw1
        public Object lastKey() {
            if (this.X.Y != 0) {
                return C6168eu2.P(this.X.X[1], 1).getValue();
            }
            throw new NoSuchElementException("Map is empty");
        }

        @Override // o.InterfaceC9612sw1
        public Object n0(Object obj) {
            C6168eu2.v(obj);
            C6168eu2 c6168eu2 = this.X;
            c e0 = c6168eu2.e0(c6168eu2.Z((Comparable) obj, 1), 1);
            if (e0 == null) {
                return null;
            }
            return e0.getValue();
        }

        @Override // o.InterfaceC5167an, o.XT0
        public V71 p() {
            if (isEmpty()) {
                return C7074ib0.X;
            }
            return new f(this.X, 1);
        }

        @Override // o.InterfaceC5167an, java.util.Map
        public Object put(Object obj, Object obj2) {
            return this.X.E((Comparable) obj2, (Comparable) obj, 1);
        }

        @Override // java.util.Map
        public void putAll(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            return this.X.l0(obj);
        }

        @Override // java.util.Map
        public int size() {
            return this.X.size();
        }

        public String toString() {
            return this.X.J(1);
        }

        @Override // java.util.Map
        public Collection values() {
            if (this.Z == null) {
                this.Z = new d(this.X, 1, 0);
            }
            return this.Z;
        }
    }

    /* renamed from: o.eu2$c */
    /* loaded from: classes4.dex */
    public static class c implements Map.Entry, KX0 {
        public Comparable[] X;
        public int a1;
        public c[] Y = new c[2];
        public c[] Z = new c[2];
        public c[] Y0 = new c[2];
        public boolean[] Z0 = {true, true};
        public boolean b1 = false;

        public c(Comparable comparable, Comparable comparable2) {
            this.X = new Comparable[]{comparable, comparable2};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Comparable o(int i) {
            return this.X[i];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean s(int i) {
            return this.Z0[i];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean t(int i) {
            return !this.Z0[i];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u(int i) {
            this.Z0[i] = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x(int i) {
            this.Z0[i] = false;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
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

        public final void n(c cVar, int i) {
            this.Z0[i] = cVar.Z0[i];
        }

        public final c p(int i) {
            return this.Y[i];
        }

        public final c q(int i) {
            return this.Y0[i];
        }

        public final c r(int i) {
            return this.Z[i];
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Map.Entry.setValue is not supported");
        }

        public final void v(c cVar, int i) {
            this.Y[i] = cVar;
        }

        public final void w(c cVar, int i) {
            this.Y0[i] = cVar;
        }

        public final void y(c cVar, int i) {
            this.Z[i] = cVar;
        }

        public final void z(c cVar, int i) {
            boolean[] zArr = this.Z0;
            boolean z = zArr[i];
            boolean[] zArr2 = cVar.Z0;
            boolean z2 = z ^ zArr2[i];
            zArr[i] = z2;
            boolean z3 = z2 ^ zArr2[i];
            zArr2[i] = z3;
            zArr[i] = zArr[i] ^ z3;
        }
    }

    /* renamed from: o.eu2$d */
    /* loaded from: classes4.dex */
    public static class d extends AbstractSet {
        public final C6168eu2 X;
        public final int Y;
        public final int Z;

        public d(C6168eu2 c6168eu2, int i, int i2) {
            this.X = c6168eu2;
            this.Y = i;
            this.Z = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            C6168eu2.x(obj, this.Z);
            if (this.X.Z((Comparable) obj, this.Z) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(this.X, this.Y, this.Z);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (this.X.I((Comparable) obj, this.Z) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size();
        }
    }

    /* renamed from: o.eu2$e */
    /* loaded from: classes4.dex */
    public static class e implements InterfaceC9127qw1 {
        public final C6168eu2 X;
        public final int Y;
        public final int Z;
        public c Z0;
        public int b1;
        public c Y0 = null;
        public c a1 = null;

        public e(C6168eu2 c6168eu2, int i, int i2) {
            this.X = c6168eu2;
            this.Y = i;
            this.Z = i2;
            this.b1 = c6168eu2.Z;
            this.Z0 = C6168eu2.Y(c6168eu2.X[i], i);
        }

        public Object b() {
            int i = this.Z;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return new C8696pB2(this.Y0.getValue(), this.Y0.getKey());
                    }
                    return this.Y0;
                }
                return this.Y0.getValue();
            }
            return this.Y0.getKey();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.Z0 != null) {
                return true;
            }
            return false;
        }

        @Override // o.InterfaceC9127qw1
        public boolean hasPrevious() {
            if (this.a1 != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.Z0 != null) {
                if (this.X.Z == this.b1) {
                    c cVar = this.Z0;
                    this.Y0 = cVar;
                    this.a1 = cVar;
                    this.Z0 = this.X.e0(cVar, this.Y);
                    return b();
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // o.InterfaceC9127qw1
        public Object previous() {
            if (this.a1 != null) {
                if (this.X.Z == this.b1) {
                    c cVar = this.Y0;
                    this.Z0 = cVar;
                    if (cVar == null) {
                        this.Z0 = this.X.e0(this.a1, this.Y);
                    }
                    c cVar2 = this.a1;
                    this.Y0 = cVar2;
                    this.a1 = this.X.f0(cVar2, this.Y);
                    return b();
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.Y0 != null) {
                if (this.X.Z == this.b1) {
                    this.X.F(this.Y0);
                    this.b1++;
                    this.Y0 = null;
                    c cVar = this.Z0;
                    if (cVar == null) {
                        c[] cVarArr = this.X.X;
                        int i = this.Y;
                        this.a1 = C6168eu2.P(cVarArr[i], i);
                        return;
                    }
                    this.a1 = this.X.f0(cVar, this.Y);
                    return;
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.eu2$f */
    /* loaded from: classes4.dex */
    public static class f extends e implements InterfaceC10098uw1 {
        public final int c1;

        public f(C6168eu2 c6168eu2, int i) {
            super(c6168eu2, i, i);
            this.c1 = C6168eu2.g0(this.Z);
        }

        @Override // o.V71
        public Object getKey() {
            c cVar = this.Y0;
            if (cVar != null) {
                return cVar.o(this.Z);
            }
            throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
        }

        @Override // o.V71
        public Object getValue() {
            c cVar = this.Y0;
            if (cVar != null) {
                return cVar.o(this.c1);
            }
            throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
        }

        @Override // o.V71
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public C6168eu2() {
        this.X = new c[2];
        this.Y = 0;
        this.Z = 0;
        this.b1 = null;
    }

    public static void A(c cVar, c cVar2, int i) {
        if (cVar2 != null) {
            if (cVar == null) {
                cVar2.u(i);
            } else {
                cVar2.n(cVar, i);
            }
        }
    }

    public static c K(c cVar, int i) {
        return N(N(cVar, i), i);
    }

    public static c L(c cVar, int i) {
        if (cVar != null) {
            return cVar.p(i);
        }
        return null;
    }

    public static c N(c cVar, int i) {
        if (cVar != null) {
            return cVar.q(i);
        }
        return null;
    }

    public static c O(c cVar, int i) {
        if (cVar != null) {
            return cVar.r(i);
        }
        return null;
    }

    public static c P(c cVar, int i) {
        if (cVar != null) {
            while (cVar.r(i) != null) {
                cVar = cVar.r(i);
            }
        }
        return cVar;
    }

    private void Q() {
        d0();
        this.Y++;
    }

    public static boolean S(c cVar, int i) {
        if (cVar != null) {
            return cVar.s(i);
        }
        return true;
    }

    public static boolean T(c cVar, int i) {
        if (cVar == null) {
            return true;
        }
        if (cVar.q(i) != null && cVar == cVar.q(i).p(i)) {
            return true;
        }
        return false;
    }

    public static boolean W(c cVar, int i) {
        if (cVar != null) {
            return cVar.t(i);
        }
        return false;
    }

    public static boolean X(c cVar, int i) {
        if (cVar == null) {
            return true;
        }
        if (cVar.q(i) != null && cVar == cVar.q(i).r(i)) {
            return true;
        }
        return false;
    }

    public static c Y(c cVar, int i) {
        if (cVar != null) {
            while (cVar.p(i) != null) {
                cVar = cVar.p(i);
            }
        }
        return cVar;
    }

    public static void a0(c cVar, int i) {
        if (cVar != null) {
            cVar.u(i);
        }
    }

    public static void c0(c cVar, int i) {
        if (cVar != null) {
            cVar.x(i);
        }
    }

    public static int g0(int i) {
        return 1 - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(Object obj) {
        x(obj, 0);
    }

    public static void w(Object obj, Object obj2) {
        v(obj);
        y(obj2);
    }

    public static void x(Object obj, int i) {
        if (obj != null) {
            if (obj instanceof Comparable) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(j1[i]);
            stringBuffer.append(" must be Comparable");
            throw new ClassCastException(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(j1[i]);
        stringBuffer2.append(" cannot be null");
        throw new NullPointerException(stringBuffer2.toString());
    }

    public static void y(Object obj) {
        x(obj, 1);
    }

    public static int z(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public final boolean B(Object obj, int i) {
        f fVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != size()) {
            return false;
        }
        if (this.Y > 0) {
            try {
                fVar = new f(this, i);
            } catch (ClassCastException | NullPointerException unused) {
            }
            while (fVar.hasNext()) {
                if (!fVar.getValue().equals(map.get(fVar.next()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final Object C(Comparable comparable, int i) {
        x(comparable, i);
        c Z = Z(comparable, i);
        if (Z != null) {
            return Z.o(g0(i));
        }
        return null;
    }

    public final int D(int i) {
        int i2 = 0;
        if (this.Y > 0) {
            f fVar = new f(this, i);
            while (fVar.hasNext()) {
                i2 += fVar.next().hashCode() ^ fVar.getValue().hashCode();
            }
        }
        return i2;
    }

    public final Object E(Comparable comparable, Comparable comparable2, int i) {
        Object C;
        c r;
        w(comparable, comparable2);
        if (i == 0) {
            C = C(comparable, 0);
        } else {
            C = C(comparable2, 1);
        }
        I(comparable, 0);
        I(comparable2, 1);
        c cVar = this.X[0];
        if (cVar == null) {
            c cVar2 = new c(comparable, comparable2);
            c[] cVarArr = this.X;
            cVarArr[0] = cVar2;
            cVarArr[1] = cVar2;
            Q();
            return C;
        }
        while (true) {
            int z = z(comparable, cVar.o(0));
            if (z != 0) {
                if (z < 0) {
                    if (cVar.p(0) != null) {
                        r = cVar.p(0);
                    } else {
                        c cVar3 = new c(comparable, comparable2);
                        R(cVar3);
                        cVar.v(cVar3, 0);
                        cVar3.w(cVar, 0);
                        H(cVar3, 0);
                        Q();
                        return C;
                    }
                } else if (cVar.r(0) != null) {
                    r = cVar.r(0);
                } else {
                    c cVar4 = new c(comparable, comparable2);
                    R(cVar4);
                    cVar.y(cVar4, 0);
                    cVar4.w(cVar, 0);
                    H(cVar4, 0);
                    Q();
                    return C;
                }
                cVar = r;
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Cannot store a duplicate key (\"");
                stringBuffer.append(comparable);
                stringBuffer.append("\") in this Map");
                throw new IllegalArgumentException(stringBuffer.toString());
            }
        }
    }

    public final void F(c cVar) {
        for (int i = 0; i < 2; i++) {
            if (cVar.p(i) != null && cVar.r(i) != null) {
                o0(e0(cVar, i), cVar, i);
            }
            c p = cVar.p(i) != null ? cVar.p(i) : cVar.r(i);
            if (p != null) {
                p.w(cVar.q(i), i);
                if (cVar.q(i) == null) {
                    this.X[i] = p;
                } else if (cVar == cVar.q(i).p(i)) {
                    cVar.q(i).v(p, i);
                } else {
                    cVar.q(i).y(p, i);
                }
                cVar.v(null, i);
                cVar.y(null, i);
                cVar.w(null, i);
                if (S(cVar, i)) {
                    G(p, i);
                }
            } else if (cVar.q(i) == null) {
                this.X[i] = null;
            } else {
                if (S(cVar, i)) {
                    G(cVar, i);
                }
                if (cVar.q(i) != null) {
                    if (cVar == cVar.q(i).p(i)) {
                        cVar.q(i).v(null, i);
                    } else {
                        cVar.q(i).y(null, i);
                    }
                    cVar.w(null, i);
                }
            }
        }
        m0();
    }

    public final void G(c cVar, int i) {
        while (cVar != this.X[i] && S(cVar, i)) {
            if (T(cVar, i)) {
                c O = O(N(cVar, i), i);
                if (W(O, i)) {
                    a0(O, i);
                    c0(N(cVar, i), i);
                    h0(N(cVar, i), i);
                    O = O(N(cVar, i), i);
                }
                if (S(L(O, i), i) && S(O(O, i), i)) {
                    c0(O, i);
                    cVar = N(cVar, i);
                } else {
                    if (S(O(O, i), i)) {
                        a0(L(O, i), i);
                        c0(O, i);
                        i0(O, i);
                        O = O(N(cVar, i), i);
                    }
                    A(N(cVar, i), O, i);
                    a0(N(cVar, i), i);
                    a0(O(O, i), i);
                    h0(N(cVar, i), i);
                    cVar = this.X[i];
                }
            } else {
                c L = L(N(cVar, i), i);
                if (W(L, i)) {
                    a0(L, i);
                    c0(N(cVar, i), i);
                    i0(N(cVar, i), i);
                    L = L(N(cVar, i), i);
                }
                if (S(O(L, i), i) && S(L(L, i), i)) {
                    c0(L, i);
                    cVar = N(cVar, i);
                } else {
                    if (S(L(L, i), i)) {
                        a0(O(L, i), i);
                        c0(L, i);
                        h0(L, i);
                        L = L(N(cVar, i), i);
                    }
                    A(N(cVar, i), L, i);
                    a0(N(cVar, i), i);
                    a0(L(L, i), i);
                    i0(N(cVar, i), i);
                    cVar = this.X[i];
                }
            }
        }
        a0(cVar, i);
    }

    public final void H(c cVar, int i) {
        c0(cVar, i);
        while (cVar != null && cVar != this.X[i] && W(cVar.q(i), i)) {
            if (T(N(cVar, i), i)) {
                c O = O(K(cVar, i), i);
                if (W(O, i)) {
                    a0(N(cVar, i), i);
                    a0(O, i);
                    c0(K(cVar, i), i);
                    cVar = K(cVar, i);
                } else {
                    if (X(cVar, i)) {
                        cVar = N(cVar, i);
                        h0(cVar, i);
                    }
                    a0(N(cVar, i), i);
                    c0(K(cVar, i), i);
                    if (K(cVar, i) != null) {
                        i0(K(cVar, i), i);
                    }
                }
            } else {
                c L = L(K(cVar, i), i);
                if (W(L, i)) {
                    a0(N(cVar, i), i);
                    a0(L, i);
                    c0(K(cVar, i), i);
                    cVar = K(cVar, i);
                } else {
                    if (T(cVar, i)) {
                        cVar = N(cVar, i);
                        i0(cVar, i);
                    }
                    a0(N(cVar, i), i);
                    c0(K(cVar, i), i);
                    if (K(cVar, i) != null) {
                        h0(K(cVar, i), i);
                    }
                }
            }
        }
        a0(this.X[i], i);
    }

    public final Object I(Comparable comparable, int i) {
        c Z = Z(comparable, i);
        if (Z != null) {
            Comparable o2 = Z.o(g0(i));
            F(Z);
            return o2;
        }
        return null;
    }

    public final String J(int i) {
        int i2 = this.Y;
        if (i2 == 0) {
            return "{}";
        }
        StringBuffer stringBuffer = new StringBuffer(i2 * 32);
        stringBuffer.append('{');
        f fVar = new f(this, i);
        boolean hasNext = fVar.hasNext();
        while (hasNext) {
            Object next = fVar.next();
            Object value = fVar.getValue();
            if (next == this) {
                next = "(this Map)";
            }
            stringBuffer.append(next);
            stringBuffer.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            stringBuffer.append(value);
            hasNext = fVar.hasNext();
            if (hasNext) {
                stringBuffer.append(C6566gU0.h);
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public final void R(c cVar) throws IllegalArgumentException {
        c cVar2 = this.X[1];
        while (true) {
            int z = z(cVar.o(1), cVar2.o(1));
            if (z != 0) {
                if (z < 0) {
                    if (cVar2.p(1) != null) {
                        cVar2 = cVar2.p(1);
                    } else {
                        cVar2.v(cVar, 1);
                        cVar.w(cVar2, 1);
                        H(cVar, 1);
                        return;
                    }
                } else if (cVar2.r(1) != null) {
                    cVar2 = cVar2.r(1);
                } else {
                    cVar2.y(cVar, 1);
                    cVar.w(cVar2, 1);
                    H(cVar, 1);
                    return;
                }
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Cannot store a duplicate value (\"");
                stringBuffer.append(cVar.o(1));
                stringBuffer.append("\") in this Map");
                throw new IllegalArgumentException(stringBuffer.toString());
            }
        }
    }

    public final c Z(Comparable comparable, int i) {
        c cVar = this.X[i];
        while (cVar != null) {
            int z = z(comparable, cVar.o(i));
            if (z == 0) {
                return cVar;
            }
            cVar = z < 0 ? cVar.p(i) : cVar.r(i);
        }
        return null;
    }

    @Override // o.InterfaceC5167an
    public Object b0(Object obj) {
        return C((Comparable) obj, 1);
    }

    @Override // o.InterfaceC9612sw1
    public InterfaceC10098uw1 c2() {
        if (isEmpty()) {
            return C7074ib0.X;
        }
        return new f(this, 0);
    }

    @Override // java.util.Map
    public void clear() {
        d0();
        this.Y = 0;
        c[] cVarArr = this.X;
        cVarArr[0] = null;
        cVarArr[1] = null;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        v(obj);
        if (Z((Comparable) obj, 0) == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        y(obj);
        if (Z((Comparable) obj, 1) != null) {
            return true;
        }
        return false;
    }

    public final void d0() {
        this.Z++;
    }

    public final c e0(c cVar, int i) {
        if (cVar == null) {
            return null;
        }
        if (cVar.r(i) == null) {
            c q = cVar.q(i);
            while (true) {
                c cVar2 = q;
                c cVar3 = cVar;
                cVar = cVar2;
                if (cVar == null || cVar3 != cVar.r(i)) {
                    break;
                }
                q = cVar.q(i);
            }
            return cVar;
        }
        return Y(cVar.r(i), i);
    }

    @Override // o.InterfaceC8634ow1
    public InterfaceC8634ow1 e1() {
        if (this.b1 == null) {
            this.b1 = new b(this);
        }
        return this.b1;
    }

    @Override // java.util.Map
    public Set entrySet() {
        if (this.a1 == null) {
            this.a1 = new a(this, 0, 2);
        }
        return this.a1;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return B(obj, 0);
    }

    public final c f0(c cVar, int i) {
        if (cVar == null) {
            return null;
        }
        if (cVar.p(i) == null) {
            c q = cVar.q(i);
            while (true) {
                c cVar2 = q;
                c cVar3 = cVar;
                cVar = cVar2;
                if (cVar == null || cVar3 != cVar.p(i)) {
                    break;
                }
                q = cVar.q(i);
            }
            return cVar;
        }
        return P(cVar.p(i), i);
    }

    @Override // o.InterfaceC9612sw1
    public Object firstKey() {
        if (this.Y != 0) {
            return Y(this.X[0], 0).getKey();
        }
        throw new NoSuchElementException("Map is empty");
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return C((Comparable) obj, 0);
    }

    @Override // o.InterfaceC8634ow1, o.X92
    public InterfaceC5167an h() {
        return e1();
    }

    public final void h0(c cVar, int i) {
        c r = cVar.r(i);
        cVar.y(r.p(i), i);
        if (r.p(i) != null) {
            r.p(i).w(cVar, i);
        }
        r.w(cVar.q(i), i);
        if (cVar.q(i) == null) {
            this.X[i] = r;
        } else if (cVar.q(i).p(i) == cVar) {
            cVar.q(i).v(r, i);
        } else {
            cVar.q(i).y(r, i);
        }
        r.v(cVar, i);
        cVar.w(r, i);
    }

    @Override // java.util.Map
    public int hashCode() {
        return D(0);
    }

    public final void i0(c cVar, int i) {
        c p = cVar.p(i);
        cVar.v(p.r(i), i);
        if (p.r(i) != null) {
            p.r(i).w(cVar, i);
        }
        p.w(cVar.q(i), i);
        if (cVar.q(i) == null) {
            this.X[i] = p;
        } else if (cVar.q(i).r(i) == cVar) {
            cVar.q(i).y(p, i);
        } else {
            cVar.q(i).v(p, i);
        }
        p.y(cVar, i);
        cVar.w(p, i);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (this.Y == 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9612sw1
    public Object j0(Object obj) {
        v(obj);
        c f0 = f0(Z((Comparable) obj, 0), 0);
        if (f0 == null) {
            return null;
        }
        return f0.getKey();
    }

    @Override // java.util.Map
    public Set keySet() {
        if (this.Y0 == null) {
            this.Y0 = new d(this, 0, 0);
        }
        return this.Y0;
    }

    @Override // o.InterfaceC5167an
    public Object l0(Object obj) {
        return I((Comparable) obj, 1);
    }

    @Override // o.InterfaceC9612sw1
    public Object lastKey() {
        if (this.Y != 0) {
            return P(this.X[0], 0).getKey();
        }
        throw new NoSuchElementException("Map is empty");
    }

    public final void m0() {
        d0();
        this.Y--;
    }

    @Override // o.InterfaceC9612sw1
    public Object n0(Object obj) {
        v(obj);
        c e0 = e0(Z((Comparable) obj, 0), 0);
        if (e0 == null) {
            return null;
        }
        return e0.getKey();
    }

    public final void o0(c cVar, c cVar2, int i) {
        boolean z;
        c q = cVar.q(i);
        c p = cVar.p(i);
        c r = cVar.r(i);
        c q2 = cVar2.q(i);
        c p2 = cVar2.p(i);
        c r2 = cVar2.r(i);
        boolean z2 = false;
        if (cVar.q(i) != null && cVar == cVar.q(i).p(i)) {
            z = true;
        } else {
            z = false;
        }
        if (cVar2.q(i) != null && cVar2 == cVar2.q(i).p(i)) {
            z2 = true;
        }
        if (cVar == q2) {
            cVar.w(cVar2, i);
            if (z2) {
                cVar2.v(cVar, i);
                cVar2.y(r, i);
            } else {
                cVar2.y(cVar, i);
                cVar2.v(p, i);
            }
        } else {
            cVar.w(q2, i);
            if (q2 != null) {
                if (z2) {
                    q2.v(cVar, i);
                } else {
                    q2.y(cVar, i);
                }
            }
            cVar2.v(p, i);
            cVar2.y(r, i);
        }
        if (cVar2 == q) {
            cVar2.w(cVar, i);
            if (z) {
                cVar.v(cVar2, i);
                cVar.y(r2, i);
            } else {
                cVar.y(cVar2, i);
                cVar.v(p2, i);
            }
        } else {
            cVar2.w(q, i);
            if (q != null) {
                if (z) {
                    q.v(cVar2, i);
                } else {
                    q.y(cVar2, i);
                }
            }
            cVar.v(p2, i);
            cVar.y(r2, i);
        }
        if (cVar.p(i) != null) {
            cVar.p(i).w(cVar, i);
        }
        if (cVar.r(i) != null) {
            cVar.r(i).w(cVar, i);
        }
        if (cVar2.p(i) != null) {
            cVar2.p(i).w(cVar2, i);
        }
        if (cVar2.r(i) != null) {
            cVar2.r(i).w(cVar2, i);
        }
        cVar.z(cVar2, i);
        c[] cVarArr = this.X;
        c cVar3 = cVarArr[i];
        if (cVar3 == cVar) {
            cVarArr[i] = cVar2;
        } else if (cVar3 == cVar2) {
            cVarArr[i] = cVar;
        }
    }

    @Override // o.InterfaceC5167an, o.XT0
    public V71 p() {
        if (isEmpty()) {
            return C7074ib0.X;
        }
        return new f(this, 0);
    }

    @Override // o.InterfaceC5167an, java.util.Map
    public Object put(Object obj, Object obj2) {
        return E((Comparable) obj, (Comparable) obj2, 0);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return I((Comparable) obj, 0);
    }

    @Override // java.util.Map
    public int size() {
        return this.Y;
    }

    public String toString() {
        return J(0);
    }

    @Override // java.util.Map
    public Collection values() {
        if (this.Z0 == null) {
            this.Z0 = new d(this, 0, 1);
        }
        return this.Z0;
    }

    public C6168eu2(Map map) {
        this.X = new c[2];
        this.Y = 0;
        this.Z = 0;
        this.b1 = null;
        putAll(map);
    }
}
