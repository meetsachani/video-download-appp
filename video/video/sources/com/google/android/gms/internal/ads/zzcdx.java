package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzcdx implements zzgg {
    public final zzgg a;
    public final long b;
    public final zzgg c;
    public long d;
    public Uri e;

    public zzcdx(zzgg zzggVar, int i, zzgg zzggVar2) {
        this.a = zzggVar;
        this.b = i;
        this.c = zzggVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.d;
        long j2 = this.b;
        if (j < j2) {
            int D = this.a.D(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.d + D;
            this.d = j3;
            i3 = D;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= j2) {
            int D2 = this.c.D(bArr, i + i3, i2 - i3);
            int i4 = i3 + D2;
            this.d += D2;
            return i4;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) throws IOException {
        Uri uri;
        zzgl zzglVar2;
        long j;
        long j2;
        Uri uri2 = zzglVar.a;
        this.e = uri2;
        long j3 = zzglVar.e;
        long j4 = this.b;
        zzgl zzglVar3 = null;
        if (j3 >= j4) {
            uri = uri2;
            zzglVar2 = null;
        } else {
            long j5 = zzglVar.f;
            long j6 = j4 - j3;
            if (j5 != -1) {
                j6 = Math.min(j5, j6);
            }
            uri = uri2;
            zzglVar2 = new zzgl(uri, j3, j6, null);
        }
        long j7 = zzglVar.f;
        int i = (j7 > (-1L) ? 1 : (j7 == (-1L) ? 0 : -1));
        if (i == 0 || j3 + j7 > j4) {
            Uri uri3 = uri;
            long max = Math.max(j4, j3);
            if (i != 0) {
                j = Math.min(j7, (j3 + j7) - j4);
            } else {
                j = -1;
            }
            zzglVar3 = new zzgl(uri3, max, j, null);
        }
        long j8 = 0;
        if (zzglVar2 != null) {
            j2 = this.a.a(zzglVar2);
        } else {
            j2 = 0;
        }
        if (zzglVar3 != null) {
            j8 = this.c.a(zzglVar3);
        }
        this.d = j3;
        if (j2 == -1 || j8 == -1) {
            return -1L;
        }
        return j2 + j8;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void b(zzhg zzhgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final Uri c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final Map d() {
        return zzfyf.d();
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() throws IOException {
        this.a.f();
        this.c.f();
    }
}
