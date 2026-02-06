package o;

import android.graphics.Bitmap;

/* renamed from: o.eo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6141eo implements InterfaceC5580cT1<Bitmap>, DP0 {
    public final Bitmap X;
    public final InterfaceC4931Zn Y;

    public C6141eo(Bitmap bitmap, InterfaceC4931Zn interfaceC4931Zn) {
        this.X = (Bitmap) C10175vF1.f(bitmap, "Bitmap must not be null");
        this.Y = (InterfaceC4931Zn) C10175vF1.f(interfaceC4931Zn, "BitmapPool must not be null");
    }

    public static C6141eo c(Bitmap bitmap, InterfaceC4931Zn interfaceC4931Zn) {
        if (bitmap == null) {
            return null;
        }
        return new C6141eo(bitmap, interfaceC4931Zn);
    }

    @Override // o.InterfaceC5580cT1
    public void a() {
        this.Y.d(this.X);
    }

    @Override // o.InterfaceC5580cT1
    /* renamed from: b */
    public Bitmap get() {
        return this.X;
    }

    @Override // o.InterfaceC5580cT1
    public int h0() {
        return SD2.i(this.X);
    }

    @Override // o.InterfaceC5580cT1
    public Class<Bitmap> i0() {
        return Bitmap.class;
    }

    @Override // o.DP0
    public void initialize() {
        this.X.prepareToDraw();
    }
}
