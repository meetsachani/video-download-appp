package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class D70<T> implements B02<T> {
    @NotNull
    public final B02<T> a;
    @NotNull
    public final HA0<T, Boolean> b;

    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, GW0 {
        public final Iterator<T> X;
        public int Y = -1;
        public final /* synthetic */ D70<T> Y0;
        public T Z;

        public a(D70<T> d70) {
            this.Y0 = d70;
            this.X = d70.a.iterator();
        }

        private final void b() {
            while (this.X.hasNext()) {
                T next = this.X.next();
                if (!((Boolean) this.Y0.b.invoke(next)).booleanValue()) {
                    this.Z = next;
                    this.Y = 1;
                    return;
                }
            }
            this.Y = 0;
        }

        public final int c() {
            return this.Y;
        }

        public final Iterator<T> d() {
            return this.X;
        }

        public final T e() {
            return this.Z;
        }

        public final void f(int i) {
            this.Y = i;
        }

        public final void g(T t) {
            this.Z = t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y == -1) {
                b();
            }
            if (this.Y == 1 || this.X.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.Y == -1) {
                b();
            }
            if (this.Y == 1) {
                T t = this.Z;
                this.Z = null;
                this.Y = 0;
                return t;
            }
            return this.X.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D70(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, Boolean> ha0) {
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
