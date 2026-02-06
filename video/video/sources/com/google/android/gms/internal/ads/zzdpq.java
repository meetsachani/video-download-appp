package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzdpq {
    public final Map a = new HashMap();

    @InterfaceC10571ws1
    public final synchronized zzdpp a(String str) {
        return (zzdpp) this.a.get(str);
    }

    public final String b(String str) {
        zzbrz zzbrzVar;
        zzdpp a = a(str);
        if (a != null && (zzbrzVar = a.b) != null) {
            return zzbrzVar.toString();
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(String str, @InterfaceC10571ws1 zzfdn zzfdnVar) {
        zzbrz j;
        if (this.a.containsKey(str)) {
            return;
        }
        zzbrz zzbrzVar = null;
        if (zzfdnVar != null) {
            try {
                j = zzfdnVar.j();
            } catch (zzfcw unused) {
            }
            if (zzfdnVar != null) {
                try {
                    zzbrzVar = zzfdnVar.k();
                } catch (zzfcw unused2) {
                }
            }
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.G9)).booleanValue()) {
                if (zzfdnVar != null) {
                    try {
                        zzfdnVar.c();
                    } catch (zzfcw unused3) {
                    }
                }
                z = false;
            }
            this.a.put(str, new zzdpp(str, j, zzbrzVar, z));
        }
        j = null;
        if (zzfdnVar != null) {
        }
        boolean z2 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.G9)).booleanValue()) {
        }
        this.a.put(str, new zzdpp(str, j, zzbrzVar, z2));
    }

    public final synchronized void d(String str, zzbrk zzbrkVar) {
        if (this.a.containsKey(str)) {
            return;
        }
        try {
            this.a.put(str, new zzdpp(str, zzbrkVar.e(), zzbrkVar.g(), true));
        } catch (Throwable unused) {
        }
    }
}
