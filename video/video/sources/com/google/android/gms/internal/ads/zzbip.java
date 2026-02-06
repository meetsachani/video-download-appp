package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.regex.Pattern;
import o.W12;

/* loaded from: classes2.dex */
public final class zzbip implements zzbjw {
    public static final Pattern a = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    public static final Pattern b = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("No label given for CSI tick.");
                return;
            }
            zzbcm zzbcmVar = zzbcv.m2;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue() && !a.matcher(str2).matches()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.b("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            } else if (TextUtils.isEmpty(str4)) {
                int i3 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("No timestamp given for CSI tick.");
            } else {
                try {
                    long b2 = com.google.android.gms.ads.internal.zzv.d().b() + (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzv.d().a());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue() && !a.matcher(str3).matches()) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.b("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                        return;
                    }
                    zzcfbVar.l().c(str2, str3, b2);
                } catch (NumberFormatException e) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.h("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                int i6 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("No value given for CSI experiment.");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.m2)).booleanValue() && !b.matcher(str5).matches()) {
                int i7 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.b("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                return;
            }
            zzcfbVar.l().a().d(W12.i, str5);
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                int i8 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                int i9 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("No name given for CSI extra.");
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.m2)).booleanValue() && !a.matcher(str6).matches()) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.b("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
                zzcfbVar.l().a().d(str6, str7);
            }
        }
    }
}
