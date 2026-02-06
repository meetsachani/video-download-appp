package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import o.C10229vT;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeeu implements zzedf {
    public final Context a;
    public final zzdga b;
    public final Executor c;
    public final zzfbt d;
    public final zzdsd e;

    public zzeeu(Context context, Executor executor, zzdga zzdgaVar, zzfbt zzfbtVar, zzdsd zzdsdVar) {
        this.a = context;
        this.b = zzdgaVar;
        this.c = executor;
        this.d = zzfbtVar;
        this.e = zzdsdVar;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 d(zzeeu zzeeuVar, Uri uri, zzfcg zzfcgVar, zzfbu zzfbuVar, zzfbx zzfbxVar, Object obj) {
        try {
            C10229vT d = new C10229vT.i().d();
            d.a.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(d.a, null);
            zzcaf zzcafVar = new zzcaf();
            zzdex c = zzeeuVar.b.c(new zzcrn(zzfcgVar, zzfbuVar, null), new zzdfa(new zzeet(zzeeuVar, zzcafVar, zzfbuVar), null));
            zzcafVar.c(new AdOverlayInfoParcel(zzcVar, null, c.h(), null, new VersionInfoParcel(0, 0, false), null, null, zzfbxVar.b));
            zzeeuVar.d.a();
            return zzgcy.h(c.i());
        } catch (Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    @InterfaceC11300zs1
    public static String e(zzfbu zzfbuVar) {
        try {
            return zzfbuVar.v.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final boolean a(zzfcg zzfcgVar, zzfbu zzfbuVar) {
        Context context = this.a;
        if ((context instanceof Activity) && zzbdw.g(context) && !TextUtils.isEmpty(e(zzfbuVar))) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final InterfaceFutureC8411o11 b(final zzfcg zzfcgVar, final zzfbu zzfbuVar) {
        final Uri uri;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.od)).booleanValue()) {
            zzdsc a = this.e.a();
            a.b("action", "cstm_tbs_rndr");
            a.j();
        }
        String e = e(zzfbuVar);
        if (e != null) {
            uri = Uri.parse(e);
        } else {
            uri = null;
        }
        final zzfbx zzfbxVar = zzfcgVar.b.b;
        return zzgcy.n(zzgcy.h(null), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzees
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzeeu.d(zzeeu.this, uri, zzfcgVar, zzfbuVar, zzfbxVar, obj);
            }
        }, this.c);
    }
}
