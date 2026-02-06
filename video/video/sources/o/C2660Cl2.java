package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Cl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2660Cl2<T> implements B02<T> {
    @NotNull
    public final B02<T> a;
    @NotNull
    public final HA0<T, Boolean> b;

    /* renamed from: o.Cl2$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, GW0 {
        public final Iterator<T> X;
        public int Y = -1;
        public final /* synthetic */ C2660Cl2<T> Y0;
        public T Z;

        public a(C2660Cl2<T> c2660Cl2) {
            this.Y0 = c2660Cl2;
            this.X = c2660Cl2.a.iterator();
        }

        private final void b() {
            if (this.X.hasNext()) {
                T next = this.X.next();
                if (((Boolean) this.Y0.b.invoke(next)).booleanValue()) {
                    this.Y = 1;
                    this.Z = next;
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
    public C2660Cl2(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(b02, "sequence");
        C6562gT0.p(ha0, "predicate");
        this.a = b02;
        this.b = ha0;
    }

    @Override // o.B02
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
