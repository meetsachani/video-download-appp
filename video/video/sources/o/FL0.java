package o;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class FL0 implements FU {
    public final FU b;
    public final int c;
    public final a d;
    public final byte[] e;
    public int f;

    /* loaded from: classes2.dex */
    public interface a {
        void b(C3012Fy1 c3012Fy1);
    }

    public FL0(FU fu, int i, a aVar) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.b = fu;
        this.c = i;
        this.d = aVar;
        this.e = new byte[1];
        this.f = i;
    }

    @Override // o.FU
    public long a(OU ou) {
        throw new UnsupportedOperationException();
    }

    @Override // o.FU
    public Map<String, List<String>> b() {
        return this.b.b();
    }

    @Override // o.FU
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return this.b.getUri();
    }

    public final boolean m() throws IOException {
        if (this.b.read(this.e, 0, 1) == -1) {
            return false;
        }
        int i = (this.e[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int read = this.b.read(bArr, i3, i2);
            if (read == -1) {
                return false;
            }
            i3 += read;
            i2 -= read;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.d.b(new C3012Fy1(bArr, i));
        }
        return true;
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f == 0) {
            if (!m()) {
                return -1;
            }
            this.f = this.c;
        }
        int read = this.b.read(bArr, i, Math.min(this.f, i2));
        if (read != -1) {
            this.f -= read;
        }
        return read;
    }

    @Override // o.FU
    public void s(InterfaceC4261Sr2 interfaceC4261Sr2) {
        C9542sf.g(interfaceC4261Sr2);
        this.b.s(interfaceC4261Sr2);
    }
}
