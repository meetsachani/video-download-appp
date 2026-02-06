package o;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: o.oD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8458oD0 implements InterfaceC5675cs2<C7468kD0> {
    public final InterfaceC5675cs2<Bitmap> c;

    public C8458oD0(InterfaceC5675cs2<Bitmap> interfaceC5675cs2) {
        this.c = (InterfaceC5675cs2) C10175vF1.e(interfaceC5675cs2);
    }

    @Override // o.InterfaceC5675cs2
    public InterfaceC5580cT1<C7468kD0> a(Context context, InterfaceC5580cT1<C7468kD0> interfaceC5580cT1, int i, int i2) {
        C7468kD0 c7468kD0 = interfaceC5580cT1.get();
        InterfaceC5580cT1<Bitmap> c6141eo = new C6141eo(c7468kD0.g(), com.bumptech.glide.a.e(context).h());
        InterfaceC5580cT1<Bitmap> a = this.c.a(context, c6141eo, i, i2);
        if (!c6141eo.equals(a)) {
            c6141eo.a();
        }
        c7468kD0.q(this.c, a.get());
        return interfaceC5580cT1;
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        this.c.b(messageDigest);
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (obj instanceof C8458oD0) {
            return this.c.equals(((C8458oD0) obj).c);
        }
        return false;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        return this.c.hashCode();
    }
}
