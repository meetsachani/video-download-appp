package o;

import java.util.Collections;
import java.util.List;

@Deprecated
/* renamed from: o.lv2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7883lv2 implements InterfaceC4020Qg2 {
    public static final C7883lv2 Y = new C7883lv2();
    public final List<C7284jS> X;

    public C7883lv2(C7284jS c7284jS) {
        this.X = Collections.singletonList(c7284jS);
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

    public C7883lv2() {
        this.X = Collections.EMPTY_LIST;
    }
}
