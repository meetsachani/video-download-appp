package o;

@Deprecated
/* renamed from: o.xr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10811xr2 {
    public final C8615or2 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public C10811xr2(C8615or2 c8615or2, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.a(z2);
        C9542sf.a(iArr2.length == jArr2.length);
        this.a = c8615or2;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j) {
        for (int n = TD2.n(this.f, j, true, false); n >= 0; n--) {
            if ((this.g[n] & 1) != 0) {
                return n;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int j2 = TD2.j(this.f, j, true, false); j2 < this.f.length; j2++) {
            if ((this.g[j2] & 1) != 0) {
                return j2;
            }
        }
        return -1;
    }
}
