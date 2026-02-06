package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzur implements zzgg {
    public final zzgg a;
    public final int b;
    public final zzuq c;
    public final byte[] d;
    public int e;

    public zzur(zzgg zzggVar, int i, zzuq zzuqVar) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        this.a = zzggVar;
        this.b = i;
        this.c = zzuqVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.e;
        if (i3 == 0) {
            zzgg zzggVar = this.a;
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (zzggVar.D(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int D = zzggVar.D(bArr3, i4, i6);
                        if (D != -1) {
                            i4 += D;
                            i6 -= D;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.c.b(new zzek(bArr3, i5));
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int D2 = this.a.D(bArr, i, Math.min(i3, i2));
        if (D2 != -1) {
            this.e -= D2;
        }
        return D2;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void b(zzhg zzhgVar) {
        zzhgVar.getClass();
        this.a.b(zzhgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Uri c() {
        return this.a.c();
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final Map d() {
        return this.a.d();
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() {
        throw new UnsupportedOperationException();
    }
}
