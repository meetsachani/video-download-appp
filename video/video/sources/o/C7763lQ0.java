package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.lQ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7763lQ0 implements InterfaceC7290jT1<InputStream, Bitmap> {
    public final C4242Sn a = new C4242Sn();

    @Override // o.InterfaceC7290jT1
    /* renamed from: c */
    public InterfaceC5580cT1<Bitmap> b(InputStream inputStream, int i, int i2, C5448bw1 c5448bw1) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(C4452Ur.b(inputStream));
        return this.a.c(createSource, i, i2, c5448bw1);
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: d */
    public boolean a(InputStream inputStream, C5448bw1 c5448bw1) throws IOException {
        return true;
    }
}
