package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
/* renamed from: o.wg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10524wg2<T> implements B02<T>, C70<T> {
    @NotNull
    public final B02<T> a;
    public final int b;
    public final int c;

    /* renamed from: o.wg2$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, GW0 {
        public final Iterator<T> X;
        public int Y;
        public final /* synthetic */ C10524wg2<T> Z;

        public a(C10524wg2<T> c10524wg2) {
            this.Z = c10524wg2;
            this.X = c10524wg2.a.iterator();
        }

        private final void b() {
            while (this.Y < this.Z.b && this.X.hasNext()) {
                this.X.next();
                this.Y++;
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
            if (this.Y < this.Z.c && this.X.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            if (this.Y < this.Z.c) {
                this.Y++;
                return this.X.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10524wg2(@NotNull B02<? extends T> b02, int i, int i2) {
        C6562gT0.p(b02, "sequence");
        this.a = b02;
        this.b = i;
        this.c = i2;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i2 >= i) {
                    return;
                }
                throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
    }

    @Override // o.C70
    @NotNull
    public B02<T> a(int i) {
        if (i >= f()) {
            return U02.l();
        }
        return new C10524wg2(this.a, this.b + i, this.c);
    }

    @Override // o.C70
    @NotNull
    public B02<T> b(int i) {
        if (i >= f()) {
            return this;
        }
        B02<T> b02 = this.a;
        int i2 = this.b;
        return new C10524wg2(b02, i2, i + i2);
    }

    public final int f() {
        return this.c - this.b;
    }

    @Override // o.B02
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
