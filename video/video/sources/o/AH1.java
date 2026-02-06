package o;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.FU;

@Deprecated
/* loaded from: classes2.dex */
public final class AH1 implements FU {
    public final FU b;
    public final FH1 c;
    public final int d;

    /* loaded from: classes2.dex */
    public static final class a implements FU.a {
        public final FU.a a;
        public final FH1 b;
        public final int c;

        public a(FU.a aVar, FH1 fh1, int i) {
            this.a = aVar;
            this.b = fh1;
            this.c = i;
        }

        @Override // o.FU.a
        /* renamed from: c */
        public AH1 a() {
            return new AH1(this.a.a(), this.b, this.c);
        }
    }

    public AH1(FU fu, FH1 fh1, int i) {
        this.b = (FU) C9542sf.g(fu);
        this.c = (FH1) C9542sf.g(fh1);
        this.d = i;
    }

    @Override // o.FU
    public long a(OU ou) throws IOException {
        this.c.d(this.d);
        return this.b.a(ou);
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

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.c.d(this.d);
        return this.b.read(bArr, i, i2);
    }

    @Override // o.FU
    public void s(InterfaceC4261Sr2 interfaceC4261Sr2) {
        C9542sf.g(interfaceC4261Sr2);
        this.b.s(interfaceC4261Sr2);
    }
}
