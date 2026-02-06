package com.google.android.gms.internal.ads;

import android.content.Context;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzqw {
    @InterfaceC11300zs1
    public final Context a;
    public final zzpe b;
    public boolean c;
    public final zzqu d;
    public final zzqv e;
    @InterfaceC11300zs1
    public zzqy f;
    public zzqo g;

    @Deprecated
    public zzqw() {
        this.a = null;
        this.b = zzpe.c;
        this.d = zzqu.a;
        this.e = zzqv.a;
    }

    public final zzri c() {
        zzdc.f(!this.c);
        this.c = true;
        if (this.f == null) {
            this.f = new zzqy(new zzcn[0]);
        }
        if (this.g == null) {
            this.g = new zzqo(this.a);
        }
        return new zzri(this, null);
    }

    public zzqw(Context context) {
        this.a = context;
        this.b = zzpe.c;
        this.d = zzqu.a;
        this.e = zzqv.a;
    }
}
