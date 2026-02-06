package o;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: o.go  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6639go implements InterfaceC5675cs2<Bitmap> {
    @Override // o.InterfaceC5675cs2
    public final InterfaceC5580cT1<Bitmap> a(Context context, InterfaceC5580cT1<Bitmap> interfaceC5580cT1, int i, int i2) {
        if (SD2.x(i, i2)) {
            InterfaceC4931Zn h = com.bumptech.glide.a.e(context).h();
            Bitmap bitmap = interfaceC5580cT1.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = c(h, bitmap, i, i2);
            if (bitmap.equals(c)) {
                return interfaceC5580cT1;
            }
            return C6141eo.c(c, h);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(InterfaceC4931Zn interfaceC4931Zn, Bitmap bitmap, int i, int i2);
}
