package o;

import android.net.Uri;
import java.io.IOException;
import o.FU;

@Deprecated
/* renamed from: o.gD1 */
/* loaded from: classes2.dex */
public final class C6499gD1 implements FU {
    public static final C6499gD1 b = new C6499gD1();
    public static final FU.a c = new FU.a() { // from class: o.fD1
        @Override // o.FU.a
        public final FU a() {
            return C6499gD1.m();
        }
    };

    public static /* synthetic */ C6499gD1 m() {
        return new C6499gD1();
    }

    @Override // o.FU
    public long a(OU ou) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return null;
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.FU
    public void close() {
    }

    @Override // o.FU
    public void s(InterfaceC4261Sr2 interfaceC4261Sr2) {
    }
}
