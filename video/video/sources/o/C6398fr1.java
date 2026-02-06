package o;

import android.graphics.drawable.Drawable;

/* renamed from: o.fr1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6398fr1 extends L60<Drawable> {
    public C6398fr1(Drawable drawable) {
        super(drawable);
    }

    public static InterfaceC5580cT1<Drawable> c(Drawable drawable) {
        if (drawable != null) {
            return new C6398fr1(drawable);
        }
        return null;
    }

    @Override // o.InterfaceC5580cT1
    public int h0() {
        return Math.max(1, this.X.getIntrinsicWidth() * this.X.getIntrinsicHeight() * 4);
    }

    @Override // o.InterfaceC5580cT1
    public Class<Drawable> i0() {
        return this.X.getClass();
    }

    @Override // o.InterfaceC5580cT1
    public void a() {
    }
}
