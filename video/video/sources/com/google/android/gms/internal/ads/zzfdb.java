package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzfdb {
    public final zzfbu a;
    public final zzfbx b;
    public final zzfjr c;
    public final zzfjj d;
    public final zzfhn e;
    public final zzcmn f;

    @InterfaceC5056aJ2
    public zzfdb(zzfjr zzfjrVar, zzfjj zzfjjVar, zzfbu zzfbuVar, zzfbx zzfbxVar, zzcmn zzcmnVar, zzfhn zzfhnVar) {
        this.a = zzfbuVar;
        this.b = zzfbxVar;
        this.c = zzfjrVar;
        this.d = zzfjjVar;
        this.f = zzcmnVar;
        this.e = zzfhnVar;
    }

    public final void a(List list, @InterfaceC11300zs1 zzcyd zzcydVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), 2, zzcydVar);
        }
    }

    public final void b(String str, int i, @InterfaceC11300zs1 zzcyd zzcydVar) {
        zzfbu zzfbuVar = this.a;
        if (!zzfbuVar.i0) {
            this.c.d(str, zzfbuVar.x0, this.e, zzcydVar);
            return;
        }
        this.d.a(str, this.b.b, i);
    }

    public final void c(List list, int i) {
        InterfaceFutureC8411o11 h;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.qa)).booleanValue() && zzcmn.j(str)) {
                h = this.f.e(str, com.google.android.gms.ads.internal.client.zzbb.e());
            } else {
                h = zzgcy.h(str);
            }
            zzgcy.r(h, new zzfda(this, i), zzcaa.a);
        }
    }
}
