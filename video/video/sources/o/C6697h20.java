package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.h20  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6697h20 implements B02<C11197zR0> {
    @NotNull
    public final CharSequence a;
    public final int b;
    public final int c;
    @NotNull
    public final VA0<CharSequence, Integer, C4180Rx1<Integer, Integer>> d;

    /* renamed from: o.h20$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<C11197zR0>, GW0 {
        public int X = -1;
        public int Y;
        public C11197zR0 Y0;
        public int Z;
        public int Z0;

        public a() {
            int I = C5075aO1.I(C6697h20.this.b, 0, C6697h20.this.a.length());
            this.Y = I;
            this.Z = I;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
            if (r0 < r6.a1.c) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void b() {
            int i = 0;
            if (this.Z < 0) {
                this.X = 0;
                this.Y0 = null;
                return;
            }
            if (C6697h20.this.c > 0) {
                int i2 = this.Z0 + 1;
                this.Z0 = i2;
            }
            if (this.Z <= C6697h20.this.a.length()) {
                C4180Rx1 c4180Rx1 = (C4180Rx1) C6697h20.this.d.i(C6697h20.this.a, Integer.valueOf(this.Z));
                if (c4180Rx1 == null) {
                    this.Y0 = new C11197zR0(this.Y, C10763xf2.A3(C6697h20.this.a));
                    this.Z = -1;
                } else {
                    int intValue = ((Number) c4180Rx1.a()).intValue();
                    int intValue2 = ((Number) c4180Rx1.b()).intValue();
                    this.Y0 = C5075aO1.W1(this.Y, intValue);
                    int i3 = intValue + intValue2;
                    this.Y = i3;
                    if (intValue2 == 0) {
                        i = 1;
                    }
                    this.Z = i3 + i;
                }
                this.X = 1;
            }
            this.Y0 = new C11197zR0(this.Y, C10763xf2.A3(C6697h20.this.a));
            this.Z = -1;
            this.X = 1;
        }

        public final int c() {
            return this.Z0;
        }

        public final int d() {
            return this.Y;
        }

        public final C11197zR0 e() {
            return this.Y0;
        }

        public final int f() {
            return this.Z;
        }

        public final int g() {
            return this.X;
        }

        @Override // java.util.Iterator
        /* renamed from: h */
        public C11197zR0 next() {
            if (this.X == -1) {
                b();
            }
            if (this.X != 0) {
                C11197zR0 c11197zR0 = this.Y0;
                C6562gT0.n(c11197zR0, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.Y0 = null;
                this.X = -1;
                return c11197zR0;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X == -1) {
                b();
            }
            if (this.X == 1) {
                return true;
            }
            return false;
        }

        public final void i(int i) {
            this.Z0 = i;
        }

        public final void j(int i) {
            this.Y = i;
        }

        public final void k(C11197zR0 c11197zR0) {
            this.Y0 = c11197zR0;
        }

        public final void l(int i) {
            this.Z = i;
        }

        public final void n(int i) {
            this.X = i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6697h20(@NotNull CharSequence charSequence, int i, int i2, @NotNull VA0<? super CharSequence, ? super Integer, C4180Rx1<Integer, Integer>> va0) {
        C6562gT0.p(charSequence, "input");
        C6562gT0.p(va0, "getNextMatch");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = va0;
    }

    @Override // o.B02
    @NotNull
    public Iterator<C11197zR0> iterator() {
        return new a();
    }
}
