package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: o.nC1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8212nC1 extends C10893yC {
    public C8212nC1(InputStream inputStream) {
        super(inputStream);
    }

    public boolean f(byte[] bArr) throws IOException {
        Objects.requireNonNull(bArr, "sourceBuffer");
        return h(bArr, 0, bArr.length);
    }

    public boolean h(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "sourceBuffer");
        if (bArr.length <= this.Y) {
            if (this.X.d() < bArr.length) {
                a();
            }
            return this.X.i(bArr, i, i2);
        }
        throw new IllegalArgumentException("Peek request size of " + bArr.length + " bytes exceeds buffer size of " + this.Y + " bytes");
    }

    public C8212nC1(InputStream inputStream, int i) {
        super(inputStream, i);
    }
}
