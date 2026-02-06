package o;

import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.Xg1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4701Xg1 {
    public final InterfaceC7583kh1.b a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public C4701Xg1(InterfaceC7583kh1.b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7 = true;
        if (z4 && !z2) {
            z5 = false;
        } else {
            z5 = true;
        }
        C9542sf.a(z5);
        if (z3 && !z2) {
            z6 = false;
        } else {
            z6 = true;
        }
        C9542sf.a(z6);
        if (z && (z2 || z3 || z4)) {
            z7 = false;
        }
        C9542sf.a(z7);
        this.a = bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public C4701Xg1 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new C4701Xg1(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public C4701Xg1 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new C4701Xg1(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4701Xg1.class == obj.getClass()) {
            C4701Xg1 c4701Xg1 = (C4701Xg1) obj;
            if (this.b == c4701Xg1.b && this.c == c4701Xg1.c && this.d == c4701Xg1.d && this.e == c4701Xg1.e && this.f == c4701Xg1.f && this.g == c4701Xg1.g && this.h == c4701Xg1.h && this.i == c4701Xg1.i && TD2.g(this.a, c4701Xg1.a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.a.hashCode()) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
