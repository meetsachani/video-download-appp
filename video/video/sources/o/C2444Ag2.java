package o;

import java.util.Collections;
import java.util.List;

@Deprecated
/* renamed from: o.Ag2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2444Ag2 implements InterfaceC4020Qg2 {
    public final C7284jS[] X;
    public final long[] Y;

    public C2444Ag2(C7284jS[] c7284jSArr, long[] jArr) {
        this.X = c7284jSArr;
        this.Y = jArr;
    }

    @Override // o.InterfaceC4020Qg2
    public int e(long j) {
        int j2 = TD2.j(this.Y, j, false, false);
        if (j2 < this.Y.length) {
            return j2;
        }
        return -1;
    }

    @Override // o.InterfaceC4020Qg2
    public List<C7284jS> g(long j) {
        C7284jS c7284jS;
        int n = TD2.n(this.Y, j, true, false);
        if (n != -1 && (c7284jS = this.X[n]) != C7284jS.m1) {
            return Collections.singletonList(c7284jS);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // o.InterfaceC4020Qg2
    public long h(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        if (i < this.Y.length) {
            z2 = true;
        }
        C9542sf.a(z2);
        return this.Y[i];
    }

    @Override // o.InterfaceC4020Qg2
    public int i() {
        return this.Y.length;
    }
}
