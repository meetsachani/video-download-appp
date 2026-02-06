package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import o.C2565Bm1;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.Nd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3714Nd0<E extends Enum<E>> extends AbstractC7180j2<E> implements Serializable {
    @InterfaceC11149zF0
    private static final long serialVersionUID = 0;
    public transient E[] Y0;
    public transient Class<E> Z;
    public transient int[] Z0;
    public transient int a1;
    public transient long b1;

    /* renamed from: o.Nd0$a */
    /* loaded from: classes3.dex */
    public class a extends C3714Nd0<E>.c<E> {
        public a() {
            super();
        }

        @Override // o.C3714Nd0.c
        /* renamed from: c */
        public E b(int i) {
            return (E) C3714Nd0.this.Y0[i];
        }
    }

    /* renamed from: o.Nd0$b */
    /* loaded from: classes3.dex */
    public class b extends C3714Nd0<E>.c<InterfaceC2467Am1.a<E>> {

        /* renamed from: o.Nd0$b$a */
        /* loaded from: classes3.dex */
        public class a extends C2565Bm1.f<E> {
            public final /* synthetic */ int X;

            public a(int i) {
                this.X = i;
            }

            @Override // o.InterfaceC2467Am1.a
            /* renamed from: b */
            public E a() {
                return (E) C3714Nd0.this.Y0[this.X];
            }

            @Override // o.InterfaceC2467Am1.a
            public int getCount() {
                return C3714Nd0.this.Z0[this.X];
            }
        }

        public b() {
            super();
        }

        @Override // o.C3714Nd0.c
        /* renamed from: c */
        public InterfaceC2467Am1.a<E> b(int i) {
            return new a(i);
        }
    }

    /* renamed from: o.Nd0$c */
    /* loaded from: classes3.dex */
    public abstract class c<T> implements Iterator<T> {
        public int X = 0;
        public int Y = -1;

        public c() {
        }

        public abstract T b(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.X < C3714Nd0.this.Y0.length) {
                int[] iArr = C3714Nd0.this.Z0;
                int i = this.X;
                if (iArr[i] > 0) {
                    return true;
                }
                this.X = i + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T b = b(this.X);
                int i = this.X;
                this.Y = i;
                this.X = i + 1;
                return b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            C3714Nd0 c3714Nd0;
            if (this.Y >= 0) {
                z = true;
            } else {
                z = false;
            }
            C5037aF.e(z);
            if (C3714Nd0.this.Z0[this.Y] > 0) {
                C3714Nd0.l(C3714Nd0.this);
                C3714Nd0.p(C3714Nd0.this, c3714Nd0.Z0[this.Y]);
                C3714Nd0.this.Z0[this.Y] = 0;
            }
            this.Y = -1;
        }
    }

    public C3714Nd0(Class<E> cls) {
        this.Z = cls;
        C10664xF1.d(cls.isEnum());
        E[] enumConstants = cls.getEnumConstants();
        this.Y0 = enumConstants;
        this.Z0 = new int[enumConstants.length];
    }

    public static <E extends Enum<E>> C3714Nd0<E> B(Class<E> cls) {
        return new C3714Nd0<>(cls);
    }

    public static <E extends Enum<E>> C3714Nd0<E> D(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        C10664xF1.e(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        C3714Nd0<E> c3714Nd0 = new C3714Nd0<>(it.next().getDeclaringClass());
        C5098aU0.a(c3714Nd0, iterable);
        return c3714Nd0;
    }

    public static <E extends Enum<E>> C3714Nd0<E> F(Iterable<E> iterable, Class<E> cls) {
        C3714Nd0<E> B = B(cls);
        C5098aU0.a(B, iterable);
        return B;
    }

    public static /* synthetic */ int l(C3714Nd0 c3714Nd0) {
        int i = c3714Nd0.a1;
        c3714Nd0.a1 = i - 1;
        return i;
    }

    public static /* synthetic */ long p(C3714Nd0 c3714Nd0, long j) {
        long j2 = c3714Nd0.b1 - j;
        c3714Nd0.b1 = j2;
        return j2;
    }

    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.Z = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.Y0 = enumConstants;
        this.Z0 = new int[enumConstants.length];
        C9634t12.f(this, objectInputStream);
    }

    @InterfaceC11149zF0
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.Z);
        C9634t12.k(this, objectOutputStream);
    }

    public final boolean G(@MB Object obj) {
        if (obj instanceof Enum) {
            Enum r5 = (Enum) obj;
            int ordinal = r5.ordinal();
            E[] eArr = this.Y0;
            if (ordinal < eArr.length && eArr[ordinal] == r5) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    /* renamed from: H */
    public int R(E e, int i) {
        w(e);
        C5037aF.b(i, "count");
        int ordinal = e.ordinal();
        int[] iArr = this.Z0;
        int i2 = iArr[ordinal];
        iArr[ordinal] = i;
        this.b1 += i - i2;
        if (i2 == 0 && i > 0) {
            this.a1++;
            return i2;
        }
        if (i2 > 0 && i == 0) {
            this.a1--;
        }
        return i2;
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean Y3(@InterfaceC7894ly1 Object obj, int i, int i2) {
        return super.Y3(obj, i, i2);
    }

    @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.Z0, 0);
        this.b1 = 0L;
        this.a1 = 0;
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
        return this.a1;
    }

    @Override // o.AbstractC7180j2
    public Iterator<E> h() {
        return new a();
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

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    public /* bridge */ /* synthetic */ Set n() {
        return super.n();
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    /* renamed from: r */
    public int x(E e, int i) {
        boolean z;
        w(e);
        C5037aF.b(i, "occurrences");
        if (i == 0) {
            return w4(e);
        }
        int ordinal = e.ordinal();
        int i2 = this.Z0[ordinal];
        long j = i;
        long j2 = i2 + j;
        if (j2 <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "too many occurrences: %s", j2);
        this.Z0[ordinal] = (int) j2;
        if (i2 == 0) {
            this.a1++;
        }
        this.b1 += j;
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    public int size() {
        return C7775lT0.x(this.b1);
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    @InterfaceC6181ey
    public int v(@MB Object obj, int i) {
        if (obj == null || !G(obj)) {
            return 0;
        }
        Enum r1 = (Enum) obj;
        C5037aF.b(i, "occurrences");
        if (i == 0) {
            return w4(obj);
        }
        int ordinal = r1.ordinal();
        int[] iArr = this.Z0;
        int i2 = iArr[ordinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 <= i) {
            iArr[ordinal] = 0;
            this.a1--;
            this.b1 -= i2;
            return i2;
        }
        iArr[ordinal] = i2 - i;
        this.b1 -= i;
        return i2;
    }

    public final void w(Object obj) {
        C10664xF1.E(obj);
        if (G(obj)) {
            return;
        }
        String valueOf = String.valueOf(this.Z);
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + 21 + valueOf2.length());
        sb.append("Expected an ");
        sb.append(valueOf);
        sb.append(" but got ");
        sb.append(valueOf2);
        throw new ClassCastException(sb.toString());
    }

    @Override // o.InterfaceC2467Am1
    public int w4(@MB Object obj) {
        if (obj != null && G(obj)) {
            return this.Z0[((Enum) obj).ordinal()];
        }
        return 0;
    }
}
