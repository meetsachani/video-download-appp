package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.vP0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10214vP0<T> implements B02<C9485sP0<? extends T>> {
    @NotNull
    public final B02<T> a;

    /* renamed from: o.vP0$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<C9485sP0<? extends T>>, GW0 {
        public final Iterator<T> X;
        public int Y;

        public a(C10214vP0<T> c10214vP0) {
            this.X = c10214vP0.a.iterator();
        }

        public final int b() {
            return this.Y;
        }

        public final Iterator<T> c() {
            return this.X;
        }

        @Override // java.util.Iterator
        /* renamed from: d */
        public C9485sP0<T> next() {
            int i = this.Y;
            this.Y = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            return new C9485sP0<>(i, this.X.next());
        }

        public final void e(int i) {
            this.Y = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10214vP0(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "sequence");
        this.a = b02;
    }

    @Override // o.B02
    @NotNull
    public Iterator<C9485sP0<T>> iterator() {
        return new a(this);
    }
}
