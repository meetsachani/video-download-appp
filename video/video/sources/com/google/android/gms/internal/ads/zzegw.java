package com.google.android.gms.internal.ads;

import java.util.Iterator;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzegw {
    public final zzfdh a;
    public final zzdpq b;
    public final zzdsd c;

    public zzegw(zzfdh zzfdhVar, zzdpq zzdpqVar, zzdsd zzdsdVar) {
        this.a = zzfdhVar;
        this.b = zzdpqVar;
        this.c = zzdsdVar;
    }

    public final void a(zzfbx zzfbxVar, zzfbu zzfbuVar, int i, @InterfaceC10571ws1 zzedj zzedjVar, long j) {
        zzdpp zzdppVar;
        zzdsc a = this.c.a();
        a.d(zzfbxVar);
        a.c(zzfbuVar);
        a.b("action", "adapter_status");
        a.b("adapter_l", String.valueOf(j));
        a.b("sc", Integer.toString(i));
        if (zzedjVar != null) {
            a.b("arec", Integer.toString(zzedjVar.b().X));
            String a2 = this.a.a(zzedjVar.getMessage());
            if (a2 != null) {
                a.b("areec", a2);
            }
        }
        zzdpq zzdpqVar = this.b;
        Iterator it = zzfbuVar.t.iterator();
        while (true) {
            if (it.hasNext()) {
                zzdppVar = zzdpqVar.a((String) it.next());
                if (zzdppVar != null) {
                    break;
                }
            } else {
                zzdppVar = null;
                break;
            }
        }
        if (zzdppVar != null) {
            a.b("ancn", zzdppVar.a);
            zzbrz zzbrzVar = zzdppVar.b;
            if (zzbrzVar != null) {
                a.b("adapter_v", zzbrzVar.toString());
            }
            zzbrz zzbrzVar2 = zzdppVar.c;
            if (zzbrzVar2 != null) {
                a.b("adapter_sv", zzbrzVar2.toString());
            }
        }
        a.j();
    }
}
