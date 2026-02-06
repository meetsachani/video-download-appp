package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
/* renamed from: o.x70  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10631x70<T> implements B02<T>, C70<T> {
    @NotNull
    public final B02<T> a;
    public final int b;

    /* renamed from: o.x70$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, GW0 {
        public final Iterator<T> X;
        public int Y;

        public a(C10631x70<T> c10631x70) {
            this.X = c10631x70.a.iterator();
            this.Y = c10631x70.b;
        }

        public final void b() {
            while (this.Y > 0 && this.X.hasNext()) {
                this.X.next();
                this.Y--;
            }
        }

        public final Iterator<T> c() {
            return this.X;
        }

        public final int d() {
            return this.Y;
        }

        public final void e(int i) {
            this.Y = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            return this.X.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10631x70(@NotNull B02<? extends T> b02, int i) {
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
        int i2 = this.b + i;
        if (i2 < 0) {
            return new C10631x70(this, i);
        }
        return new C10631x70(this.a, i2);
    }

    @Override // o.C70
    @NotNull
    public B02<T> b(int i) {
        int i2 = this.b;
        int i3 = i2 + i;
        if (i3 < 0) {
            return new C2562Bl2(this, i);
        }
        return new C10524wg2(this.a, i2, i3);
    }

    @Override // o.B02
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
