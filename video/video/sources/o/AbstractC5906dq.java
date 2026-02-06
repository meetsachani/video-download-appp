package o;

@Deprecated
/* renamed from: o.dq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5906dq {
    public int X;

    public final void j(int i) {
        this.X = i | this.X;
    }

    public void l() {
        this.X = 0;
    }

    public final void m(int i) {
        this.X = (~i) & this.X;
    }

    public final boolean n(int i) {
        if ((this.X & i) == i) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        return n(268435456);
    }

    public final boolean p() {
        return n(Integer.MIN_VALUE);
    }

    public final boolean q() {
        return n(4);
    }

    public final boolean r() {
        return n(C10323vs.Q0);
    }

    public final boolean s() {
        return n(1);
    }

    public final boolean t() {
        return n(536870912);
    }

    public final void u(int i) {
        this.X = i;
    }
}
