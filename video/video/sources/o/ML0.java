package o;

import java.io.EOFException;
import java.io.IOException;
import o.KL0;

@Deprecated
/* loaded from: classes2.dex */
public final class ML0 {
    public final C3012Fy1 a = new C3012Fy1(10);

    @InterfaceC11300zs1
    public C4224Si1 a(InterfaceC4421Uj0 interfaceC4421Uj0, @InterfaceC11300zs1 KL0.a aVar) throws IOException {
        C4224Si1 c4224Si1 = null;
        int i = 0;
        while (true) {
            try {
                interfaceC4421Uj0.x(this.a.e(), 0, 10);
                this.a.Y(0);
                if (this.a.O() != 4801587) {
                    break;
                }
                this.a.Z(3);
                int K = this.a.K();
                int i2 = K + 10;
                if (c4224Si1 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.e(), 0, bArr, 0, 10);
                    interfaceC4421Uj0.x(bArr, 10, K);
                    c4224Si1 = new KL0(aVar).e(bArr, i2);
                } else {
                    interfaceC4421Uj0.p(K);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC4421Uj0.i();
        interfaceC4421Uj0.p(i);
        return c4224Si1;
    }
}
