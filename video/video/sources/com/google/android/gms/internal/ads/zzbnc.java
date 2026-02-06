package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;
import org.json.JSONObject;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbnc implements zzbmu, zzbmt {
    public final zzcfb X;

    public zzbnc(Context context, VersionInfoParcel versionInfoParcel, @InterfaceC11300zs1 zzavl zzavlVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcfn {
        com.google.android.gms.ads.internal.zzv.b();
        zzcfb a = zzcfo.a(context, zzcgv.a(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbbt.a(), null, null, null, null, null);
        this.X = a;
        a.U().setWillNotDraw(true);
    }

    public static final void p(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzbb.b();
        if (com.google.android.gms.ads.internal.util.client.zzf.A()) {
            com.google.android.gms.ads.internal.util.zze.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
            return;
        }
        com.google.android.gms.ads.internal.util.zze.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
        if (!com.google.android.gms.ads.internal.util.zzs.l.post(runnable)) {
            com.google.android.gms.ads.internal.util.client.zzo.g("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void S(final String str) {
        com.google.android.gms.ads.internal.util.zze.k("loadHtml on adWebView from html");
        p(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmz
            @Override // java.lang.Runnable
            public final void run() {
                zzbnc.this.X.loadData(str, "text/html", "UTF-8");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final /* synthetic */ void a(String str, JSONObject jSONObject) {
        zzbms.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void c() {
        this.X.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final /* synthetic */ void c1(String str, JSONObject jSONObject) {
        zzbms.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void f0(final String str) {
        com.google.android.gms.ads.internal.util.zze.k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        p(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmw
            @Override // java.lang.Runnable
            public final void run() {
                zzbnc.this.X.loadUrl(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void g1(final zzbnf zzbnfVar) {
        zzcgt M = this.X.M();
        Objects.requireNonNull(zzbnfVar);
        M.v0(new zzcgs() { // from class: com.google.android.gms.internal.ads.zzbmx
            @Override // com.google.android.gms.internal.ads.zzcgs
            public final void a() {
                long a = com.google.android.gms.ads.internal.zzv.d().a();
                zzbnf zzbnfVar2 = zzbnf.this;
                final long j = zzbnfVar2.c;
                final ArrayList arrayList = zzbnfVar2.b;
                arrayList.add(Long.valueOf(a - j));
                String valueOf = String.valueOf(arrayList.get(0));
                com.google.android.gms.ads.internal.util.zze.k("LoadNewJavascriptEngine(onEngLoaded) latency is " + valueOf + " ms.");
                zzfrl zzfrlVar = com.google.android.gms.ads.internal.util.zzs.l;
                final zzbnz zzbnzVar = zzbnfVar2.a;
                final zzbny zzbnyVar = zzbnfVar2.d;
                final zzbmu zzbmuVar = zzbnfVar2.e;
                zzfrlVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbng
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbnz.i(zzbnz.this, zzbnyVar, zzbmuVar, arrayList, j);
                    }
                }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final boolean i() {
        return this.X.L();
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final zzbob j() {
        return new zzbob(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final /* synthetic */ void q(String str, Map map) {
        zzbms.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void r0(String str) {
        com.google.android.gms.ads.internal.util.zze.k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        p(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbna
            @Override // java.lang.Runnable
            public final void run() {
                zzbnc.this.X.loadData(format, "text/html", "UTF-8");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final /* synthetic */ void u(String str, String str2) {
        zzbms.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzboa
    public final void v(String str, final zzbjw zzbjwVar) {
        this.X.B0(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbmv
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbjw zzbjwVar2;
                zzbjw zzbjwVar3 = (zzbjw) obj;
                if (zzbjwVar3 instanceof zzbnb) {
                    zzbjw zzbjwVar4 = zzbjw.this;
                    zzbjwVar2 = ((zzbnb) zzbjwVar3).a;
                    if (zzbjwVar2.equals(zzbjwVar4)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void w(final String str) {
        com.google.android.gms.ads.internal.util.zze.k("invokeJavascript on adWebView from js");
        p(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmy
            @Override // java.lang.Runnable
            public final void run() {
                zzbnc.this.X.w(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzboa
    public final void x0(String str, zzbjw zzbjwVar) {
        this.X.r1(str, new zzbnb(this, zzbjwVar));
    }
}
