package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Ci1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2647Ci1<T1, T2, V> implements B02<V> {
    @NotNull
    public final B02<T1> a;
    @NotNull
    public final B02<T2> b;
    @NotNull
    public final VA0<T1, T2, V> c;

    /* renamed from: o.Ci1$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<V>, GW0 {
        public final Iterator<T1> X;
        public final Iterator<T2> Y;
        public final /* synthetic */ C2647Ci1<T1, T2, V> Z;

        public a(C2647Ci1<T1, T2, V> c2647Ci1) {
            this.Z = c2647Ci1;
            this.X = c2647Ci1.a.iterator();
            this.Y = c2647Ci1.b.iterator();
        }

        public final Iterator<T1> b() {
            return this.X;
        }

        public final Iterator<T2> c() {
            return this.Y;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X.hasNext() && this.Y.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) this.Z.c.i(this.X.next(), this.Y.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2647Ci1(@NotNull B02<? extends T1> b02, @NotNull B02<? extends T2> b022, @NotNull VA0<? super T1, ? super T2, ? extends V> va0) {
        C6562gT0.p(b02, "sequence1");
        C6562gT0.p(b022, "sequence2");
        C6562gT0.p(va0, "transform");
        this.a = b02;
        this.b = b022;
        this.c = va0;
    }

    @Override // o.B02
    @NotNull
    public Iterator<V> iterator() {
        return new a(this);
    }
}
