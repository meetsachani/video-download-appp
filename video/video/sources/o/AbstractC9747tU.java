package o;

import java.io.IOException;
import java.util.Arrays;

@Deprecated
/* renamed from: o.tU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9747tU extends AbstractC6238fC {
    public static final int l = 16384;
    public byte[] j;
    public volatile boolean k;

    public AbstractC9747tU(FU fu, OU ou, int i, C10833xx0 c10833xx0, int i2, @InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 byte[] bArr) {
        super(fu, ou, i, c10833xx0, i2, obj, C10323vs.b, C10323vs.b);
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = TD2.f;
        } else {
            bArr2 = bArr;
        }
        this.j = bArr2;
    }

    @Override // o.R11.e
    public final void a() throws IOException {
        try {
            this.i.a(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                i(i2);
                i = this.i.read(this.j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                g(this.j, i2);
            }
            NU.a(this.i);
        } catch (Throwable th) {
            NU.a(this.i);
            throw th;
        }
    }

    @Override // o.R11.e
    public final void c() {
        this.k = true;
    }

    public abstract void g(byte[] bArr, int i) throws IOException;

    public byte[] h() {
        return this.j;
    }

    public final void i(int i) {
        byte[] bArr = this.j;
        if (bArr.length < i + 16384) {
            this.j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
