package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C9811tl1;
import o.InterfaceC11300zs1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcnk implements zzayu, zzcwo, com.google.android.gms.ads.internal.overlay.zzr, zzcwn {
    public final zzcnf X;
    public final zzcng Y;
    public final zzboz Y0;
    public final Executor Z0;
    public final Clock a1;
    public final Set Z = new HashSet();
    public final AtomicBoolean b1 = new AtomicBoolean(false);
    public final zzcnj c1 = new zzcnj();
    public boolean d1 = false;
    public WeakReference e1 = new WeakReference(this);

    public zzcnk(zzbow zzbowVar, zzcng zzcngVar, Executor executor, zzcnf zzcnfVar, Clock clock) {
        this.X = zzcnfVar;
        zzboh zzbohVar = zzbok.b;
        this.Y0 = zzbowVar.a("google.afma.activeView.handleUpdate", zzbohVar, zzbohVar);
        this.Y = zzcngVar;
        this.Z0 = executor;
        this.a1 = clock;
    }

    private final void e() {
        for (zzcfb zzcfbVar : this.Z) {
            this.X.f(zzcfbVar);
        }
        this.X.e();
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final synchronized void E0(zzayt zzaytVar) {
        zzcnj zzcnjVar = this.c1;
        zzcnjVar.a = zzaytVar.j;
        zzcnjVar.f = zzaytVar;
        a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void S7() {
        this.c1.b = true;
        a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void V3() {
    }

    public final synchronized void a() {
        try {
            if (this.e1.get() != null) {
                if (!this.d1 && this.b1.get()) {
                    try {
                        zzcnj zzcnjVar = this.c1;
                        zzcnjVar.d = this.a1.b();
                        final JSONObject c = this.Y.c(zzcnjVar);
                        for (final zzcfb zzcfbVar : this.Z) {
                            this.Z0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcni
                                @Override // java.lang.Runnable
                                public final void run() {
                                    JSONObject jSONObject = c;
                                    int i = com.google.android.gms.ads.internal.util.zze.b;
                                    com.google.android.gms.ads.internal.util.client.zzo.b("Calling AFMA_updateActiveView(" + jSONObject.toString() + C9811tl1.d);
                                    zzcfbVar.c1("AFMA_updateActiveView", jSONObject);
                                }
                            });
                        }
                        zzcad.b(this.Y0.d(c), "ActiveViewListener.callActiveViewJs");
                        return;
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.util.zze.l("Failed to call ActiveViewJS", e);
                        return;
                    }
                }
                return;
            }
            d();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(zzcfb zzcfbVar) {
        this.Z.add(zzcfbVar);
        this.X.d(zzcfbVar);
    }

    public final void c(Object obj) {
        this.e1 = new WeakReference(obj);
    }

    public final synchronized void d() {
        e();
        this.d1 = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void h5(int i) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void o1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void r4() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final synchronized void s() {
        if (this.b1.compareAndSet(false, true)) {
            this.X.c(this);
            a();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void s7() {
        this.c1.b = false;
        a();
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final synchronized void t(@InterfaceC11300zs1 Context context) {
        this.c1.e = "u";
        a();
        e();
        this.d1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final synchronized void w(@InterfaceC11300zs1 Context context) {
        this.c1.b = true;
        a();
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final synchronized void x(@InterfaceC11300zs1 Context context) {
        this.c1.b = false;
        a();
    }
}
