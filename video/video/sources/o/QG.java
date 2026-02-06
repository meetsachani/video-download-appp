package o;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public class QG<E> extends AbstractSet<E> implements Serializable {
    @InterfaceC5299bJ2
    public static final double a1 = 0.001d;
    public static final int b1 = 9;
    @MB
    public transient Object X;
    @MB
    public transient int[] Y;
    public transient int Y0;
    @MB
    @InterfaceC5299bJ2
    public transient Object[] Z;
    public transient int Z0;

    /* loaded from: classes3.dex */
    public class a implements Iterator<E> {
        public int X;
        public int Y;
        public int Z = -1;

        public a() {
            this.X = QG.this.Y0;
            this.Y = QG.this.F();
        }

        public final void b() {
            if (QG.this.Y0 == this.X) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public void c() {
            this.X += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @InterfaceC7894ly1
        public E next() {
            b();
            if (hasNext()) {
                int i = this.Y;
                this.Z = i;
                E e = (E) QG.this.B(i);
                this.Y = QG.this.G(this.Y);
                return e;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            b();
            if (this.Z >= 0) {
                z = true;
            } else {
                z = false;
            }
            C5037aF.e(z);
            c();
            QG qg = QG.this;
            qg.remove(qg.B(this.Z));
            this.Y = QG.this.f(this.Y, this.Z);
            this.Z = -1;
        }
    }

    public QG() {
        K(3);
    }

    public static <E> QG<E> j() {
        return new QG<>();
    }

    public static <E> QG<E> k(Collection<? extends E> collection) {
        QG<E> r = r(collection.size());
        r.addAll(collection);
        return r;
    }

    @SafeVarargs
    public static <E> QG<E> l(E... eArr) {
        QG<E> r = r(eArr.length);
        Collections.addAll(r, eArr);
        return r;
    }

    public static <E> QG<E> r(int i) {
        return new QG<>(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            K(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public final E B(int i) {
        return (E) V()[i];
    }

    public final int D(int i) {
        return X()[i];
    }

    public int F() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public int G(int i) {
        int i2 = i + 1;
        if (i2 < this.Z0) {
            return i2;
        }
        return -1;
    }

    public final int H() {
        return (1 << (this.Y0 & 31)) - 1;
    }

    public void J() {
        this.Y0 += 32;
    }

    public void K(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "Expected size must be >= 0");
        this.Y0 = C7775lT0.g(i, 1, 1073741823);
    }

    public void L(int i, @InterfaceC7894ly1 E e, int i2, int i3) {
        f0(i, RG.d(i2, 0, i3));
        e0(i, e);
    }

    @InterfaceC5299bJ2
    public boolean M() {
        if (w() != null) {
            return true;
        }
        return false;
    }

    public void Q(int i, int i2) {
        Object Y = Y();
        int[] X = X();
        Object[] V = V();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj = V[i3];
            V[i] = obj;
            V[i3] = null;
            X[i] = X[i3];
            X[i3] = 0;
            int d = EG0.d(obj) & i2;
            int h = RG.h(Y, d);
            if (h == size) {
                RG.i(Y, d, i + 1);
                return;
            }
            while (true) {
                int i4 = h - 1;
                int i5 = X[i4];
                int c = RG.c(i5, i2);
                if (c == size) {
                    X[i4] = RG.d(i5, i + 1, i2);
                    return;
                }
                h = c;
            }
        } else {
            V[i] = null;
            X[i] = 0;
        }
    }

    @InterfaceC5299bJ2
    public boolean U() {
        if (this.X == null) {
            return true;
        }
        return false;
    }

    public final Object[] V() {
        Object[] objArr = this.Z;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] X() {
        int[] iArr = this.Y;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object Y() {
        Object obj = this.X;
        Objects.requireNonNull(obj);
        return obj;
    }

    public void a0(int i) {
        this.Y = Arrays.copyOf(X(), i);
        this.Z = Arrays.copyOf(V(), i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @InterfaceC6181ey
    public boolean add(@InterfaceC7894ly1 E e) {
        if (U()) {
            h();
        }
        Set<E> w = w();
        if (w != null) {
            return w.add(e);
        }
        int[] X = X();
        Object[] V = V();
        int i = this.Z0;
        int i2 = i + 1;
        int d = EG0.d(e);
        int H = H();
        int i3 = d & H;
        int h = RG.h(Y(), i3);
        if (h == 0) {
            if (i2 > H) {
                H = d0(H, RG.e(H), d, i);
            } else {
                RG.i(Y(), i3, i2);
            }
        } else {
            int b = RG.b(d, H);
            int i4 = 0;
            while (true) {
                int i5 = h - 1;
                int i6 = X[i5];
                if (RG.b(i6, H) == b && C2593Bt1.a(e, V[i5])) {
                    return false;
                }
                int c = RG.c(i6, H);
                i4++;
                if (c == 0) {
                    if (i4 >= 9) {
                        return i().add(e);
                    }
                    if (i2 > H) {
                        H = d0(H, RG.e(H), d, i);
                    } else {
                        X[i5] = RG.d(i6, i2, H);
                    }
                } else {
                    h = c;
                }
            }
        }
        b0(i2);
        L(i, e, d, H);
        this.Z0 = i2;
        J();
        return true;
    }

    public final void b0(int i) {
        int min;
        int length = X().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            a0(min);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (U()) {
            return;
        }
        J();
        Set<E> w = w();
        if (w != null) {
            this.Y0 = C7775lT0.g(size(), 3, 1073741823);
            w.clear();
            this.X = null;
            this.Z0 = 0;
            return;
        }
        Arrays.fill(V(), 0, this.Z0, (Object) null);
        RG.g(Y());
        Arrays.fill(X(), 0, this.Z0, 0);
        this.Z0 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        if (U()) {
            return false;
        }
        Set<E> w = w();
        if (w != null) {
            return w.contains(obj);
        }
        int d = EG0.d(obj);
        int H = H();
        int h = RG.h(Y(), d & H);
        if (h == 0) {
            return false;
        }
        int b = RG.b(d, H);
        do {
            int i = h - 1;
            int D = D(i);
            if (RG.b(D, H) == b && C2593Bt1.a(obj, B(i))) {
                return true;
            }
            h = RG.c(D, H);
        } while (h != 0);
        return false;
    }

    @InterfaceC6181ey
    public final int d0(int i, int i2, int i3, int i4) {
        Object a2 = RG.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            RG.i(a2, i3 & i5, i4 + 1);
        }
        Object Y = Y();
        int[] X = X();
        for (int i6 = 0; i6 <= i; i6++) {
            int h = RG.h(Y, i6);
            while (h != 0) {
                int i7 = h - 1;
                int i8 = X[i7];
                int b = RG.b(i8, i) | i6;
                int i9 = b & i5;
                int h2 = RG.h(a2, i9);
                RG.i(a2, i9, h);
                X[i7] = RG.d(b, h2, i5);
                h = RG.c(i8, i);
            }
        }
        this.X = a2;
        h0(i5);
        return i5;
    }

    public final void e0(int i, E e) {
        V()[i] = e;
    }

    public int f(int i, int i2) {
        return i - 1;
    }

    public final void f0(int i, int i2) {
        X()[i] = i2;
    }

    @InterfaceC6181ey
    public int h() {
        C10664xF1.h0(U(), "Arrays already allocated");
        int i = this.Y0;
        int j = RG.j(i);
        this.X = RG.a(j);
        h0(j - 1);
        this.Y = new int[i];
        this.Z = new Object[i];
        return i;
    }

    public final void h0(int i) {
        this.Y0 = RG.d(this.Y0, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    @InterfaceC6181ey
    @InterfaceC5299bJ2
    public Set<E> i() {
        Set<E> p = p(H() + 1);
        int F = F();
        while (F >= 0) {
            p.add(B(F));
            F = G(F);
        }
        this.X = p;
        this.Y = null;
        this.Z = null;
        J();
        return p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> w = w();
        if (w != null) {
            return w.iterator();
        }
        return new a();
    }

    public void j0() {
        if (!U()) {
            Set<E> w = w();
            if (w != null) {
                Set<E> p = p(size());
                p.addAll(w);
                this.X = p;
                return;
            }
            int i = this.Z0;
            if (i < X().length) {
                a0(i);
            }
            int j = RG.j(i);
            int H = H();
            if (j < H) {
                d0(H, j, 0, 0);
            }
        }
    }

    public final Set<E> p(int i) {
        return new LinkedHashSet(i, 1.0f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @InterfaceC6181ey
    public boolean remove(@MB Object obj) {
        if (U()) {
            return false;
        }
        Set<E> w = w();
        if (w != null) {
            return w.remove(obj);
        }
        int H = H();
        int f = RG.f(obj, null, H, Y(), X(), V(), null);
        if (f == -1) {
            return false;
        }
        Q(f, H);
        this.Z0--;
        J();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> w = w();
        if (w != null) {
            return w.size();
        }
        return this.Z0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (U()) {
            return new Object[0];
        }
        Set<E> w = w();
        return w != null ? w.toArray() : Arrays.copyOf(V(), this.Z0);
    }

    @MB
    @InterfaceC5299bJ2
    public Set<E> w() {
        Object obj = this.X;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public QG(int i) {
        K(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @InterfaceC6181ey
    public <T> T[] toArray(T[] tArr) {
        if (U()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> w = w();
        if (w != null) {
            return (T[]) w.toArray(tArr);
        }
        return (T[]) C5436bt1.n(V(), 0, this.Z0, tArr);
    }
}
