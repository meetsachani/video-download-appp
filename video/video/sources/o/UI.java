package o;

@Deprecated
/* loaded from: classes2.dex */
public class UI implements G02 {
    public final G02[] X;

    public UI(G02[] g02Arr) {
        this.X = g02Arr;
    }

    @Override // o.G02
    public boolean a() {
        for (G02 g02 : this.X) {
            if (g02.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.G02
    public final long c() {
        long j = Long.MAX_VALUE;
        for (G02 g02 : this.X) {
            long c = g02.c();
            if (c != Long.MIN_VALUE) {
                j = Math.min(j, c);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // o.G02
    public boolean d(long j) {
        G02[] g02Arr;
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long c = c();
            if (c == Long.MIN_VALUE) {
                return z3;
            }
            z = false;
            for (G02 g02 : this.X) {
                long c2 = g02.c();
                if (c2 != Long.MIN_VALUE && c2 <= j) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c2 == c || z2) {
                    z |= g02.d(j);
                }
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    @Override // o.G02
    public final long f() {
        long j = Long.MAX_VALUE;
        for (G02 g02 : this.X) {
            long f = g02.f();
            if (f != Long.MIN_VALUE) {
                j = Math.min(j, f);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // o.G02
    public final void g(long j) {
        for (G02 g02 : this.X) {
            g02.g(j);
        }
    }
}
