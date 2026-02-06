package o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.gE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6501gE extends InputStream {
    public static final C6501gE X;
    @Deprecated
    public static final C6501gE Y;

    static {
        C6501gE c6501gE = new C6501gE();
        X = c6501gE;
        Y = c6501gE;
    }

    public static InputStream a(InputStream inputStream) {
        if (inputStream != null) {
            return inputStream;
        }
        return X;
    }

    @Override // java.io.InputStream
    public int read() {
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        C7743lL0.q(bArr, i, i2);
        return i2 == 0 ? 0 : -1;
    }
}
