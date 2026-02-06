package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import o.C2638Cg0;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzdkk {
    public final zzdpd a;
    public final zzdns b;
    public ViewTreeObserver.OnScrollChangedListener c = null;

    public zzdkk(zzdpd zzdpdVar, zzdns zzdnsVar) {
        this.a = zzdpdVar;
        this.b = zzdnsVar;
    }

    public static /* synthetic */ void b(zzdkk zzdkkVar, WindowManager windowManager, View view, zzcfb zzcfbVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.b("Hide native ad policy validator overlay.");
        zzcfbVar.U().setVisibility(8);
        if (zzcfbVar.U().getWindowToken() != null) {
            windowManager.removeView(zzcfbVar.U());
        }
        zzcfbVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (zzdkkVar.c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(zzdkkVar.c);
        }
    }

    public static /* synthetic */ void c(final zzdkk zzdkkVar, final View view, final WindowManager windowManager, zzcfb zzcfbVar, final Map map) {
        int i;
        final zzcfb zzcfbVar2;
        zzcfbVar.M().f1(new zzcgr() { // from class: com.google.android.gms.internal.ads.zzdki
            @Override // com.google.android.gms.internal.ads.zzcgr
            public final void a(boolean z, int i2, String str, String str2) {
                zzdkk.d(zzdkk.this, map, z, i2, str, str2);
            }
        });
        if (map != null) {
            Context context = view.getContext();
            int f = f(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.r8)).intValue());
            int f2 = f(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s8)).intValue());
            int f3 = f(context, (String) map.get("validator_x"), 0);
            int f4 = f(context, (String) map.get("validator_y"), 0);
            zzcfbVar.b1(zzcgv.b(f, f2));
            try {
                zzcfbVar.N().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.t8)).booleanValue());
                zzcfbVar.N().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.u8)).booleanValue());
            } catch (NullPointerException unused) {
            }
            final WindowManager.LayoutParams b = com.google.android.gms.ads.internal.util.zzbv.b();
            b.x = f3;
            b.y = f4;
            windowManager.updateViewLayout(zzcfbVar.U(), b);
            final String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                zzcfbVar2 = zzcfbVar;
            } else {
                if (!"1".equals(str) && !C2638Cg0.Y4.equals(str)) {
                    i = rect.top;
                } else {
                    i = rect.bottom;
                }
                final int i2 = i - f4;
                zzcfbVar2 = zzcfbVar;
                zzdkkVar.c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdkj
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        Rect rect2 = new Rect();
                        if (view.getGlobalVisibleRect(rect2)) {
                            zzcfb zzcfbVar3 = zzcfbVar2;
                            if (zzcfbVar3.U().getWindowToken() != null) {
                                int i3 = i2;
                                WindowManager.LayoutParams layoutParams = b;
                                String str2 = str;
                                if (!"1".equals(str2) && !C2638Cg0.Y4.equals(str2)) {
                                    layoutParams.y = rect2.top - i3;
                                } else {
                                    layoutParams.y = rect2.bottom - i3;
                                }
                                windowManager.updateViewLayout(zzcfbVar3.U(), layoutParams);
                            }
                        }
                    }
                };
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(zzdkkVar.c);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzcfbVar2.loadUrl(str2);
            }
        }
    }

    public static /* synthetic */ void d(zzdkk zzdkkVar, Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        zzdkkVar.b.j("sendMessageToNativeJs", hashMap);
    }

    public static final int f(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbb.b();
        return com.google.android.gms.ads.internal.util.client.zzf.D(context, i);
    }

    public final View a(@InterfaceC5670cr1 final View view, @InterfaceC5670cr1 final WindowManager windowManager) throws zzcfn {
        zzcfb a = this.a.a(com.google.android.gms.ads.internal.client.zzr.E0(), null, null);
        a.U().setVisibility(4);
        a.U().setContentDescription("policy_validator");
        a.r1("/sendMessageToSdk", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, Map map) {
                zzcfb zzcfbVar = (zzcfb) obj;
                zzdkk.this.b.j("sendMessageToNativeJs", map);
            }
        });
        a.r1("/hideValidatorOverlay", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdkf
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, Map map) {
                zzdkk.b(zzdkk.this, windowManager, view, (zzcfb) obj, map);
            }
        });
        a.r1("/open", new zzbki(null, null, null, null, null));
        WeakReference weakReference = new WeakReference(a);
        zzbjw zzbjwVar = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdkg
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, Map map) {
                zzdkk.c(zzdkk.this, view, windowManager, (zzcfb) obj, map);
            }
        };
        zzdns zzdnsVar = this.b;
        zzdnsVar.m(weakReference, "/loadNativeAdPolicyViolations", zzbjwVar);
        zzdnsVar.m(new WeakReference(a), "/showValidatorOverlay", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdkh
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, Map map) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.b("Show native ad policy validator overlay.");
                ((zzcfb) obj).U().setVisibility(0);
            }
        });
        return a.U();
    }
}
