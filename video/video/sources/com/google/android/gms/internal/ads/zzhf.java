package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzhf implements zzgg {
    public final zzgg a;
    public long b;
    public Uri c = Uri.EMPTY;
    public Map d = Collections.EMPTY_MAP;

    public zzhf(zzgg zzggVar) {
        this.a = zzggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws IOException {
        int D = this.a.D(bArr, i, i2);
        if (D != -1) {
            this.b += D;
        }
        return D;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) throws IOException {
        this.c = zzglVar.a;
        this.d = Collections.EMPTY_MAP;
        try {
            long a = this.a.a(zzglVar);
            Uri c = c();
            if (c != null) {
                this.c = c;
            }
            this.d = d();
            return a;
        } catch (Throwable th) {
            Uri c2 = c();
            if (c2 != null) {
                this.c = c2;
            }
            this.d = d();
            throw th;
        }
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
    public final void f() throws IOException {
        this.a.f();
    }

    public final long g() {
        return this.b;
    }

    public final Uri h() {
        return this.c;
    }

    public final Map i() {
        return this.d;
    }
}
