package o;

import java.io.IOException;

@Deprecated
/* renamed from: o.Re0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4107Re0 implements IX1 {
    public final C10833xx0 X;
    public boolean Y0;
    public long[] Z;
    public C4896Ze0 Z0;
    public boolean a1;
    public int b1;
    public final C4010Qe0 Y = new C4010Qe0();
    public long c1 = C10323vs.b;

    public C4107Re0(C4896Ze0 c4896Ze0, C10833xx0 c10833xx0, boolean z) {
        this.X = c10833xx0;
        this.Z0 = c4896Ze0;
        this.Z = c4896Ze0.b;
        d(c4896Ze0, z);
    }

    public String a() {
        return this.Z0.a();
    }

    public void c(long j) {
        int j2 = TD2.j(this.Z, j, true, false);
        this.b1 = j2;
        if (!this.Y0 || j2 != this.Z.length) {
            j = C10323vs.b;
        }
        this.c1 = j;
    }

    public void d(C4896Ze0 c4896Ze0, boolean z) {
        long j;
        int i = this.b1;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.Z[i - 1];
        }
        this.Y0 = z;
        this.Z0 = c4896Ze0;
        long[] jArr = c4896Ze0.b;
        this.Z = jArr;
        long j2 = this.c1;
        if (j2 != C10323vs.b) {
            c(j2);
        } else if (j != C10323vs.b) {
            this.b1 = TD2.j(jArr, j, false, false);
        }
    }

    @Override // o.IX1
    public boolean isReady() {
        return true;
    }

    @Override // o.IX1
    public int j(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
        boolean z;
        int i2 = this.b1;
        if (i2 == this.Z.length) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.Y0) {
            c9267rW.u(4);
            return -4;
        } else if ((i & 2) == 0 && this.a1) {
            if (z) {
                return -3;
            }
            if ((i & 1) == 0) {
                this.b1 = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] a = this.Y.a(this.Z0.a[i2]);
                c9267rW.w(a.length);
                c9267rW.Y0.put(a);
            }
            c9267rW.a1 = this.Z[i2];
            c9267rW.u(1);
            return -4;
        } else {
            c2899Ex0.b = this.X;
            this.a1 = true;
            return -5;
        }
    }

    @Override // o.IX1
    public int n(long j) {
        int max = Math.max(this.b1, TD2.j(this.Z, j, true, false));
        int i = max - this.b1;
        this.b1 = max;
        return i;
    }

    @Override // o.IX1
    public void b() throws IOException {
    }
}
