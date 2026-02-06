package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import o.C6566gU0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzhw extends zzhx {
    public final byte[] Z0;

    public zzhw(byte[] bArr) {
        bArr.getClass();
        this.Z0 = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public int B() {
        return this.Z0.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final int D(int i, int i2, int i3) {
        return zziz.a(i, this.Z0, K(), i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final boolean H() {
        int K = K();
        return zzmh.f(this.Z0, K, B() + K);
    }

    @Override // com.google.android.gms.internal.measurement.zzhx
    public final boolean J(zzhm zzhmVar, int i, int i2) {
        if (i2 <= zzhmVar.B()) {
            if (i2 <= zzhmVar.B()) {
                if (zzhmVar instanceof zzhw) {
                    zzhw zzhwVar = (zzhw) zzhmVar;
                    byte[] bArr = this.Z0;
                    byte[] bArr2 = zzhwVar.Z0;
                    int K = K() + i2;
                    int K2 = K();
                    int K3 = zzhwVar.K();
                    while (K2 < K) {
                        if (bArr[K2] != bArr2[K3]) {
                            return false;
                        }
                        K2++;
                        K3++;
                    }
                    return true;
                }
                return zzhmVar.i(0, i2).equals(i(0, i2));
            }
            int B = zzhmVar.B();
            throw new IllegalArgumentException("Ran off end of other: 0" + C6566gU0.h + i2 + C6566gU0.h + B);
        }
        int B2 = B();
        throw new IllegalArgumentException("Length too large: " + i2 + B2);
    }

    public int K() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public byte d(int i) {
        return this.Z0[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhm) || B() != ((zzhm) obj).B()) {
            return false;
        }
        if (B() == 0) {
            return true;
        }
        if (obj instanceof zzhw) {
            zzhw zzhwVar = (zzhw) obj;
            int e = e();
            int e2 = zzhwVar.e();
            if (e != 0 && e2 != 0 && e != e2) {
                return false;
            }
            return J(zzhwVar, 0, B());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final zzhm i(int i, int i2) {
        int h = zzhm.h(0, i2, B());
        if (h == 0) {
            return zzhm.Y;
        }
        return new zzhq(this.Z0, K(), h);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final String p(Charset charset) {
        return new String(this.Z0, K(), B(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final void r(zzhn zzhnVar) throws IOException {
        zzhnVar.a(this.Z0, K(), B());
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public byte w(int i) {
        return this.Z0[i];
    }
}
