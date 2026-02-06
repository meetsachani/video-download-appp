package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractServiceConnectionC10961yT;
import o.C9743tT;
import o.CT;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzbdu extends AbstractServiceConnectionC10961yT {
    public static final /* synthetic */ int b1 = 0;
    public final AtomicBoolean Y = new AtomicBoolean(false);
    @InterfaceC11300zs1
    public zzdsd Y0;
    @InterfaceC11300zs1
    public Context Z;
    @InterfaceC11300zs1
    public CT Z0;
    @InterfaceC11300zs1
    public C9743tT a1;

    public static /* synthetic */ void e(zzbdu zzbduVar, int i) {
        zzdsd zzdsdVar = zzbduVar.Y0;
        if (zzdsdVar != null) {
            zzdsc a = zzdsdVar.a();
            a.b("action", "cct_nav");
            a.b("cct_navs", String.valueOf(i));
            a.j();
        }
    }

    @Override // o.AbstractServiceConnectionC10961yT
    public final void b(@InterfaceC5670cr1 ComponentName componentName, @InterfaceC5670cr1 C9743tT c9743tT) {
        this.a1 = c9743tT;
        c9743tT.n(0L);
        this.Z0 = c9743tT.k(new zzbdt(this));
    }

    @InterfaceC11300zs1
    public final CT d() {
        if (this.Z0 == null) {
            zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbds
                @Override // java.lang.Runnable
                public final void run() {
                    r0.i(zzbdu.this.Z);
                }
            });
        }
        return this.Z0;
    }

    public final void g(Context context, zzdsd zzdsdVar) {
        if (this.Y.getAndSet(true)) {
            return;
        }
        this.Z = context;
        this.Y0 = zzdsdVar;
        i(context);
    }

    @InterfaceC5056aJ2
    public final void h(final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P4)).booleanValue() && this.Y0 != null) {
            zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdr
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdu.e(zzbdu.this, i);
                }
            });
        }
    }

    public final void i(@InterfaceC11300zs1 Context context) {
        String h;
        if (this.a1 == null && context != null && (h = C9743tT.h(context, null)) != null) {
            C9743tT.b(context, h, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a1 = null;
        this.Z0 = null;
    }
}
