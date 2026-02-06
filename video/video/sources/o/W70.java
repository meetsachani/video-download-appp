package o;

import java.io.EOFException;
import java.io.IOException;
import o.InterfaceC10568wr2;

@Deprecated
/* loaded from: classes2.dex */
public final class W70 implements InterfaceC10568wr2 {
    public final byte[] d = new byte[4096];

    @Override // o.InterfaceC10568wr2
    public int d(CU cu, int i, boolean z, int i2) throws IOException {
        int read = cu.read(this.d, 0, Math.min(this.d.length, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // o.InterfaceC10568wr2
    public void f(C3012Fy1 c3012Fy1, int i, int i2) {
        c3012Fy1.Z(i);
    }

    @Override // o.InterfaceC10568wr2
    public void a(C10833xx0 c10833xx0) {
    }

    @Override // o.InterfaceC10568wr2
    public void b(long j, int i, int i2, int i3, @InterfaceC11300zs1 InterfaceC10568wr2.a aVar) {
    }
}
