package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcnf {
    public final String a;
    public final zzbow b;
    public final Executor c;
    public zzcnk d;
    public final zzbjw e = new zzcnc(this);
    public final zzbjw f = new zzcne(this);

    public zzcnf(String str, zzbow zzbowVar, Executor executor) {
        this.a = str;
        this.b = zzbowVar;
        this.c = executor;
    }

    public static /* bridge */ /* synthetic */ boolean g(zzcnf zzcnfVar, Map map) {
        if (map != null) {
            String str = (String) map.get("hashCode");
            if (!TextUtils.isEmpty(str) && str.equals(zzcnfVar.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c(zzcnk zzcnkVar) {
        zzbow zzbowVar = this.b;
        zzbowVar.b("/updateActiveView", this.e);
        zzbowVar.b("/untrackActiveViewUnit", this.f);
        this.d = zzcnkVar;
    }

    public final void d(zzcfb zzcfbVar) {
        zzcfbVar.r1("/updateActiveView", this.e);
        zzcfbVar.r1("/untrackActiveViewUnit", this.f);
    }

    public final void e() {
        zzbow zzbowVar = this.b;
        zzbowVar.c("/updateActiveView", this.e);
        zzbowVar.c("/untrackActiveViewUnit", this.f);
    }

    public final void f(zzcfb zzcfbVar) {
        zzcfbVar.i1("/updateActiveView", this.e);
        zzcfbVar.i1("/untrackActiveViewUnit", this.f);
    }
}
