package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzfhm {
    public static void a(InterfaceFutureC8411o11 interfaceFutureC8411o11, zzfhn zzfhnVar, zzfhc zzfhcVar) {
        g(interfaceFutureC8411o11, zzfhnVar, zzfhcVar, false);
    }

    public static void b(InterfaceFutureC8411o11 interfaceFutureC8411o11, zzfhn zzfhnVar, zzfhc zzfhcVar) {
        g(interfaceFutureC8411o11, zzfhnVar, zzfhcVar, true);
    }

    public static void c(InterfaceFutureC8411o11 interfaceFutureC8411o11, zzfhn zzfhnVar, zzfhc zzfhcVar) {
        if (!((Boolean) zzbeo.c.e()).booleanValue()) {
            return;
        }
        zzgcy.r(zzgcp.A(interfaceFutureC8411o11), new zzfhl(zzfhnVar, zzfhcVar), zzcaa.g);
    }

    public static void d(InterfaceFutureC8411o11 interfaceFutureC8411o11, zzfhc zzfhcVar) {
        if (!((Boolean) zzbeo.c.e()).booleanValue()) {
            return;
        }
        zzgcy.r(zzgcp.A(interfaceFutureC8411o11), new zzfhj(zzfhcVar), zzcaa.g);
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d9), str);
    }

    public static int f(zzfcp zzfcpVar) {
        int g = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.g(zzfcpVar) - 1;
        return (g == 0 || g == 1) ? 7 : 23;
    }

    public static void g(InterfaceFutureC8411o11 interfaceFutureC8411o11, zzfhn zzfhnVar, zzfhc zzfhcVar, boolean z) {
        if (!((Boolean) zzbeo.c.e()).booleanValue()) {
            return;
        }
        zzgcy.r(zzgcp.A(interfaceFutureC8411o11), new zzfhk(zzfhnVar, zzfhcVar, z), zzcaa.g);
    }
}
