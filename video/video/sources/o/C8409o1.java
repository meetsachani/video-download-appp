package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import o.U0;

/* renamed from: o.o1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8409o1 extends U0 implements InterfaceC9612sw1 {
    public transient c o1;

    /* renamed from: o.o1$a */
    /* loaded from: classes4.dex */
    public static class a extends d {
        public a(C8409o1 c8409o1) {
            super(c8409o1);
        }

        @Override // java.util.Iterator
        public Object next() {
            return super.c();
        }

        @Override // o.InterfaceC9127qw1
        public Object previous() {
            return super.d();
        }
    }

    /* renamed from: o.o1$b */
    /* loaded from: classes4.dex */
    public static class b extends a {
        public b(C8409o1 c8409o1) {
            super(c8409o1);
        }

        @Override // o.C8409o1.a, java.util.Iterator
        public Object next() {
            return super.c().getKey();
        }

        @Override // o.C8409o1.a, o.InterfaceC9127qw1
        public Object previous() {
            return super.d().getKey();
        }
    }

    /* renamed from: o.o1$c */
    /* loaded from: classes4.dex */
    public static class c extends U0.c {
        public c Z0;
        public c a1;

        public c(U0.c cVar, int i, Object obj, Object obj2) {
            super(cVar, i, obj, obj2);
        }
    }

    /* renamed from: o.o1$d */
    /* loaded from: classes4.dex */
    public static abstract class d implements InterfaceC9127qw1, NS1 {
        public final C8409o1 X;
        public c Y;
        public int Y0;
        public c Z;

        public d(C8409o1 c8409o1) {
            this.X = c8409o1;
            this.Z = c8409o1.o1.a1;
            this.Y0 = c8409o1.Z0;
        }

        public c b() {
            return this.Y;
        }

        public c c() {
            C8409o1 c8409o1 = this.X;
            if (c8409o1.Z0 == this.Y0) {
                c cVar = this.Z;
                if (cVar != c8409o1.o1) {
                    this.Y = cVar;
                    this.Z = cVar.a1;
                    return cVar;
                }
                throw new NoSuchElementException("No next() entry in the iteration");
            }
            throw new ConcurrentModificationException();
        }

        public c d() {
            C8409o1 c8409o1 = this.X;
            if (c8409o1.Z0 == this.Y0) {
                c cVar = this.Z.Z0;
                if (cVar != c8409o1.o1) {
                    this.Z = cVar;
                    this.Y = cVar;
                    return cVar;
                }
                throw new NoSuchElementException("No previous() entry in the iteration");
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Z != this.X.o1) {
                return true;
            }
            return false;
        }

        @Override // o.InterfaceC9127qw1
        public boolean hasPrevious() {
            if (this.Z.Z0 != this.X.o1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            c cVar = this.Y;
            if (cVar != null) {
                C8409o1 c8409o1 = this.X;
                if (c8409o1.Z0 == this.Y0) {
                    c8409o1.remove(cVar.getKey());
                    this.Y = null;
                    this.Y0 = this.X.Z0;
                    return;
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException("remove() can only be called once after next()");
        }

        @Override // o.NS1
        public void reset() {
            this.Y = null;
            this.Z = this.X.o1.a1;
        }

        public String toString() {
            if (this.Y != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Iterator[");
                stringBuffer.append(this.Y.getKey());
                stringBuffer.append("=");
                stringBuffer.append(this.Y.getValue());
                stringBuffer.append(C6566gU0.g);
                return stringBuffer.toString();
            }
            return "Iterator[]";
        }
    }

    /* renamed from: o.o1$e */
    /* loaded from: classes4.dex */
    public static class e extends d implements InterfaceC10098uw1 {
        public e(C8409o1 c8409o1) {
            super(c8409o1);
        }

        @Override // o.V71
        public Object getKey() {
            c b = b();
            if (b != null) {
                return b.getKey();
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // o.V71
        public Object getValue() {
            c b = b();
            if (b != null) {
                return b.getValue();
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // java.util.Iterator, o.V71
        public Object next() {
            return super.c().getKey();
        }

        @Override // o.InterfaceC9127qw1
        public Object previous() {
            return super.d().getKey();
        }

        @Override // o.V71
        public Object setValue(Object obj) {
            c b = b();
            if (b != null) {
                return b.setValue(obj);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }
    }

    /* renamed from: o.o1$f */
    /* loaded from: classes4.dex */
    public static class f extends d {
        public f(C8409o1 c8409o1) {
            super(c8409o1);
        }

        @Override // java.util.Iterator
        public Object next() {
            return super.c().getValue();
        }

        @Override // o.InterfaceC9127qw1
        public Object previous() {
            return super.d().getValue();
        }
    }

    public C8409o1() {
    }

    @Override // o.U0
    public void A() {
        c cVar = (c) i(null, -1, null, null);
        this.o1 = cVar;
        cVar.a1 = cVar;
        cVar.Z0 = cVar;
    }

    @Override // o.U0
    public void D(U0.c cVar, int i, U0.c cVar2) {
        c cVar3 = (c) cVar;
        c cVar4 = cVar3.Z0;
        cVar4.a1 = cVar3.a1;
        cVar3.a1.Z0 = cVar4;
        cVar3.a1 = null;
        cVar3.Z0 = null;
        super.D(cVar, i, cVar2);
    }

    public c H(c cVar) {
        return cVar.a1;
    }

    public c I(c cVar) {
        return cVar.Z0;
    }

    public c J(int i) {
        if (i >= 0) {
            int i2 = this.Y;
            if (i < i2) {
                if (i < i2 / 2) {
                    c cVar = this.o1.a1;
                    for (int i3 = 0; i3 < i; i3++) {
                        cVar = cVar.a1;
                    }
                    return cVar;
                }
                c cVar2 = this.o1;
                while (i2 > i) {
                    cVar2 = cVar2.Z0;
                    i2--;
                }
                return cVar2;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Index ");
            stringBuffer.append(i);
            stringBuffer.append(" is invalid for size ");
            stringBuffer.append(this.Y);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Index ");
        stringBuffer2.append(i);
        stringBuffer2.append(" is less than zero");
        throw new IndexOutOfBoundsException(stringBuffer2.toString());
    }

    @Override // o.U0
    public void b(U0.c cVar, int i) {
        c cVar2 = (c) cVar;
        c cVar3 = this.o1;
        cVar2.a1 = cVar3;
        cVar2.Z0 = cVar3.Z0;
        cVar3.Z0.a1 = cVar2;
        cVar3.Z0 = cVar2;
        this.Z[i] = cVar;
    }

    @Override // o.InterfaceC9612sw1
    public InterfaceC10098uw1 c2() {
        if (this.Y == 0) {
            return C7074ib0.X;
        }
        return new e(this);
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        c cVar = this.o1;
        cVar.a1 = cVar;
        cVar.Z0 = cVar;
    }

    @Override // o.U0, java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            c cVar = this.o1;
            do {
                cVar = cVar.a1;
                if (cVar == this.o1) {
                    return false;
                }
            } while (cVar.getValue() != null);
            return true;
        }
        c cVar2 = this.o1;
        do {
            cVar2 = cVar2.a1;
            if (cVar2 == this.o1) {
                return false;
            }
        } while (!C(obj, cVar2.getValue()));
        return true;
    }

    @Override // o.InterfaceC9612sw1
    public Object firstKey() {
        if (this.Y != 0) {
            return this.o1.a1.getKey();
        }
        throw new NoSuchElementException("Map is empty");
    }

    @Override // o.U0
    public U0.c i(U0.c cVar, int i, Object obj, Object obj2) {
        return new c(cVar, i, obj, obj2);
    }

    @Override // o.U0
    public Iterator j() {
        if (size() == 0) {
            return C6588gb0.X;
        }
        return new a(this);
    }

    @Override // o.InterfaceC9612sw1
    public Object j0(Object obj) {
        c cVar;
        c cVar2 = (c) x(obj);
        if (cVar2 != null && (cVar = cVar2.Z0) != this.o1) {
            return cVar.getKey();
        }
        return null;
    }

    @Override // o.U0
    public Iterator k() {
        if (size() == 0) {
            return C6588gb0.X;
        }
        return new b(this);
    }

    @Override // o.U0
    public Iterator l() {
        if (size() == 0) {
            return C6588gb0.X;
        }
        return new f(this);
    }

    @Override // o.InterfaceC9612sw1
    public Object lastKey() {
        if (this.Y != 0) {
            return this.o1.Z0.getKey();
        }
        throw new NoSuchElementException("Map is empty");
    }

    @Override // o.InterfaceC9612sw1
    public Object n0(Object obj) {
        c cVar;
        c cVar2 = (c) x(obj);
        if (cVar2 != null && (cVar = cVar2.a1) != this.o1) {
            return cVar.getKey();
        }
        return null;
    }

    @Override // o.U0, o.XT0
    public V71 p() {
        if (this.Y == 0) {
            return C7074ib0.X;
        }
        return new e(this);
    }

    public C8409o1(int i, float f2, int i2) {
        super(i, f2, i2);
    }

    public C8409o1(int i) {
        super(i);
    }

    public C8409o1(int i, float f2) {
        super(i, f2);
    }

    public C8409o1(Map map) {
        super(map);
    }
}
