package o;

import java.util.Collections;
import java.util.List;

@Deprecated
/* renamed from: o.xb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10747xb2 implements InterfaceC4020Qg2 {
    public final List<List<C7284jS>> X;
    public final List<Long> Y;

    public C10747xb2(List<List<C7284jS>> list, List<Long> list2) {
        this.X = list;
        this.Y = list2;
    }

    @Override // o.InterfaceC4020Qg2
    public int e(long j) {
        int h = TD2.h(this.Y, Long.valueOf(j), false, false);
        if (h < this.Y.size()) {
            return h;
        }
        return -1;
    }

    @Override // o.InterfaceC4020Qg2
    public List<C7284jS> g(long j) {
        int k = TD2.k(this.Y, Long.valueOf(j), true, false);
        if (k == -1) {
            return Collections.EMPTY_LIST;
        }
        return this.X.get(k);
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
        if (i < this.Y.size()) {
            z2 = true;
        }
        C9542sf.a(z2);
        return this.Y.get(i).longValue();
    }

    @Override // o.InterfaceC4020Qg2
    public int i() {
        return this.Y.size();
    }
}
