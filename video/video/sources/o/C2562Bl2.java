package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
/* renamed from: o.Bl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2562Bl2<T> implements B02<T>, C70<T> {
    @NotNull
    public final B02<T> a;
    public final int b;

    /* renamed from: o.Bl2$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, GW0 {
        public int X;
        public final Iterator<T> Y;

        public a(C2562Bl2<T> c2562Bl2) {
            this.X = c2562Bl2.b;
            this.Y = c2562Bl2.a.iterator();
        }

        public final Iterator<T> b() {
            return this.Y;
        }

        public final int c() {
            return this.X;
        }

        public final void d(int i) {
            this.X = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X > 0 && this.Y.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.X;
            if (i != 0) {
                this.X = i - 1;
                return this.Y.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2562Bl2(@NotNull B02<? extends T> b02, int i) {
        C6562gT0.p(b02, "sequence");
        this.a = b02;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // o.C70
    @NotNull
    public B02<T> a(int i) {
        int i2 = this.b;
        if (i >= i2) {
            return U02.l();
        }
        return new C10524wg2(this.a, i, i2);
    }

    @Override // o.C70
    @NotNull
    public B02<T> b(int i) {
        if (i >= this.b) {
            return this;
        }
        return new C2562Bl2(this.a, i);
    }

    @Override // o.B02
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
