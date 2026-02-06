package o;

import android.net.Uri;
import java.io.IOException;

@Deprecated
/* renamed from: o.Cr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2681Cr extends AbstractC5887dl {
    public final byte[] f;
    @InterfaceC11300zs1
    public Uri g;
    public int h;
    public int i;
    public boolean j;

    public C2681Cr(byte[] bArr) {
        super(false);
        C9542sf.g(bArr);
        C9542sf.a(bArr.length > 0);
        this.f = bArr;
    }

    @Override // o.FU
    public long a(OU ou) throws IOException {
        this.g = ou.a;
        A(ou);
        long j = ou.g;
        byte[] bArr = this.f;
        if (j <= bArr.length) {
            this.h = (int) j;
            int length = bArr.length - ((int) j);
            this.i = length;
            long j2 = ou.h;
            if (j2 != -1) {
                this.i = (int) Math.min(length, j2);
            }
            this.j = true;
            B(ou);
            long j3 = ou.h;
            if (j3 != -1) {
                return j3;
            }
            return this.i;
        }
        throw new LU(2008);
    }

    @Override // o.FU
    public void close() {
        if (this.j) {
            this.j = false;
            z();
        }
        this.g = null;
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return this.g;
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.i;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f, this.h, bArr, i, min);
        this.h += min;
        this.i -= min;
        y(min);
        return min;
    }
}
