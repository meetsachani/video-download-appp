package o;

import com.facebook.C2381j;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import o.C2565Bm1;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.mu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8140mu2<E> extends AbstractC8174n3<E> implements Serializable {
    @InterfaceC11149zF0
    private static final long serialVersionUID = 1;
    public final transient g<f<E>> Z0;
    public final transient GC0<E> a1;
    public final transient f<E> b1;

    /* renamed from: o.mu2$a */
    /* loaded from: classes3.dex */
    public class a extends C2565Bm1.f<E> {
        public final /* synthetic */ f X;

        public a(f fVar) {
            this.X = fVar;
        }

        @Override // o.InterfaceC2467Am1.a
        @InterfaceC7894ly1
        public E a() {
            return (E) this.X.x();
        }

        @Override // o.InterfaceC2467Am1.a
        public int getCount() {
            int w = this.X.w();
            if (w == 0) {
                return C8140mu2.this.w4(a());
            }
            return w;
        }
    }

    /* renamed from: o.mu2$b */
    /* loaded from: classes3.dex */
    public class b implements Iterator<InterfaceC2467Am1.a<E>> {
        @MB
        public f<E> X;
        @MB
        public InterfaceC2467Am1.a<E> Y;

        public b() {
            this.X = C8140mu2.this.V();
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public InterfaceC2467Am1.a<E> next() {
            if (hasNext()) {
                C8140mu2 c8140mu2 = C8140mu2.this;
                f<E> fVar = this.X;
                Objects.requireNonNull(fVar);
                InterfaceC2467Am1.a<E> b0 = c8140mu2.b0(fVar);
                this.Y = b0;
                if (this.X.L() == C8140mu2.this.b1) {
                    this.X = null;
                    return b0;
                }
                this.X = this.X.L();
                return b0;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X == null) {
                return false;
            }
            if (C8140mu2.this.a1.p(this.X.x())) {
                this.X = null;
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.Y != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.h0(z, "no calls to next() since the last call to remove()");
            C8140mu2.this.R(this.Y.a(), 0);
            this.Y = null;
        }
    }

    /* renamed from: o.mu2$c */
    /* loaded from: classes3.dex */
    public class c implements Iterator<InterfaceC2467Am1.a<E>> {
        @MB
        public f<E> X;
        @MB
        public InterfaceC2467Am1.a<E> Y = null;

        public c() {
            this.X = C8140mu2.this.X();
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public InterfaceC2467Am1.a<E> next() {
            if (hasNext()) {
                Objects.requireNonNull(this.X);
                InterfaceC2467Am1.a<E> b0 = C8140mu2.this.b0(this.X);
                this.Y = b0;
                if (this.X.z() == C8140mu2.this.b1) {
                    this.X = null;
                    return b0;
                }
                this.X = this.X.z();
                return b0;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X == null) {
                return false;
            }
            if (C8140mu2.this.a1.q(this.X.x())) {
                this.X = null;
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.Y != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.h0(z, "no calls to next() since the last call to remove()");
            C8140mu2.this.R(this.Y.a(), 0);
            this.Y = null;
        }
    }

    /* renamed from: o.mu2$d */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC6886hp.values().length];
            a = iArr;
            try {
                iArr[EnumC6886hp.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC6886hp.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.mu2$e */
    /* loaded from: classes3.dex */
    public static abstract class e {
        public static final e X = new a("SIZE", 0);
        public static final e Y = new b("DISTINCT", 1);
        public static final /* synthetic */ e[] Z = e();

        /* renamed from: o.mu2$e$a */
        /* loaded from: classes3.dex */
        public enum a extends e {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.C8140mu2.e
            public int g(f<?> fVar) {
                return fVar.b;
            }

            @Override // o.C8140mu2.e
            public long h(@MB f<?> fVar) {
                if (fVar != null) {
                    return fVar.d;
                }
                return 0L;
            }
        }

        /* renamed from: o.mu2$e$b */
        /* loaded from: classes3.dex */
        public enum b extends e {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // o.C8140mu2.e
            public int g(f<?> fVar) {
                return 1;
            }

            @Override // o.C8140mu2.e
            public long h(@MB f<?> fVar) {
                if (fVar == null) {
                    return 0L;
                }
                return fVar.c;
            }
        }

        public e(String str, int i) {
        }

        public static /* synthetic */ e[] e() {
            return new e[]{X, Y};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) Z.clone();
        }

        public abstract int g(f<?> fVar);

        public abstract long h(@MB f<?> fVar);

        public /* synthetic */ e(String str, int i, a aVar) {
            this(str, i);
        }
    }

    /* renamed from: o.mu2$g */
    /* loaded from: classes3.dex */
    public static final class g<T> {
        @MB
        public T a;

        public g() {
        }

        public void a(@MB T t, @MB T t2) {
            if (this.a == t) {
                this.a = t2;
                return;
            }
            throw new ConcurrentModificationException();
        }

        public void b() {
            this.a = null;
        }

        @MB
        public T c() {
            return this.a;
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public C8140mu2(g<f<E>> gVar, GC0<E> gc0, f<E> fVar) {
        super(gc0.b());
        this.Z0 = gVar;
        this.a1 = gc0;
        this.b1 = fVar;
    }

    public static <E extends Comparable> C8140mu2<E> L() {
        return new C8140mu2<>(AbstractC10587ww1.z());
    }

    public static <E extends Comparable> C8140mu2<E> M(Iterable<? extends E> iterable) {
        C8140mu2<E> L = L();
        C5098aU0.a(L, iterable);
        return L;
    }

    public static <E> C8140mu2<E> Q(@MB Comparator<? super E> comparator) {
        if (comparator == null) {
            return new C8140mu2<>(AbstractC10587ww1.z());
        }
        return new C8140mu2<>(comparator);
    }

    public static int U(@MB f<?> fVar) {
        if (fVar != null) {
            return fVar.c;
        }
        return 0;
    }

    public static <T> void Y(f<T> fVar, f<T> fVar2) {
        fVar.i = fVar2;
        fVar2.h = fVar;
    }

    public static <T> void a0(f<T> fVar, f<T> fVar2, f<T> fVar3) {
        Y(fVar, fVar2);
        Y(fVar2, fVar3);
    }

    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        C9634t12.a(AbstractC8174n3.class, "comparator").b(this, comparator);
        C9634t12.a(C8140mu2.class, V12.q).b(this, GC0.a(comparator));
        C9634t12.a(C8140mu2.class, "rootReference").b(this, new g(null));
        f fVar = new f();
        C9634t12.a(C8140mu2.class, C2381j.e1).b(this, fVar);
        Y(fVar, fVar);
        C9634t12.f(this, objectInputStream);
    }

    @InterfaceC11149zF0
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(n().comparator());
        C9634t12.k(this, objectOutputStream);
    }

    @Override // o.AbstractC8174n3, o.InterfaceC5603ca2
    public /* bridge */ /* synthetic */ InterfaceC5603ca2 C3() {
        return super.C3();
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> G2(@InterfaceC7894ly1 E e2, EnumC6886hp enumC6886hp) {
        return new C8140mu2(this.Z0, this.a1.l(GC0.r(comparator(), e2, enumC6886hp)), this.b1);
    }

    public final long H(e eVar, @MB f<E> fVar) {
        long h;
        long H;
        if (fVar == null) {
            return 0L;
        }
        int compare = comparator().compare(C2491As1.a(this.a1.i()), fVar.x());
        if (compare > 0) {
            return H(eVar, fVar.g);
        }
        if (compare == 0) {
            int i = d.a[this.a1.h().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return eVar.h(fVar.g);
                }
                throw new AssertionError();
            }
            h = eVar.g(fVar);
            H = eVar.h(fVar.g);
        } else {
            h = eVar.h(fVar.g) + eVar.g(fVar);
            H = H(eVar, fVar.f);
        }
        return h + H;
    }

    public final long J(e eVar, @MB f<E> fVar) {
        long h;
        long J;
        if (fVar == null) {
            return 0L;
        }
        int compare = comparator().compare(C2491As1.a(this.a1.g()), fVar.x());
        if (compare < 0) {
            return J(eVar, fVar.f);
        }
        if (compare == 0) {
            int i = d.a[this.a1.f().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return eVar.h(fVar.f);
                }
                throw new AssertionError();
            }
            h = eVar.g(fVar);
            J = eVar.h(fVar.f);
        } else {
            h = eVar.h(fVar.f) + eVar.g(fVar);
            J = J(eVar, fVar.g);
        }
        return h + J;
    }

    public final long K(e eVar) {
        f<E> c2 = this.Z0.c();
        long h = eVar.h(c2);
        if (this.a1.j()) {
            h -= J(eVar, c2);
        }
        if (this.a1.k()) {
            return h - H(eVar, c2);
        }
        return h;
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public int R(@InterfaceC7894ly1 E e2, int i) {
        C5037aF.b(i, "count");
        boolean z = true;
        if (!this.a1.c(e2)) {
            if (i != 0) {
                z = false;
            }
            C10664xF1.d(z);
            return 0;
        }
        f<E> c2 = this.Z0.c();
        if (c2 == null) {
            if (i > 0) {
                x(e2, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.Z0.a(c2, c2.K(comparator(), e2, i, iArr));
        return iArr[0];
    }

    @MB
    public final f<E> V() {
        f<E> L;
        f<E> c2 = this.Z0.c();
        if (c2 == null) {
            return null;
        }
        if (!this.a1.j()) {
            L = this.b1.L();
        } else {
            Object a2 = C2491As1.a(this.a1.g());
            L = c2.s(comparator(), a2);
            if (L == null) {
                return null;
            }
            if (this.a1.f() == EnumC6886hp.OPEN && comparator().compare(a2, L.x()) == 0) {
                L = L.L();
            }
        }
        if (L == this.b1 || !this.a1.c(L.x())) {
            return null;
        }
        return L;
    }

    @MB
    public final f<E> X() {
        f<E> z;
        f<E> c2 = this.Z0.c();
        if (c2 == null) {
            return null;
        }
        if (!this.a1.k()) {
            z = this.b1.z();
        } else {
            Object a2 = C2491As1.a(this.a1.i());
            z = c2.v(comparator(), a2);
            if (z == null) {
                return null;
            }
            if (this.a1.h() == EnumC6886hp.OPEN && comparator().compare(a2, z.x()) == 0) {
                z = z.z();
            }
        }
        if (z == this.b1 || !this.a1.c(z.x())) {
            return null;
        }
        return z;
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public boolean Y3(@InterfaceC7894ly1 E e2, int i, int i2) {
        C5037aF.b(i2, "newCount");
        C5037aF.b(i, "oldCount");
        C10664xF1.d(this.a1.c(e2));
        f<E> c2 = this.Z0.c();
        if (c2 == null) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                x(e2, i2);
            }
            return true;
        }
        int[] iArr = new int[1];
        this.Z0.a(c2, c2.J(comparator(), e2, i, i2, iArr));
        if (iArr[0] != i) {
            return false;
        }
        return true;
    }

    public final InterfaceC2467Am1.a<E> b0(f<E> fVar) {
        return new a(fVar);
    }

    @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (!this.a1.j() && !this.a1.k()) {
            f<E> L = this.b1.L();
            while (true) {
                f<E> fVar = this.b1;
                if (L != fVar) {
                    f<E> L2 = L.L();
                    L.b = 0;
                    L.f = null;
                    L.g = null;
                    L.h = null;
                    L.i = null;
                    L = L2;
                } else {
                    Y(fVar, fVar);
                    this.Z0.b();
                    return;
                }
            }
        } else {
            C7052iU0.h(i());
        }
    }

    @Override // o.AbstractC8174n3, o.InterfaceC5603ca2, o.Y92
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    public /* bridge */ /* synthetic */ boolean contains(@MB Object obj) {
        return super.contains(obj);
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // o.AbstractC7180j2
    public int f() {
        return C7775lT0.x(K(e.Y));
    }

    @Override // o.AbstractC8174n3, o.InterfaceC5603ca2
    @MB
    public /* bridge */ /* synthetic */ InterfaceC2467Am1.a firstEntry() {
        return super.firstEntry();
    }

    @Override // o.AbstractC7180j2
    public Iterator<E> h() {
        return C2565Bm1.h(i());
    }

    @Override // o.AbstractC7180j2
    public Iterator<InterfaceC2467Am1.a<E>> i() {
        return new b();
    }

    @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
    public Iterator<E> iterator() {
        return C2565Bm1.n(this);
    }

    @Override // o.AbstractC8174n3
    public Iterator<InterfaceC2467Am1.a<E>> l() {
        return new c();
    }

    @Override // o.AbstractC8174n3, o.InterfaceC5603ca2
    @MB
    public /* bridge */ /* synthetic */ InterfaceC2467Am1.a lastEntry() {
        return super.lastEntry();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8174n3, o.InterfaceC5603ca2
    public /* bridge */ /* synthetic */ InterfaceC5603ca2 m3(@InterfaceC7894ly1 Object obj, EnumC6886hp enumC6886hp, @InterfaceC7894ly1 Object obj2, EnumC6886hp enumC6886hp2) {
        return super.m3(obj, enumC6886hp, obj2, enumC6886hp2);
    }

    @Override // o.AbstractC8174n3, o.AbstractC7180j2, o.InterfaceC2467Am1
    public /* bridge */ /* synthetic */ NavigableSet n() {
        return super.n();
    }

    @Override // o.AbstractC8174n3, o.InterfaceC5603ca2
    @MB
    public /* bridge */ /* synthetic */ InterfaceC2467Am1.a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // o.AbstractC8174n3, o.InterfaceC5603ca2
    @MB
    public /* bridge */ /* synthetic */ InterfaceC2467Am1.a pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    public int size() {
        return C7775lT0.x(K(e.X));
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> t3(@InterfaceC7894ly1 E e2, EnumC6886hp enumC6886hp) {
        return new C8140mu2(this.Z0, this.a1.l(GC0.d(comparator(), e2, enumC6886hp)), this.b1);
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public int v(@MB Object obj, int i) {
        C5037aF.b(i, "occurrences");
        if (i == 0) {
            return w4(obj);
        }
        f<E> c2 = this.Z0.c();
        int[] iArr = new int[1];
        try {
            if (this.a1.c(obj) && c2 != null) {
                this.Z0.a(c2, c2.E(comparator(), obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // o.InterfaceC2467Am1
    public int w4(@MB Object obj) {
        try {
            f<E> c2 = this.Z0.c();
            if (this.a1.c(obj) && c2 != null) {
                return c2.t(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public int x(@InterfaceC7894ly1 E e2, int i) {
        C5037aF.b(i, "occurrences");
        if (i == 0) {
            return w4(e2);
        }
        C10664xF1.d(this.a1.c(e2));
        f<E> c2 = this.Z0.c();
        if (c2 == null) {
            comparator().compare(e2, e2);
            f<E> fVar = new f<>(e2, i);
            f<E> fVar2 = this.b1;
            a0(fVar2, fVar, fVar2);
            this.Z0.a(c2, fVar);
            return 0;
        }
        int[] iArr = new int[1];
        this.Z0.a(c2, c2.o(comparator(), e2, i, iArr));
        return iArr[0];
    }

    public C8140mu2(Comparator<? super E> comparator) {
        super(comparator);
        this.a1 = GC0.a(comparator);
        f<E> fVar = new f<>();
        this.b1 = fVar;
        Y(fVar, fVar);
        this.Z0 = new g<>(null);
    }

    /* renamed from: o.mu2$f */
    /* loaded from: classes3.dex */
    public static final class f<E> {
        @MB
        public final E a;
        public int b;
        public int c;
        public long d;
        public int e;
        @MB
        public f<E> f;
        @MB
        public f<E> g;
        @MB
        public f<E> h;
        @MB
        public f<E> i;

        public f(@InterfaceC7894ly1 E e, int i) {
            C10664xF1.d(i > 0);
            this.a = e;
            this.b = i;
            this.d = i;
            this.c = 1;
            this.e = 1;
            this.f = null;
            this.g = null;
        }

        public static long M(@MB f<?> fVar) {
            if (fVar == null) {
                return 0L;
            }
            return fVar.d;
        }

        public static int y(@MB f<?> fVar) {
            if (fVar == null) {
                return 0;
            }
            return fVar.e;
        }

        public final f<E> A() {
            int r = r();
            if (r != -2) {
                if (r != 2) {
                    C();
                    return this;
                }
                Objects.requireNonNull(this.f);
                if (this.f.r() < 0) {
                    this.f = this.f.H();
                }
                return I();
            }
            Objects.requireNonNull(this.g);
            if (this.g.r() > 0) {
                this.g = this.g.I();
            }
            return H();
        }

        public final void B() {
            D();
            C();
        }

        public final void C() {
            this.e = Math.max(y(this.f), y(this.g)) + 1;
        }

        public final void D() {
            this.c = C8140mu2.U(this.f) + 1 + C8140mu2.U(this.g);
            this.d = this.b + M(this.f) + M(this.g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @MB
        public f<E> E(Comparator<? super E> comparator, @InterfaceC7894ly1 E e, int i, int[] iArr) {
            int compare = comparator.compare(e, x());
            if (compare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f = fVar.E(comparator, e, i, iArr);
                int i2 = iArr[0];
                if (i2 > 0) {
                    if (i >= i2) {
                        this.c--;
                        this.d -= i2;
                    } else {
                        this.d -= i;
                    }
                }
                if (i2 == 0) {
                    return this;
                }
                return A();
            } else if (compare > 0) {
                f<E> fVar2 = this.g;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.g = fVar2.E(comparator, e, i, iArr);
                int i3 = iArr[0];
                if (i3 > 0) {
                    if (i >= i3) {
                        this.c--;
                        this.d -= i3;
                    } else {
                        this.d -= i;
                    }
                }
                return A();
            } else {
                int i4 = this.b;
                iArr[0] = i4;
                if (i >= i4) {
                    return u();
                }
                this.b = i4 - i;
                this.d -= i;
                return this;
            }
        }

        @MB
        public final f<E> F(f<E> fVar) {
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                return this.f;
            }
            this.g = fVar2.F(fVar);
            this.c--;
            this.d -= fVar.b;
            return A();
        }

        @MB
        public final f<E> G(f<E> fVar) {
            f<E> fVar2 = this.f;
            if (fVar2 == null) {
                return this.g;
            }
            this.f = fVar2.G(fVar);
            this.c--;
            this.d -= fVar.b;
            return A();
        }

        public final f<E> H() {
            boolean z;
            if (this.g != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.g0(z);
            f<E> fVar = this.g;
            this.g = fVar.f;
            fVar.f = this;
            fVar.d = this.d;
            fVar.c = this.c;
            B();
            fVar.C();
            return fVar;
        }

        public final f<E> I() {
            boolean z;
            if (this.f != null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.g0(z);
            f<E> fVar = this.f;
            this.f = fVar.g;
            fVar.g = this;
            fVar.d = this.d;
            fVar.c = this.c;
            B();
            fVar.C();
            return fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @MB
        public f<E> J(Comparator<? super E> comparator, @InterfaceC7894ly1 E e, int i, int i2, int[] iArr) {
            int compare = comparator.compare(e, x());
            if (compare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        return p(e, i2);
                    }
                } else {
                    this.f = fVar.J(comparator, e, i, i2, iArr);
                    int i3 = iArr[0];
                    if (i3 == i) {
                        if (i2 == 0 && i3 != 0) {
                            this.c--;
                        } else if (i2 > 0 && i3 == 0) {
                            this.c++;
                        }
                        this.d += i2 - i3;
                    }
                    return A();
                }
            } else if (compare > 0) {
                f<E> fVar2 = this.g;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        return q(e, i2);
                    }
                } else {
                    this.g = fVar2.J(comparator, e, i, i2, iArr);
                    int i4 = iArr[0];
                    if (i4 == i) {
                        if (i2 == 0 && i4 != 0) {
                            this.c--;
                        } else if (i2 > 0 && i4 == 0) {
                            this.c++;
                        }
                        this.d += i2 - i4;
                    }
                    return A();
                }
            } else {
                int i5 = this.b;
                iArr[0] = i5;
                if (i == i5) {
                    if (i2 == 0) {
                        return u();
                    }
                    this.d += i2 - i5;
                    this.b = i2;
                }
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @MB
        public f<E> K(Comparator<? super E> comparator, @InterfaceC7894ly1 E e, int i, int[] iArr) {
            int i2;
            int compare = comparator.compare(e, x());
            if (compare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        return p(e, i);
                    }
                } else {
                    this.f = fVar.K(comparator, e, i, iArr);
                    if (i == 0 && iArr[0] != 0) {
                        this.c--;
                    } else if (i > 0 && iArr[0] == 0) {
                        this.c++;
                    }
                    this.d += i - iArr[0];
                    return A();
                }
            } else if (compare > 0) {
                f<E> fVar2 = this.g;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        return q(e, i);
                    }
                } else {
                    this.g = fVar2.K(comparator, e, i, iArr);
                    if (i == 0 && iArr[0] != 0) {
                        this.c--;
                    } else if (i > 0 && iArr[0] == 0) {
                        this.c++;
                    }
                    this.d += i - iArr[0];
                    return A();
                }
            } else {
                iArr[0] = this.b;
                if (i == 0) {
                    return u();
                }
                this.d += i - i2;
                this.b = i;
                return this;
            }
            return this;
        }

        public final f<E> L() {
            f<E> fVar = this.i;
            Objects.requireNonNull(fVar);
            return fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f<E> o(Comparator<? super E> comparator, @InterfaceC7894ly1 E e, int i, int[] iArr) {
            int compare = comparator.compare(e, x());
            boolean z = true;
            if (compare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return p(e, i);
                }
                int i2 = fVar.e;
                f<E> o2 = fVar.o(comparator, e, i, iArr);
                this.f = o2;
                if (iArr[0] == 0) {
                    this.c++;
                }
                this.d += i;
                if (o2.e != i2) {
                    return A();
                }
            } else if (compare > 0) {
                f<E> fVar2 = this.g;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    return q(e, i);
                }
                int i3 = fVar2.e;
                f<E> o3 = fVar2.o(comparator, e, i, iArr);
                this.g = o3;
                if (iArr[0] == 0) {
                    this.c++;
                }
                this.d += i;
                if (o3.e != i3) {
                    return A();
                }
            } else {
                int i4 = this.b;
                iArr[0] = i4;
                long j = i;
                if (i4 + j > 2147483647L) {
                    z = false;
                }
                C10664xF1.d(z);
                this.b += i;
                this.d += j;
                return this;
            }
            return this;
        }

        public final f<E> p(@InterfaceC7894ly1 E e, int i) {
            this.f = new f<>(e, i);
            C8140mu2.a0(z(), this.f, this);
            this.e = Math.max(2, this.e);
            this.c++;
            this.d += i;
            return this;
        }

        public final f<E> q(@InterfaceC7894ly1 E e, int i) {
            f<E> fVar = new f<>(e, i);
            this.g = fVar;
            C8140mu2.a0(this, fVar, L());
            this.e = Math.max(2, this.e);
            this.c++;
            this.d += i;
            return this;
        }

        public final int r() {
            return y(this.f) - y(this.g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @MB
        public final f<E> s(Comparator<? super E> comparator, @InterfaceC7894ly1 E e) {
            int compare = comparator.compare(e, x());
            if (compare < 0) {
                f<E> fVar = this.f;
                if (fVar != null) {
                    return (f) C3743Nk1.a(fVar.s(comparator, e), this);
                }
            } else if (compare != 0) {
                f<E> fVar2 = this.g;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.s(comparator, e);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int t(Comparator<? super E> comparator, @InterfaceC7894ly1 E e) {
            int compare = comparator.compare(e, x());
            if (compare < 0) {
                f<E> fVar = this.f;
                if (fVar == null) {
                    return 0;
                }
                return fVar.t(comparator, e);
            } else if (compare > 0) {
                f<E> fVar2 = this.g;
                if (fVar2 == null) {
                    return 0;
                }
                return fVar2.t(comparator, e);
            } else {
                return this.b;
            }
        }

        public String toString() {
            return C2565Bm1.k(x(), w()).toString();
        }

        @MB
        public final f<E> u() {
            int i = this.b;
            this.b = 0;
            C8140mu2.Y(z(), L());
            f<E> fVar = this.f;
            if (fVar == null) {
                return this.g;
            }
            f<E> fVar2 = this.g;
            if (fVar2 == null) {
                return fVar;
            }
            if (fVar.e >= fVar2.e) {
                f<E> z = z();
                z.f = this.f.F(z);
                z.g = this.g;
                z.c = this.c - 1;
                z.d = this.d - i;
                return z.A();
            }
            f<E> L = L();
            L.g = this.g.G(L);
            L.f = this.f;
            L.c = this.c - 1;
            L.d = this.d - i;
            return L.A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @MB
        public final f<E> v(Comparator<? super E> comparator, @InterfaceC7894ly1 E e) {
            int compare = comparator.compare(e, x());
            if (compare > 0) {
                f<E> fVar = this.g;
                if (fVar != null) {
                    return (f) C3743Nk1.a(fVar.v(comparator, e), this);
                }
            } else if (compare != 0) {
                f<E> fVar2 = this.f;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.v(comparator, e);
            }
            return this;
        }

        public int w() {
            return this.b;
        }

        @InterfaceC7894ly1
        public E x() {
            return (E) C2491As1.a(this.a);
        }

        public final f<E> z() {
            f<E> fVar = this.h;
            Objects.requireNonNull(fVar);
            return fVar;
        }

        public f() {
            this.a = null;
            this.b = 1;
        }
    }
}
