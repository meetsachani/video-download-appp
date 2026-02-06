package o;

import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class Q7 implements EU {
    public final EU a;
    public final byte[] b;
    @InterfaceC11300zs1
    public final byte[] c;
    @InterfaceC11300zs1
    public S7 d;

    public Q7(byte[] bArr, EU eu) {
        this(bArr, eu, null);
    }

    @Override // o.EU
    public void a(OU ou) throws IOException {
        this.a.a(ou);
        this.d = new S7(1, this.b, ou.i, ou.b + ou.g);
    }

    @Override // o.EU
    public void close() throws IOException {
        this.d = null;
        this.a.close();
    }

    @Override // o.EU
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.c == null) {
            ((S7) TD2.o(this.d)).e(bArr, i, i2);
            this.a.write(bArr, i, i2);
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i2 - i3, this.c.length);
            byte[] bArr2 = bArr;
            ((S7) TD2.o(this.d)).d(bArr2, i + i3, min, this.c, 0);
            this.a.write(this.c, 0, min);
            i3 += min;
            bArr = bArr2;
        }
    }

    public Q7(byte[] bArr, EU eu, @InterfaceC11300zs1 byte[] bArr2) {
        this.a = eu;
        this.b = bArr;
        this.c = bArr2;
    }
}
