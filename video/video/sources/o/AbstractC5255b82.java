package o;

@Deprecated
/* renamed from: o.b82  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5255b82<Z> extends AbstractC3843Ol<Z> {
    public final int Y;
    public final int Z;

    public AbstractC5255b82() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // o.InterfaceC2856El2
    public final void h(U82 u82) {
        if (SD2.x(this.Y, this.Z)) {
            u82.d(this.Y, this.Z);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.Y + " and height: " + this.Z + ", either provide dimensions in the constructor or call override()");
    }

    public AbstractC5255b82(int i, int i2) {
        this.Y = i;
        this.Z = i2;
    }

    @Override // o.InterfaceC2856El2
    public void e(U82 u82) {
    }
}
