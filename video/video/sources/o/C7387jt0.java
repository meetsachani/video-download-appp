package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.jt0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7387jt0<T> implements B02<T> {
    @NotNull
    public final B02<T> a;
    public final boolean b;
    @NotNull
    public final HA0<T, Boolean> c;

    /* renamed from: o.jt0$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, GW0 {
        public final Iterator<T> X;
        public int Y = -1;
        public final /* synthetic */ C7387jt0<T> Y0;
        public T Z;

        public a(C7387jt0<T> c7387jt0) {
            this.Y0 = c7387jt0;
            this.X = c7387jt0.a.iterator();
        }

        public final void b() {
            while (this.X.hasNext()) {
                T next = this.X.next();
                if (((Boolean) this.Y0.c.invoke(next)).booleanValue() == this.Y0.b) {
                    this.Z = next;
                    this.Y = 1;
                    return;
                }
            }
            this.Y = 0;
        }

        public final Iterator<T> c() {
            return this.X;
        }

        public final T d() {
            return this.Z;
        }

        public final int e() {
            return this.Y;
        }

        public final void f(T t) {
            this.Z = t;
        }

        public final void g(int i) {
            this.Y = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y == -1) {
                b();
            }
            if (this.Y == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.Y == -1) {
                b();
            }
            if (this.Y != 0) {
                T t = this.Z;
                this.Z = null;
                this.Y = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7387jt0(@NotNull B02<? extends T> b02, boolean z, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "sequence");
        C6562gT0.p(ha0, "predicate");
        this.a = b02;
        this.b = z;
        this.c = ha0;
    }

    @Override // o.B02
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }

    public /* synthetic */ C7387jt0(B02 b02, boolean z, HA0 ha0, int i, C9516sY c9516sY) {
        this(b02, (i & 2) != 0 ? true : z, ha0);
    }
}
