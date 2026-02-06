package o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.ns1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8374ns1 extends OutputStream {
    public static final C8374ns1 X;
    @Deprecated
    public static final C8374ns1 Y;

    static {
        C8374ns1 c8374ns1 = new C8374ns1();
        X = c8374ns1;
        Y = c8374ns1;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        C7743lL0.q(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
    }
}
