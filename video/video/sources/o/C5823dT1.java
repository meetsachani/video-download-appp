package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: o.dT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5823dT1 implements InterfaceC7290jT1<Uri, Bitmap> {
    public final C7776lT1 a;
    public final InterfaceC4931Zn b;

    public C5823dT1(C7776lT1 c7776lT1, InterfaceC4931Zn interfaceC4931Zn) {
        this.a = c7776lT1;
        this.b = interfaceC4931Zn;
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: c */
    public InterfaceC5580cT1<Bitmap> b(Uri uri, int i, int i2, C5448bw1 c5448bw1) {
        InterfaceC5580cT1<Drawable> b = this.a.b(uri, i, i2, c5448bw1);
        if (b == null) {
            return null;
        }
        return N60.a(this.b, b.get(), i, i2);
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: d */
    public boolean a(Uri uri, C5448bw1 c5448bw1) {
        return C10977yY.t.equals(uri.getScheme());
    }
}
