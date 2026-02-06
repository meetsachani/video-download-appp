package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdns {
    public final zzdnf a;
    public final com.google.android.gms.ads.internal.zza b;
    public final Context c;
    public final zzdsd d;
    public final Executor e;
    public final zzavl f;
    public final VersionInfoParcel g;
    public final zzbkm h;
    public final zzebt i;
    public final zzfjr j;
    public final zzece k;
    public final zzfct l;
    public InterfaceFutureC8411o11 m;

    public zzdns(zzdnp zzdnpVar) {
        Context context;
        Executor executor;
        zzavl zzavlVar;
        VersionInfoParcel versionInfoParcel;
        com.google.android.gms.ads.internal.zza zzaVar;
        zzebt zzebtVar;
        zzfjr zzfjrVar;
        zzdsd zzdsdVar;
        zzece zzeceVar;
        zzfct zzfctVar;
        context = zzdnpVar.b;
        this.c = context;
        executor = zzdnpVar.e;
        this.e = executor;
        zzavlVar = zzdnpVar.f;
        this.f = zzavlVar;
        versionInfoParcel = zzdnpVar.g;
        this.g = versionInfoParcel;
        zzaVar = zzdnpVar.a;
        this.b = zzaVar;
        this.a = new zzdnf();
        this.h = new zzbkm();
        zzebtVar = zzdnpVar.d;
        this.i = zzebtVar;
        zzfjrVar = zzdnpVar.h;
        this.j = zzfjrVar;
        zzdsdVar = zzdnpVar.c;
        this.d = zzdsdVar;
        zzeceVar = zzdnpVar.i;
        this.k = zzeceVar;
        zzfctVar = zzdnpVar.j;
        this.l = zzfctVar;
    }

    public static /* synthetic */ zzcfb a(zzdns zzdnsVar, zzcfb zzcfbVar) {
        zzcfbVar.r1("/result", zzdnsVar.h);
        zzcgt M = zzcfbVar.M();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(zzdnsVar.c, null, null);
        zzebt zzebtVar = zzdnsVar.i;
        zzfjr zzfjrVar = zzdnsVar.j;
        zzdsd zzdsdVar = zzdnsVar.d;
        zzdnf zzdnfVar = zzdnsVar.a;
        M.e1(null, zzdnfVar, zzdnfVar, zzdnfVar, zzdnfVar, false, null, zzbVar, null, null, zzebtVar, zzfjrVar, zzdsdVar, null, null, null, null, null, null);
        return zzcfbVar;
    }

    public final synchronized InterfaceFutureC8411o11 g(final String str, final JSONObject jSONObject) {
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.m;
        if (interfaceFutureC8411o11 == null) {
            return zzgcy.h(null);
        }
        return zzgcy.n(interfaceFutureC8411o11, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdng
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                InterfaceFutureC8411o11 b;
                zzcfb zzcfbVar = (zzcfb) obj;
                b = zzdns.this.h.b(zzcfbVar, str, jSONObject);
                return b;
            }
        }, this.e);
    }

    public final synchronized void h(zzfbu zzfbuVar, zzfbx zzfbxVar, zzcmn zzcmnVar) {
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.m;
        if (interfaceFutureC8411o11 == null) {
            return;
        }
        zzgcy.r(interfaceFutureC8411o11, new zzdnm(this, zzfbuVar, zzfbxVar, zzcmnVar), this.e);
    }

    public final synchronized void i() {
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.m;
        if (interfaceFutureC8411o11 == null) {
            return;
        }
        zzgcy.r(interfaceFutureC8411o11, new zzdni(this), this.e);
        this.m = null;
    }

    public final synchronized void j(String str, Map map) {
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.m;
        if (interfaceFutureC8411o11 == null) {
            return;
        }
        zzgcy.r(interfaceFutureC8411o11, new zzdnl(this, "sendMessageToNativeJs", map), this.e);
    }

    public final synchronized void k() {
        final String str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.a4);
        final Context context = this.c;
        final zzavl zzavlVar = this.f;
        final VersionInfoParcel versionInfoParcel = this.g;
        final com.google.android.gms.ads.internal.zza zzaVar = this.b;
        final zzece zzeceVar = this.k;
        final zzfct zzfctVar = this.l;
        final zzdsd zzdsdVar = this.d;
        InterfaceFutureC8411o11 m = zzgcy.m(zzgcy.k(new zzgce() { // from class: com.google.android.gms.internal.ads.zzcfk
            @Override // com.google.android.gms.internal.ads.zzgce
            public final InterfaceFutureC8411o11 a() {
                com.google.android.gms.ads.internal.zzv.b();
                Context context2 = context;
                zzece zzeceVar2 = zzeceVar;
                zzcgv a = zzcgv.a();
                zzavl zzavlVar2 = zzavlVar;
                zzfct zzfctVar2 = zzfctVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzcfb a2 = zzcfo.a(context2, a, "", false, false, zzavlVar2, null, versionInfoParcel, null, null, zzaVar2, zzbbt.a(), null, null, zzeceVar2, zzfctVar2, zzdsdVar);
                final zzcae e = zzcae.e(a2);
                a2.M().f1(new zzcgr() { // from class: com.google.android.gms.internal.ads.zzcfl
                    @Override // com.google.android.gms.internal.ads.zzcgr
                    public final void a(boolean z, int i, String str2, String str3) {
                        zzcae.this.f();
                    }
                });
                a2.loadUrl(str);
                return e;
            }
        }, zzcaa.f), new zzfur() { // from class: com.google.android.gms.internal.ads.zzdnh
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                zzcfb zzcfbVar = (zzcfb) obj;
                zzdns.a(zzdns.this, zzcfbVar);
                return zzcfbVar;
            }
        }, this.e);
        this.m = m;
        zzcad.a(m, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void l(String str, zzbjw zzbjwVar) {
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.m;
        if (interfaceFutureC8411o11 == null) {
            return;
        }
        zzgcy.r(interfaceFutureC8411o11, new zzdnj(this, str, zzbjwVar), this.e);
    }

    public final void m(WeakReference weakReference, String str, zzbjw zzbjwVar) {
        l(str, new zzdnq(this, weakReference, str, zzbjwVar, null));
    }

    public final synchronized void n(String str, zzbjw zzbjwVar) {
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.m;
        if (interfaceFutureC8411o11 == null) {
            return;
        }
        zzgcy.r(interfaceFutureC8411o11, new zzdnk(this, str, zzbjwVar), this.e);
    }
}
