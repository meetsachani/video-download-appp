package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import o.C9811tl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcnu implements zzayu {
    public zzcfb X;
    public final Executor Y;
    public final Clock Y0;
    public final zzcng Z;
    public boolean Z0 = false;
    public boolean a1 = false;
    public final zzcnj b1 = new zzcnj();

    public zzcnu(Executor executor, zzcng zzcngVar, Clock clock) {
        this.Y = executor;
        this.Z = zzcngVar;
        this.Y0 = clock;
    }

    public static /* synthetic */ void a(zzcnu zzcnuVar, JSONObject jSONObject) {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.b("Calling AFMA_updateActiveView(" + jSONObject.toString() + C9811tl1.d);
        zzcnuVar.X.c1("AFMA_updateActiveView", jSONObject);
    }

    private final void f() {
        try {
            final JSONObject c = this.Z.c(this.b1);
            if (this.X != null) {
                this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcnu.a(zzcnu.this, c);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.l("Failed to call video active view js", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void E0(zzayt zzaytVar) {
        boolean z;
        if (this.a1) {
            z = false;
        } else {
            z = zzaytVar.j;
        }
        zzcnj zzcnjVar = this.b1;
        zzcnjVar.a = z;
        zzcnjVar.d = this.Y0.b();
        zzcnjVar.f = zzaytVar;
        if (this.Z0) {
            f();
        }
    }

    public final void b() {
        this.Z0 = false;
    }

    public final void c() {
        this.Z0 = true;
        f();
    }

    public final void d(boolean z) {
        this.a1 = z;
    }

    public final void e(zzcfb zzcfbVar) {
        this.X = zzcfbVar;
    }
}
