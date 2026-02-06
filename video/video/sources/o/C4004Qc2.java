package o;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: o.Qc2 */
/* loaded from: classes2.dex */
public final class C4004Qc2 implements FU {
    public final FU b;
    public long c;
    public Uri d = Uri.EMPTY;
    public Map<String, List<String>> e = Collections.EMPTY_MAP;

    public C4004Qc2(FU fu) {
        this.b = (FU) C9542sf.g(fu);
    }

    public void A() {
        this.c = 0L;
    }

    @Override // o.FU
    public long a(OU ou) throws IOException {
        this.d = ou.a;
        this.e = Collections.EMPTY_MAP;
        long a = this.b.a(ou);
        this.d = (Uri) C9542sf.g(getUri());
        this.e = b();
        return a;
    }

    @Override // o.FU
    public Map<String, List<String>> b() {
        return this.b.b();
    }

    @Override // o.FU
    public void close() throws IOException {
        this.b.close();
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return this.b.getUri();
    }

    public long m() {
        return this.c;
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.b.read(bArr, i, i2);
        if (read != -1) {
            this.c += read;
        }
        return read;
    }

    @Override // o.FU
    public void s(InterfaceC4261Sr2 interfaceC4261Sr2) {
        C9542sf.g(interfaceC4261Sr2);
        this.b.s(interfaceC4261Sr2);
    }

    public Uri y() {
        return this.d;
    }

    public Map<String, List<String>> z() {
        return this.e;
    }
}
