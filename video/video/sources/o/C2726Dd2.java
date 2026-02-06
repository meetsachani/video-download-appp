package o;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: o.Dd2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2726Dd2 implements InterfaceC7290jT1<InputStream, C7468kD0> {
    public static final String d = "StreamGifDecoder";
    public final List<ImageHeaderParser> a;
    public final InterfaceC7290jT1<ByteBuffer, C7468kD0> b;
    public final InterfaceC2727De c;

    public C2726Dd2(List<ImageHeaderParser> list, InterfaceC7290jT1<ByteBuffer, C7468kD0> interfaceC7290jT1, InterfaceC2727De interfaceC2727De) {
        this.a = list;
        this.b = interfaceC7290jT1;
        this.c = interfaceC2727De;
    }

    public static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable(d, 5)) {
                Log.w(d, "Error reading data from stream", e);
                return null;
            }
            return null;
        }
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: c */
    public InterfaceC5580cT1<C7468kD0> b(InputStream inputStream, int i, int i2, C5448bw1 c5448bw1) throws IOException {
        byte[] e = e(inputStream);
        if (e == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(e), i, i2, c5448bw1);
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: d */
    public boolean a(InputStream inputStream, C5448bw1 c5448bw1) throws IOException {
        if (!((Boolean) c5448bw1.c(C9923uD0.b)).booleanValue() && com.bumptech.glide.load.a.f(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }
}
