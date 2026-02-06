package o;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class R7 implements FU {
    public final FU b;
    public final byte[] c;
    @InterfaceC11300zs1
    public S7 d;

    public R7(byte[] bArr, FU fu) {
        this.b = fu;
        this.c = bArr;
    }

    @Override // o.FU
    public long a(OU ou) throws IOException {
        long a = this.b.a(ou);
        this.d = new S7(2, this.c, ou.i, ou.b + ou.g);
        return a;
    }

    @Override // o.FU
    public Map<String, List<String>> b() {
        return this.b.b();
    }

    @Override // o.FU
    public void close() throws IOException {
        this.d = null;
        this.b.close();
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return this.b.getUri();
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int read = this.b.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        ((S7) TD2.o(this.d)).e(bArr, i, read);
        return read;
    }

    @Override // o.FU
    public void s(InterfaceC4261Sr2 interfaceC4261Sr2) {
        C9542sf.g(interfaceC4261Sr2);
        this.b.s(interfaceC4261Sr2);
    }
}
