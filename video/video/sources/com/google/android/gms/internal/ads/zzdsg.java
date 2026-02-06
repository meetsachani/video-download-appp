package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdsg implements zzfgu {
    public final zzdrx Y;
    public final Clock Z;
    public final Map X = new HashMap();
    public final Map Y0 = new HashMap();

    public zzdsg(zzdrx zzdrxVar, Set set, Clock clock) {
        zzfgn zzfgnVar;
        this.Y = zzdrxVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdsf zzdsfVar = (zzdsf) it.next();
            Map map = this.Y0;
            zzfgnVar = zzdsfVar.c;
            map.put(zzfgnVar, zzdsfVar);
        }
        this.Z = clock;
    }

    public final void a(zzfgn zzfgnVar, boolean z) {
        String str;
        zzfgn zzfgnVar2;
        String str2;
        zzdsf zzdsfVar = (zzdsf) this.Y0.get(zzfgnVar);
        if (zzdsfVar != null) {
            if (true != z) {
                str = "f.";
            } else {
                str = "s.";
            }
            Map map = this.X;
            zzfgnVar2 = zzdsfVar.b;
            if (map.containsKey(zzfgnVar2)) {
                long b = this.Z.b() - ((Long) map.get(zzfgnVar2)).longValue();
                Map b2 = this.Y.b();
                str2 = zzdsfVar.a;
                b2.put("label.".concat(str2), str + b);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void g(zzfgn zzfgnVar, String str) {
        this.X.put(zzfgnVar, Long.valueOf(this.Z.b()));
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void h(zzfgn zzfgnVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void n(zzfgn zzfgnVar, String str) {
        Map map = this.X;
        if (map.containsKey(zzfgnVar)) {
            zzdrx zzdrxVar = this.Y;
            String valueOf = String.valueOf(str);
            zzdrxVar.b().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(this.Z.b() - ((Long) map.get(zzfgnVar)).longValue()))));
        }
        if (this.Y0.containsKey(zzfgnVar)) {
            a(zzfgnVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void q(zzfgn zzfgnVar, String str, Throwable th) {
        Map map = this.X;
        if (map.containsKey(zzfgnVar)) {
            zzdrx zzdrxVar = this.Y;
            String valueOf = String.valueOf(str);
            zzdrxVar.b().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(this.Z.b() - ((Long) map.get(zzfgnVar)).longValue()))));
        }
        if (this.Y0.containsKey(zzfgnVar)) {
            a(zzfgnVar, false);
        }
    }
}
