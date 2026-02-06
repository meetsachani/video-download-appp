package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class JC0<T> implements B02<T> {
    @NotNull
    public final FA0<T> a;
    @NotNull
    public final HA0<T, T> b;

    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, GW0 {
        public T X;
        public int Y = -2;
        public final /* synthetic */ JC0<T> Z;

        public a(JC0<T> jc0) {
            this.Z = jc0;
        }

        private final void b() {
            T t;
            int i;
            if (this.Y != -2) {
                HA0 ha0 = this.Z.b;
                T t2 = this.X;
                C6562gT0.m(t2);
                t = (T) ha0.invoke(t2);
            } else {
                t = (T) this.Z.a.invoke();
            }
            this.X = t;
            if (t == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.Y = i;
        }

        public final T c() {
            return this.X;
        }

        public final int d() {
            return this.Y;
        }

        public final void e(T t) {
            this.X = t;
        }

        public final void f(int i) {
            this.Y = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y < 0) {
                b();
            }
            if (this.Y == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.Y < 0) {
                b();
            }
            if (this.Y != 0) {
                T t = this.X;
                C6562gT0.n(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
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
    public JC0(@NotNull FA0<? extends T> fa0, @NotNull HA0<? super T, ? extends T> ha0) {
        C6562gT0.p(fa0, "getInitialValue");
        C6562gT0.p(ha0, "getNextValue");
        this.a = fa0;
        this.b = ha0;
    }

    @Override // o.B02
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
