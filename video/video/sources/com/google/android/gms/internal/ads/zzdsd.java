package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdsd {
    public final zzdsi a;
    public final Executor b;
    public final Map c;

    public zzdsd(zzdsi zzdsiVar, Executor executor) {
        this.a = zzdsiVar;
        this.c = zzdsiVar.i();
        this.b = executor;
    }

    public final zzdsc a() {
        zzdsc zzdscVar = new zzdsc(this);
        zzdsc.a(zzdscVar);
        return zzdscVar;
    }

    public final void e() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Tb)).booleanValue()) {
            return;
        }
        zzdsc a = a();
        a.b("action", "pecr");
        a.j();
    }
}
