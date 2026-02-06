package o;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: o.Dg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2736Dg0 implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean a(ByteBuffer byteBuffer, InterfaceC2727De interfaceC2727De) throws IOException {
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(ByteBuffer byteBuffer, InterfaceC2727De interfaceC2727De) throws IOException {
        return d(C4452Ur.g(byteBuffer), interfaceC2727De);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(InputStream inputStream, InterfaceC2727De interfaceC2727De) throws IOException {
        int l = new C2638Cg0(inputStream).l(C2638Cg0.C, 1);
        if (l == 0) {
            return -1;
        }
        return l;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType e(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean f(InputStream inputStream, InterfaceC2727De interfaceC2727De) throws IOException {
        return false;
    }
}
