package o;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: o.Gn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3068Gn implements InterfaceC9502sT1<Bitmap, byte[]> {
    public final Bitmap.CompressFormat a;
    public final int b;

    public C3068Gn() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // o.InterfaceC9502sT1
    public InterfaceC5580cT1<byte[]> a(InterfaceC5580cT1<Bitmap> interfaceC5580cT1, C5448bw1 c5448bw1) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC5580cT1.get().compress(this.a, this.b, byteArrayOutputStream);
        interfaceC5580cT1.a();
        return new C9594ss(byteArrayOutputStream.toByteArray());
    }

    public C3068Gn(Bitmap.CompressFormat compressFormat, int i) {
        this.a = compressFormat;
        this.b = i;
    }
}
