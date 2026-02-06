package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import o.C6566gU0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzgxh extends zzgxg {
    public final byte[] Z;

    public zzgxh(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.Z = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final zzgxq B() {
        return zzgxq.g(this.Z, d0(), i(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final String D(Charset charset) {
        return new String(this.Z, d0(), i(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final ByteBuffer F() {
        return ByteBuffer.wrap(this.Z, d0(), i()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final void G(zzgxb zzgxbVar) throws IOException {
        zzgxbVar.a(this.Z, d0(), i());
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final boolean H() {
        int d0 = d0();
        return zzhbu.i(this.Z, d0, i() + d0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final boolean b0(zzgxk zzgxkVar, int i, int i2) {
        if (i2 <= zzgxkVar.i()) {
            int i3 = i + i2;
            if (i3 <= zzgxkVar.i()) {
                if (zzgxkVar instanceof zzgxh) {
                    zzgxh zzgxhVar = (zzgxh) zzgxkVar;
                    byte[] bArr = this.Z;
                    byte[] bArr2 = zzgxhVar.Z;
                    int d0 = d0() + i2;
                    int d02 = d0();
                    int d03 = zzgxhVar.d0() + i;
                    while (d02 < d0) {
                        if (bArr[d02] != bArr2[d03]) {
                            return false;
                        }
                        d02++;
                        d03++;
                    }
                    return true;
                }
                return zzgxkVar.w(i, i3).equals(w(0, i2));
            }
            int i4 = zzgxkVar.i();
            throw new IllegalArgumentException("Ran off end of other: " + i + C6566gU0.h + i2 + C6566gU0.h + i4);
        }
        int i5 = i();
        throw new IllegalArgumentException("Length too large: " + i2 + i5);
    }

    public int d0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public byte e(int i) {
        return this.Z[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxk) || i() != ((zzgxk) obj).i()) {
            return false;
        }
        if (i() == 0) {
            return true;
        }
        if (obj instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) obj;
            int K = K();
            int K2 = zzgxhVar.K();
            if (K != 0 && K2 != 0 && K != K2) {
                return false;
            }
            return b0(zzgxhVar, 0, i());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public byte f(int i) {
        return this.Z[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public int i() {
        return this.Z.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public void j(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.Z, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final int p(int i, int i2, int i3) {
        return zzgzf.b(i, this.Z, d0() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final int r(int i, int i2, int i3) {
        int d0 = d0() + i2;
        return zzhbu.f(i, this.Z, d0, i3 + d0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final zzgxk w(int i, int i2) {
        int J = zzgxk.J(i, i2, i());
        if (J == 0) {
            return zzgxk.Y;
        }
        return new zzgxe(this.Z, d0() + i, J);
    }
}
