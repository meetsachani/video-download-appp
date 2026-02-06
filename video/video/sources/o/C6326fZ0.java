package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: o.fZ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6326fZ0 extends H2<String> implements InterfaceC6581gZ0, RandomAccess {
    public static final C6326fZ0 Y0;
    public static final InterfaceC6581gZ0 Z0;
    public final List<Object> Z;

    /* renamed from: o.fZ0$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractList<byte[]> implements RandomAccess {
        public final C6326fZ0 X;

        public a(C6326fZ0 c6326fZ0) {
            this.X = c6326fZ0;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public void add(int i, byte[] bArr) {
            this.X.r(i, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e */
        public byte[] get(int i) {
            return this.X.m1(i);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: f */
        public byte[] remove(int i) {
            String remove = this.X.remove(i);
            ((AbstractList) this).modCount++;
            return C6326fZ0.w(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: h */
        public byte[] set(int i, byte[] bArr) {
            Object M = this.X.M(i, bArr);
            ((AbstractList) this).modCount++;
            return C6326fZ0.w(M);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.size();
        }
    }

    /* renamed from: o.fZ0$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractList<AbstractC8616os> implements RandomAccess {
        public final C6326fZ0 X;

        public b(C6326fZ0 c6326fZ0) {
            this.X = c6326fZ0;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public void add(int i, AbstractC8616os abstractC8616os) {
            this.X.p(i, abstractC8616os);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e */
        public AbstractC8616os get(int i) {
            return this.X.n2(i);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: f */
        public AbstractC8616os remove(int i) {
            String remove = this.X.remove(i);
            ((AbstractList) this).modCount++;
            return C6326fZ0.B(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: h */
        public AbstractC8616os set(int i, AbstractC8616os abstractC8616os) {
            Object L = this.X.L(i, abstractC8616os);
            ((AbstractList) this).modCount++;
            return C6326fZ0.B(L);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.size();
        }
    }

    static {
        C6326fZ0 c6326fZ0 = new C6326fZ0();
        Y0 = c6326fZ0;
        c6326fZ0.M0();
        Z0 = c6326fZ0;
    }

    public C6326fZ0() {
        this(10);
    }

    public static AbstractC8616os B(Object obj) {
        if (obj instanceof AbstractC8616os) {
            return (AbstractC8616os) obj;
        }
        if (obj instanceof String) {
            return AbstractC8616os.H((String) obj);
        }
        return AbstractC8616os.F((byte[]) obj);
    }

    public static String D(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC8616os) {
            return ((AbstractC8616os) obj).B0();
        }
        return C9740tS0.z((byte[]) obj);
    }

    public static C6326fZ0 F() {
        return Y0;
    }

    public static byte[] w(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return C9740tS0.y((String) obj);
        }
        return ((AbstractC8616os) obj).v0();
    }

    @Override // o.InterfaceC6581gZ0
    public void A2(int i, AbstractC8616os abstractC8616os) {
        L(i, abstractC8616os);
    }

    @Override // o.InterfaceC6581gZ0
    public List<?> D1() {
        return Collections.unmodifiableList(this.Z);
    }

    @Override // o.InterfaceC6581gZ0
    public void E3(AbstractC8616os abstractC8616os) {
        d();
        this.Z.add(abstractC8616os);
        ((AbstractList) this).modCount++;
    }

    @Override // o.InterfaceC6581gZ0
    public void E4(InterfaceC6581gZ0 interfaceC6581gZ0) {
        d();
        for (Object obj : interfaceC6581gZ0.D1()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.Z.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.Z.add(obj);
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: G */
    public String get(int i) {
        Object obj = this.Z.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC8616os) {
            AbstractC8616os abstractC8616os = (AbstractC8616os) obj;
            String B0 = abstractC8616os.B0();
            if (abstractC8616os.Y()) {
                this.Z.set(i, B0);
            }
            return B0;
        }
        byte[] bArr = (byte[]) obj;
        String z = C9740tS0.z(bArr);
        if (C9740tS0.u(bArr)) {
            this.Z.set(i, z);
        }
        return z;
    }

    @Override // o.C9740tS0.k, o.C9740tS0.i
    /* renamed from: H */
    public C6326fZ0 o(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.Z);
            return new C6326fZ0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: J */
    public String remove(int i) {
        d();
        Object remove = this.Z.remove(i);
        ((AbstractList) this).modCount++;
        return D(remove);
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: K */
    public String set(int i, String str) {
        d();
        return D(this.Z.set(i, str));
    }

    public final Object L(int i, AbstractC8616os abstractC8616os) {
        d();
        return this.Z.set(i, abstractC8616os);
    }

    public final Object M(int i, byte[] bArr) {
        d();
        return this.Z.set(i, bArr);
    }

    @Override // o.InterfaceC6581gZ0
    public List<byte[]> O1() {
        return new a(this);
    }

    @Override // o.InterfaceC6581gZ0
    public void P(byte[] bArr) {
        d();
        this.Z.add(bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // o.H2, o.C9740tS0.k
    public /* bridge */ /* synthetic */ boolean X2() {
        return super.X2();
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // o.H2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        d();
        this.Z.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // o.InterfaceC6581gZ0
    public InterfaceC6581gZ0 e5() {
        if (X2()) {
            return new C6492gB2(this);
        }
        return this;
    }

    @Override // o.H2, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // o.H2, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    /* renamed from: l */
    public void add(int i, String str) {
        d();
        this.Z.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // o.InterfaceC6581gZ0
    public void l4(int i, byte[] bArr) {
        M(i, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC6581gZ0
    public byte[] m1(int i) {
        Object obj = this.Z.get(i);
        byte[] w = w(obj);
        if (w != obj) {
            this.Z.set(i, w);
        }
        return w;
    }

    @Override // o.InterfaceC6581gZ0
    public AbstractC8616os n2(int i) {
        Object obj = this.Z.get(i);
        AbstractC8616os B = B(obj);
        if (B != obj) {
            this.Z.set(i, B);
        }
        return B;
    }

    public final void p(int i, AbstractC8616os abstractC8616os) {
        d();
        this.Z.add(i, abstractC8616os);
        ((AbstractList) this).modCount++;
    }

    public final void r(int i, byte[] bArr) {
        d();
        this.Z.add(i, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.Z.size();
    }

    @Override // o.InterfaceC6581gZ0
    public boolean t1(Collection<byte[]> collection) {
        d();
        boolean addAll = this.Z.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // o.InterfaceC6581gZ0
    public boolean t4(Collection<? extends AbstractC8616os> collection) {
        d();
        boolean addAll = this.Z.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // o.InterfaceC5302bK1
    public List<AbstractC8616os> u2() {
        return new b(this);
    }

    @Override // o.InterfaceC6581gZ0
    public Object w5(int i) {
        return this.Z.get(i);
    }

    public C6326fZ0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // o.H2, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        d();
        if (collection instanceof InterfaceC6581gZ0) {
            collection = ((InterfaceC6581gZ0) collection).D1();
        }
        boolean addAll = this.Z.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // o.H2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C6326fZ0(InterfaceC6581gZ0 interfaceC6581gZ0) {
        this.Z = new ArrayList(interfaceC6581gZ0.size());
        addAll(interfaceC6581gZ0);
    }

    public C6326fZ0(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    public C6326fZ0(ArrayList<Object> arrayList) {
        this.Z = arrayList;
    }
}
