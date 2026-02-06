package o;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class HT<T> implements InterfaceC2856El2<T> {
    public final int X;
    public final int Y;
    public InterfaceC5334bS1 Z;

    public HT() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // o.InterfaceC2856El2
    public final void h(U82 u82) {
        u82.d(this.X, this.Y);
    }

    @Override // o.InterfaceC2856El2
    public final InterfaceC5334bS1 j() {
        return this.Z;
    }

    @Override // o.InterfaceC2856El2
    public final void q(InterfaceC5334bS1 interfaceC5334bS1) {
        this.Z = interfaceC5334bS1;
    }

    public HT(int i, int i2) {
        if (SD2.x(i, i2)) {
            this.X = i;
            this.Y = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }

    @Override // o.IZ0
    public void onDestroy() {
    }

    @Override // o.IZ0
    public void onStart() {
    }

    @Override // o.IZ0
    public void onStop() {
    }

    @Override // o.InterfaceC2856El2
    public final void e(U82 u82) {
    }

    @Override // o.InterfaceC2856El2
    public void i(Drawable drawable) {
    }

    @Override // o.InterfaceC2856El2
    public void m(Drawable drawable) {
    }
}
