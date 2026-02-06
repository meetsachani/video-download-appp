package o;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: o.Xl2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4722Xl2 implements FU {
    public final FU b;
    public final EU c;
    public boolean d;
    public long e;

    public C4722Xl2(FU fu, EU eu) {
        this.b = (FU) C9542sf.g(fu);
        this.c = (EU) C9542sf.g(eu);
    }

    @Override // o.FU
    public long a(OU ou) throws IOException {
        long a = this.b.a(ou);
        this.e = a;
        if (a == 0) {
            return 0L;
        }
        if (ou.h == -1 && a != -1) {
            ou = ou.f(0L, a);
        }
        this.d = true;
        this.c.a(ou);
        return this.e;
    }

    @Override // o.FU
    public Map<String, List<String>> b() {
        return this.b.b();
    }

    @Override // o.FU
    public void close() throws IOException {
        try {
            this.b.close();
        } finally {
            if (this.d) {
                this.d = false;
                this.c.close();
            }
        }
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return this.b.getUri();
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.e == 0) {
            return -1;
        }
        int read = this.b.read(bArr, i, i2);
        if (read > 0) {
            this.c.write(bArr, i, read);
            long j = this.e;
            if (j != -1) {
                this.e = j - read;
            }
        }
        return read;
    }

    @Override // o.FU
    public void s(InterfaceC4261Sr2 interfaceC4261Sr2) {
        C9542sf.g(interfaceC4261Sr2);
        this.b.s(interfaceC4261Sr2);
    }
}
