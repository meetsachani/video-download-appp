package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class C60 implements InterfaceC9502sT1<Drawable, byte[]> {
    public final InterfaceC4931Zn a;
    public final InterfaceC9502sT1<Bitmap, byte[]> b;
    public final InterfaceC9502sT1<C7468kD0, byte[]> c;

    public C60(InterfaceC4931Zn interfaceC4931Zn, InterfaceC9502sT1<Bitmap, byte[]> interfaceC9502sT1, InterfaceC9502sT1<C7468kD0, byte[]> interfaceC9502sT12) {
        this.a = interfaceC4931Zn;
        this.b = interfaceC9502sT1;
        this.c = interfaceC9502sT12;
    }

    @Override // o.InterfaceC9502sT1
    public InterfaceC5580cT1<byte[]> a(InterfaceC5580cT1<Drawable> interfaceC5580cT1, C5448bw1 c5448bw1) {
        Drawable drawable = interfaceC5580cT1.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(C6141eo.c(((BitmapDrawable) drawable).getBitmap(), this.a), c5448bw1);
        }
        if (drawable instanceof C7468kD0) {
            return this.c.a(b(interfaceC5580cT1), c5448bw1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC5580cT1<C7468kD0> b(InterfaceC5580cT1<Drawable> interfaceC5580cT1) {
        return interfaceC5580cT1;
    }
}
