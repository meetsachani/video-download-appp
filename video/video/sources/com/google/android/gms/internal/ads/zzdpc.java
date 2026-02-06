package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdpc {
    public final zzcvr a;
    public final zzddw b;
    public final zzcxa c;
    public final zzcxn d;
    public final zzcxz e;
    public final zzdau f;
    public final Executor g;
    public final zzdds h;
    public final zzcnk i;
    public final com.google.android.gms.ads.internal.zzb j;
    public final zzbxv k;
    public final zzavl l;
    public final zzdal m;
    public final zzebt n;

    /* renamed from: o  reason: collision with root package name */
    public final zzfjr f270o;
    public final zzdsd p;
    public final zzcmn q;
    public final zzdpi r;

    public zzdpc(zzcvr zzcvrVar, zzcxa zzcxaVar, zzcxn zzcxnVar, zzcxz zzcxzVar, zzdau zzdauVar, Executor executor, zzdds zzddsVar, zzcnk zzcnkVar, com.google.android.gms.ads.internal.zzb zzbVar, @InterfaceC11300zs1 zzbxv zzbxvVar, zzavl zzavlVar, zzdal zzdalVar, zzebt zzebtVar, zzfjr zzfjrVar, zzdsd zzdsdVar, zzddw zzddwVar, zzcmn zzcmnVar, zzdpi zzdpiVar) {
        this.a = zzcvrVar;
        this.c = zzcxaVar;
        this.d = zzcxnVar;
        this.e = zzcxzVar;
        this.f = zzdauVar;
        this.g = executor;
        this.h = zzddsVar;
        this.i = zzcnkVar;
        this.j = zzbVar;
        this.k = zzbxvVar;
        this.l = zzavlVar;
        this.m = zzdalVar;
        this.n = zzebtVar;
        this.f270o = zzfjrVar;
        this.p = zzdsdVar;
        this.b = zzddwVar;
        this.q = zzcmnVar;
        this.r = zzdpiVar;
    }

    public static /* synthetic */ boolean h(zzdpc zzdpcVar, View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.qa)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            zzdpcVar.r.b(motionEvent);
        }
        zzdpcVar.j.a();
        if (view != null) {
            view.performClick();
            return false;
        }
        return false;
    }

    public static final InterfaceFutureC8411o11 j(zzcfb zzcfbVar, String str, String str2, final Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.t2)).booleanValue()) {
            bundle.putLong(zzdrl.RENDERING_WEBVIEW_LOAD_HTML_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        final zzcaf zzcafVar = new zzcaf();
        zzcfbVar.M().f1(new zzcgr() { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // com.google.android.gms.internal.ads.zzcgr
            public final void a(boolean z, int i, String str3, String str4) {
                zzcaf zzcafVar2 = zzcafVar;
                if (z) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.t2)).booleanValue()) {
                        bundle.putLong(zzdrl.RENDERING_WEBVIEW_LOAD_HTML_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
                    }
                    zzcafVar2.c(null);
                    return;
                }
                zzcafVar2.d(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcfbVar.h1(str, str2, null);
        return zzcafVar;
    }

    public final void i(final zzcfb zzcfbVar, boolean z, zzbjz zzbjzVar, Bundle bundle) {
        zzavg c;
        zzbcm zzbcmVar = zzbcv.t2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            bundle.putLong(zzdrl.RENDERING_CONFIGURE_WEBVIEW_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzcfbVar.M().e1(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdou
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void y() {
                zzdpc.this.a.y();
            }
        }, this.d, this.e, new zzbio() { // from class: com.google.android.gms.internal.ads.zzdov
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void u(String str, String str2) {
                zzdpc.this.f.u(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdow
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final void g() {
                zzdpc.this.c.b();
            }
        }, z, zzbjzVar, this.j, new zzdpb(this), this.k, this.n, this.f270o, this.p, null, this.b, null, null, null, this.q);
        zzcfbVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdox
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdpc.h(zzdpc.this, view, motionEvent);
                return false;
            }
        });
        zzcfbVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdoy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdpc.this.j.a();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T2)).booleanValue() && (c = this.l.c()) != null) {
            c.b(zzcfbVar.U());
        }
        zzdds zzddsVar = this.h;
        Executor executor = this.g;
        zzddsVar.c1(zzcfbVar, executor);
        zzddsVar.c1(new zzayu() { // from class: com.google.android.gms.internal.ads.zzdoz
            @Override // com.google.android.gms.internal.ads.zzayu
            public final void E0(zzayt zzaytVar) {
                zzcgt M = zzcfb.this.M();
                Rect rect = zzaytVar.d;
                M.o0(rect.left, rect.top, false);
            }
        }, executor);
        zzddsVar.n1(zzcfbVar.U());
        zzcfbVar.r1("/trackActiveViewUnit", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzdpa
            @Override // com.google.android.gms.internal.ads.zzbjw
            public final void a(Object obj, Map map) {
                zzcfb zzcfbVar2 = (zzcfb) obj;
                zzdpc.this.i.b(zzcfbVar);
            }
        });
        this.i.c(zzcfbVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            bundle.putLong(zzdrl.RENDERING_CONFIGURE_WEBVIEW_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
    }
}
