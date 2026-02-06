package o;

import java.util.Collections;
import java.util.List;

@Deprecated
/* renamed from: o.El1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2855El1 implements InterfaceC4020Qg2 {
    public final List<C7284jS> X;

    public C2855El1(List<C7284jS> list) {
        this.X = Collections.unmodifiableList(list);
    }

    @Override // o.InterfaceC4020Qg2
    public int e(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    @Override // o.InterfaceC4020Qg2
    public List<C7284jS> g(long j) {
        if (j >= 0) {
            return this.X;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // o.InterfaceC4020Qg2
    public long h(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        return 0L;
    }

    @Override // o.InterfaceC4020Qg2
    public int i() {
        return 1;
    }
}
