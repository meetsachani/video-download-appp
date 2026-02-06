package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Deprecated
/* renamed from: o.Br  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2583Br implements EU {
    public ByteArrayOutputStream a;

    @Override // o.EU
    public void a(OU ou) {
        boolean z;
        long j = ou.h;
        if (j == -1) {
            this.a = new ByteArrayOutputStream();
            return;
        }
        if (j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.a = new ByteArrayOutputStream((int) ou.h);
    }

    @InterfaceC11300zs1
    public byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // o.EU
    public void close() throws IOException {
        ((ByteArrayOutputStream) TD2.o(this.a)).close();
    }

    @Override // o.EU
    public void write(byte[] bArr, int i, int i2) {
        ((ByteArrayOutputStream) TD2.o(this.a)).write(bArr, i, i2);
    }
}
