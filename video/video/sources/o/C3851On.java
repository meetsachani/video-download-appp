package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

@Deprecated
/* renamed from: o.On  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3851On implements InterfaceC5675cs2<BitmapDrawable> {
    public final InterfaceC5675cs2<Drawable> c;

    public C3851On(InterfaceC5675cs2<Bitmap> interfaceC5675cs2) {
        this.c = (InterfaceC5675cs2) C10175vF1.e(new O60(interfaceC5675cs2, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC5580cT1<BitmapDrawable> c(InterfaceC5580cT1<Drawable> interfaceC5580cT1) {
        if (interfaceC5580cT1.get() instanceof BitmapDrawable) {
            return interfaceC5580cT1;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + interfaceC5580cT1.get());
    }

    @Override // o.InterfaceC5675cs2
    public InterfaceC5580cT1<BitmapDrawable> a(Context context, InterfaceC5580cT1<BitmapDrawable> interfaceC5580cT1, int i, int i2) {
        return c(this.c.a(context, d(interfaceC5580cT1), i, i2));
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        this.c.b(messageDigest);
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (obj instanceof C3851On) {
            return this.c.equals(((C3851On) obj).c);
        }
        return false;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        return this.c.hashCode();
    }

    public static InterfaceC5580cT1<Drawable> d(InterfaceC5580cT1<BitmapDrawable> interfaceC5580cT1) {
        return interfaceC5580cT1;
    }
}
