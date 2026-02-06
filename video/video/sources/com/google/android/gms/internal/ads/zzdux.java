package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC8710pF0;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzdux {
    public final zzduh a;
    public final zzdpq b;
    public final Object c = new Object();
    @InterfaceC8710pF0("lock")
    public final List d = new ArrayList();
    @InterfaceC8710pF0("lock")
    public boolean e;

    public zzdux(zzduh zzduhVar, zzdpq zzdpqVar) {
        this.a = zzduhVar;
        this.b = zzdpqVar;
    }

    public final JSONArray a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.c) {
            try {
                if (!this.e) {
                    zzduh zzduhVar = this.a;
                    if (zzduhVar.t()) {
                        d(zzduhVar.g());
                    } else {
                        c();
                        return jSONArray;
                    }
                }
                for (zzduw zzduwVar : this.d) {
                    jSONArray.put(zzduwVar.a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        this.a.s(new zzduv(this));
    }

    public final void d(List list) {
        String str;
        boolean z;
        zzdpp a;
        zzbrz zzbrzVar;
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzblu zzbluVar = (zzblu) it.next();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F9)).booleanValue()) {
                        zzdpp a2 = this.b.a(zzbluVar.X);
                        if (a2 != null && (zzbrzVar = a2.c) != null) {
                            str = zzbrzVar.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.G9)).booleanValue() || (a = this.b.a(zzbluVar.X)) == null || !a.d) {
                        z = false;
                    } else {
                        z = true;
                    }
                    List list2 = this.d;
                    String str3 = zzbluVar.X;
                    list2.add(new zzduw(str3, str2, this.b.b(str3), zzbluVar.Y ? 1 : 0, zzbluVar.Y0, zzbluVar.Z, z));
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
