package o;

import java.util.List;

@Deprecated
/* renamed from: o.Wg2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4605Wg2 extends AbstractC9510sW implements InterfaceC4020Qg2 {
    @InterfaceC11300zs1
    public InterfaceC4020Qg2 Y0;
    public long Z0;

    @Override // o.InterfaceC4020Qg2
    public int e(long j) {
        return ((InterfaceC4020Qg2) C9542sf.g(this.Y0)).e(j - this.Z0);
    }

    @Override // o.InterfaceC4020Qg2
    public List<C7284jS> g(long j) {
        return ((InterfaceC4020Qg2) C9542sf.g(this.Y0)).g(j - this.Z0);
    }

    @Override // o.InterfaceC4020Qg2
    public long h(int i) {
        return ((InterfaceC4020Qg2) C9542sf.g(this.Y0)).h(i) + this.Z0;
    }

    @Override // o.InterfaceC4020Qg2
    public int i() {
        return ((InterfaceC4020Qg2) C9542sf.g(this.Y0)).i();
    }

    @Override // o.AbstractC5906dq
    public void l() {
        super.l();
        this.Y0 = null;
    }

    public void w(long j, InterfaceC4020Qg2 interfaceC4020Qg2, long j2) {
        this.Y = j;
        this.Y0 = interfaceC4020Qg2;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.Z0 = j;
    }
}
