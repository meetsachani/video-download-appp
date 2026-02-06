package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class O60 implements InterfaceC5675cs2<Drawable> {
    public final InterfaceC5675cs2<Bitmap> c;
    public final boolean d;

    public O60(InterfaceC5675cs2<Bitmap> interfaceC5675cs2, boolean z) {
        this.c = interfaceC5675cs2;
        this.d = z;
    }

    @Override // o.InterfaceC5675cs2
    public InterfaceC5580cT1<Drawable> a(Context context, InterfaceC5580cT1<Drawable> interfaceC5580cT1, int i, int i2) {
        InterfaceC4931Zn h = com.bumptech.glide.a.e(context).h();
        Drawable drawable = interfaceC5580cT1.get();
        InterfaceC5580cT1<Bitmap> a = N60.a(h, drawable, i, i2);
        if (a == null) {
            if (!this.d) {
                return interfaceC5580cT1;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        InterfaceC5580cT1<Bitmap> a2 = this.c.a(context, a, i, i2);
        if (a2.equals(a)) {
            a2.a();
            return interfaceC5580cT1;
        }
        return d(context, a2);
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        this.c.b(messageDigest);
    }

    public final InterfaceC5580cT1<Drawable> d(Context context, InterfaceC5580cT1<Bitmap> interfaceC5580cT1) {
        return HY0.e(context.getResources(), interfaceC5580cT1);
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (obj instanceof O60) {
            return this.c.equals(((O60) obj).c);
        }
        return false;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        return this.c.hashCode();
    }

    public InterfaceC5675cs2<BitmapDrawable> c() {
        return this;
    }
}
