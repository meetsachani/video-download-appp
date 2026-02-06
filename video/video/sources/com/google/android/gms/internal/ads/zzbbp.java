package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbbp {
    @InterfaceC11300zs1
    public zzbbe a;
    public boolean b;
    public final Context c;
    public final Object d = new Object();

    public zzbbp(Context context) {
        this.c = context;
    }

    public static /* bridge */ /* synthetic */ void e(zzbbp zzbbpVar) {
        synchronized (zzbbpVar.d) {
            try {
                zzbbe zzbbeVar = zzbbpVar.a;
                if (zzbbeVar == null) {
                    return;
                }
                zzbbeVar.c();
                zzbbpVar.a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Future c(zzbbf zzbbfVar) {
        zzbbj zzbbjVar = new zzbbj(this);
        zzbbn zzbbnVar = new zzbbn(this, zzbbfVar, zzbbjVar);
        zzbbo zzbboVar = new zzbbo(this, zzbbjVar);
        synchronized (this.d) {
            zzbbe zzbbeVar = new zzbbe(this.c, com.google.android.gms.ads.internal.zzv.z().b(), zzbbnVar, zzbboVar);
            this.a = zzbbeVar;
            zzbbeVar.x();
        }
        return zzbbjVar;
    }
}
