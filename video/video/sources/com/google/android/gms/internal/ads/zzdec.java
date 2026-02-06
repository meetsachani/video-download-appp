package com.google.android.gms.internal.ads;

import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdec {
    public final List a;
    public final zzfjr b;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.util.client.zzv c;
    public boolean d;

    public zzdec(zzfbu zzfbuVar, zzfjr zzfjrVar) {
        this.a = zzfbuVar.p;
        this.b = zzfjrVar;
        this.c = zzfbuVar.x0;
    }

    public final void a() {
        if (!this.d) {
            this.b.e(this.a, this.c);
            this.d = true;
        }
    }
}
