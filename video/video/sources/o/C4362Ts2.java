package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Ts2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4362Ts2<T, R> implements B02<R> {
    @NotNull
    public final B02<T> a;
    @NotNull
    public final HA0<T, R> b;

    /* renamed from: o.Ts2$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<R>, GW0 {
        public final Iterator<T> X;
        public final /* synthetic */ C4362Ts2<T, R> Y;

        public a(C4362Ts2<T, R> c4362Ts2) {
            this.Y = c4362Ts2;
            this.X = c4362Ts2.a.iterator();
        }

        public final Iterator<T> b() {
            return this.X;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.Y.b.invoke(this.X.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4362Ts2(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(b02, "sequence");
        C6562gT0.p(ha0, "transformer");
        this.a = b02;
        this.b = ha0;
    }

    @NotNull
    public final <E> B02<E> e(@NotNull HA0<? super R, ? extends Iterator<? extends E>> ha0) {
        C6562gT0.p(ha0, "iterator");
        return new C4959Zu0(this.a, this.b, ha0);
    }

    @Override // o.B02
    @NotNull
    public Iterator<R> iterator() {
        return new a(this);
    }
}
