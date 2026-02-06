package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzapc;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzarb;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcaf;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;
import o.InterfaceFutureC8411o11;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbo {
    public static zzapx a;
    public static final Object b = new Object();

    public zzbo(Context context) {
        zzapx a2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (b) {
            try {
                if (a == null) {
                    zzbcv.a(context);
                    if (!ClientLibraryUtils.c()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.G4)).booleanValue()) {
                            a2 = zzaz.b(context);
                            a = a2;
                        }
                    }
                    a2 = zzarb.a(context, null);
                    a = a2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceFutureC8411o11 a(String str) {
        zzcaf zzcafVar = new zzcaf();
        a.a(new zzbm(str, null, zzcafVar));
        return zzcafVar;
    }

    public final InterfaceFutureC8411o11 b(int i, String str, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 byte[] bArr) {
        zzbk zzbkVar = new zzbk(null);
        zzbi zzbiVar = new zzbi(this, str, zzbkVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbj zzbjVar = new zzbj(this, i, str, zzbkVar, zzbiVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.k()) {
            try {
                zzlVar.d(str, "GET", zzbjVar.q(), zzbjVar.C());
            } catch (zzapc e) {
                String message = e.getMessage();
                int i2 = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g(message);
            }
        }
        a.a(zzbjVar);
        return zzbkVar;
    }
}
