package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzegu {
    public final Clock a;
    public final zzegw b;
    public final zzfjr c;
    @InterfaceC8710pF0("this")
    public final LinkedHashMap d = new LinkedHashMap();
    public final boolean e = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X6)).booleanValue();
    public final zzedk f;
    public boolean g;
    public long h;
    public long i;

    public zzegu(Clock clock, zzegw zzegwVar, zzedk zzedkVar, zzfjr zzfjrVar) {
        this.a = clock;
        this.b = zzegwVar;
        this.f = zzedkVar;
        this.c = zzfjrVar;
    }

    public final synchronized long a() {
        return this.h;
    }

    public final synchronized InterfaceFutureC8411o11 f(zzfcg zzfcgVar, zzfbu zzfbuVar, InterfaceFutureC8411o11 interfaceFutureC8411o11, zzfjn zzfjnVar) {
        zzfbx zzfbxVar = zzfcgVar.b.b;
        long b = this.a.b();
        String str = zzfbuVar.w;
        if (str != null) {
            this.d.put(zzfbuVar, new zzegt(str, zzfbuVar.f0, 9, 0L, null));
            zzgcy.r(interfaceFutureC8411o11, new zzegs(this, b, zzfbxVar, zzfbuVar, str, zzfjnVar, zzfcgVar), zzcaa.g);
        }
        return interfaceFutureC8411o11;
    }

    public final synchronized String g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry entry : this.d.entrySet()) {
                zzegt zzegtVar = (zzegt) entry.getValue();
                if (zzegtVar.c != Integer.MAX_VALUE) {
                    arrayList.add(zzegtVar.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join(CrashlyticsReportPersistence.m, arrayList);
    }

    public final synchronized void i(@InterfaceC11300zs1 zzfbu zzfbuVar) {
        try {
            this.h = this.a.b() - this.i;
            if (zzfbuVar != null) {
                this.f.e(zzfbuVar);
            }
            this.g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        this.h = this.a.b() - this.i;
    }

    public final synchronized void k(List list) {
        this.i = this.a.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfbu zzfbuVar = (zzfbu) it.next();
            String str = zzfbuVar.w;
            if (!TextUtils.isEmpty(str)) {
                this.d.put(zzfbuVar, new zzegt(str, zzfbuVar.f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void l() {
        this.i = this.a.b();
    }

    public final synchronized void m(zzfbu zzfbuVar) {
        zzegt zzegtVar = (zzegt) this.d.get(zzfbuVar);
        if (zzegtVar != null && !this.g) {
            zzegtVar.c = 8;
        }
    }

    public final synchronized boolean q(zzfbu zzfbuVar) {
        zzegt zzegtVar = (zzegt) this.d.get(zzfbuVar);
        if (zzegtVar == null) {
            return false;
        }
        if (zzegtVar.c != 8) {
            return false;
        }
        return true;
    }
}
