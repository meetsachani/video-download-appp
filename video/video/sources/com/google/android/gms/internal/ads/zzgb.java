package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzgb extends zzfz {
    @InterfaceC11300zs1
    public Uri e;
    @InterfaceC11300zs1
    public byte[] f;
    public int g;
    public int h;
    public boolean i;
    public final zzga j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgb(byte[] bArr) {
        super(false);
        zzga zzgaVar = new zzga(bArr);
        this.j = zzgaVar;
        zzdc.d(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        zzdc.b(bArr2);
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        A(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) throws IOException {
        h(zzglVar);
        this.e = zzglVar.a;
        byte[] bArr = this.j.a;
        this.f = bArr;
        long j = zzglVar.e;
        int length = bArr.length;
        if (j <= length) {
            int i = (int) j;
            this.g = i;
            int i2 = length - i;
            this.h = i2;
            long j2 = zzglVar.f;
            int i3 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
            if (i3 != 0) {
                this.h = (int) Math.min(i2, j2);
            }
            this.i = true;
            i(zzglVar);
            if (i3 != 0) {
                return j2;
            }
            return this.h;
        }
        throw new zzgh(2008);
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Uri c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() {
        if (this.i) {
            this.i = false;
            g();
        }
        this.e = null;
        this.f = null;
    }
}
