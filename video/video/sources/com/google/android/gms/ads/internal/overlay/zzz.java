package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzfsr;
import com.google.android.gms.internal.ads.zzfss;
import com.google.android.gms.internal.ads.zzfst;
import com.google.android.gms.internal.ads.zzfsu;
import com.google.android.gms.internal.ads.zzftn;
import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzftr;
import com.google.android.gms.internal.ads.zzfts;
import com.google.android.gms.internal.ads.zzfuf;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzz {
    public zzftq f;
    @InterfaceC11300zs1
    public zzcfb c = null;
    public boolean e = false;
    @InterfaceC11300zs1
    public String a = null;
    @InterfaceC11300zs1
    public zzfst d = null;
    @InterfaceC11300zs1
    public String b = null;

    public static /* synthetic */ void a(zzz zzzVar, String str, Map map) {
        zzcfb zzcfbVar = zzzVar.c;
        if (zzcfbVar != null) {
            zzcfbVar.q(str, map);
        }
    }

    public final synchronized void b(@InterfaceC11300zs1 zzcfb zzcfbVar, Context context) {
        this.c = zzcfbVar;
        if (!k(context)) {
            g("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        f("on_play_store_bind", hashMap);
    }

    public final void c() {
        zzfst zzfstVar;
        if (this.e && (zzfstVar = this.d) != null) {
            zzfstVar.c(l(), this.f);
            e("onLMDOverlayCollapse");
            return;
        }
        com.google.android.gms.ads.internal.util.zze.k("LastMileDelivery not connected");
    }

    public final void d() {
        zzfst zzfstVar;
        if (this.e && (zzfstVar = this.d) != null) {
            zzfsr c = zzfss.c();
            if (((Boolean) zzbd.c().b(zzbcv.Nb)).booleanValue() && !TextUtils.isEmpty(this.b)) {
                c.a(this.b);
            } else {
                String str = this.a;
                if (str != null) {
                    c.b(str);
                } else {
                    g("Missing session token and/or appId", "onLMDupdate");
                }
            }
            zzfstVar.a(c.c(), this.f);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.k("LastMileDelivery not connected");
    }

    @InterfaceC5056aJ2
    public final void e(String str) {
        f(str, new HashMap());
    }

    @InterfaceC5056aJ2
    public final void f(final String str, final Map map) {
        zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzx
            @Override // java.lang.Runnable
            public final void run() {
                zzz.a(zzz.this, str, map);
            }
        });
    }

    @InterfaceC5056aJ2
    public final void g(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.k(str);
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            f("onError", hashMap);
        }
    }

    public final void h() {
        zzfst zzfstVar;
        if (this.e && (zzfstVar = this.d) != null) {
            zzfstVar.b(l(), this.f);
            e("onLMDOverlayExpand");
            return;
        }
        com.google.android.gms.ads.internal.util.zze.k("LastMileDelivery not connected");
    }

    @InterfaceC5056aJ2
    public final void i(zzftp zzftpVar) {
        if (!TextUtils.isEmpty(zzftpVar.b())) {
            if (!((Boolean) zzbd.c().b(zzbcv.Nb)).booleanValue()) {
                this.a = zzftpVar.b();
            }
        }
        switch (zzftpVar.a()) {
            case 8152:
                e("onLMDOverlayOpened");
                return;
            case 8153:
                e("onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                e("onLMDOverlayClose");
                return;
            case 8157:
                this.a = null;
                this.b = null;
                this.e = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzftpVar.a()));
                f("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    public final void j(@InterfaceC11300zs1 zzcfb zzcfbVar, @InterfaceC11300zs1 zzftn zzftnVar) {
        if (zzcfbVar == null) {
            g("adWebview missing", "onLMDShow");
            return;
        }
        this.c = zzcfbVar;
        if (!this.e && !k(zzcfbVar.getContext())) {
            g("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzbd.c().b(zzbcv.Nb)).booleanValue()) {
            this.b = zzftnVar.h();
        }
        m();
        zzfst zzfstVar = this.d;
        if (zzfstVar != null) {
            zzfstVar.d(zzftnVar, this.f);
        }
    }

    public final synchronized boolean k(Context context) {
        if (!zzfuf.a(context)) {
            return false;
        }
        try {
            this.d = zzfsu.a(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.k("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzv.t().x(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.d == null) {
            this.e = false;
            return false;
        }
        m();
        this.e = true;
        return true;
    }

    public final zzfts l() {
        zzftr c = zzfts.c();
        if (((Boolean) zzbd.c().b(zzbcv.Nb)).booleanValue() && !TextUtils.isEmpty(this.b)) {
            c.a(this.b);
        } else {
            String str = this.a;
            if (str != null) {
                c.b(str);
            } else {
                g("Missing session token and/or appId", "onLMDupdate");
            }
        }
        return c.c();
    }

    public final void m() {
        if (this.f == null) {
            this.f = new zzy(this);
        }
    }
}
