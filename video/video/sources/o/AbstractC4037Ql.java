package o;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Deprecated
/* renamed from: o.Ql  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4037Ql implements InterfaceC6859hi0 {
    public final C9593sr2 c;
    public final int d;
    public final int[] e;
    public final int f;
    public final C10833xx0[] g;
    public final long[] h;
    public int i;

    public AbstractC4037Ql(C9593sr2 c9593sr2, int... iArr) {
        this(c9593sr2, iArr, 0);
    }

    public static /* synthetic */ int w(C10833xx0 c10833xx0, C10833xx0 c10833xx02) {
        return c10833xx02.c1 - c10833xx0.c1;
    }

    @Override // o.InterfaceC11054yr2
    public final C10833xx0 a(int i) {
        return this.g[i];
    }

    @Override // o.InterfaceC6859hi0
    public boolean d(int i, long j) {
        if (this.h[i] > j) {
            return true;
        }
        return false;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC4037Ql abstractC4037Ql = (AbstractC4037Ql) obj;
            if (this.c == abstractC4037Ql.c && Arrays.equals(this.e, abstractC4037Ql.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC11054yr2
    public final int g(int i) {
        return this.e[i];
    }

    @Override // o.InterfaceC11054yr2
    public final int getType() {
        return this.f;
    }

    @Override // o.InterfaceC6859hi0
    public boolean h(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean d = d(i, elapsedRealtime);
        for (int i2 = 0; i2 < this.d && !d; i2++) {
            if (i2 != i && !d(i2, elapsedRealtime)) {
                d = true;
            } else {
                d = false;
            }
        }
        if (!d) {
            return false;
        }
        long[] jArr = this.h;
        jArr[i] = Math.max(jArr[i], TD2.f(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    public int hashCode() {
        if (this.i == 0) {
            this.i = (System.identityHashCode(this.c) * 31) + Arrays.hashCode(this.e);
        }
        return this.i;
    }

    @Override // o.InterfaceC11054yr2
    public final int length() {
        return this.e.length;
    }

    @Override // o.InterfaceC11054yr2
    public final int m(int i) {
        for (int i2 = 0; i2 < this.d; i2++) {
            if (this.e[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.InterfaceC11054yr2
    public final C9593sr2 n() {
        return this.c;
    }

    @Override // o.InterfaceC11054yr2
    public final int o(C10833xx0 c10833xx0) {
        for (int i = 0; i < this.d; i++) {
            if (this.g[i] == c10833xx0) {
                return i;
            }
        }
        return -1;
    }

    @Override // o.InterfaceC6859hi0
    public int r(long j, List<? extends AbstractC2533Be1> list) {
        return list.size();
    }

    @Override // o.InterfaceC6859hi0
    public final int s() {
        return this.e[f()];
    }

    @Override // o.InterfaceC6859hi0
    public final C10833xx0 t() {
        return this.g[f()];
    }

    public AbstractC4037Ql(C9593sr2 c9593sr2, int[] iArr, int i) {
        int i2 = 0;
        C9542sf.i(iArr.length > 0);
        this.f = i;
        this.c = (C9593sr2) C9542sf.g(c9593sr2);
        int length = iArr.length;
        this.d = length;
        this.g = new C10833xx0[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.g[i3] = c9593sr2.c(iArr[i3]);
        }
        Arrays.sort(this.g, new Comparator() { // from class: o.Pl
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4037Ql.w((C10833xx0) obj, (C10833xx0) obj2);
            }
        });
        this.e = new int[this.d];
        while (true) {
            int i4 = this.d;
            if (i2 < i4) {
                this.e[i2] = c9593sr2.d(this.g[i2]);
                i2++;
            } else {
                this.h = new long[i4];
                return;
            }
        }
    }

    @Override // o.InterfaceC6859hi0
    public void b() {
    }

    @Override // o.InterfaceC6859hi0
    public void q() {
    }

    @Override // o.InterfaceC6859hi0
    public void i(float f) {
    }
}
