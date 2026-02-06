package o;

import java.io.File;

@Deprecated
/* renamed from: o.nt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8376nt implements Comparable<C8376nt> {
    public final String X;
    public final long Y;
    public final boolean Y0;
    public final long Z;
    @InterfaceC11300zs1
    public final File Z0;
    public final long a1;

    public C8376nt(String str, long j, long j2) {
        this(str, j, j2, C10323vs.b, null);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(C8376nt c8376nt) {
        if (!this.X.equals(c8376nt.X)) {
            return this.X.compareTo(c8376nt.X);
        }
        int i = ((this.Y - c8376nt.Y) > 0L ? 1 : ((this.Y - c8376nt.Y) == 0L ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        return 1;
    }

    public boolean g() {
        return !this.Y0;
    }

    public boolean h() {
        if (this.Z == -1) {
            return true;
        }
        return false;
    }

    public String toString() {
        return C6566gU0.f + this.Y + C6566gU0.h + this.Z + C6566gU0.g;
    }

    public C8376nt(String str, long j, long j2, long j3, @InterfaceC11300zs1 File file) {
        this.X = str;
        this.Y = j;
        this.Z = j2;
        this.Y0 = file != null;
        this.Z0 = file;
        this.a1 = j3;
    }
}
