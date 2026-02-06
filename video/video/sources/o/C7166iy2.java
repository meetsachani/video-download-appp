package o;

import o.C11193zQ0;
import org.jetbrains.annotations.NotNull;

@InterfaceC5395bj0
/* renamed from: o.iy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7166iy2 {
    @NotNull
    public static final a h = new a(null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    /* renamed from: o.iy2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C7166iy2 a(@NotNull C11193zQ0 c11193zQ0) {
            long j;
            long j2;
            C6562gT0.p(c11193zQ0, "instant");
            long i = c11193zQ0.i();
            long j3 = i / 86400;
            if ((i ^ 86400) < 0 && j3 * 86400 != i) {
                j3--;
            }
            long j4 = i % 86400;
            int i2 = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
            long j5 = (j3 + ((long) MQ0.f)) - 60;
            if (j5 < 0) {
                j = -1;
                long j6 = (long) MQ0.e;
                long j7 = ((j5 + 1) / j6) - 1;
                j2 = 400 * j7;
                j5 += (-j7) * j6;
            } else {
                j = -1;
                j2 = 0;
            }
            long j8 = 400;
            long j9 = ((j8 * j5) + 591) / ((long) MQ0.e);
            long j10 = 365;
            long j11 = 4;
            long j12 = 100;
            long j13 = j5 - ((((j10 * j9) + (j9 / j11)) - (j9 / j12)) + (j9 / j8));
            if (j13 < 0) {
                j9 += j;
                j13 = j5 - ((((j10 * j9) + (j9 / j11)) - (j9 / j12)) + (j9 / j8));
            }
            long j14 = j9 + j2;
            int i3 = (int) j13;
            int i4 = ((i3 * 5) + 2) / C3503Kz.m0;
            int i5 = i2 / 3600;
            int i6 = i2 - (i5 * 3600);
            int i7 = i6 / 60;
            return new C7166iy2((int) (j14 + (i4 / 10)), ((i4 + 2) % 12) + 1, (i3 - (((i4 * 306) + 5) / 10)) + 1, i5, i7, i6 - (i7 * 60), c11193zQ0.j());
        }

        public a() {
        }
    }

    public C7166iy2(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public final int d() {
        return this.b;
    }

    public final int e() {
        return this.g;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.a;
    }

    @NotNull
    public final C11193zQ0 h(int i) {
        long j;
        int i2;
        int i3 = this.a;
        long j2 = i3;
        long j3 = 365 * j2;
        if (j2 >= 0) {
            j = j3 + (((3 + j2) / 4) - ((99 + j2) / 100)) + ((j2 + 399) / 400);
        } else {
            j = j3 - (((j2 / (-4)) - (j2 / (-100))) + (j2 / (-400)));
        }
        long j4 = j + (((i2 * 367) - 362) / 12) + (this.c - 1);
        if (this.b > 2) {
            long j5 = (-1) + j4;
            if (!MQ0.o(i3)) {
                j4 -= 2;
            } else {
                j4 = j5;
            }
        }
        long j6 = (((j4 - ((long) MQ0.f)) * 86400) + (((this.d * 3600) + (this.e * 60)) + this.f)) - i;
        C11193zQ0.a aVar = C11193zQ0.Z;
        if (j6 >= aVar.h().i() && j6 <= aVar.g().i()) {
            return aVar.b(j6, this.g);
        }
        throw new EQ0("The parsed date is outside the range representable by Instant (Unix epoch second " + j6 + ')');
    }

    @NotNull
    public String toString() {
        return "UnboundLocalDateTime(" + this.a + '-' + this.b + '-' + this.c + ' ' + this.d + ':' + this.e + ':' + this.f + '.' + this.g + ')';
    }
}
