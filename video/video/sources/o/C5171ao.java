package o;

import android.graphics.Bitmap;

/* renamed from: o.ao  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5171ao implements InterfaceC4931Zn {
    @Override // o.InterfaceC4931Zn
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // o.InterfaceC4931Zn
    public long e() {
        return 0L;
    }

    @Override // o.InterfaceC4931Zn
    public Bitmap f(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // o.InterfaceC4931Zn
    public Bitmap g(int i, int i2, Bitmap.Config config) {
        return f(i, i2, config);
    }

    @Override // o.InterfaceC4931Zn
    public void b() {
    }

    @Override // o.InterfaceC4931Zn
    public void a(int i) {
    }

    @Override // o.InterfaceC4931Zn
    public void c(float f) {
    }
}
