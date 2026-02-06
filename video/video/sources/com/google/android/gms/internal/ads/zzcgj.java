package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public class zzcgj extends zzcfj {
    public zzcgj(zzcfb zzcfbVar, zzbbt zzbbtVar, boolean z, @InterfaceC11300zs1 zzece zzeceVar) {
        super(zzcfbVar, zzbbtVar, z, new zzbso(zzcfbVar, zzcfbVar.h0(), new zzbcd(zzcfbVar.getContext())), null, zzeceVar);
    }

    @InterfaceC11300zs1
    public final WebResourceResponse d1(WebView webView, String str, @InterfaceC11300zs1 Map map) {
        String str2;
        if (!(webView instanceof zzcfb)) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcfb zzcfbVar = (zzcfb) webView;
        zzbxv zzbxvVar = this.t1;
        if (zzbxvVar != null) {
            zzbxvVar.b(str, map, 1);
        }
        zzfqh.a();
        zzfqn zzfqnVar = zzfqn.a;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return super.a0(str, map);
        }
        if (zzcfbVar.M() != null) {
            zzcfbVar.M().D();
        }
        if (zzcfbVar.H().i()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d0);
        } else if (zzcfbVar.j0()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c0);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.b0);
        }
        com.google.android.gms.ads.internal.zzv.v();
        return com.google.android.gms.ads.internal.util.zzs.e0(zzcfbVar.getContext(), zzcfbVar.m().X, str2);
    }
}
