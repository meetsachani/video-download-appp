package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Ss2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4265Ss2<T, R> implements B02<R> {
    @NotNull
    public final B02<T> a;
    @NotNull
    public final VA0<Integer, T, R> b;

    /* renamed from: o.Ss2$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<R>, GW0 {
        public final Iterator<T> X;
        public int Y;
        public final /* synthetic */ C4265Ss2<T, R> Z;

        public a(C4265Ss2<T, R> c4265Ss2) {
            this.Z = c4265Ss2;
            this.X = c4265Ss2.a.iterator();
        }

        public final int b() {
            return this.Y;
        }

        public final Iterator<T> c() {
            return this.X;
        }

        public final void d(int i) {
            this.Y = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            VA0 va0 = this.Z.b;
            int i = this.Y;
            this.Y = i + 1;
            if (i < 0) {
                C8222nF.Z();
            }
            return (R) va0.i(Integer.valueOf(i), this.X.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4265Ss2(@NotNull B02<? extends T> b02, @NotNull VA0<? super Integer, ? super T, ? extends R> va0) {
        C6562gT0.p(b02, "sequence");
        C6562gT0.p(va0, "transformer");
        this.a = b02;
        this.b = va0;
    }

    @Override // o.B02
    @NotNull
    public Iterator<R> iterator() {
        return new a(this);
    }
}
