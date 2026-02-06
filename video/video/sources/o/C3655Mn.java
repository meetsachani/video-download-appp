package o;

import android.graphics.drawable.BitmapDrawable;

/* renamed from: o.Mn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3655Mn extends L60<BitmapDrawable> implements DP0 {
    public final InterfaceC4931Zn Y;

    public C3655Mn(BitmapDrawable bitmapDrawable, InterfaceC4931Zn interfaceC4931Zn) {
        super(bitmapDrawable);
        this.Y = interfaceC4931Zn;
    }

    @Override // o.InterfaceC5580cT1
    public void a() {
        this.Y.d(((BitmapDrawable) this.X).getBitmap());
    }

    @Override // o.InterfaceC5580cT1
    public int h0() {
        return SD2.i(((BitmapDrawable) this.X).getBitmap());
    }

    @Override // o.InterfaceC5580cT1
    public Class<BitmapDrawable> i0() {
        return BitmapDrawable.class;
    }

    @Override // o.L60, o.DP0
    public void initialize() {
        ((BitmapDrawable) this.X).getBitmap().prepareToDraw();
    }
}
