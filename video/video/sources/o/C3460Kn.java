package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: o.Kn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3460Kn implements InterfaceC8037mT1<BitmapDrawable> {
    public final InterfaceC4931Zn a;
    public final InterfaceC8037mT1<Bitmap> b;

    public C3460Kn(InterfaceC4931Zn interfaceC4931Zn, InterfaceC8037mT1<Bitmap> interfaceC8037mT1) {
        this.a = interfaceC4931Zn;
        this.b = interfaceC8037mT1;
    }

    @Override // o.InterfaceC8037mT1
    public EnumC9770tb0 a(C5448bw1 c5448bw1) {
        return this.b.a(c5448bw1);
    }

    @Override // o.InterfaceC2422Ab0
    /* renamed from: c */
    public boolean b(InterfaceC5580cT1<BitmapDrawable> interfaceC5580cT1, File file, C5448bw1 c5448bw1) {
        return this.b.b(new C6141eo(interfaceC5580cT1.get().getBitmap(), this.a), file, c5448bw1);
    }
}
