package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzaz {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final zzbb f;

    public zzaz(zzhf zzhfVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzbb zzbbVar;
        Preconditions.l(str2);
        Preconditions.l(str3);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            zzhfVar.j().L().b("Event created with reverse previous/current timestamps. appId", zzfr.v(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzhfVar.j().G().a("Param name can't be null");
                    it.remove();
                } else {
                    Object s0 = zzhfVar.L().s0(next, bundle2.get(next));
                    if (s0 == null) {
                        zzhfVar.j().L().b("Param value can't be null", zzhfVar.D().f(next));
                        it.remove();
                    } else {
                        zzhfVar.L().N(bundle2, next, s0);
                    }
                }
            }
            zzbbVar = new zzbb(bundle2);
        } else {
            zzbbVar = new zzbb(new Bundle());
        }
        this.f = zzbbVar;
    }

    public final zzaz a(zzhf zzhfVar, long j) {
        return new zzaz(zzhfVar, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + valueOf + "}";
    }

    public zzaz(zzhf zzhfVar, String str, String str2, String str3, long j, long j2, zzbb zzbbVar) {
        Preconditions.l(str2);
        Preconditions.l(str3);
        Preconditions.r(zzbbVar);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            zzhfVar.j().L().c("Event created with reverse previous/current timestamps. appId, name", zzfr.v(str2), zzfr.v(str3));
        }
        this.f = zzbbVar;
    }
}
