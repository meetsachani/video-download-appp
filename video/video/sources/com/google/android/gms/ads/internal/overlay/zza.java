package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.firebase.sessions.settings.RemoteSettings;
import o.C10229vT;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zza {
    public static final boolean a(Context context, Intent intent, zzad zzadVar, @InterfaceC11300zs1 zzaa zzaaVar, boolean z, @InterfaceC11300zs1 zzdsd zzdsdVar, String str) {
        if (z) {
            return c(context, intent.getData(), zzadVar, zzaaVar);
        }
        try {
            String uri = intent.toURI();
            com.google.android.gms.ads.internal.util.zze.k("Launching an intent: " + uri);
            if (((Boolean) zzbd.c().b(zzbcv.pd)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.v();
                com.google.android.gms.ads.internal.util.zzs.y(context, intent, zzdsdVar, str);
            } else {
                com.google.android.gms.ads.internal.zzv.v();
                com.google.android.gms.ads.internal.util.zzs.u(context, intent);
            }
            if (zzadVar != null) {
                zzadVar.g();
            }
            if (zzaaVar != null) {
                zzaaVar.O0(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            String message = e.getMessage();
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g(message);
            if (zzaaVar != null) {
                zzaaVar.O0(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, @InterfaceC11300zs1 zzc zzcVar, zzad zzadVar, @InterfaceC11300zs1 zzaa zzaaVar, @InterfaceC11300zs1 zzdsd zzdsdVar, String str) {
        int i = 0;
        if (zzcVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("No intent data for launcher overlay.");
            return false;
        }
        zzbcv.a(context);
        Intent intent = zzcVar.c1;
        if (intent != null) {
            return a(context, intent, zzadVar, zzaaVar, zzcVar.e1, zzdsdVar, str);
        }
        Intent intent2 = new Intent();
        String str2 = zzcVar.Y;
        if (TextUtils.isEmpty(str2)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = zzcVar.Z;
        if (!TextUtils.isEmpty(str3)) {
            intent2.setDataAndType(Uri.parse(str2), str3);
        } else {
            intent2.setData(Uri.parse(str2));
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = zzcVar.Y0;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = zzcVar.Z0;
        if (!TextUtils.isEmpty(str5)) {
            String[] split = str5.split(RemoteSettings.i, 2);
            if (split.length < 2) {
                int i4 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str6 = zzcVar.a1;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i5 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) zzbd.c().b(zzbcv.N4)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra(C10229vT.c, true);
        } else {
            if (((Boolean) zzbd.c().b(zzbcv.M4)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.v();
                com.google.android.gms.ads.internal.util.zzs.V(context, intent2);
            }
        }
        return a(context, intent2, zzadVar, zzaaVar, zzcVar.e1, zzdsdVar, str);
    }

    public static final boolean c(Context context, Uri uri, zzad zzadVar, zzaa zzaaVar) {
        int i;
        try {
            i = com.google.android.gms.ads.internal.zzv.v().T(context, uri);
            if (zzadVar != null) {
                zzadVar.g();
            }
        } catch (ActivityNotFoundException e) {
            String message = e.getMessage();
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g(message);
            i = 6;
        }
        if (zzaaVar != null) {
            zzaaVar.z(i);
        }
        if (i != 5) {
            return false;
        }
        return true;
    }
}
