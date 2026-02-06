package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzfjr {
    public final Context a;
    public final Executor b;
    public final zzgdk c;
    public final com.google.android.gms.ads.internal.util.client.zzu d;
    public final zzfjj e;
    public final zzfhq f;

    public zzfjr(Context context, Executor executor, zzgdk zzgdkVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfjj zzfjjVar, zzfhq zzfhqVar) {
        this.a = context;
        this.b = executor;
        this.c = zzgdkVar;
        this.d = zzuVar;
        this.e = zzfjjVar;
        this.f = zzfhqVar;
    }

    public final void d(final String str, @InterfaceC11300zs1 com.google.android.gms.ads.internal.util.client.zzv zzvVar, @InterfaceC11300zs1 zzfhn zzfhnVar, @InterfaceC11300zs1 zzcyd zzcydVar) {
        InterfaceFutureC8411o11 I2;
        zzfhc zzfhcVar = null;
        if (zzfhq.a() && ((Boolean) zzbeo.d.e()).booleanValue()) {
            zzfhcVar = zzfhb.a(this.a, 14);
            zzfhcVar.i();
        }
        if (zzvVar != null) {
            I2 = new zzfji(zzvVar.b(), this.d, this.c, this.e).d(str);
        } else {
            I2 = this.c.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    com.google.android.gms.ads.internal.util.client.zzt w;
                    w = zzfjr.this.d.w(str);
                    return w;
                }
            });
        }
        zzgcy.r(I2, new zzfjq(this, zzfhcVar, zzfhnVar, zzcydVar), this.b);
    }

    public final void e(List list, @InterfaceC11300zs1 com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d((String) it.next(), zzvVar, null, null);
        }
    }
}
