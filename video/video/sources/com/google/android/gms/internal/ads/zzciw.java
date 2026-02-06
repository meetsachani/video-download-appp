package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzciw {
    public zzche a;
    public zzcjq b;
    public zzfgx c;
    public zzckd d;
    public zzfdr e;

    private zzciw() {
        throw null;
    }

    public final zzchb a() {
        zzhgd.c(this.a, zzche.class);
        zzhgd.c(this.b, zzcjq.class);
        if (this.c == null) {
            this.c = new zzfgx();
        }
        if (this.d == null) {
            this.d = new zzckd();
        }
        if (this.e == null) {
            this.e = new zzfdr();
        }
        return new zzcil(this.a, this.b, this.c, this.d, this.e);
    }

    public final zzciw b(zzche zzcheVar) {
        this.a = zzcheVar;
        return this;
    }

    public final zzciw c(zzcjq zzcjqVar) {
        this.b = zzcjqVar;
        return this;
    }

    public /* synthetic */ zzciw(zzcjp zzcjpVar) {
    }
}
