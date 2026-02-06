package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: o.Mr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3671Mr implements InterfaceC7290jT1<ByteBuffer, Bitmap> {
    public final C4242Sn a = new C4242Sn();

    @Override // o.InterfaceC7290jT1
    /* renamed from: c */
    public InterfaceC5580cT1<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, C5448bw1 c5448bw1) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.a.c(createSource, i, i2, c5448bw1);
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, C5448bw1 c5448bw1) throws IOException {
        return true;
    }
}
