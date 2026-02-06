package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdkc {
    public final zzdpd a;
    public final zzdns b;
    public final zzcnu c;
    public final zzdiw d;

    public zzdkc(zzdpd zzdpdVar, zzdns zzdnsVar, zzcnu zzcnuVar, zzdiw zzdiwVar) {
        this.a = zzdpdVar;
        this.b = zzdnsVar;
        this.c = zzcnuVar;
        this.d = zzdiwVar;
    }

    public static /* synthetic */ void b(zzdkc zzdkcVar, zzcfb zzcfbVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("Hiding native ads overlay.");
        zzcfbVar.U().setVisibility(8);
        zzdkcVar.c.d(false);
    }

    public static /* synthetic */ void d(zzdkc zzdkcVar, zzcfb zzcfbVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("Showing native ads overlay.");
        zzcfbVar.U().setVisibility(0);
        zzdkcVar.c.d(true);
    }

    public static /* synthetic */ void e(zzdkc zzdkcVar, Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        zzdkcVar.b.j("sendMessageToNativeJs", hashMap);
    }

    public final View a() throws zzcfn {
        zzcfb a = this.a.a(com.google.android.gms.ads.internal.client.zzr.E0(), null, null);
        a.U().setVisibility(8);
        a.r1("/sendMessageToSdk", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, Map map) {
                zzcfb zzcfbVar = (zzcfb) obj;
                zzdkc.this.b.j("sendMessageToNativeJs", map);
            }
        });
        a.r1("/adMuted", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdjx
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, Map map) {
                zzcfb zzcfbVar = (zzcfb) obj;
                zzdkc.this.d.i();
            }
        });
        WeakReference weakReference = new WeakReference(a);
        zzbjw zzbjwVar = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, final Map map) {
                zzcfb zzcfbVar = (zzcfb) obj;
                zzcgt M = zzcfbVar.M();
                final zzdkc zzdkcVar = zzdkc.this;
                M.f1(new zzcgr() { // from class: com.google.android.gms.internal.ads.zzdkb
                    @Override // com.google.android.gms.internal.ads.zzcgr
                    public final void a(boolean z, int i, String str, String str2) {
                        zzdkc.e(zzdkc.this, map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcfbVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcfbVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        };
        zzdns zzdnsVar = this.b;
        zzdnsVar.m(weakReference, "/loadHtml", zzbjwVar);
        zzdnsVar.m(new WeakReference(a), "/showOverlay", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, Map map) {
                zzdkc.d(zzdkc.this, (zzcfb) obj, map);
            }
        });
        zzdnsVar.m(new WeakReference(a), "/hideOverlay", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdka
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, Map map) {
                zzdkc.b(zzdkc.this, (zzcfb) obj, map);
            }
        });
        return a.U();
    }
}
