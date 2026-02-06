package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcnc implements zzbjw {
    public final /* synthetic */ zzcnf a;

    public zzcnc(zzcnf zzcnfVar) {
        this.a = zzcnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        Executor executor;
        zzcnf zzcnfVar = this.a;
        if (zzcnf.g(zzcnfVar, map)) {
            executor = zzcnfVar.c;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnb
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnk zzcnkVar;
                    zzcnkVar = zzcnc.this.a.d;
                    zzcnkVar.a();
                }
            });
        }
    }
}
